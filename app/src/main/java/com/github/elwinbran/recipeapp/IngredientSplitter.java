package com.github.elwinbran.recipeapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Elwin Slokker
 */
public class IngredientSplitter
{
    private static final Character SPLIT_CHAR = '-';

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
        ArrayList<String> ingredients = new ArrayList<>();
        while(!ingredientList.isEmpty())
        {
            int index = ingredientList.indexOf(SPLIT_CHAR, 1);
            if (index == -1)
            {
                ingredients.add(ingredientList);
                ingredientList = "";
            }
            else
            {
                String ingredient = ingredientList.substring(0, index);
                ingredients.add(ingredient);
                ingredientList = ingredientList.substring(index + 1, ingredientList.length() - 1);
            }
        }
        return ingredients;
    }
}
