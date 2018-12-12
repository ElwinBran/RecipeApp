package com.github.elwinbran.recipeapp;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * The model class to be used.
 *
 * @author Elwin Slokker
 */
public class Recipe implements Serializable
{
    /**
     * The url to the recipe preview image.
     */
    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    /**
     * The url to the original source of the recipe.
     */
    @SerializedName("source_url")
    @Expose
    private String sourceUrl;

    /**
     * Url of the recipe on Food2Fork.com.
     */
    @SerializedName("f2f_url")
    @Expose
    private String foodTwoForkUrl;

    /**
     * Title of the recipe.
     */
    @SerializedName("title")
    @Expose
    private String title;

    /**
     * Name of the Publisher.
     */
    @SerializedName("publisher")
    @Expose
    private String publisher;

    /**
     * Base url of the publisher.
     */
    @SerializedName("publisher_url")
    @Expose
    private String publisherUrl;

    /**
     * The rating of the recipe.
     */
    @SerializedName("social_rank")
    @Expose
    private Long socialRank;

    /**
     * The list of ingredients.
     */
    @SerializedName("ingredients")
    @Expose
    private String ingredients;

    public Recipe(){}

    public String imageUrl()
    {
        return this.imageUrl;
    }

    public String title()
    {
        return this.title;
    }

    public String ingredients()
    {
        return (this.ingredients == null)? "" :this.ingredients;
    }
}
