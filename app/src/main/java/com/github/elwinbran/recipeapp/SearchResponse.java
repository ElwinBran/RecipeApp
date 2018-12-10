package com.github.elwinbran.recipeapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class SearchResponse implements Serializable
{
    /**
     * The amount of recipes in this search result (max 30).
     */
    @SerializedName("count")
    @Expose
    private Integer count;

    /**
     * The url to the original source of the recipe.
     */
    @SerializedName("recipes")
    @Expose
    private List<Recipe> recipes;

    public SearchResponse(){}

    public List<Recipe> recipes()
    {
        return recipes;
    }
}
