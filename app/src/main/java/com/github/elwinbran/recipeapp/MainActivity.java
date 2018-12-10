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
        final String accessParameter = "key=" + key;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecipeApiService service = RecipeApiService.retrofit.create(RecipeApiService.class);
        Call<Iterable<Recipe>> call = service.popularRecipes(accessParameter);
        call.enqueue(new Callback<Iterable<Recipe>>() {

            @Override
            public void onResponse(Call<Iterable<Recipe>> call, Response<Iterable<Recipe>> response)
            {
                Iterable<Recipe> topRecipes = response.body();
            }

            @Override
            public void onFailure(Call<Iterable<Recipe>> call, Throwable t)
            {
                Log.d("error",t.toString());
            }

        });
    }
}
