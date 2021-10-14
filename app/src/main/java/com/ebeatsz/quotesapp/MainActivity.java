package com.ebeatsz.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ebeatsz.quotesapp.categories.CategoriesAdapter;
import com.ebeatsz.quotesapp.categories.CategoriesList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<CategoriesList> categoriesLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView categoriesRecyclerView = findViewById(R.id.categoriesRecyclerView);

        categoriesRecyclerView.setHasFixedSize(true);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        // Love Category
        CategoriesList loveCategory = new CategoriesList("Love", R.drawable.ic_launcher_foreground);
        categoriesLists.add(loveCategory);

        // Motivation Category
        CategoriesList motivationCategory = new CategoriesList("Motivation", R.drawable.ic_launcher_foreground);
        categoriesLists.add(motivationCategory);

        // English Category
        CategoriesList englishCategory = new CategoriesList("English", R.drawable.ic_launcher_background);
        categoriesLists.add(englishCategory);

        // Success Category
        CategoriesList successCategory = new CategoriesList("Success", R.drawable.ic_launcher_background);
        categoriesLists.add(successCategory);

        // Life Category
        CategoriesList lifeCategory = new CategoriesList("Life", R.drawable.ic_launcher_background);
        categoriesLists.add(lifeCategory);

        // Set adapter to recyclerView
        categoriesRecyclerView.setAdapter(new CategoriesAdapter(categoriesLists, MainActivity.this));



    }
}