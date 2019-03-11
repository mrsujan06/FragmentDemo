package com.example.fragmentdemo;

class GridAdapter extends BaseRecyclerAdapter {

    private final GridFragment.OnRecipeSeletedInterface mListener;

    public GridAdapter(GridFragment.OnRecipeSeletedInterface listener) {
        mListener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.grid_item;
    }

    @Override
    protected void onListRecipeSeleted(int index) {
        mListener.onGridRecipeSeleted(index);
    }

}
