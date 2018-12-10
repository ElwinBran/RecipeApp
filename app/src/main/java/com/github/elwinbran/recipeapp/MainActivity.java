package com.github.elwinbran.recipeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        final String key = "74dea97d3e6df9461980789902998e79";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        FragmentPagerAdapter fpAdapter = null;//getSupportFragmentManager();
        viewPager.setAdapter(fpAdapter);
        RecipeApiService service = RecipeApiService.retrofit.create(RecipeApiService.class);
        Call<SearchResponse> call = service.popularRecipes(key);
        call.enqueue(new Callback<SearchResponse>() {

            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response)
            {
                SearchResponse topRecipes = response.body();
                Log.d("none", topRecipes.recipes().iterator().next().title());
                //extract 3 recipes and apply them to the pages
            }

            @Override
            public void onFailure(Call<SearchResponse> call, Throwable t)
            {
                Log.d("none",t.toString());
            }

        });
    }
}
