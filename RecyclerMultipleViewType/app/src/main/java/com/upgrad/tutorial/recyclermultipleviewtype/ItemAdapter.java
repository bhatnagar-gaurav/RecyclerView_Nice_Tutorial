package com.upgrad.tutorial.recyclermultipleviewtype;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by gaurav_bhatnagar on 6/15/2016.
 */

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    MainActivity activity;

    public ItemAdapter(MainActivity activity){
        this.activity = activity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == R.id.group_content){
            return(new RowHolderWithListener(activity.getLayoutInflater()
                    .inflate(R.layout.row, parent, false)));
        }

        return(new GroupTitleController(activity.getLayoutInflater()
                .inflate(R.layout.group_title, parent, false)));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RowHolderWithListener){
            ((RowHolderWithListener)holder).bindModel((String)getItem(position));
        }
        else{
            ((GroupTitleController)holder).bindModel((Integer)getItem(position));
        }
    }

    @Override
    public int getItemCount() {
        int count=0;

        for (String[] groupTitle : activity.shoppingItems) {
            count+=1 + groupTitle.length;
        }

        return(count);
    }



    @Override
    public int getItemViewType(int position) {
        if (getItem(position) instanceof Integer) {
            return(R.id.group_title);
        }

        return(R.id.group_content);
    }


    private Object getItem(int position) {
        int offset=position;
        int groupContentIndex=0;

        for (String[] groupTitle : activity.shoppingItems) {
            if (offset == 0) {
                return(Integer.valueOf(groupContentIndex));
            }

            offset--;

            if (offset < groupTitle.length) {
                return(groupTitle[offset]);
            }

            offset-=groupTitle.length;
            groupContentIndex++;
        }

        throw new IllegalArgumentException("Invalid position: "
                + String.valueOf(position));
    }
}
