package com.github.elwinbran.recipeapp;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;

/**
 *
 * @author Elwin Slokker
 */
public interface RecipeApiService
{
    String BASE_URL = "https://www.food2fork.com/api/";

    /**
     * Create a retrofit client.
     */
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    /**
     *
     */
    @GET("search?sort=r")
    Call<Iterable<Recipe>> popularRecipes(@Body String accessToken);
}
