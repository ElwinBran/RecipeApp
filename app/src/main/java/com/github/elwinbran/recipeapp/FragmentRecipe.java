package com.github.elwinbran.recipeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FragmentRecipe extends Fragment
{
    final static String MODEL_KEY = "recipe";

    private TextView title;

    private ImageView recipePreview;

    private RecyclerView ingredientList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, parent, savedInstanceState);
        View fragment = inflater.inflate(R.layout.fragment_recipe, parent, false);
        Bundle args = getArguments();
        setContent(fragment, args);
        return fragment;
    }

    private void setContent(View view, Bundle data)
    {
        recipePreview = view.findViewById(R.id.imageView);
        ingredientList = view.findViewById(R.id.recyclerViewIngredients);
        title = view.findViewById(R.id.textViewRecipeTitle);

        Recipe model = (Recipe) data.getSerializable(MODEL_KEY);
        title.setText(model.title());
        Glide.with(this).load(model.imageUrl()).into(recipePreview);
        ingredientList.setLayoutManager(new LinearLayoutManager(
                this.getContext(), LinearLayoutManager.VERTICAL, false));
    }

}
