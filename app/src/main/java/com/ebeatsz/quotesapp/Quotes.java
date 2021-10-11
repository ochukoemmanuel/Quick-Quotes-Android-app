package com.ebeatsz.quotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Quotes extends AppCompatActivity {

    private TextView quoteTxt, writerName;
    private final List<QuotesList> quotesLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        final TextView categoryName = findViewById(R.id.categoryName);
        quoteTxt = findViewById(R.id.quoteTxt);
        writerName = findViewById(R.id.writerName);

        final Button prevBtn = findViewById(R.id.prevBtn);
        final Button nextBtn = findViewById(R.id.nextBtn);
        final ImageView copyBtn = findViewById(R.id.copyBtn);

        final String getName = getIntent().getStringExtra("name");

        categoryName.setText(getName);

        if (getName.equals("Life")){
            quotesLists.add((QuotesList) QuoteData.getLifeQuotes());
        }else if (getName.equals("Motivation")){
            quotesLists.add((QuotesList) QuoteData.getMotivationQuotes());
        }else if (getName.equals("Love")){
            quotesLists.add((QuotesList) QuoteData.getLoveQuotes());
        }else if (getName.equals("Success")){
            quotesLists.add((QuotesList) QuoteData.getSuccessQuotes());
        }else if (getName.equals("English")){
            quotesLists.add((QuotesList) QuoteData.getEnglishQuotes());
        }

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}