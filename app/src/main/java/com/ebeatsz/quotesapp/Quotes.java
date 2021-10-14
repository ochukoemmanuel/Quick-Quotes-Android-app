package com.ebeatsz.quotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Quotes extends AppCompatActivity {

    private TextView quoteTxt, writerName;
    private final List<QuotesList> quotesLists = new ArrayList<>();

    private int currentQuotePosition = 0;
    private String getPrevPage;
    private String getQuote;
    private String getWriter;
    private String getName;

    private Button prevBtn;
    private Button nextBtn;
    private ImageView copyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        final TextView categoryName = findViewById(R.id.categoryName);
        quoteTxt = findViewById(R.id.quoteTxt);
        writerName = findViewById(R.id.writerName);

        prevBtn = findViewById(R.id.prevBtn);
        nextBtn = findViewById(R.id.nextBtn);
        copyBtn = findViewById(R.id.copyBtn);

        getName = getIntent().getStringExtra("name");

        getQuote = getIntent().getStringExtra("quote");
        getWriter = getIntent().getStringExtra("writer");
        getPrevPage = getIntent().getStringExtra("prevPage");

        categoryName.setText(getName);




        setQuoteToTextView();

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentQuotePosition--;
                if (currentQuotePosition < 0){
                    currentQuotePosition = quotesLists.size() - 1;
                }

                setQuoteToTextView();
            }
        });

        copyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                CharSequence label;
                if (getPrevPage.equals("Timeline")){
                    ClipData clipData = ClipData.newPlainText("quote", getQuote + "\nby: " + getWriter);
                    clipboardManager.setPrimaryClip(clipData);
                } else if (getPrevPage.equals("main")){
                    ClipData clipData = ClipData.newPlainText("quote", quotesLists.get(currentQuotePosition).getQuote() + "\nby: " + quotesLists.get(currentQuotePosition).getWriter());
                    clipboardManager.setPrimaryClip(clipData);
                }

                Toast.makeText(Quotes.this, "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentQuotePosition++;
                if (currentQuotePosition >= quotesLists.size()){
                    currentQuotePosition = 0;
                }

                setQuoteToTextView();
            }
        });

    }

    private void setQuoteToTextView(){
        if (getPrevPage.equals("Timeline")){
            // Set prevBtn and nextBtn to not visible
            prevBtn.setVisibility(View.GONE);
            nextBtn.setVisibility(View.GONE);

            quoteTxt.setText(getQuote);
            writerName.setText(getWriter);
        } else if (getPrevPage.equals("main")){

            quoteTxt.setText(quotesLists.get(currentQuotePosition).getQuote());
            writerName.setText(quotesLists.get(currentQuotePosition).getWriter());

            if (getName.equals("Life")){
                quotesLists.addAll(QuoteData.getLifeQuotes());
            }else if (getName.equals("Motivation")){
                quotesLists.addAll((QuoteData.getMotivationQuotes()));
            }else if (getName.equals("Love")){
                quotesLists.addAll(QuoteData.getLoveQuotes());
            }else if (getName.equals("Success")){
                quotesLists.addAll(QuoteData.getSuccessQuotes());
            }else if (getName.equals("English")){
                quotesLists.addAll(QuoteData.getEnglishQuotes());
            }
        }
    }
}