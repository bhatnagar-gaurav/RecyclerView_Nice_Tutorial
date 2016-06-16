package com.upgrad.tutorial.recyclerdividerlist;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

public class MainActivity extends RecyclerViewActivity {

    public static final String[] shoppingItems={"lotion", "black salt", "powder",
            "salt", "pen",
            "ocra", "biscuits", "corn", "cake", "veal",
            "liquor", "vinegar", "tomatoes", "gourd", "mangoes",
            "pizza", "ink", "ice", "potatoes", "pear",
            "toothpaste", "sodas", "shampoo", "soaps", "purse"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting the title
        setTitle(R.string.app_name);

        // Setting the Layout Manager
        setLayoutManager(new LinearLayoutManager(this));


        // Initializing the Drawable for Divider
        Drawable divider=getResources().getDrawable(R.drawable.list_item_divider);

        //Setting the divider as an ItemDecorator for the RecyclerView
        getRecyclerView().addItemDecoration(new ListItemDivider(divider));

        // Instantiating the adapter for the RecyclerView
        ItemAdapter itemAdapter = new ItemAdapter(this);

        // Setting the adapter for the recyclerView
        setAdapter(itemAdapter);
    }
}