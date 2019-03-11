package com.example.fragmentdemo;

public class IngredientsFragment extends CheckBoxFragment {
    @Override
    public String[] getContent(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
