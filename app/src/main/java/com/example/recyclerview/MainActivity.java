package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

import Adapters.RecipeAdapter;
import models.RecipeModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recyclerView);

        ArrayList<RecipeModel> list =new ArrayList<>();

        list.add(new RecipeModel(R.drawable.coffee, "coffee" ));
        list.add(new RecipeModel(R.drawable.coffee, "coffee" ));
        list.add(new RecipeModel(R.drawable.coffee, "coffee" ));
        list.add(new RecipeModel(R.drawable.coffee, "coffee" ));
        list.add(new RecipeModel(R.drawable.coffee, "coffee" ));
        list.add(new RecipeModel(R.drawable.coffee, "coffee" ));

        RecipeAdapter adapter = new RecipeAdapter(list, this);
        recyclerView.setAdapter(adapter);

//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager. HORIZONTAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);


//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);



        LinearLayoutManager layoutManager =new LinearLayoutManager(this);       //for vertical list view we use "this", by-default it is vertical
        recyclerView.setLayoutManager(layoutManager);

//       LinearLayoutManager layoutManager =new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);       // for horizontal we have to pass two parameters, false for right side scroll, true for left side scroll.
//        recyclerView.setLayoutManager(layoutManager);
System.out.println("mmmmmmmmmmmmmmm");

    }
}