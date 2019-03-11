package com.example.fragmentdemo;

public class ListAdapter extends BaseRecyclerAdapter {

    private final ListFragment.OnRecipeSeletedInterface mListener;

    public ListAdapter(ListFragment.OnRecipeSeletedInterface listener) {
        mListener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.list_item;
    }

    @Override
    protected void onListRecipeSeleted(int index) {
        mListener.onListRecipeSeleted(index);
    }

}
