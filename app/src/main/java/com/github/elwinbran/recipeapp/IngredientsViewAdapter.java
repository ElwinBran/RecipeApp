package com.github.elwinbran.recipeapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
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
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.ingredient_item, viewGroup, false);
        return new IngredientViewHolder(item);
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
