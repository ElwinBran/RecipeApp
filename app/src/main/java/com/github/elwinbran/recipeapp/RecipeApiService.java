package com.github.elwinbran.recipeapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

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
     * Retrieves 30 recipes that have the highest rating.
     *
     * @param accessToken The string token that is required to make a HTTP request.
     */
    @GET("search?sort=r")
    Call<SearchResponse> popularRecipes(@Query("key") String accessToken);

}
