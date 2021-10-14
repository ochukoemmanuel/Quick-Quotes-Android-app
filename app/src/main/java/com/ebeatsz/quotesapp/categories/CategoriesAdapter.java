package com.ebeatsz.quotesapp.categories;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ebeatsz.quotesapp.Quotes;
import com.ebeatsz.quotesapp.R;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyViewHolder> {

    private final List<CategoriesList> categoriesLists;
    private final Context context;

    public CategoriesAdapter(List<CategoriesList> categoriesLists, Context context) {
        this.categoriesLists = categoriesLists;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoriesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_adapter_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.MyViewHolder holder, int position) {
        CategoriesList list2 = categoriesLists.get(position);

        holder.categoryName.setText(list2.getCategoryName());
        holder.categoryImage.setImageResource(list2.getCategoryImg());

        holder.rootLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Quotes.class);
                intent.putExtra("name", list2.getCategoryName());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoriesLists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private final TextView categoryName;
        private final ImageView categoryImage;
        private final CardView rootLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryName = itemView.findViewById(R.id.categoryName);
            categoryImage = itemView.findViewById(R.id.categoryImage);
            rootLayout = itemView.findViewById(R.id.rootLayout);

        }
    }
}
