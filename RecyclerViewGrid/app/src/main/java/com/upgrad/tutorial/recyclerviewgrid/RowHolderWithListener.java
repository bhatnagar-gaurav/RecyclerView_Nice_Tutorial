package com.upgrad.tutorial.recyclerviewgrid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by gaurav_bhatnagar on 6/15/2016.
 */
public class RowHolderWithListener extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView itemLabel=null;
    TextView magnitude=null;
    ImageView avatar=null;
    String template=null;

    RowHolderWithListener(View row) {
        super(row);

        itemLabel=(TextView)row.findViewById(R.id.item_label);
        magnitude=(TextView)row.findViewById(R.id.magnitude);
        avatar=(ImageView)row.findViewById(R.id.avatar);

        template=magnitude.getContext().getString(R.string.size_template);

        // Setting the OnClickListener for the row
        row.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),
                String.format("Clicked on position %d", getAdapterPosition()+1),
                Toast.LENGTH_SHORT).show();
    }
}