package com.github.elwinbran.recipeapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        final String key = "74dea97d3e6df9461980789902998e79";
        final Integer recipeCount = 3;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        final FragmentManager manager = getSupportFragmentManager();
        //FragmentPagerAdapter fpAdapter = null;//getSupportFragmentManager();
        //viewPager.setAdapter(fpAdapter);
        RecipeApiService service = RecipeApiService.retrofit.create(RecipeApiService.class);
        Call<SearchResponse> call = service.popularRecipes(key);
        call.enqueue(new Callback<SearchResponse>() {

            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response)
            {
                SearchResponse topRecipes = response.body();
                List<Recipe> topRecipeList = topRecipes.recipes();
                int maxRecipeRequirement;
                if(topRecipeList.size() < recipeCount)
                {
                    maxRecipeRequirement = topRecipeList.size();
                }
                else
                {
                    maxRecipeRequirement = recipeCount;
                }
                List<Recipe> requiredRecipes = topRecipes.recipes().subList(0, maxRecipeRequirement);
                //extract 3 recipes and apply them to the pages
                viewPager.setAdapter(new RecipeFragmentPagerAdapter(manager, requiredRecipes));
            }

            @Override
            public void onFailure(Call<SearchResponse> call, Throwable t)
            {
                Log.d("none",t.toString());
            }

        });
    }
}
