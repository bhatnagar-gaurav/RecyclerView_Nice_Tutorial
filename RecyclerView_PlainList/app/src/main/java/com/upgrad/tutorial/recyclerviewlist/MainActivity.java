package com.upgrad.tutorial.recyclerviewlist;

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

        // Setting the Layout Manager
        setLayoutManager(new LinearLayoutManager(this));

        // Instantiating the adapter for the RecyclerView
        ItemAdapter itemAdapter = new ItemAdapter(this);

        // Setting the adapter for the recyclerView
        setAdapter(itemAdapter);
    }
}
