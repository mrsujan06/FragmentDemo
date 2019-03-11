package com.example.fragmentdemo;

public class DirectionsFragment extends CheckBoxFragment {
    @Override
    public String[] getContent(int index) {
        return Recipes.directions[index].split("`");
    }
}
