package com.upgrad.tutorial.recyclerdividerlist;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by gaurav_bhatnagar on 6/15/2016.
 */
public class ItemAdapter extends RecyclerView.Adapter<RowHolder> {
    MainActivity activity;

    public ItemAdapter(MainActivity activity){
        this.activity = activity;
    }

    @Override
    public RowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return(new RowHolder(activity.getLayoutInflater()
                .inflate(R.layout.row, parent, false)));
    }

    @Override
    public void onBindViewHolder(RowHolder holder, int position) {
        holder.bindModel(activity.shoppingItems[position]);
    }

    @Override
    public int getItemCount() {
        return(activity.shoppingItems.length);
    }
}
