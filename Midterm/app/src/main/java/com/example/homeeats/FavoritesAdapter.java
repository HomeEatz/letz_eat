package com.example.homeeats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FavoritesAdapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<String> data;

    FavoritesAdapter(Context context, List<String> data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.custom_favorites_view, parent, false);
        return new Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        String title = data.get(position);
        holder.textTitle.setText(title);

        final int i = holder.pos;



        switch (title){
            case "Steak n' Shake":
                holder.resImage.setImageResource(R.drawable.steak_shake);
                holder.textDescription.setText("Fast Food");
                holder.textAdress.setText("443 N Semoran Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 3.9 stars");
                holder.distanceText.setText("0.7 miles");
                holder.pos = 0;
                break;
            case "Chick-fil-A":
                holder.resImage.setImageResource(R.drawable.chic_a);
                holder.textDescription.setText("Fast Food");
                holder.textAdress.setText("3391 University Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.6 stars");
                holder.distanceText.setText("0.5 miles");
                holder.pos = 0;
                break;
            case "Perkins Restaurant & Bakery":
                holder.resImage.setImageResource(R.drawable.perkins_res);
                holder.textDescription.setText("American");
                holder.textAdress.setText("6425 University Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.4 stars");
                holder.distanceText.setText("0.5 miles");
                holder.pos = 0;
                break;
            case "Garita Del Sabor":
                holder.resImage.setImageResource(R.drawable.garita_del_sabor);
                holder.textDescription.setText("Spanish");
                holder.textAdress.setText("3413 Forsyth Rd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 1.0 stars");
                holder.distanceText.setText("0.6 miles");
                holder.pos = 0;
                break;
            case "Rincon Latino Cafe":
                holder.resImage.setImageResource(R.drawable.rincon_latino);
                holder.textDescription.setText("Spanish");
                holder.textAdress.setText("3327 Forsyth Rd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.5 stars");
                holder.distanceText.setText("0.7 miles");
                holder.pos = 0;
                break;
            case "Costco Food Court":
                holder.resImage.setImageResource(R.drawable.costco_food);
                holder.textDescription.setText("American");
                holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.5 stars");
                holder.distanceText.setText("0.3 miles");
                holder.pos = 0;
                break;
            case "Miller's Ale House":
                holder.resImage.setImageResource(R.drawable.millers_ale);
                holder.textDescription.setText("American");
                holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.1 stars");
                holder.distanceText.setText("0.1 miles");
                holder.pos = 0;
                break;
            case "China Garden Restaurant":
                holder.resImage.setImageResource(R.drawable.china_garden);
                holder.textDescription.setText("Asian");
                holder.textAdress.setText("118 S Semoran Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 3.8 stars");
                holder.distanceText.setText("0.3 miles");
                holder.pos = 0;
                break;
            case "Arooga's":
                holder.resImage.setImageResource(R.drawable.aroogas_);
                holder.textDescription.setText("American");
                holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.2 stars");
                holder.distanceText.setText("0.2 miles");
                holder.pos = 0;
                break;
            case "Chili's Grill & Bar":
                holder.resImage.setImageResource(R.drawable.chilis_grill);
                holder.textDescription.setText("American");
                holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.1 stars");
                holder.distanceText.setText("0.2 miles");
                holder.pos = 0;
                break;
            case "Firehouse Subs":
                holder.resImage.setImageResource(R.drawable.firehouse_subs);
                holder.textDescription.setText("American");
                holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.4 stars");
                holder.distanceText.setText("0.2 miles");
                holder.pos = 0;
                break;
            case "Kiko Japanese Cuisine":
                holder.resImage.setImageResource(R.drawable.kiko_japan);
                holder.textDescription.setText("Asian");
                holder.textAdress.setText("110 S Semoran Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.5 stars");
                holder.distanceText.setText("0.4 miles");
                holder.pos = 0;
                break;
            case "Bolay":
                holder.resImage.setImageResource(R.drawable.bolay_);
                holder.textDescription.setText("American");
                holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.5 stars");
                holder.distanceText.setText("2.0 miles");
                holder.pos = 0;
                break;
            case "Boston's Fish House":
                holder.resImage.setImageResource(R.drawable.bostons_fish);
                holder.textDescription.setText("American");
                holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.5 stars");
                holder.distanceText.setText("1.0 miles");
                holder.pos = 0;
                break;
            case "Anna's Polish Restaurant":
                holder.resImage.setImageResource(R.drawable.annas_polish);
                holder.textDescription.setText("Polish");
                holder.textAdress.setText("3586 Aloma Ave # 7, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.7 stars");
                holder.distanceText.setText("1.2 miles");
                holder.pos = 0;
                break;
            case "Moghul Indian Cuisine":
                holder.resImage.setImageResource(R.drawable.moghul_indian_cuisine);
                holder.textDescription.setText("Asian");
                holder.textAdress.setText("401 N Semoran Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.4 stars");
                holder.distanceText.setText("0.6 miles");
                holder.pos = 0;
                break;
            case "La Granja":
                holder.resImage.setImageResource(R.drawable.la_granja);
                holder.textDescription.setText("Spanish");
                holder.textAdress.setText("490 N Semoran Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.4 stars");
                holder.distanceText.setText("0.7 miles");
                holder.pos = 0;
                break;
            case "Habaneros Mexican Restaurant":
                holder.resImage.setImageResource(R.drawable.habanero_mexican);
                holder.textDescription.setText("Spanish");
                holder.textAdress.setText("494 N Semoran Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.3 stars");
                holder.distanceText.setText("0.7 miles");
                holder.pos = 0;
                break;
            case "La Hacienda":
                holder.resImage.setImageResource(R.drawable.la_hacienda);
                holder.textDescription.setText("Spanish");
                holder.textAdress.setText("3090 Aloma Ave # 145, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.4 stars");
                holder.distanceText.setText("0.7 miles");
                holder.pos = 0;
                break;
            case "Thai Villa Restaurant":
                holder.resImage.setImageResource(R.drawable.thai_villa);
                holder.textDescription.setText("Asian");
                holder.textAdress.setText("7355 Aloma Ave, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.6 stars");
                holder.distanceText.setText("1.4 miles");
                holder.pos = 0;
                break;
            case "Mi Raza Restaurant":
                holder.resImage.setImageResource(R.drawable.mi_raza);
                holder.textDescription.setText("Spanish");
                holder.textAdress.setText("1810 FL-436, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.2 stars");
                holder.distanceText.setText("1.7 miles");
                holder.pos = 0;
                break;
            case "Arigato Sushi Restaurant":
                holder.resImage.setImageResource(R.drawable.arigato_sushi);
                holder.textDescription.setText("Asian");
                holder.textAdress.setText("1560 Semoran N Cir, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.3 stars");
                holder.distanceText.setText("2.2 miles");
                holder.pos = 0;
                break;
            case "Kai Asian Street Restaurant":
                holder.resImage.setImageResource(R.drawable.kai_asian);
                holder.textDescription.setText("Asian");
                holder.textAdress.setText("1555 FL-436 Suite 1171, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.6 stars");
                holder.distanceText.setText("2.2 miles");
                holder.pos = 0;
                break;
            case "Mei Garden":
                holder.resImage.setImageResource(R.drawable.mei_garden);
                holder.textDescription.setText("Asian");
                holder.textAdress.setText("3760 Howell Branch Rd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.3 stars");
                holder.distanceText.setText("3.2 miles");
                holder.pos = 0;
                break;
            case "Jalisco":
                holder.resImage.setImageResource(R.drawable.jalisco_);
                holder.textDescription.setText("Spanish");
                holder.textAdress.setText("2021 N Goldenrod Rd, Orlando, FL 32807");
                holder.ratingText.setText("Rating: 4.5 stars");
                holder.distanceText.setText("3.1 miles");
                holder.pos = 0;
                break;
            case "He Sheng":
                holder.resImage.setImageResource(R.drawable.he_sheng);
                holder.textDescription.setText("Asian");
                holder.textAdress.setText("7756 University Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.4 stars");
                holder.distanceText.setText("1.4 miles");
                holder.pos = 0;
                break;
            case "Toasted":
                holder.resImage.setImageResource(R.drawable.toasted_);
                holder.textDescription.setText("American");
                holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                holder.ratingText.setText("Rating: 4.5 stars");
                holder.distanceText.setText("2.0 miles");
                holder.pos = 0;
                break;
            case "Tibby's":
                holder.resImage.setImageResource(R.drawable.tibbys_);
                holder.textDescription.setText("American");
                holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.6 stars");
                holder.distanceText.setText("1.7 miles");
                holder.pos = 0;
                break;
            case "Mellow Mushroom":
                holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                holder.textDescription.setText("American");
                holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.5 stars");
                holder.distanceText.setText("1.8 miles");
                holder.pos = 0;
                break;
            case "Viet-Nomz":
                holder.resImage.setImageResource(R.drawable.viet_nomz);
                holder.textDescription.setText("Asian");
                holder.textAdress.setText("7581 University Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.7 stars");
                holder.distanceText.setText("1.3 miles");
                holder.pos = 0;
                break;
            case "Zaxby's":
                holder.resImage.setImageResource(R.drawable.zaxbys_);
                holder.textDescription.setText("American");
                holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.2 stars");
                holder.distanceText.setText("0.6 miles");
                holder.pos = 0;
                break;
            case "McDonald's":
                holder.resImage.setImageResource(R.drawable.mcdonalds);
                holder.textDescription.setText("Fast Food");
                holder.textAdress.setText("3162 University Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 3.6 stars");
                holder.distanceText.setText("0.1 miles");
                holder.pos = 1;
                break;
            case "Wendy's":
                holder.resImage.setImageResource(R.drawable.wendys);
                holder.textDescription.setText("Fast Food");
                holder.textAdress.setText("365 University Park Dr, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 3.8 stars");
                holder.distanceText.setText("0.3 miles");
                holder.pos = 2;
                break;
            case "Little Caesars":
                holder.resImage.setImageResource(R.drawable.littlecaesars);
                holder.textDescription.setText("Fast Food");
                holder.textAdress.setText("495 N Semoran Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 4.1 stars");
                holder.distanceText.setText("0.8 miles");

                holder.pos = 3;
                break;
            case "Dunkin Donuts":
                holder.resImage.setImageResource(R.drawable.dd);
                holder.textDescription.setText("Fast Food");
                holder.textAdress.setText("6627 University Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 3.6 stars");
                holder.distanceText.setText("0.6 miles");

                holder.pos = 4;
                break;
            case "Burger King":
                holder.resImage.setImageResource(R.drawable.burger_king);
                holder.textDescription.setText("Fast Food");
                holder.textAdress.setText("6709 University Blvd, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 3.1 stars");
                holder.distanceText.setText("0.7 miles");

                holder.pos = 5;
                break;
            case "KFC":
                holder.resImage.setImageResource(R.drawable.kfc);
                holder.textDescription.setText("Fast Food");
                holder.textAdress.setText(" 4250 Aloma Ave, Winter Park, FL 32792");
                holder.ratingText.setText("Rating: 3.5 stars");
                holder.distanceText.setText("3.0 miles");

                holder.pos = 6;
                break;
        }


    }



    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textTitle, textDescription, textAdress, ratingText, distanceText, categoryText;
        ImageView resImage;
        int pos;
        Button saveBtn;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.textTitle);
            textDescription = itemView.findViewById(R.id.textDescription);
            resImage = itemView.findViewById(R.id.restaurantImage);
            textAdress = itemView.findViewById(R.id.textAddress);
            saveBtn = itemView.findViewById(R.id.saveButton);
            distanceText = itemView.findViewById(R.id.distanceTextView);
            ratingText = itemView.findViewById(R.id.ratingTextView);
            categoryText = itemView.findViewById(R.id.categoryTextView);
        }
    }
}
