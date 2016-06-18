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

    // Returning the length of Extra GroupTitle Rows along with the regular row contents.
    @Override
    public int getItemCount() {
        int count=0;

        for (String[] groupTitle : activity.shoppingItems) {
            count+=1 + groupTitle.length;
        }

        return(count);
    }


    /* This method returns R.id.group_title or R.id.group_content to identify the two row types.
       It specifies which row type corresponds to which specific position.
     */
    @Override
    public int getItemViewType(int position) {
        if (getItem(position) instanceof Integer) {
            return(R.id.group_title);
        }

        return(R.id.group_content);
    }


    private Object getItem(int position) {
        int offset=position;
        int groupTitleIndex=0;

        for (String[] groupContent : activity.shoppingItems) {
            if (offset == 0) {
                return(Integer.valueOf(groupTitleIndex));
            }

            offset--;

            if (offset < groupContent.length) {
                return(groupContent[offset]);
            }

            offset-=groupContent.length;
            groupTitleIndex++;
        }

        throw new IllegalArgumentException("Invalid position: "
                + String.valueOf(position));
    }
}
