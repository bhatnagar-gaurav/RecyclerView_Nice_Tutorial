package com.upgrad.tutorial.recyclerviewgrid;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by gaurav_bhatnagar on 6/15/2016.
 */

public class ItemAdapter extends RecyclerView.Adapter<RowHolderWithListener> {
    MainActivity activity;

    public ItemAdapter(MainActivity activity){
        this.activity = activity;
    }

    @Override
    public RowHolderWithListener onCreateViewHolder(ViewGroup parent, int viewType) {
        return(new RowHolderWithListener(activity.getLayoutInflater()
                .inflate(R.layout.row, parent, false)));
    }

    @Override
    public void onBindViewHolder(RowHolderWithListener holder, int position) {
        holder.bindModel(activity.shoppingItems[position]);
    }

    @Override
    public int getItemCount() {
        return(activity.shoppingItems.length);
    }
}
