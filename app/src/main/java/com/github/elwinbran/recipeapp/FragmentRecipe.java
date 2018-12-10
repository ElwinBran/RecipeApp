package com.github.elwinbran.recipeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentRecipe extends Fragment
{
    private ImageView recipePreview;

    private RecyclerView ingredientList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, parent, savedInstanceState);
        return inflater.inflate(R.layout.fragment_recipe, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        recipePreview = view.findViewById(R.id.imageView);
        ingredientList = view.findViewById(R.id.recyclerViewIngredients);
    }

}
