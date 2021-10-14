package com.ebeatsz.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.ebeatsz.quotesapp.timeline.TimelineAdapter;

import java.util.ArrayList;
import java.util.List;

public class Timeline extends AppCompatActivity {

    private List<QuotesList> quotesList = new ArrayList<>();
    int lastVisiblePosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        final RecyclerView recyclerView = findViewById(R.id.Timeline_recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(Timeline.this ));

        for (int i = 0; i < 10; i++){
            quotesList.add(new QuotesList("Get free daily quotes", "free quotes"));
        }


        recyclerView.setAdapter(new TimelineAdapter(quotesList, Timeline.this));
    }
}