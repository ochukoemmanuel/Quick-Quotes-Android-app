package com.ebeatsz.quotesapp.timeline;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ebeatsz.quotesapp.Quotes;
import com.ebeatsz.quotesapp.QuotesList;
import com.ebeatsz.quotesapp.R;
import com.ebeatsz.quotesapp.Timeline;
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

        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Quotes.class);
                intent.putExtra("quote", quotes.get(position).getQuote());
                intent.putExtra("writer", quotes.get(position).getWriter());
                intent.putExtra("prevPage", "Timeline");

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return quotes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView quoteTxt, writerName;
        LinearLayout container;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            quoteTxt = itemView.findViewById(R.id.quoteTxt);
            writerName = itemView.findViewById(R.id.writerName);
            container = itemView.findViewById(R.id.container);

        }
    }
}
