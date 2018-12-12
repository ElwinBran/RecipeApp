package com.github.elwinbran.recipeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 *
 *
 * @author Elwin Slokker
 */
public class RecipeFragmentPagerAdapter extends FragmentPagerAdapter
{

    private final List<Recipe> recipes;

    public RecipeFragmentPagerAdapter(FragmentManager manager, List<Recipe> recipes)
    {
        super(manager);
        this.recipes = recipes;
    }

    @Override
    public Fragment getItem(int i)
    {
        Recipe retrieved = recipes.get(i);
        Fragment fragment = new FragmentRecipe();
        Bundle args = new Bundle();
        args.putSerializable(FragmentRecipe.MODEL_KEY, retrieved);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount()
    {
        return this.recipes.size();
    }
}
