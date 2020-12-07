package com.example.krogerrecipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeViewHolder> {

    private Context mContext;
    private List<RecipeData> recipeDataList;

    public RecipeAdapter(Context mContext, List<RecipeData> recipeDataList) {
        this.mContext = mContext;
        this.recipeDataList = recipeDataList;
    }

    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_item, parent);

        return new RecipeViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        holder.mImage.setImageResource(recipeDataList.get(position).getRecipeImage());
        holder.mTitle.setText(recipeDataList.get(position).getRecipeName());
        holder.mDescription.setText(recipeDataList.get(position).getRecipeDescription());
        holder.mPrice.setText(recipeDataList.get(position).getRecipePrice());
    }

    @Override
    public int getItemCount() {
        return recipeDataList.size();
    }
}

class RecipeViewHolder extends RecyclerView.ViewHolder {

    ImageView mImage;
    TextView mTitle, mDescription, mPrice;
    CardView mCardView;

    public RecipeViewHolder(@NonNull View itemView){
        super(itemView);

        mImage = itemView.findViewById(R.id.recipeBriefImage);
        mTitle = itemView.findViewById(R.id.recipeBriefTitle);
        mDescription = itemView.findViewById(R.id.recipeBriefDescription);
        mPrice = itemView.findViewById(R.id.recipeBriefPrice);
        mCardView = itemView.findViewById(R.id.recipeBriefCardView);
    }
}