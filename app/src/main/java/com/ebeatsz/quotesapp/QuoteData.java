package com.ebeatsz.quotesapp;

import java.util.ArrayList;
import java.util.List;

public class QuoteData {
    public static List<QuotesList> getLifeQuotes(){
        final List<QuotesList> lifeQuotesList = new ArrayList<>();

        QuotesList lifeQuote1 = new QuotesList("This is LifeQuote 1", " LifeQuote writer 1");
        lifeQuotesList.add(lifeQuote1);

        QuotesList lifeQuote2 = new QuotesList("This is LifeQuote 2", "LifeQuote writer 2");
        lifeQuotesList.add(lifeQuote2);

        QuotesList lifeQuote3 = new QuotesList("This is LifeQuote 3", "LifeQuote writer 3");
        lifeQuotesList.add(lifeQuote3);

        QuotesList lifeQuote4 = new QuotesList("This is LifeQuote 4", "LifeQuote writer 4");
        lifeQuotesList.add(lifeQuote4);

        return lifeQuotesList;
    }

    public static List<QuotesList> getMotivationQuotes(){
        final List<QuotesList> MotivationQuotesList = new ArrayList<>();

        QuotesList MotivationQuote1 = new QuotesList("This is MotivationQuote 1", "MotivationQuote writer 1");
        MotivationQuotesList.add(MotivationQuote1);

        QuotesList MotivationQuote2 = new QuotesList("This is MotivationQuote 2", "MotivationQuote writer 2");
        MotivationQuotesList.add(MotivationQuote2);

        QuotesList MotivationQuote3 = new QuotesList("This is MotivationQuote 3", "MotivationQuote writer 3");
        MotivationQuotesList.add(MotivationQuote3);

        QuotesList MotivationQuote4 = new QuotesList("This is MotivationQuote 4", "MotivationQuote writer 4");
        MotivationQuotesList.add(MotivationQuote4);

        return MotivationQuotesList;
    }

    public static List<QuotesList> getLoveQuotes(){
        final List<QuotesList> LoveQuotesList = new ArrayList<>();

        QuotesList LoveQuote1 = new QuotesList("This is LoveQuote 1", "LoveQuote writer 1");
        LoveQuotesList.add(LoveQuote1);

        QuotesList LoveQuote2 = new QuotesList("This is LoveQuote 2", "LoveQuote writer 2");
        LoveQuotesList.add(LoveQuote2);

        QuotesList LoveQuote3 = new QuotesList("This is LoveQuote 3", "LoveQuote writer 3");
        LoveQuotesList.add(LoveQuote3);

        QuotesList LoveQuote4 = new QuotesList("This is LoveQuote 4", "LoveQuote writer 4");
        LoveQuotesList.add(LoveQuote4);

        return LoveQuotesList;
    }

    public static List<QuotesList> getSuccessQuotes(){
        final List<QuotesList> SuccessQuotesList = new ArrayList<>();

        QuotesList SuccessQuote1 = new QuotesList("This is SuccessQuote 1", "SuccessQuote writer 1");
        SuccessQuotesList.add(SuccessQuote1);

        QuotesList SuccessQuote2 = new QuotesList("This is SuccessQuote 2", "SuccessQuote writer 2");
        SuccessQuotesList.add(SuccessQuote2);

        QuotesList SuccessQuote3 = new QuotesList("This is SuccessQuote 3", "SuccessQuote writer 3");
        SuccessQuotesList.add(SuccessQuote3);

        QuotesList SuccessQuote4 = new QuotesList("This is SuccessQuote 4", "SuccessQuote writer 4");
        SuccessQuotesList.add(SuccessQuote4);

        return SuccessQuotesList;
    }

    public static List<QuotesList> getEnglishQuotes(){
        final List<QuotesList> EnglishQuotesList = new ArrayList<>();

        QuotesList EnglishQuote1 = new QuotesList("This is EnglishQuote 1", "EnglishQuote writer 1");
        EnglishQuotesList.add(EnglishQuote1);

        QuotesList EnglishQuote2 = new QuotesList("This is EnglishQuote 2", "EnglishQuote writer 2");
        EnglishQuotesList.add(EnglishQuote2);

        QuotesList EnglishQuote3 = new QuotesList("This is EnglishQuote 3", "EnglishQuote writer 3");
        EnglishQuotesList.add(EnglishQuote3);

        QuotesList EnglishQuote4 = new QuotesList("This is EnglishQuote 4", "EnglishQuote writer 4");
        EnglishQuotesList.add(EnglishQuote4);

        return EnglishQuotesList;
    }
}
