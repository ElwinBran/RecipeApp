package com.github.elwinbran.recipeapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class IngredientsViewAdapter extends RecyclerView.Adapter<IngredientViewHolder>
{
    private final List<String> ingredients;

    public IngredientsViewAdapter(List<String> ingredients)
    {
        this.ingredients = ingredients;
    }

    @NonNull
    @Override
    public IngredientViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        //TODO: inflater code
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull IngredientViewHolder ingredientViewHolder, int i)
    {
        ingredientViewHolder.displayText(this.ingredients.get(i));
    }

    @Override
    public int getItemCount()
    {
        return this.ingredients.size();
    }
}
