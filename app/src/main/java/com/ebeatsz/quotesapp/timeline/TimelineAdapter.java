package com.ebeatsz.quotesapp.timeline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ebeatsz.quotesapp.Quotes;
import com.ebeatsz.quotesapp.QuotesList;
import com.ebeatsz.quotesapp.R;
import com.ebeatsz.quotesapp.categories.CategoriesAdapter;

import java.util.ArrayList;
import java.util.List;

public class TimelineAdapter extends RecyclerView.Adapter<TimelineAdapter.MyViewHolder> {
    private final List<QuotesList> quotes;
    private Context context;

    public TimelineAdapter(List<QuotesList> quotes, Context context) {
        this.quotes = quotes;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.timeline_row, null));
    }

    @Override
    public void onBindViewHolder(@NonNull TimelineAdapter.MyViewHolder holder, int position) {
        holder.quoteTxt.setText(quotes.get(position).getQuote());
        holder.writerName.setText(quotes.get(position).getWriter());
    }

    @Override
    public int getItemCount() {
        return quotes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView quoteTxt, writerName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            quoteTxt = itemView.findViewById(R.id.quoteTxt);
            writerName = itemView.findViewById(R.id.writerName);
        }
    }
}
