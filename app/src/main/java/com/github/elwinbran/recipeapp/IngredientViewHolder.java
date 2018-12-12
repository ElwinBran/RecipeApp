package com.github.elwinbran.recipeapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class IngredientViewHolder extends RecyclerView.ViewHolder
{

    private TextView ingredient;

    public IngredientViewHolder(@NonNull View itemView)
    {
        super(itemView);
        ingredient = itemView.findViewById(R.id.textViewIngredient);
    }

    public void displayText(String text)
    {
        this.ingredient.setText(text);
    }
}
