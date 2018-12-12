package com.github.elwinbran.recipeapp;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Elwin Slokker
 */
public class IngredientSplitter
{
    private static final IngredientSplitter ourInstance = new IngredientSplitter();

    public static IngredientSplitter getInstance()
    {
        return ourInstance;
    }

    private IngredientSplitter()
    {
    }

    public List<String> split(String ingredientList)
    {
        return Arrays.asList("bub", "2 x bub");
    }
}
