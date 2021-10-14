package com.ebeatsz.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.Toast;

import com.ebeatsz.quotesapp.timeline.TimelineAdapter;

import java.util.ArrayList;
import java.util.List;

public class Timeline extends AppCompatActivity {

    private List<QuotesList> quotesList = new ArrayList<>();
    int lastVisiblePosition;
    private TableLayout tab;
    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        final RecyclerView recyclerView = findViewById(R.id.Timeline_recyclerView);

        tab = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tab.setupWithViewPager(viewPager);

        ViewAdapter viewAdapter = new ViewAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewAdapter.addFragment(new fragment1(), "Timeline");
        viewAdapter.addFragment(new fragment2(), "Category");

        viewAdapter.setAdapter(viewAdapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(Timeline.this ));

        for (int i = 0; i < 10; i++){
            quotesList.add(new QuotesList("Get free daily quotes " + i, "free quotes " + i));
        }


        recyclerView.setAdapter(new TimelineAdapter(quotesList, Timeline.this));
    }
}