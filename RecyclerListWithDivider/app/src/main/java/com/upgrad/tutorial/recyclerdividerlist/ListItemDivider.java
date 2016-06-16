package com.upgrad.tutorial.recyclerdividerlist;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by gaurav_bhatnagar on 6/15/2016.
 */
public class ListItemDivider extends RecyclerView.ItemDecoration {
    private Drawable divider;

    public ListItemDivider(Drawable divider) {
        this.divider=divider.mutate();
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int left=parent.getPaddingLeft();
        int right=parent.getWidth()-parent.getPaddingRight();

        int childCount=parent.getChildCount();

        for (int i=0; i<childCount-1; i++) {
            View child=parent.getChildAt(i);
            RecyclerView.LayoutParams params=
                    (RecyclerView.LayoutParams)child.getLayoutParams();

            int top=child.getBottom()+params.bottomMargin;
            int bottom=top+divider.getIntrinsicHeight();

            divider.setBounds(left, top, right, bottom);
            divider.draw(c);
        }
    }
}
