package com.upgrad.tutorial.recyclermultipleviewtype;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by gaurav_bhatnagar on 6/15/2016.
 * Name : GroupTitleController
 * Purpose : ViewHolder for Different View Type in the RecyclerView.
 */
public class GroupTitleController extends RecyclerView.ViewHolder {
    TextView titleLabel=null;
    String template=null;

    GroupTitleController(View row) {
        super(row);

        titleLabel=(TextView)row.findViewById(R.id.title_label);

        template=titleLabel.getContext().getString(R.string.row_title_template);
    }

    void bindModel(Integer headerIndex) {
        titleLabel.setText(String.format(template, headerIndex.intValue()+1));
    }
}
