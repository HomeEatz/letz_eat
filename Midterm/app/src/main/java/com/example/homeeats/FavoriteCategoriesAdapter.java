package com.example.homeeats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FavoriteCategoriesAdapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    public boolean[] positions = new boolean[5];
    final public boolean [] distancePositions = new boolean[9];
    final public float[] distances = new float[37];
    private LayoutInflater layoutInflater;
    private List<String> data;


    FavoriteCategoriesAdapter(Context context, List<String> data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.custom_favorite_categories_view, parent, false);
        return new Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {




        switch (position){
            case 0:

                holder.textTitle.setText("Asian");
                holder.resImage.setImageResource(R.drawable.asia_titled);

                if (positions[0] == true){
                    holder.saveBtn.setChecked(true);
                }
                else {
                    holder.saveBtn.setChecked(false);
                }


                holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        positions[0] = isChecked;
                    }
                });
                break;

            case 1:
                holder.textTitle.setText("American");
                holder.resImage.setImageResource(R.drawable.american_food);

                if (positions[1] == true){
                    holder.saveBtn.setChecked(true);
                }
                else {
                    holder.saveBtn.setChecked(false);
                }
                holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        positions[1] = isChecked;
                    }
                });
//                holder.saveBtn.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        positions[1] = holder.pos;
//
//                    }
//                });
                break;
            case 2:
                holder.textTitle.setText("Polish");
                holder.resImage.setImageResource(R.drawable.polish_food);

                if (positions[2] == true){
                    holder.saveBtn.setChecked(true);
                }
                else {
                    holder.saveBtn.setChecked(false);
                }
                holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        positions[2] = isChecked;
                    }
                });

                break;
            case 3:
                holder.textTitle.setText("Fast Food");
                holder.resImage.setImageResource(R.drawable.fastfood);

                if (positions[3] == true){
                    holder.saveBtn.setChecked(true);
                }
                else {
                    holder.saveBtn.setChecked(false);
                }
                holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        positions[3] = isChecked;
                    }
                });
//                holder.saveBtn.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                        positions[3] = holder.pos;
//                    }
//                });
                break;
            case 4:
                holder.textTitle.setText("Spanish/Latin");
                holder.resImage.setImageResource(R.drawable.spanish_food);

                if (positions[4] == true){
                    holder.saveBtn.setChecked(true);
                }
                else {
                    holder.saveBtn.setChecked(false);
                }
                holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        positions[4] = isChecked;
                    }
                });

//                holder.saveBtn.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                        positions[4] = holder.pos;
//                    }
//                });
                break;


        }


    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textTitle, textDescription, textAdress, ratingText, distanceText;
        ImageView resImage;
        int pos;
        boolean resPosition;
        ToggleButton saveBtn;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.textTitle);
            resImage = itemView.findViewById(R.id.restaurantImage);
            saveBtn = itemView.findViewById(R.id.saveButton);


        }
    }
}

