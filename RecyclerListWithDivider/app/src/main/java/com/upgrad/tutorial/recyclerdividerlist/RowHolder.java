package com.upgrad.tutorial.recyclerdividerlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by gaurav_bhatnagar on 6/15/2016.
 */
public class RowHolder extends RecyclerView.ViewHolder {
    TextView itemLabel=null;
    TextView magnitude=null;
    ImageView avatar=null;
    String template=null;

    RowHolder(View row) {
        super(row);

        itemLabel=(TextView)row.findViewById(R.id.item_label);
        magnitude=(TextView)row.findViewById(R.id.magnitude);
        avatar=(ImageView)row.findViewById(R.id.avatar);

        template=magnitude.getContext().getString(R.string.size_template);
    }

    void bindModel(String item) {
        itemLabel.setText(item);
        magnitude.setText(String.format(template, item.length()));

        if (item.length()>4) {
            avatar.setImageResource(R.drawable.recycle);
        }
        else {
            avatar.setImageResource(R.drawable.great);
        }
    }
}