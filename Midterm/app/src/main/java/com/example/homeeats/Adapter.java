package com.example.homeeats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    final public boolean[] positions = new boolean[37]; //12
    final public int [] notFavorite = new int[37];
    final public boolean[] asianPositions = new boolean[9];
    final public boolean[] americanPositions = new boolean[12];
    final public boolean[] fastFoodPositions = new boolean[8];
    final public boolean[] spanishPositions = new boolean[7];
    public boolean polishPosition = false;
    final public float [] ratingPositions = new float[37];
    final public float[] distances = new float[37];
    private LayoutInflater layoutInflater;
    private List<String> data;
    public String category = "";
    public boolean isDefault;
    public float [] fastFoodDistances = new float[8];
    public float [] spanishDistances = new float[7];
    public float [] americanDistances = new float[12];
    public  float [] asianDistances = new float[9];
    public float polishDistance;
    public float [] fastFoodRating = new float[8];
    public float [] spanishRating = new float[7];
    public float [] americanRating = new float[12];
    public float [] asianRating = new float[9];
    public float polishRating;



    Adapter(Context context, List<String> data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.custom_view, parent, false);

        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {


        final int[] i = new int[7];

        fastFoodDistances[0] = (float) 0.7;
        fastFoodDistances[1] = (float) 0.5;
        fastFoodDistances[2] = (float) 0.1;
        fastFoodDistances[3] = (float) 0.3;
        fastFoodDistances[4] = (float) 0.8;
        fastFoodDistances[5] = (float) 0.6;
        fastFoodDistances[6] = (float) 0.7;
        fastFoodDistances[7] = (float) 3.0;

        spanishDistances[0] = (float) 0.6;
        spanishDistances[1] = (float) 0.7;
        spanishDistances[2] = (float) 0.7;
        spanishDistances[3] = (float) 0.7;
        spanishDistances[4] = (float) 0.7;
        spanishDistances[5] = (float) 1.7;
        spanishDistances[6] = (float) 3.1;


        americanDistances[0] = (float) 0.5;
        americanDistances[1] = (float) 0.3;
        americanDistances[2] = (float) 0.1;
        americanDistances[3] = (float) 0.2;
        americanDistances[4] = (float) 0.2;
        americanDistances[5] = (float) 0.2;
        americanDistances[6] = (float) 2.0;
        americanDistances[7] = (float) 1.0;
        americanDistances[8] = (float) 2.0;
        americanDistances[9] = (float) 1.7;
        americanDistances[10] = (float) 1.8;
        americanDistances[11] = (float) 0.6;

        asianDistances[0] = (float) 0.3;
        asianDistances[1] = (float) 0.4;
        asianDistances[2] = (float) 0.6;
        asianDistances[3] = (float) 1.4;
        asianDistances[4] = (float) 2.2;
        asianDistances[5] = (float) 2.2;
        asianDistances[6] = (float) 3.2;
        asianDistances[7] = (float) 1.4;
        asianDistances[8] = (float) 1.3;

        polishDistance = (float) 1.2;

        fastFoodRating[0] = (float) 3.9;
        fastFoodRating[1] = (float) 4.6;
        fastFoodRating[2] = (float) 3.6;
        fastFoodRating[3] = (float) 3.8;
        fastFoodRating[4] = (float) 4.1;
        fastFoodRating[5] = (float) 3.6;
        fastFoodRating[6] = (float) 3.1;
        fastFoodRating[7] = (float) 3.5;

        spanishRating[0] = (float) 1.0;
        spanishRating[1] = (float) 4.5;
        spanishRating[2] = (float) 4.4;
        spanishRating[3] = (float) 4.3;
        spanishRating[4] = (float) 4.4;
        spanishRating[5] = (float) 4.2;
        spanishRating[6] = (float) 4.5;

        americanRating[0] = (float) 4.4;
        americanRating[1] = (float) 4.5;
        americanRating[2] = (float) 4.1;
        americanRating[3] = (float) 4.2;
        americanRating[4] = (float) 4.1;
        americanRating[5] = (float) 4.4;
        americanRating[6] = (float) 4.5;
        americanRating[7] = (float) 4.5;
        americanRating[8] = (float) 4.5;
        americanRating[9] = (float) 4.6;
        americanRating[10] = (float) 4.5;
        americanRating[11] = (float) 4.2;

        asianRating[0] = (float) 3.8;
        asianRating[1] = (float) 4.5;
        asianRating[2] = (float) 4.4;
        asianRating[3] = (float) 4.6;
        asianRating[4] = (float) 4.3;
        asianRating[5] = (float) 4.6;
        asianRating[6] = (float) 4.3;
        asianRating[7] = (float) 4.4;
        asianRating[8] = (float) 4.7;

        polishRating = (float) 4.7;


        ratingPositions[0] = (float) 3.9;
        ratingPositions[1] = (float) 4.6;
        ratingPositions[2] = (float) 4.4;
        ratingPositions[3] = (float) 1.0;
        ratingPositions[4] = (float) 4.5;
        ratingPositions[5] = (float) 4.5;
        ratingPositions[6] = (float) 4.1;
        ratingPositions[7] = (float) 3.8;
        ratingPositions[8] = (float) 4.2;
        ratingPositions[9] = (float) 4.1;
        ratingPositions[10] = (float) 4.4;
        ratingPositions[11] = (float) 4.5;
        ratingPositions[12] = (float) 4.5;
        ratingPositions[13] = (float) 4.5;
        ratingPositions[14] = (float) 4.7;
        ratingPositions[15] = (float) 4.4;
        ratingPositions[16] = (float) 4.4;
        ratingPositions[17] = (float) 4.3;
        ratingPositions[18] = (float) 4.4;
        ratingPositions[19] = (float) 4.6;
        ratingPositions[20] = (float) 4.2;
        ratingPositions[21] = (float) 4.3;
        ratingPositions[22] = (float) 4.6;
        ratingPositions[23] = (float) 4.3;
        ratingPositions[24] = (float) 4.5;
        ratingPositions[25] = (float) 4.4;
        ratingPositions[26] = (float) 4.5;
        ratingPositions[27] = (float) 4.6;
        ratingPositions[28] = (float) 4.5;
        ratingPositions[29] = (float) 4.7;
        ratingPositions[30] = (float) 4.2;
        ratingPositions[31] = (float) 3.6;
        ratingPositions[32] = (float) 3.8;
        ratingPositions[33] = (float) 4.1;
        ratingPositions[34] = (float) 3.6;
        ratingPositions[35] = (float) 3.1;
        ratingPositions[36] = (float) 3.0;

        distances[0] = (float) 0.7;
        distances[1] = (float) 0.5;
        distances[2] = (float) 0.5;
        distances[3] = (float) 0.6;
        distances[4] = (float) 0.7;
        distances[5] = (float) 0.3;
        distances[6] = (float) 0.1;
        distances[7] = (float) 0.3;
        distances[8] = (float) 0.2;
        distances[9] = (float) 0.2;
        distances[10] = (float) 0.2;
        distances[11] = (float) 0.4;
        distances[12] = (float) 2.0;
        distances[13] = (float) 1.0;
        distances[14] = (float) 1.2;
        distances[15] = (float) 0.6;
        distances[16] = (float) 0.7;
        distances[17] = (float) 0.7;
        distances[18] = (float) 0.7;
        distances[19] = (float) 1.4;
        distances[20] = (float) 1.7;
        distances[21] = (float) 2.2;
        distances[22] = (float) 2.2;
        distances[23] = (float) 3.2;
        distances[24] = (float) 3.1;
        distances[25] = (float) 1.4;
        distances[26] = (float) 2.0;
        distances[27] = (float) 1.7;
        distances[28] = (float) 1.8;
        distances[29] = (float) 1.3;
        distances[30] = (float) 0.6;
        distances[31] = (float) 0.1;
        distances[32] = (float) 0.3;
        distances[33] = (float) 0.8;
        distances[34] = (float) 0.6;
        distances[35] = (float) 0.7;
        distances[36] = (float) 3.0;






        if(isDefault == false){
            switch (position) {

                case 0:
                    switch (data.get(0)) {
                        case "Asian":
                            holder.textTitle.setText("China Garden Restaurant");
                            holder.resImage.setImageResource(R.drawable.china_garden);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("118 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 3.8 stars");
                            asianRating[0] = (float) 3.8;
                            holder.distanceText.setText("0.33 miles");
                            holder.pos = 0;
                            asianDistances[0] = (float) 0.3;
                            if (asianPositions[0] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }

                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[0] = isChecked;
                                }
                            });


                            break;


                        case "American":
                            holder.textTitle.setText("Perkins Restaurant & Bakery");
                            holder.resImage.setImageResource(R.drawable.perkins_res);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6425 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[0] = (float) 4.4;
                            holder.distanceText.setText("0.5 miles");
                            americanDistances[0] = (float) 0.5;
                            holder.pos = 0;
                            if (americanPositions[0] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[0] = isChecked;
                                }
                            });


                            break;


                        case "Polish":
                            holder.textTitle.setText("Anna's Polish Restaurant");
                            holder.resImage.setImageResource(R.drawable.annas_polish);
                            holder.textDescription.setText("Polish");
                            holder.textAdress.setText("3586 Aloma Ave # 7, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.7 stars");
                            polishRating = (float) 4.7;
                            holder.distanceText.setText("1.2 miles");
                            polishDistance = (float) 1.2;
                            holder.pos = 0;
                            if (polishPosition == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    polishPosition = isChecked;
                                }
                            });

                            break;


                        case "Fast Food":
                            holder.textTitle.setText("Steak n' Shake");
                            holder.resImage.setImageResource(R.drawable.steak_shake);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("443 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 3.9 stars");
                            fastFoodRating[0] = (float) 3.9;
                            fastFoodDistances[0] = (float) 0.7;
//fastFoodDistances = (float) 0.7;
                            holder.distanceText.setText("0.7 miles");
                            holder.pos = 0;
                            if (fastFoodPositions[0] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[0] = isChecked;
                                }
                            });


                            break;


                        case "Spanish":
                            holder.textTitle.setText("Garita Del Sabor");
                            holder.resImage.setImageResource(R.drawable.garita_del_sabor);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3413 Forsyth Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 1.0 stars");
                            spanishRating[0] = (float) 1.0;
                            holder.distanceText.setText("0.6 miles");
                            spanishDistances[0] = (float) 0.6;
                            holder.pos = 0;
                            if (spanishPositions[0] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[0] = isChecked;
                                }
                            });


                            break;

                    }
                    break;
                case 1:
                    switch (data.get(1)){

                        case "Kiko Japanese Cuisine":
                            holder.textTitle.setText("Kiko Japanese Cuisine");
                            holder.resImage.setImageResource(R.drawable.kiko_japan);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("110 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            asianRating[1] = (float) 4.5;
                            holder.distanceText.setText("0.4 miles");
                            holder.pos = 0;
                            asianDistances[1] = (float)0.4;
                            if (asianPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Moghul Indian Cuisine":
                            holder.textTitle.setText("Moghul Indian Cuisine");
                            holder.resImage.setImageResource(R.drawable.moghul_indian_cuisine);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("401 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[1] = (float) 4.4;
                            holder.distanceText.setText("0.6 miles");
                            asianDistances[1] = (float)0.6;
                            holder.pos = 0;
                            if (asianPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Thai Villa Restaurant":
                            holder.textTitle.setText("Thai Villa Restaurant");
                            holder.resImage.setImageResource(R.drawable.thai_villa);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7355 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[1] = (float) 4.5;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[1] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Arigato Sushi Restaurant":
                            holder.textTitle.setText("Arigato Sushi Restaurant");
                            holder.resImage.setImageResource(R.drawable.arigato_sushi);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1560 Semoran N Cir, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[1] = (float) 4.3;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[1] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Kai Asian Street Restaurant":
                            holder.textTitle.setText("Kai Asian Street Restaurant");
                            holder.resImage.setImageResource(R.drawable.kai_asian);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1555 FL-436 Suite 1171, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[1] = (float) 4.6;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[1] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[1] = isChecked;
                                }
                            });
                            break;
                        case "Mei Garden":
                            holder.textTitle.setText("Mei Garden");
                            holder.resImage.setImageResource(R.drawable.mei_garden);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("3760 Howell Branch Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[1] = (float) 4.3;
                            holder.distanceText.setText("3.2 miles");
                            asianDistances[1] = (float)3.2;
                            holder.pos = 0;
                            if (asianPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "He Sheng":
                            holder.textTitle.setText("He Sheng");
                            holder.resImage.setImageResource(R.drawable.he_sheng);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7756 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[1] = (float) 4.4;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[1] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Viet-Nomz":
                            holder.textTitle.setText("Viet-Nomz");
                            holder.resImage.setImageResource(R.drawable.viet_nomz);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7581 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.7 stars");
                            asianRating[1] = (float) 4.7;
                            holder.distanceText.setText("1.3 miles");
                            asianDistances[1] = (float)1.3;
                            holder.pos = 0;
                            if (asianPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[1] = isChecked;
                                }
                            });
                            break;


                        case "Costco Food Court":
                            holder.textTitle.setText("Costco Food Court");
                            holder.resImage.setImageResource(R.drawable.costco_food);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[1] = (float) 4.5;
                            holder.distanceText.setText("0.3 miles");
                            americanDistances[1] = (float) 0.3;
                            holder.pos = 0;
                            if (americanPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Miller's Ale House":
                            holder.textTitle.setText("Miller's Ale House");
                            holder.resImage.setImageResource(R.drawable.millers_ale);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[1] = (float) 4.1;
                            holder.distanceText.setText("0.1 miles");
                            americanDistances[1] = (float) 0.1;
                            holder.pos = 0;
                            if (americanPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Arooga's":
                            holder.textTitle.setText("Arooga's");
                            holder.resImage.setImageResource(R.drawable.aroogas_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[1] = (float) 4.2;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[1] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Chili's Grill & Bar":
                            holder.textTitle.setText("Chili's Grill & Bar");
                            holder.resImage.setImageResource(R.drawable.chilis_grill);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[1] = (float) 4.1;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[1] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Firehouse Subs":
                            holder.textTitle.setText("Firehouse Subs");
                            holder.resImage.setImageResource(R.drawable.firehouse_subs);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[1] = (float) 4.4;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[1] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Bolay":
                            holder.textTitle.setText("Bolay");
                            holder.resImage.setImageResource(R.drawable.bolay_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[1] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[1] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[1] = isChecked;
                                }
                            });
                            break;
                        case "Boston's Fish House":
                            holder.textTitle.setText("Boston's Fish House");
                            holder.resImage.setImageResource(R.drawable.bostons_fish);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[1] = (float) 4.5;
                            holder.distanceText.setText("1.0 miles");
                            americanDistances[1] = (float) 1.0;
                            holder.pos = 0;
                            if (americanPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[1] = isChecked;
                                }
                            });
                            break;
                        case "Toasted":
                            holder.textTitle.setText("Toasted");
                            holder.resImage.setImageResource(R.drawable.toasted_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[1] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[1] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Tibby's":
                            holder.textTitle.setText("Tibby's");
                            holder.resImage.setImageResource(R.drawable.tibbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            americanRating[1] = (float) 4.6;
                            holder.distanceText.setText("1.7 miles");
                            americanDistances[1] = (float) 1.7;
                            holder.pos = 0;
                            if (americanPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[1] = isChecked;
                                }
                            });
                            break;
                        case "Mellow Mushroom":
                            holder.textTitle.setText("Mellow Mushroom");
                            holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[1] = (float) 4.5;
                            holder.distanceText.setText("1.8 miles");
                            americanDistances[1] = (float) 1.8;
                            holder.pos = 0;
                            if (americanPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Zaxby's":
                            holder.textTitle.setText("Zaxby's");
                            holder.resImage.setImageResource(R.drawable.zaxbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[1] = (float) 4.2;
                            holder.distanceText.setText("0.6 miles");
                            americanDistances[1] = (float) 0.6;
                            holder.pos = 0;
                            if (americanPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[1] = isChecked;
                                }
                            });
                            break;





                        case "Chick-fil-A":
                            holder.textTitle.setText("Chick-fil-A");
                            holder.resImage.setImageResource(R.drawable.chic_a);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3391 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            fastFoodRating[1] = (float) 4.6;
                            //fastFoodDistances = (float) 0.5;
                            holder.distanceText.setText("0.5 miles");
                            fastFoodDistances[1] = (float) 0.5;
                            holder.pos = 0;
                            if (fastFoodPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "McDonald's":
                            holder.textTitle.setText("McDonald's");
                            holder.resImage.setImageResource(R.drawable.mcdonalds);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3162 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[1] = (float) 3.6;
                            holder.distanceText.setText("0.1 miles");
                            fastFoodDistances[1] = (float) 0.1;
                            distances[1] = (float) 0.1;
                            i[0] = holder.pos;
                            if (fastFoodPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Wendy's":
                            holder.textTitle.setText("Wendy's");
                            holder.resImage.setImageResource(R.drawable.wendys);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("365 University Park Dr, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.8 stars");
                            fastFoodRating[1] = (float) 3.8;
                            holder.distanceText.setText("0.3 miles");
                            fastFoodDistances[1] = (float) 0.3;
                            distances[1] = (float) 0.3;
                            i[0] = holder.pos;
                            if (fastFoodPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Little Caesars":
                            holder.textTitle.setText("Little Caesars");
                            holder.textDescription.setText("Fast Food");
                            holder.resImage.setImageResource(R.drawable.littlecaesars);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("495 N Semoran Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 4.1 stars");
                            fastFoodRating[1] = (float) 4.1;
                            holder.distanceText.setText("0.8 miles");
                            fastFoodDistances[1] = (float) 0.8;
                            distances[1] = (float) 0.8;
                            i[0] = holder.pos;
                            if (fastFoodPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Dunkin Donuts":
                            holder.textTitle.setText("Dunkin Donuts");
                            holder.resImage.setImageResource(R.drawable.dd);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6627 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[1] = (float) 3.6;
                            holder.distanceText.setText("0.6 miles");
                            fastFoodDistances[1] = (float) 0.6;
                            distances[1] = (float) 0.6;
                            i[0] = holder.pos;
                            if (fastFoodPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "Burger King":
                            holder.textTitle.setText("Burger King");
                            holder.resImage.setImageResource(R.drawable.burger_king);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6709 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.1 stars");
                            fastFoodRating[1] = (float) 3.1;
                            holder.distanceText.setText("0.7 miles");
                            fastFoodDistances[1] = (float) 0.7;
                            distances[1] = (float) 0.7;
                            i[0] = holder.pos;
                            if (fastFoodPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[1] = isChecked;
                                }
                            });
                            break;
                        case "KFC":

                            holder.textTitle.setText("KFC");
                            holder.resImage.setImageResource(R.drawable.kfc);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText(" 4250 Aloma Ave, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.5 stars");
                            fastFoodRating[1] = (float) 3.5;
                            holder.distanceText.setText("3.0 miles");
                            fastFoodDistances[1] = (float) 3.0;
                            distances[1] = (float) 3.0;
                            i[0] = holder.pos;
                            if (fastFoodPositions[1] == true) {
                                holder.saveBtn.setChecked(true);
                            } else {
                                holder.saveBtn.setChecked(false);
                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[1] = isChecked;
                                }
                            });

                            break;



                        case "Rincon Latino Cafe":
                            holder.textTitle.setText("Rincon Latino Cafe");
                            holder.resImage.setImageResource(R.drawable.rincon_latino);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3327 Forsyth Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            spanishRating[1] = (float) 4.5;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[1] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[1] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[1] = isChecked;
                                }
                            });
                            break;

                        case "La Granja":
                            holder.textTitle.setText("La Granja");
                            holder.resImage.setImageResource(R.drawable.la_granja);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("490 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[1] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[1] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[1] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[1] = isChecked;
                                }
                            });
                            break;
                        case "Habaneros Mexican Restaurant":
                            holder.textTitle.setText("Habaneros Mexican Restaurant");
                            holder.resImage.setImageResource(R.drawable.habanero_mexican);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("494 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            spanishRating[1] = (float) 4.3;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[1] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[1] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[1] = isChecked;
                                }
                            });
                            break;
                        case "La Hacienda":
                            holder.textTitle.setText("La Hacienda");
                            holder.resImage.setImageResource(R.drawable.la_hacienda);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3090 Aloma Ave # 145, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[1] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[1] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[1] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[1] = isChecked;
                                }
                            });
                            break;
                        case "Mi Raza Restaurant":
                            holder.textTitle.setText("Mi Raza Restaurant");
                            holder.resImage.setImageResource(R.drawable.mi_raza);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("1810 FL-436, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            spanishRating[1] = (float) 4.2;
                            holder.distanceText.setText("1.7 miles");
                            spanishDistances[1] = (float) 1.7;
                            holder.pos = 0;
                            if (spanishPositions[1] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[1] = isChecked;
                                }
                            });
                            break;
                        case "Jalisco":
                            holder.textTitle.setText("Jalisco");
                            holder.resImage.setImageResource(R.drawable.jalisco_);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("2021 N Goldenrod Rd, Orlando, FL 32807");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            holder.distanceText.setText("3.1 miles");
                            spanishRating[1] = (float) 3.1;
                            spanishDistances[1] = (float) 3.1;
                            holder.pos = 0;
                            if (spanishPositions[1] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[1] = isChecked;
                                }
                            });
                            break;







                    }

                    break;
                case 2:

                    switch (data.get(2)){
                        case "Kiko Japanese Cuisine":
                            holder.textTitle.setText("Kiko Japanese Cuisine");
                            holder.resImage.setImageResource(R.drawable.kiko_japan);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("110 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            asianRating[2] = (float) 4.5;
                            holder.distanceText.setText("0.4 miles");
                            holder.pos = 0;
                            asianDistances[2] = (float)0.4;
                            if (asianPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Moghul Indian Cuisine":
                            holder.textTitle.setText("Moghul Indian Cuisine");
                            holder.resImage.setImageResource(R.drawable.moghul_indian_cuisine);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("401 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[2] = (float) 4.4;
                            holder.distanceText.setText("0.6 miles");
                            asianDistances[2] = (float)0.6;
                            holder.pos = 0;
                            if (asianPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Thai Villa Restaurant":
                            holder.textTitle.setText("Thai Villa Restaurant");
                            holder.resImage.setImageResource(R.drawable.thai_villa);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7355 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[2] = (float) 4.5;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[2] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Arigato Sushi Restaurant":
                            holder.textTitle.setText("Arigato Sushi Restaurant");
                            holder.resImage.setImageResource(R.drawable.arigato_sushi);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1560 Semoran N Cir, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[2] = (float) 4.3;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[2] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Kai Asian Street Restaurant":
                            holder.textTitle.setText("Kai Asian Street Restaurant");
                            holder.resImage.setImageResource(R.drawable.kai_asian);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1555 FL-436 Suite 1171, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[2] = (float) 4.6;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[2] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[2] = isChecked;
                                }
                            });
                            break;
                        case "Mei Garden":
                            holder.textTitle.setText("Mei Garden");
                            holder.resImage.setImageResource(R.drawable.mei_garden);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("3760 Howell Branch Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[2] = (float) 4.3;
                            holder.distanceText.setText("3.2 miles");
                            asianDistances[2] = (float)3.2;
                            holder.pos = 0;
                            if (asianPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "He Sheng":
                            holder.textTitle.setText("He Sheng");
                            holder.resImage.setImageResource(R.drawable.he_sheng);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7756 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[2] = (float) 4.4;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[2] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Viet-Nomz":
                            holder.textTitle.setText("Viet-Nomz");
                            holder.resImage.setImageResource(R.drawable.viet_nomz);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7581 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.7 stars");
                            asianRating[2] = (float) 4.7;
                            holder.distanceText.setText("1.3 miles");
                            asianDistances[2] = (float)1.3;
                            holder.pos = 0;
                            if (asianPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Costco Food Court":
                            holder.textTitle.setText("Costco Food Court");
                            holder.resImage.setImageResource(R.drawable.costco_food);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[2] = (float) 4.5;
                            holder.distanceText.setText("0.3 miles");
                            americanDistances[2] = (float) 0.3;
                            holder.pos = 0;
                            if (americanPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Miller's Ale House":
                            holder.textTitle.setText("Miller's Ale House");
                            holder.resImage.setImageResource(R.drawable.millers_ale);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[2] = (float) 4.1;
                            holder.distanceText.setText("0.1 miles");
                            americanDistances[2] = (float) 0.1;
                            holder.pos = 0;
                            if (americanPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Arooga's":
                            holder.textTitle.setText("Arooga's");
                            holder.resImage.setImageResource(R.drawable.aroogas_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[2] = (float) 4.2;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[2] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Chili's Grill & Bar":
                            holder.textTitle.setText("Chili's Grill & Bar");
                            holder.resImage.setImageResource(R.drawable.chilis_grill);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[2] = (float) 4.1;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[2] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Firehouse Subs":
                            holder.textTitle.setText("Firehouse Subs");
                            holder.resImage.setImageResource(R.drawable.firehouse_subs);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[2] = (float) 4.4;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[2] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Bolay":
                            holder.textTitle.setText("Bolay");
                            holder.resImage.setImageResource(R.drawable.bolay_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[2] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[2] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[2] = isChecked;
                                }
                            });
                            break;
                        case "Boston's Fish House":
                            holder.textTitle.setText("Boston's Fish House");
                            holder.resImage.setImageResource(R.drawable.bostons_fish);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[2] = (float) 4.5;
                            holder.distanceText.setText("1.0 miles");
                            americanDistances[2] = (float) 1.0;
                            holder.pos = 0;
                            if (americanPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[2] = isChecked;
                                }
                            });
                            break;
                        case "Toasted":
                            holder.textTitle.setText("Toasted");
                            holder.resImage.setImageResource(R.drawable.toasted_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[2] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[2] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Tibby's":
                            holder.textTitle.setText("Tibby's");
                            holder.resImage.setImageResource(R.drawable.tibbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            americanRating[2] = (float) 4.6;
                            holder.distanceText.setText("1.7 miles");
                            americanDistances[2] = (float) 1.7;
                            holder.pos = 0;
                            if (americanPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[2] = isChecked;
                                }
                            });
                            break;
                        case "Mellow Mushroom":
                            holder.textTitle.setText("Mellow Mushroom");
                            holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[2] = (float) 4.5;
                            holder.distanceText.setText("1.8 miles");
                            americanDistances[2] = (float) 1.8;
                            holder.pos = 0;
                            if (americanPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Zaxby's":
                            holder.textTitle.setText("Zaxby's");
                            holder.resImage.setImageResource(R.drawable.zaxbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[2] = (float) 4.2;
                            holder.distanceText.setText("0.6 miles");
                            americanDistances[2] = (float) 0.6;
                            if (americanPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[2] = isChecked;
                                }
                            });
                            break;


                        case "Chick-fil-A":
                            holder.textTitle.setText("Chick-fil-A");
                            holder.resImage.setImageResource(R.drawable.chic_a);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3391 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            fastFoodRating[2] = (float) 4.6;
                            //fastFoodDistances = (float) 0.5;
                            holder.distanceText.setText("0.5 miles");
                            fastFoodDistances[2] = (float) 0.5;
                            holder.pos = 0;
                            if (fastFoodPositions[2] == true) {
                                holder.saveBtn.setChecked(true);
                               ;
                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "McDonald's":
                            holder.textTitle.setText("McDonald's");
                            holder.resImage.setImageResource(R.drawable.mcdonalds);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3162 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[2] = (float) 3.6;
                            holder.distanceText.setText("0.1 miles");
                            fastFoodDistances[2] = (float) 0.1;
                            distances[2] = (float) 0.1;
                            i[0] = holder.pos;
                            if (fastFoodPositions[2] == true) {
                                holder.saveBtn.setChecked(true);
                                ;
                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Wendy's":
                            holder.textTitle.setText("Wendy's");
                            holder.resImage.setImageResource(R.drawable.wendys);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("365 University Park Dr, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.8 stars");
                            fastFoodRating[2] = (float) 3.8;
                            holder.distanceText.setText("0.3 miles");
                            fastFoodDistances[2] = (float) 0.3;
                            distances[2] = (float) 0.3;
                            i[0] = holder.pos;
                            if (fastFoodPositions[2] == true) {
                                holder.saveBtn.setChecked(true);
                                ;
                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Little Caesars":
                            holder.textTitle.setText("Little Caesars");
                            holder.textDescription.setText("Fast Food");
                            holder.resImage.setImageResource(R.drawable.littlecaesars);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("495 N Semoran Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 4.1 stars");
                            fastFoodRating[2] = (float) 4.1;
                            holder.distanceText.setText("0.8 miles");
                            fastFoodDistances[2] = (float) 0.8;
                            distances[2] = (float) 0.8;
                            i[0] = holder.pos;
                            if (fastFoodPositions[2] == true) {
                                holder.saveBtn.setChecked(true);
                                ;
                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Dunkin Donuts":
                            holder.textTitle.setText("Dunkin Donuts");
                            holder.resImage.setImageResource(R.drawable.dd);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6627 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[2] = (float) 3.6;
                            holder.distanceText.setText("0.6 miles");
                            fastFoodDistances[2] = (float) 0.6;
                            distances[2] = (float) 0.6;
                            i[0] = holder.pos;
                            if (fastFoodPositions[2] == true) {
                                holder.saveBtn.setChecked(true);
                                ;
                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "Burger King":
                            holder.textTitle.setText("Burger King");
                            holder.resImage.setImageResource(R.drawable.burger_king);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6709 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.1 stars");
                            fastFoodRating[2] = (float) 3.1;
                            holder.distanceText.setText("0.7 miles");
                            fastFoodDistances[2] = (float) 0.7;
                            distances[2] = (float) 0.7;
                            i[0] = holder.pos;
                            if (fastFoodPositions[2] == true) {
                                holder.saveBtn.setChecked(true);
                                ;
                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[2] = isChecked;
                                }
                            });
                            break;
                        case "KFC":

                            holder.textTitle.setText("KFC");
                            holder.resImage.setImageResource(R.drawable.kfc);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText(" 4250 Aloma Ave, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.5 stars");
                            fastFoodRating[2] = (float) 3.5;
                            holder.distanceText.setText("3.0 miles");
                            fastFoodDistances[2] = (float) 3.0;
                            distances[2] = (float) 3.0;
                            i[0] = holder.pos;
                            if (fastFoodPositions[2] == true) {
                                holder.saveBtn.setChecked(true);
                                ;
                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[2] = isChecked;
                                }
                            });

                            break;


                        case "Rincon Latino Cafe":
                            holder.textTitle.setText("Rincon Latino Cafe");
                            holder.resImage.setImageResource(R.drawable.rincon_latino);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3327 Forsyth Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            spanishRating[2] = (float) 4.5;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[2] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[2] = isChecked;
                                }
                            });
                            break;

                        case "La Granja":
                            holder.textTitle.setText("La Granja");
                            holder.resImage.setImageResource(R.drawable.la_granja);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("490 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[1] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[1] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[2] = isChecked;
                                }
                            });
                            break;
                        case "Habaneros Mexican Restaurant":
                            holder.textTitle.setText("Habaneros Mexican Restaurant");
                            holder.resImage.setImageResource(R.drawable.habanero_mexican);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("494 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            spanishRating[2] = (float) 4.3;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[2] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[2] = isChecked;
                                }
                            });
                            break;
                        case "La Hacienda":
                            holder.textTitle.setText("La Hacienda");
                            holder.resImage.setImageResource(R.drawable.la_hacienda);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3090 Aloma Ave # 145, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[2] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[2] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[2] = isChecked;
                                }
                            });
                            break;
                        case "Mi Raza Restaurant":
                            holder.textTitle.setText("Mi Raza Restaurant");
                            holder.resImage.setImageResource(R.drawable.mi_raza);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("1810 FL-436, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            spanishRating[2] = (float) 4.2;
                            holder.distanceText.setText("1.7 miles");
                            spanishDistances[2] = (float) 1.7;
                            holder.pos = 0;
                            if (spanishPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[2] = isChecked;
                                }
                            });
                            break;
                        case "Jalisco":
                            holder.textTitle.setText("Jalisco");
                            holder.resImage.setImageResource(R.drawable.jalisco_);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("2021 N Goldenrod Rd, Orlando, FL 32807");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            holder.distanceText.setText("3.1 miles");
                            spanishRating[2] = (float) 3.1;
                            spanishDistances[2] = (float) 3.1;
                            holder.pos = 0;
                            if (spanishPositions[2] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[2] = isChecked;
                                }
                            });
                            break;



                    }


                    break;
                case 3:

                    switch (data.get(3)){
                        case "Kiko Japanese Cuisine":
                            holder.textTitle.setText("Kiko Japanese Cuisine");
                            holder.resImage.setImageResource(R.drawable.kiko_japan);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("110 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            asianRating[3] = (float) 4.5;
                            holder.distanceText.setText("0.4 miles");
                            holder.pos = 0;
                            asianDistances[3] = (float)0.4;
                            if (asianPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Moghul Indian Cuisine":
                            holder.textTitle.setText("Moghul Indian Cuisine");
                            holder.resImage.setImageResource(R.drawable.moghul_indian_cuisine);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("401 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[3] = (float) 4.4;
                            holder.distanceText.setText("0.6 miles");
                            asianDistances[3] = (float)0.6;
                            holder.pos = 0;
                            if (asianPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Thai Villa Restaurant":
                            holder.textTitle.setText("Thai Villa Restaurant");
                            holder.resImage.setImageResource(R.drawable.thai_villa);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7355 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[3] = (float) 4.5;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[3] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Arigato Sushi Restaurant":
                            holder.textTitle.setText("Arigato Sushi Restaurant");
                            holder.resImage.setImageResource(R.drawable.arigato_sushi);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1560 Semoran N Cir, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[3] = (float) 4.3;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[3] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Kai Asian Street Restaurant":
                            holder.textTitle.setText("Kai Asian Street Restaurant");
                            holder.resImage.setImageResource(R.drawable.kai_asian);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1555 FL-436 Suite 1171, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[3] = (float) 4.6;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[3] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[3] = isChecked;
                                }
                            });
                            break;
                        case "Mei Garden":
                            holder.textTitle.setText("Mei Garden");
                            holder.resImage.setImageResource(R.drawable.mei_garden);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("3760 Howell Branch Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[3] = (float) 4.3;
                            holder.distanceText.setText("3.2 miles");
                            asianDistances[3] = (float)3.2;
                            holder.pos = 0;
                            if (asianPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "He Sheng":
                            holder.textTitle.setText("He Sheng");
                            holder.resImage.setImageResource(R.drawable.he_sheng);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7756 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[3] = (float) 4.4;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[3] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Viet-Nomz":
                            holder.textTitle.setText("Viet-Nomz");
                            holder.resImage.setImageResource(R.drawable.viet_nomz);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7581 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.7 stars");
                            asianRating[3] = (float) 4.7;
                            holder.distanceText.setText("1.3 miles");
                            asianDistances[3] = (float)1.3;
                            holder.pos = 0;
                            if (asianPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Costco Food Court":
                            holder.textTitle.setText("Costco Food Court");
                            holder.resImage.setImageResource(R.drawable.costco_food);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[3] = (float) 4.5;
                            holder.distanceText.setText("0.3 miles");
                            americanDistances[3] = (float) 0.3;
                            holder.pos = 0;
                            if (americanPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Miller's Ale House":
                            holder.textTitle.setText("Miller's Ale House");
                            holder.resImage.setImageResource(R.drawable.millers_ale);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[3] = (float) 4.1;
                            holder.distanceText.setText("0.1 miles");
                            americanDistances[3] = (float) 0.1;
                            holder.pos = 0;
                            if (americanPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Arooga's":
                            holder.textTitle.setText("Arooga's");
                            holder.resImage.setImageResource(R.drawable.aroogas_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[3] = (float) 4.2;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[3] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Chili's Grill & Bar":
                            holder.textTitle.setText("Chili's Grill & Bar");
                            holder.resImage.setImageResource(R.drawable.chilis_grill);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[3] = (float) 4.1;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[3] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Firehouse Subs":
                            holder.textTitle.setText("Firehouse Subs");
                            holder.resImage.setImageResource(R.drawable.firehouse_subs);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[3] = (float) 4.4;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[3] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Bolay":
                            holder.textTitle.setText("Bolay");
                            holder.resImage.setImageResource(R.drawable.bolay_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[3] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[3] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[3] = isChecked;
                                }
                            });
                            break;
                        case "Boston's Fish House":
                            holder.textTitle.setText("Boston's Fish House");
                            holder.resImage.setImageResource(R.drawable.bostons_fish);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[3] = (float) 4.5;
                            holder.distanceText.setText("1.0 miles");
                            americanDistances[3] = (float) 1.0;
                            holder.pos = 0;
                            if (americanPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[3] = isChecked;
                                }
                            });
                            break;
                        case "Toasted":
                            holder.textTitle.setText("Toasted");
                            holder.resImage.setImageResource(R.drawable.toasted_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[3] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[3] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Tibby's":
                            holder.textTitle.setText("Tibby's");
                            holder.resImage.setImageResource(R.drawable.tibbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            americanRating[3] = (float) 4.6;
                            holder.distanceText.setText("1.7 miles");
                            americanDistances[3] = (float) 1.7;
                            holder.pos = 0;
                            if (americanPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[3] = isChecked;
                                }
                            });
                            break;
                        case "Mellow Mushroom":
                            holder.textTitle.setText("Mellow Mushroom");
                            holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[3] = (float) 4.5;
                            holder.distanceText.setText("1.8 miles");
                            americanDistances[3] = (float) 1.8;
                            holder.pos = 0;
                            if (americanPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Zaxby's":
                            holder.textTitle.setText("Zaxby's");
                            holder.resImage.setImageResource(R.drawable.zaxbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[3] = (float) 4.2;
                            holder.distanceText.setText("0.6 miles");
                            americanDistances[3] = (float) 0.6;
                            holder.pos = 0;
                            if (americanPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[3] = isChecked;
                                }
                            });
                            break;


                        case "Chick-fil-A":
                            holder.textTitle.setText("Chick-fil-A");
                            holder.resImage.setImageResource(R.drawable.chic_a);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3391 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            fastFoodRating[3] = (float) 4.6;
                            //fastFoodDistances = (float) 0.5;
                            holder.distanceText.setText("0.5 miles");
                            fastFoodDistances[3] = (float) 0.5;
                            holder.pos = 0;
                            if (fastFoodPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "McDonald's":
                            holder.textTitle.setText("McDonald's");
                            holder.resImage.setImageResource(R.drawable.mcdonalds);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3162 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[3] = (float) 3.6;
                            holder.distanceText.setText("0.1 miles");
                            fastFoodDistances[3] = (float) 0.1;
                            distances[3] = (float) 0.1;
                            i[0] = holder.pos;
                            if (fastFoodPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Wendy's":
                            holder.textTitle.setText("Wendy's");
                            holder.resImage.setImageResource(R.drawable.wendys);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("365 University Park Dr, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.8 stars");
                            fastFoodRating[3] = (float) 3.8;
                            holder.distanceText.setText("0.3 miles");
                            fastFoodDistances[3] = (float) 0.3;
                            distances[3] = (float) 0.3;
                            i[0] = holder.pos;
                            if (fastFoodPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Little Caesars":
                            holder.textTitle.setText("Little Caesars");
                            holder.textDescription.setText("Fast Food");
                            holder.resImage.setImageResource(R.drawable.littlecaesars);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("495 N Semoran Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 4.1 stars");
                            fastFoodRating[3] = (float) 4.1;
                            holder.distanceText.setText("0.8 miles");
                            fastFoodDistances[3] = (float) 0.8;
                            distances[3] = (float) 0.8;
                            i[0] = holder.pos;
                            if (fastFoodPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Dunkin Donuts":
                            holder.textTitle.setText("Dunkin Donuts");
                            holder.resImage.setImageResource(R.drawable.dd);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6627 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[3] = (float) 3.6;
                            holder.distanceText.setText("0.6 miles");
                            fastFoodDistances[3] = (float) 0.6;
                            distances[3] = (float) 0.6;
                            i[0] = holder.pos;
                            if (fastFoodPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "Burger King":
                            holder.textTitle.setText("Burger King");
                            holder.resImage.setImageResource(R.drawable.burger_king);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6709 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.1 stars");
                            fastFoodRating[3] = (float) 3.1;
                            holder.distanceText.setText("0.7 miles");
                            fastFoodDistances[3] = (float) 0.7;
                            distances[3] = (float) 0.7;
                            i[0] = holder.pos;
                            if (fastFoodPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[3] = isChecked;
                                }
                            });
                            break;
                        case "KFC":

                            holder.textTitle.setText("KFC");
                            holder.resImage.setImageResource(R.drawable.kfc);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText(" 4250 Aloma Ave, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.5 stars");
                            fastFoodRating[3] = (float) 3.5;
                            holder.distanceText.setText("3.0 miles");
                            fastFoodDistances[2] = (float) 3.0;
                            distances[3] = (float) 3.0;
                            i[0] = holder.pos;
                            if (fastFoodPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[3] = isChecked;
                                }
                            });

                            break;


                        case "Rincon Latino Cafe":
                            holder.textTitle.setText("Rincon Latino Cafe");
                            holder.resImage.setImageResource(R.drawable.rincon_latino);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3327 Forsyth Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            spanishRating[3] = (float) 4.5;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[3] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[3] = isChecked;
                                }
                            });
                            break;

                        case "La Granja":
                            holder.textTitle.setText("La Granja");
                            holder.resImage.setImageResource(R.drawable.la_granja);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("490 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[3] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[3] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[3] = isChecked;
                                }
                            });
                            break;
                        case "Habaneros Mexican Restaurant":
                            holder.textTitle.setText("Habaneros Mexican Restaurant");
                            holder.resImage.setImageResource(R.drawable.habanero_mexican);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("494 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            spanishRating[3] = (float) 4.3;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[3] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[3] = isChecked;
                                }
                            });
                            break;
                        case "La Hacienda":
                            holder.textTitle.setText("La Hacienda");
                            holder.resImage.setImageResource(R.drawable.la_hacienda);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3090 Aloma Ave # 145, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[3] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[3] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[3] = isChecked;
                                }
                            });
                            break;
                        case "Mi Raza Restaurant":
                            holder.textTitle.setText("Mi Raza Restaurant");
                            holder.resImage.setImageResource(R.drawable.mi_raza);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("1810 FL-436, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            spanishRating[3] = (float) 4.2;
                            holder.distanceText.setText("1.7 miles");
                            spanishDistances[3] = (float) 1.7;
                            holder.pos = 0;
                            if (spanishPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[3] = isChecked;
                                }
                            });
                            break;
                        case "Jalisco":
                            holder.textTitle.setText("Jalisco");
                            holder.resImage.setImageResource(R.drawable.jalisco_);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("2021 N Goldenrod Rd, Orlando, FL 32807");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            holder.distanceText.setText("3.1 miles");
                            spanishRating[3] = (float) 3.1;
                            spanishDistances[3] = (float) 3.1;
                            holder.pos = 0;
                            if (spanishPositions[3] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[3] = isChecked;
                                }
                            });
                            break;




                    }

                    break;
                case 4:

                    switch (data.get(4)){
                        case "Kiko Japanese Cuisine":
                            holder.textTitle.setText("Kiko Japanese Cuisine");
                            holder.resImage.setImageResource(R.drawable.kiko_japan);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("110 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            asianRating[4] = (float) 4.5;
                            holder.distanceText.setText("0.4 miles");
                            holder.pos = 0;
                            asianDistances[4] = (float)0.4;
                            if (asianPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Moghul Indian Cuisine":
                            holder.textTitle.setText("Moghul Indian Cuisine");
                            holder.resImage.setImageResource(R.drawable.moghul_indian_cuisine);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("401 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[4] = (float) 4.4;
                            holder.distanceText.setText("0.6 miles");
                            asianDistances[4] = (float)0.6;
                            holder.pos = 0;
                            if (asianPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Thai Villa Restaurant":
                            holder.textTitle.setText("Thai Villa Restaurant");
                            holder.resImage.setImageResource(R.drawable.thai_villa);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7355 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[4] = (float) 4.5;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[4] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Arigato Sushi Restaurant":
                            holder.textTitle.setText("Arigato Sushi Restaurant");
                            holder.resImage.setImageResource(R.drawable.arigato_sushi);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1560 Semoran N Cir, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[4] = (float) 4.3;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[4] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Kai Asian Street Restaurant":
                            holder.textTitle.setText("Kai Asian Street Restaurant");
                            holder.resImage.setImageResource(R.drawable.kai_asian);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1555 FL-436 Suite 1171, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[4] = (float) 4.6;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[4] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[4] = isChecked;
                                }
                            });
                            break;
                        case "Mei Garden":
                            holder.textTitle.setText("Mei Garden");
                            holder.resImage.setImageResource(R.drawable.mei_garden);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("3760 Howell Branch Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[4] = (float) 4.3;
                            holder.distanceText.setText("3.2 miles");
                            asianDistances[4] = (float)3.2;
                            holder.pos = 0;
                            if (asianPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "He Sheng":
                            holder.textTitle.setText("He Sheng");
                            holder.resImage.setImageResource(R.drawable.he_sheng);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7756 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[4] = (float) 4.4;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[4] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Viet-Nomz":
                            holder.textTitle.setText("Viet-Nomz");
                            holder.resImage.setImageResource(R.drawable.viet_nomz);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7581 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.7 stars");
                            asianRating[4] = (float) 4.7;
                            holder.distanceText.setText("1.3 miles");
                            asianDistances[4] = (float)1.3;
                            holder.pos = 0;
                            if (asianPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Costco Food Court":
                            holder.textTitle.setText("Costco Food Court");
                            holder.resImage.setImageResource(R.drawable.costco_food);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[4] = (float) 4.5;
                            holder.distanceText.setText("0.3 miles");
                            americanDistances[4] = (float) 0.3;
                            holder.pos = 0;
                            if (americanPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Miller's Ale House":
                            holder.textTitle.setText("Miller's Ale House");
                            holder.resImage.setImageResource(R.drawable.millers_ale);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[4] = (float) 4.1;
                            holder.distanceText.setText("0.1 miles");
                            americanDistances[4] = (float) 0.1;
                            holder.pos = 0;
                            if (americanPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Arooga's":
                            holder.textTitle.setText("Arooga's");
                            holder.resImage.setImageResource(R.drawable.aroogas_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[4] = (float) 4.2;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[4] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Chili's Grill & Bar":
                            holder.textTitle.setText("Chili's Grill & Bar");
                            holder.resImage.setImageResource(R.drawable.chilis_grill);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[4] = (float) 4.1;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[4] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Firehouse Subs":
                            holder.textTitle.setText("Firehouse Subs");
                            holder.resImage.setImageResource(R.drawable.firehouse_subs);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[4] = (float) 4.4;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[4] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Bolay":
                            holder.textTitle.setText("Bolay");
                            holder.resImage.setImageResource(R.drawable.bolay_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[4] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[4] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[4] = isChecked;
                                }
                            });
                            break;
                        case "Boston's Fish House":
                            holder.textTitle.setText("Boston's Fish House");
                            holder.resImage.setImageResource(R.drawable.bostons_fish);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[4] = (float) 4.5;
                            holder.distanceText.setText("1.0 miles");
                            americanDistances[4] = (float) 1.0;
                            holder.pos = 0;
                            if (americanPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[4] = isChecked;
                                }
                            });
                            break;
                        case "Toasted":
                            holder.textTitle.setText("Toasted");
                            holder.resImage.setImageResource(R.drawable.toasted_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[4] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[4] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Tibby's":
                            holder.textTitle.setText("Tibby's");
                            holder.resImage.setImageResource(R.drawable.tibbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            americanRating[4] = (float) 4.6;
                            holder.distanceText.setText("1.7 miles");
                            americanDistances[4] = (float) 1.7;
                            holder.pos = 0;
                            if (americanPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[4] = isChecked;
                                }
                            });
                            break;
                        case "Mellow Mushroom":
                            holder.textTitle.setText("Mellow Mushroom");
                            holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[4] = (float) 4.5;
                            holder.distanceText.setText("1.8 miles");
                            americanDistances[4] = (float) 1.8;
                            holder.pos = 0;
                            if (americanPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Zaxby's":
                            holder.textTitle.setText("Zaxby's");
                            holder.resImage.setImageResource(R.drawable.zaxbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[4] = (float) 4.2;
                            holder.distanceText.setText("0.6 miles");
                            americanDistances[4] = (float) 0.6;
                            holder.pos = 0;
                            if (americanPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Chick-fil-A":
                            holder.textTitle.setText("Chick-fil-A");
                            holder.resImage.setImageResource(R.drawable.chic_a);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3391 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            fastFoodRating[4] = (float) 4.6;
                            //fastFoodDistances = (float) 0.5;
                            holder.distanceText.setText("0.5 miles");
                            fastFoodDistances[4] = (float) 0.5;
                            holder.pos = 0;
                            if (fastFoodPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "McDonald's":
                            holder.textTitle.setText("McDonald's");
                            holder.resImage.setImageResource(R.drawable.mcdonalds);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3162 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[4] = (float) 3.6;
                            holder.distanceText.setText("0.1 miles");
                            fastFoodDistances[4] = (float) 0.1;
                            distances[4] = (float) 0.1;
                            i[0] = holder.pos;
                            if (fastFoodPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Wendy's":
                            holder.textTitle.setText("Wendy's");
                            holder.resImage.setImageResource(R.drawable.wendys);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("365 University Park Dr, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.8 stars");
                            fastFoodRating[4] = (float) 3.8;
                            holder.distanceText.setText("0.3 miles");
                            fastFoodDistances[4] = (float) 0.3;
                            distances[4] = (float) 0.3;
                            i[0] = holder.pos;
                            if (fastFoodPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Little Caesars":
                            holder.textTitle.setText("Little Caesars");
                            holder.textDescription.setText("Fast Food");
                            holder.resImage.setImageResource(R.drawable.littlecaesars);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("495 N Semoran Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 4.1 stars");
                            fastFoodRating[4] = (float) 4.1;
                            holder.distanceText.setText("0.8 miles");
                            fastFoodDistances[4] = (float) 0.8;
                            distances[4] = (float) 0.8;
                            i[0] = holder.pos;
                            if (fastFoodPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Dunkin Donuts":
                            holder.textTitle.setText("Dunkin Donuts");
                            holder.resImage.setImageResource(R.drawable.dd);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6627 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[4] = (float) 3.6;
                            holder.distanceText.setText("0.6 miles");
                            fastFoodDistances[4] = (float) 0.6;
                            distances[4] = (float) 0.6;
                            i[0] = holder.pos;
                            if (fastFoodPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "Burger King":
                            holder.textTitle.setText("Burger King");
                            holder.resImage.setImageResource(R.drawable.burger_king);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6709 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.1 stars");
                            fastFoodRating[4] = (float) 3.1;
                            holder.distanceText.setText("0.7 miles");
                            fastFoodDistances[4] = (float) 0.7;
                            distances[4] = (float) 0.7;
                            i[0] = holder.pos;
                            if (fastFoodPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[4] = isChecked;
                                }
                            });
                            break;
                        case "KFC":

                            holder.textTitle.setText("KFC");
                            holder.resImage.setImageResource(R.drawable.kfc);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText(" 4250 Aloma Ave, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.5 stars");
                            fastFoodRating[4] = (float) 3.5;
                            holder.distanceText.setText("3.0 miles");
                            fastFoodDistances[4] = (float) 3.0;
                            distances[4] = (float) 3.0;
                            i[0] = holder.pos;
                            if (fastFoodPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[4] = isChecked;
                                }
                            });

                            break;

                        case "Rincon Latino Cafe":
                            holder.textTitle.setText("Rincon Latino Cafe");
                            holder.resImage.setImageResource(R.drawable.rincon_latino);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3327 Forsyth Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            spanishRating[4] = (float) 4.5;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[4] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[4] = isChecked;
                                }
                            });
                            break;

                        case "La Granja":
                            holder.textTitle.setText("La Granja");
                            holder.resImage.setImageResource(R.drawable.la_granja);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("490 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[4] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[4] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[4] = isChecked;
                                }
                            });
                            break;
                        case "Habaneros Mexican Restaurant":
                            holder.textTitle.setText("Habaneros Mexican Restaurant");
                            holder.resImage.setImageResource(R.drawable.habanero_mexican);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("494 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            spanishRating[4] = (float) 4.3;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[4] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[4] = isChecked;
                                }
                            });
                            break;
                        case "La Hacienda":
                            holder.textTitle.setText("La Hacienda");
                            holder.resImage.setImageResource(R.drawable.la_hacienda);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3090 Aloma Ave # 145, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[4] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[4] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[4] = isChecked;
                                }
                            });
                            break;
                        case "Mi Raza Restaurant":
                            holder.textTitle.setText("Mi Raza Restaurant");
                            holder.resImage.setImageResource(R.drawable.mi_raza);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("1810 FL-436, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            spanishRating[4] = (float) 4.2;
                            holder.distanceText.setText("1.7 miles");
                            spanishDistances[4] = (float) 1.7;
                            holder.pos = 0;
                            if (spanishPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[4] = isChecked;
                                }
                            });
                            break;
                        case "Jalisco":
                            holder.textTitle.setText("Jalisco");
                            holder.resImage.setImageResource(R.drawable.jalisco_);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("2021 N Goldenrod Rd, Orlando, FL 32807");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            holder.distanceText.setText("3.1 miles");
                            spanishRating[4] = (float) 3.1;
                            spanishDistances[4] = (float) 3.1;
                            holder.pos = 0;
                            if (spanishPositions[4] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[4] = isChecked;
                                }
                            });
                            break;




                    }

                    break;
                case 5:


                    switch (data.get(5)){
                        case "Kiko Japanese Cuisine":
                            holder.textTitle.setText("Kiko Japanese Cuisine");
                            holder.resImage.setImageResource(R.drawable.kiko_japan);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("110 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            asianRating[5] = (float) 4.5;
                            holder.distanceText.setText("0.4 miles");
                            holder.pos = 0;
                            asianDistances[5] = (float)0.4;
                            if (asianPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Moghul Indian Cuisine":
                            holder.textTitle.setText("Moghul Indian Cuisine");
                            holder.resImage.setImageResource(R.drawable.moghul_indian_cuisine);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("401 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[5] = (float) 4.4;
                            holder.distanceText.setText("0.6 miles");
                            asianDistances[5] = (float)0.6;
                            holder.pos = 0;
                            if (asianPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Thai Villa Restaurant":
                            holder.textTitle.setText("Thai Villa Restaurant");
                            holder.resImage.setImageResource(R.drawable.thai_villa);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7355 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[5] = (float) 4.5;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[5] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Arigato Sushi Restaurant":
                            holder.textTitle.setText("Arigato Sushi Restaurant");
                            holder.resImage.setImageResource(R.drawable.arigato_sushi);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1560 Semoran N Cir, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[5] = (float) 4.3;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[5] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Kai Asian Street Restaurant":
                            holder.textTitle.setText("Kai Asian Street Restaurant");
                            holder.resImage.setImageResource(R.drawable.kai_asian);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1555 FL-436 Suite 1171, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[5] = (float) 4.6;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[5] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[5] = isChecked;
                                }
                            });
                            break;
                        case "Mei Garden":
                            holder.textTitle.setText("Mei Garden");
                            holder.resImage.setImageResource(R.drawable.mei_garden);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("3760 Howell Branch Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[5] = (float) 4.3;
                            holder.distanceText.setText("3.2 miles");
                            asianDistances[5] = (float)3.2;
                            holder.pos = 0;
                            if (asianPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "He Sheng":
                            holder.textTitle.setText("He Sheng");
                            holder.resImage.setImageResource(R.drawable.he_sheng);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7756 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[5] = (float) 4.4;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[5] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Viet-Nomz":
                            holder.textTitle.setText("Viet-Nomz");
                            holder.resImage.setImageResource(R.drawable.viet_nomz);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7581 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.7 stars");
                            asianRating[5] = (float) 4.7;
                            holder.distanceText.setText("1.3 miles");
                            asianDistances[5] = (float)1.3;
                            holder.pos = 0;
                            if (asianPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[5] = isChecked;
                                }
                            });
                            break;


                        case "Costco Food Court":
                            holder.textTitle.setText("Costco Food Court");
                            holder.resImage.setImageResource(R.drawable.costco_food);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[5] = (float) 4.5;
                            holder.distanceText.setText("0.3 miles");
                            americanDistances[5] = (float) 0.3;
                            holder.pos = 0;
                            if (americanPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Miller's Ale House":
                            holder.textTitle.setText("Miller's Ale House");
                            holder.resImage.setImageResource(R.drawable.millers_ale);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[5] = (float) 4.1;
                            holder.distanceText.setText("0.1 miles");
                            americanDistances[5] = (float) 0.1;
                            holder.pos = 0;
                            if (americanPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Arooga's":
                            holder.textTitle.setText("Arooga's");
                            holder.resImage.setImageResource(R.drawable.aroogas_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[5] = (float) 4.2;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[5] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Chili's Grill & Bar":
                            holder.textTitle.setText("Chili's Grill & Bar");
                            holder.resImage.setImageResource(R.drawable.chilis_grill);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[5] = (float) 4.1;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[5] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Firehouse Subs":
                            holder.textTitle.setText("Firehouse Subs");
                            holder.resImage.setImageResource(R.drawable.firehouse_subs);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[5] = (float) 4.4;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[5] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Bolay":
                            holder.textTitle.setText("Bolay");
                            holder.resImage.setImageResource(R.drawable.bolay_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[5] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[5] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[5] = isChecked;
                                }
                            });
                            break;
                        case "Boston's Fish House":
                            holder.textTitle.setText("Boston's Fish House");
                            holder.resImage.setImageResource(R.drawable.bostons_fish);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[5] = (float) 4.5;
                            holder.distanceText.setText("1.0 miles");
                            americanDistances[5] = (float) 1.0;
                            holder.pos = 0;
                            if (americanPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[5] = isChecked;
                                }
                            });
                            break;
                        case "Toasted":
                            holder.textTitle.setText("Toasted");
                            holder.resImage.setImageResource(R.drawable.toasted_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[5] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[5] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Tibby's":
                            holder.textTitle.setText("Tibby's");
                            holder.resImage.setImageResource(R.drawable.tibbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            americanRating[5] = (float) 4.6;
                            holder.distanceText.setText("1.7 miles");
                            americanDistances[5] = (float) 1.7;
                            holder.pos = 0;
                            if (americanPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[5] = isChecked;
                                }
                            });
                            break;
                        case "Mellow Mushroom":
                            holder.textTitle.setText("Mellow Mushroom");
                            holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[5] = (float) 4.5;
                            holder.distanceText.setText("1.8 miles");
                            americanDistances[5] = (float) 1.8;
                            holder.pos = 0;
                            if (americanPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Zaxby's":
                            holder.textTitle.setText("Zaxby's");
                            holder.resImage.setImageResource(R.drawable.zaxbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[5] = (float) 4.2;
                            holder.distanceText.setText("0.6 miles");
                            americanDistances[5] = (float) 0.6;
                            holder.pos = 0;
                            if (americanPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Chick-fil-A":
                            holder.textTitle.setText("Chick-fil-A");
                            holder.resImage.setImageResource(R.drawable.chic_a);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3391 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            fastFoodRating[5] = (float) 4.6;
                            //fastFoodDistances = (float) 0.5;
                            holder.distanceText.setText("0.5 miles");
                            fastFoodDistances[5] = (float) 0.5;
                            holder.pos = 0;
                            if (fastFoodPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "McDonald's":
                            holder.textTitle.setText("McDonald's");
                            holder.resImage.setImageResource(R.drawable.mcdonalds);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3162 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[5] = (float) 3.6;
                            holder.distanceText.setText("0.1 miles");
                            fastFoodDistances[5] = (float) 0.1;
                            distances[5] = (float) 0.1;
                            i[0] = holder.pos;
                            if (fastFoodPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Wendy's":
                            holder.textTitle.setText("Wendy's");
                            holder.resImage.setImageResource(R.drawable.wendys);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("365 University Park Dr, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.8 stars");
                            fastFoodRating[5] = (float) 3.8;
                            holder.distanceText.setText("0.3 miles");
                            fastFoodDistances[5] = (float) 0.3;
                            distances[5] = (float) 0.3;
                            i[0] = holder.pos;
                            if (fastFoodPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Little Caesars":
                            holder.textTitle.setText("Little Caesars");
                            holder.textDescription.setText("Fast Food");
                            holder.resImage.setImageResource(R.drawable.littlecaesars);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("495 N Semoran Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 4.1 stars");
                            fastFoodRating[5] = (float) 4.1;
                            holder.distanceText.setText("0.8 miles");
                            fastFoodDistances[5] = (float) 0.8;
                            distances[5] = (float) 0.8;
                            i[0] = holder.pos;
                            if (fastFoodPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Dunkin Donuts":
                            holder.textTitle.setText("Dunkin Donuts");
                            holder.resImage.setImageResource(R.drawable.dd);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6627 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[5] = (float) 3.6;
                            holder.distanceText.setText("0.6 miles");
                            fastFoodDistances[5] = (float) 0.6;
                            distances[5] = (float) 0.6;
                            i[0] = holder.pos;
                            if (fastFoodPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "Burger King":
                            holder.textTitle.setText("Burger King");
                            holder.resImage.setImageResource(R.drawable.burger_king);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6709 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.1 stars");
                            fastFoodRating[5] = (float) 3.1;
                            holder.distanceText.setText("0.7 miles");
                            fastFoodDistances[2] = (float) 0.7;
                            distances[5] = (float) 0.7;
                            i[0] = holder.pos;
                            if (fastFoodPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[5] = isChecked;
                                }
                            });
                            break;
                        case "KFC":

                            holder.textTitle.setText("KFC");
                            holder.resImage.setImageResource(R.drawable.kfc);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText(" 4250 Aloma Ave, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.5 stars");
                            fastFoodRating[5] = (float) 3.5;
                            holder.distanceText.setText("3.0 miles");
                            fastFoodDistances[2] = (float) 3.0;
                            distances[5] = (float) 3.0;
                            i[0] = holder.pos;
                            if (fastFoodPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[5] = isChecked;
                                }
                            });

                            break;



                        case "Rincon Latino Cafe":
                            holder.textTitle.setText("Rincon Latino Cafe");
                            holder.resImage.setImageResource(R.drawable.rincon_latino);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3327 Forsyth Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            spanishRating[5] = (float) 4.5;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[5] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[5] = isChecked;
                                }
                            });
                            break;

                        case "La Granja":
                            holder.textTitle.setText("La Granja");
                            holder.resImage.setImageResource(R.drawable.la_granja);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("490 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[5] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[5] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[5] = isChecked;
                                }
                            });
                            break;
                        case "Habaneros Mexican Restaurant":
                            holder.textTitle.setText("Habaneros Mexican Restaurant");
                            holder.resImage.setImageResource(R.drawable.habanero_mexican);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("494 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            spanishRating[5] = (float) 4.3;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[5] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[5] = isChecked;
                                }
                            });
                            break;
                        case "La Hacienda":
                            holder.textTitle.setText("La Hacienda");
                            holder.resImage.setImageResource(R.drawable.la_hacienda);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3090 Aloma Ave # 145, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[5] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[5] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[5] = isChecked;
                                }
                            });
                            break;
                        case "Mi Raza Restaurant":
                            holder.textTitle.setText("Mi Raza Restaurant");
                            holder.resImage.setImageResource(R.drawable.mi_raza);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("1810 FL-436, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            spanishRating[5] = (float) 4.2;
                            holder.distanceText.setText("1.7 miles");
                            spanishDistances[5] = (float) 1.7;
                            holder.pos = 0;
                            if (spanishPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[5] = isChecked;
                                }
                            });
                            break;
                        case "Jalisco":
                            holder.textTitle.setText("Jalisco");
                            holder.resImage.setImageResource(R.drawable.jalisco_);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("2021 N Goldenrod Rd, Orlando, FL 32807");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            holder.distanceText.setText("3.1 miles");
                            spanishRating[5] = (float) 3.1;
                            spanishDistances[5] = (float) 3.1;
                            holder.pos = 0;
                            if (spanishPositions[5] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[5] = isChecked;
                                }
                            });
                            break;



                    }




                    break;
                case 6:

                    switch (data.get(6)){
                        case "Kiko Japanese Cuisine":
                            holder.textTitle.setText("Kiko Japanese Cuisine");
                            holder.resImage.setImageResource(R.drawable.kiko_japan);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("110 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            asianRating[6] = (float) 4.5;
                            holder.distanceText.setText("0.4 miles");
                            holder.pos = 0;
                            asianDistances[6] = (float)0.4;
                            if (asianPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Moghul Indian Cuisine":
                            holder.textTitle.setText("Moghul Indian Cuisine");
                            holder.resImage.setImageResource(R.drawable.moghul_indian_cuisine);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("401 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[6] = (float) 4.4;
                            holder.distanceText.setText("0.6 miles");
                            asianDistances[6] = (float)0.6;
                            holder.pos = 0;
                            if (asianPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Thai Villa Restaurant":
                            holder.textTitle.setText("Thai Villa Restaurant");
                            holder.resImage.setImageResource(R.drawable.thai_villa);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7355 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[6] = (float) 4.5;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[6] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Arigato Sushi Restaurant":
                            holder.textTitle.setText("Arigato Sushi Restaurant");
                            holder.resImage.setImageResource(R.drawable.arigato_sushi);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1560 Semoran N Cir, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[6] = (float) 4.3;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[6] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Kai Asian Street Restaurant":
                            holder.textTitle.setText("Kai Asian Street Restaurant");
                            holder.resImage.setImageResource(R.drawable.kai_asian);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1555 FL-436 Suite 1171, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[6] = (float) 4.6;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[6] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[6] = isChecked;
                                }
                            });
                            break;
                        case "Mei Garden":
                            holder.textTitle.setText("Mei Garden");
                            holder.resImage.setImageResource(R.drawable.mei_garden);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("3760 Howell Branch Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[6] = (float) 4.3;
                            holder.distanceText.setText("3.2 miles");
                            asianDistances[6] = (float)3.2;
                            holder.pos = 0;
                            if (asianPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "He Sheng":
                            holder.textTitle.setText("He Sheng");
                            holder.resImage.setImageResource(R.drawable.he_sheng);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7756 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[6] = (float) 4.4;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[6] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Viet-Nomz":
                            holder.textTitle.setText("Viet-Nomz");
                            holder.resImage.setImageResource(R.drawable.viet_nomz);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7581 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.7 stars");
                            asianRating[6] = (float) 4.7;
                            holder.distanceText.setText("1.3 miles");
                            asianDistances[6] = (float)1.3;
                            holder.pos = 0;
                            if (asianPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[6] = isChecked;
                                }
                            });
                            break;


                        case "Costco Food Court":
                            holder.textTitle.setText("Costco Food Court");
                            holder.resImage.setImageResource(R.drawable.costco_food);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[6] = (float) 4.5;
                            holder.distanceText.setText("0.3 miles");
                            americanDistances[6] = (float) 0.3;
                            holder.pos = 0;
                            if (americanPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Miller's Ale House":
                            holder.textTitle.setText("Miller's Ale House");
                            holder.resImage.setImageResource(R.drawable.millers_ale);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[6] = (float) 4.1;
                            holder.distanceText.setText("0.1 miles");
                            americanDistances[6] = (float) 0.1;
                            holder.pos = 0;
                            if (americanPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Arooga's":
                            holder.textTitle.setText("Arooga's");
                            holder.resImage.setImageResource(R.drawable.aroogas_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[6] = (float) 4.2;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[6] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Chili's Grill & Bar":
                            holder.textTitle.setText("Chili's Grill & Bar");
                            holder.resImage.setImageResource(R.drawable.chilis_grill);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[6] = (float) 4.1;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[6] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Firehouse Subs":
                            holder.textTitle.setText("Firehouse Subs");
                            holder.resImage.setImageResource(R.drawable.firehouse_subs);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[6] = (float) 4.4;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[6] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Bolay":
                            holder.textTitle.setText("Bolay");
                            holder.resImage.setImageResource(R.drawable.bolay_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[6] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[6] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[6] = isChecked;
                                }
                            });
                            break;
                        case "Boston's Fish House":
                            holder.textTitle.setText("Boston's Fish House");
                            holder.resImage.setImageResource(R.drawable.bostons_fish);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[6] = (float) 4.5;
                            holder.distanceText.setText("1.0 miles");
                            americanDistances[6] = (float) 1.0;
                            holder.pos = 0;
                            if (americanPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[6] = isChecked;
                                }
                            });
                            break;
                        case "Toasted":
                            holder.textTitle.setText("Toasted");
                            holder.resImage.setImageResource(R.drawable.toasted_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[6] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[6] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Tibby's":
                            holder.textTitle.setText("Tibby's");
                            holder.resImage.setImageResource(R.drawable.tibbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            americanRating[6] = (float) 4.6;
                            holder.distanceText.setText("1.7 miles");
                            americanDistances[6] = (float) 1.7;
                            holder.pos = 0;
                            if (americanPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[6] = isChecked;
                                }
                            });
                            break;
                        case "Mellow Mushroom":
                            holder.textTitle.setText("Mellow Mushroom");
                            holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[6] = (float) 4.5;
                            holder.distanceText.setText("1.8 miles");
                            americanDistances[6] = (float) 1.8;
                            holder.pos = 0;
                            if (americanPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Zaxby's":
                            holder.textTitle.setText("Zaxby's");
                            holder.resImage.setImageResource(R.drawable.zaxbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[6] = (float) 4.2;
                            holder.distanceText.setText("0.6 miles");
                            americanDistances[6] = (float) 0.6;
                            holder.pos = 0;
                            if (americanPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Chick-fil-A":
                            holder.textTitle.setText("Chick-fil-A");
                            holder.resImage.setImageResource(R.drawable.chic_a);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3391 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            fastFoodRating[6] = (float) 4.6;
                            //fastFoodDistances = (float) 0.5;
                            holder.distanceText.setText("0.5 miles");
                            fastFoodDistances[6] = (float) 0.5;
                            holder.pos = 0;
                            if (fastFoodPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "McDonald's":
                            holder.textTitle.setText("McDonald's");
                            holder.resImage.setImageResource(R.drawable.mcdonalds);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3162 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[6] = (float) 3.6;
                            holder.distanceText.setText("0.1 miles");
                            fastFoodDistances[6] = (float) 0.1;
                            distances[6] = (float) 0.1;
                            i[0] = holder.pos;
                            if (fastFoodPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Wendy's":
                            holder.textTitle.setText("Wendy's");
                            holder.resImage.setImageResource(R.drawable.wendys);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("365 University Park Dr, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.8 stars");
                            fastFoodRating[6] = (float) 3.8;
                            holder.distanceText.setText("0.3 miles");
                            fastFoodDistances[6] = (float) 0.3;
                            distances[6] = (float) 0.3;
                            i[0] = holder.pos;
                            if (fastFoodPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Little Caesars":
                            holder.textTitle.setText("Little Caesars");
                            holder.textDescription.setText("Fast Food");
                            holder.resImage.setImageResource(R.drawable.littlecaesars);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("495 N Semoran Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 4.1 stars");
                            fastFoodRating[6] = (float) 4.1;
                            holder.distanceText.setText("0.8 miles");
                            fastFoodDistances[6] = (float) 0.8;
                            distances[6] = (float) 0.8;
                            i[0] = holder.pos;
                            if (fastFoodPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Dunkin Donuts":
                            holder.textTitle.setText("Dunkin Donuts");
                            holder.resImage.setImageResource(R.drawable.dd);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6627 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[6] = (float) 3.6;
                            holder.distanceText.setText("0.6 miles");
                            fastFoodDistances[6] = (float) 0.6;
                            distances[6] = (float) 0.6;
                            i[0] = holder.pos;
                            if (fastFoodPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "Burger King":
                            holder.textTitle.setText("Burger King");
                            holder.resImage.setImageResource(R.drawable.burger_king);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6709 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.1 stars");
                            fastFoodRating[6] = (float) 3.1;
                            holder.distanceText.setText("0.7 miles");
                            fastFoodDistances[6] = (float) 0.7;
                            distances[6] = (float) 0.7;
                            i[0] = holder.pos;
                            if (fastFoodPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[6] = isChecked;
                                }
                            });
                            break;
                        case "KFC":

                            holder.textTitle.setText("KFC");
                            holder.resImage.setImageResource(R.drawable.kfc);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText(" 4250 Aloma Ave, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.5 stars");
                            fastFoodRating[6] = (float) 3.5;
                            holder.distanceText.setText("3.0 miles");
                            fastFoodDistances[6] = (float) 3.0;
                            distances[6] = (float) 3.0;
                            i[0] = holder.pos;
                            if (fastFoodPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[6] = isChecked;
                                }
                            });

                            break;

                        case "Rincon Latino Cafe":
                            holder.textTitle.setText("Rincon Latino Cafe");
                            holder.resImage.setImageResource(R.drawable.rincon_latino);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3327 Forsyth Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            spanishRating[6] = (float) 4.5;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[6] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[6] = isChecked;
                                }
                            });
                            break;

                        case "La Granja":
                            holder.textTitle.setText("La Granja");
                            holder.resImage.setImageResource(R.drawable.la_granja);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("490 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[6] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[6] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[6] = isChecked;
                                }
                            });
                            break;
                        case "Habaneros Mexican Restaurant":
                            holder.textTitle.setText("Habaneros Mexican Restaurant");
                            holder.resImage.setImageResource(R.drawable.habanero_mexican);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("494 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            spanishRating[6] = (float) 4.3;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[6] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[6] = isChecked;
                                }
                            });
                            break;
                        case "La Hacienda":
                            holder.textTitle.setText("La Hacienda");
                            holder.resImage.setImageResource(R.drawable.la_hacienda);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("3090 Aloma Ave # 145, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            spanishRating[6] = (float) 4.4;
                            holder.distanceText.setText("0.7 miles");
                            spanishDistances[6] = (float) 0.7;
                            holder.pos = 0;
                            if (spanishPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[6] = isChecked;
                                }
                            });
                            break;
                        case "Mi Raza Restaurant":
                            holder.textTitle.setText("Mi Raza Restaurant");
                            holder.resImage.setImageResource(R.drawable.mi_raza);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("1810 FL-436, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            spanishRating[6] = (float) 4.2;
                            holder.distanceText.setText("1.7 miles");
                            spanishDistances[6] = (float) 1.7;
                            holder.pos = 0;
                            if (spanishPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[6] = isChecked;
                                }
                            });
                            break;
                        case "Jalisco":
                            holder.textTitle.setText("Jalisco");
                            holder.resImage.setImageResource(R.drawable.jalisco_);
                            holder.textDescription.setText("Spanish");
                            holder.textAdress.setText("2021 N Goldenrod Rd, Orlando, FL 32807");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            holder.distanceText.setText("3.1 miles");
                            spanishRating[6] = (float) 3.1;
                            spanishDistances[6] = (float) 3.1;
                            holder.pos = 0;
                            if (spanishPositions[6] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    spanishPositions[6] = isChecked;
                                }
                            });
                            break;




                    }



                    break;
                case 7:

                    switch (data.get(7)){
                        case "Kiko Japanese Cuisine":
                            holder.textTitle.setText("Kiko Japanese Cuisine");
                            holder.resImage.setImageResource(R.drawable.kiko_japan);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("110 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            asianRating[7] = (float) 4.5;
                            holder.distanceText.setText("0.4 miles");
                            holder.pos = 0;
                            asianDistances[7] = (float)0.4;
                            if (asianPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Moghul Indian Cuisine":
                            holder.textTitle.setText("Moghul Indian Cuisine");
                            holder.resImage.setImageResource(R.drawable.moghul_indian_cuisine);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("401 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[7] = (float) 4.4;
                            holder.distanceText.setText("0.6 miles");
                            asianDistances[7] = (float)0.6;
                            holder.pos = 0;
                            if (asianPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Thai Villa Restaurant":
                            holder.textTitle.setText("Thai Villa Restaurant");
                            holder.resImage.setImageResource(R.drawable.thai_villa);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7355 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[7] = (float) 4.5;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[7] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Arigato Sushi Restaurant":
                            holder.textTitle.setText("Arigato Sushi Restaurant");
                            holder.resImage.setImageResource(R.drawable.arigato_sushi);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1560 Semoran N Cir, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[7] = (float) 4.3;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[7] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Kai Asian Street Restaurant":
                            holder.textTitle.setText("Kai Asian Street Restaurant");
                            holder.resImage.setImageResource(R.drawable.kai_asian);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1555 FL-436 Suite 1171, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[7] = (float) 4.6;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[7] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[7] = isChecked;
                                }
                            });
                            break;
                        case "Mei Garden":
                            holder.textTitle.setText("Mei Garden");
                            holder.resImage.setImageResource(R.drawable.mei_garden);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("3760 Howell Branch Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[2] = (float) 4.3;
                            holder.distanceText.setText("3.2 miles");
                            asianDistances[2] = (float)3.2;
                            holder.pos = 0;
                            if (asianPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "He Sheng":
                            holder.textTitle.setText("He Sheng");
                            holder.resImage.setImageResource(R.drawable.he_sheng);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7756 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[7] = (float) 4.4;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[7] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Viet-Nomz":
                            holder.textTitle.setText("Viet-Nomz");
                            holder.resImage.setImageResource(R.drawable.viet_nomz);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7581 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.7 stars");
                            asianRating[7] = (float) 4.7;
                            holder.distanceText.setText("1.3 miles");
                            asianDistances[7] = (float)1.3;
                            holder.pos = 0;
                            if (asianPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[7] = isChecked;
                                }
                            });
                            break;



                        case "Costco Food Court":
                            holder.textTitle.setText("Costco Food Court");
                            holder.resImage.setImageResource(R.drawable.costco_food);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[7] = (float) 4.5;
                            holder.distanceText.setText("0.3 miles");
                            americanDistances[7] = (float) 0.3;
                            holder.pos = 0;
                            if (americanPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Miller's Ale House":
                            holder.textTitle.setText("Miller's Ale House");
                            holder.resImage.setImageResource(R.drawable.millers_ale);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[7] = (float) 4.1;
                            holder.distanceText.setText("0.1 miles");
                            americanDistances[7] = (float) 0.1;
                            holder.pos = 0;
                            if (americanPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Arooga's":
                            holder.textTitle.setText("Arooga's");
                            holder.resImage.setImageResource(R.drawable.aroogas_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[7] = (float) 4.2;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[7] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Chili's Grill & Bar":
                            holder.textTitle.setText("Chili's Grill & Bar");
                            holder.resImage.setImageResource(R.drawable.chilis_grill);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[7] = (float) 4.1;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[7] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Firehouse Subs":
                            holder.textTitle.setText("Firehouse Subs");
                            holder.resImage.setImageResource(R.drawable.firehouse_subs);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[7] = (float) 4.4;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[7] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Bolay":
                            holder.textTitle.setText("Bolay");
                            holder.resImage.setImageResource(R.drawable.bolay_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[7] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[7] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[7] = isChecked;
                                }
                            });
                            break;
                        case "Boston's Fish House":
                            holder.textTitle.setText("Boston's Fish House");
                            holder.resImage.setImageResource(R.drawable.bostons_fish);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[7] = (float) 4.5;
                            holder.distanceText.setText("1.0 miles");
                            americanDistances[7] = (float) 1.0;
                            holder.pos = 0;
                            if (americanPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[7] = isChecked;
                                }
                            });
                            break;
                        case "Toasted":
                            holder.textTitle.setText("Toasted");
                            holder.resImage.setImageResource(R.drawable.toasted_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[7] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[7] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Tibby's":
                            holder.textTitle.setText("Tibby's");
                            holder.resImage.setImageResource(R.drawable.tibbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            americanRating[7] = (float) 4.6;
                            holder.distanceText.setText("1.7 miles");
                            americanDistances[7] = (float) 1.7;
                            holder.pos = 0;
                            if (americanPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[7] = isChecked;
                                }
                            });
                            break;
                        case "Mellow Mushroom":
                            holder.textTitle.setText("Mellow Mushroom");
                            holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[7] = (float) 4.5;
                            holder.distanceText.setText("1.8 miles");
                            americanDistances[7] = (float) 1.8;
                            holder.pos = 0;
                            if (americanPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Zaxby's":
                            holder.textTitle.setText("Zaxby's");
                            holder.resImage.setImageResource(R.drawable.zaxbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[7] = (float) 4.2;
                            holder.distanceText.setText("0.6 miles");
                            americanDistances[7] = (float) 0.6;
                            holder.pos = 0;
                            if (americanPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Chick-fil-A":
                            holder.textTitle.setText("Chick-fil-A");
                            holder.resImage.setImageResource(R.drawable.chic_a);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3391 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            fastFoodRating[7] = (float) 4.6;
                            //fastFoodDistances = (float) 0.5;
                            holder.distanceText.setText("0.5 miles");
                            fastFoodDistances[7] = (float) 0.5;
                            holder.pos = 0;
                            if (fastFoodPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "McDonald's":
                            holder.textTitle.setText("McDonald's");
                            holder.resImage.setImageResource(R.drawable.mcdonalds);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("3162 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[7] = (float) 3.6;
                            holder.distanceText.setText("0.1 miles");
                            fastFoodDistances[7] = (float) 0.1;
                            distances[7] = (float) 0.1;
                            i[0] = holder.pos;
                            if (fastFoodPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Wendy's":
                            holder.textTitle.setText("Wendy's");
                            holder.resImage.setImageResource(R.drawable.wendys);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("365 University Park Dr, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.8 stars");
                            fastFoodRating[7] = (float) 3.8;
                            holder.distanceText.setText("0.3 miles");
                            fastFoodDistances[7] = (float) 0.3;
                            distances[7] = (float) 0.3;
                            i[0] = holder.pos;
                            if (fastFoodPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Little Caesars":
                            holder.textTitle.setText("Little Caesars");
                            holder.textDescription.setText("Fast Food");
                            holder.resImage.setImageResource(R.drawable.littlecaesars);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("495 N Semoran Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 4.1 stars");
                            fastFoodRating[7] = (float) 4.1;
                            holder.distanceText.setText("0.8 miles");
                            fastFoodDistances[7] = (float) 0.8;
                            distances[7] = (float) 0.8;
                            i[0] = holder.pos;
                            if (fastFoodPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Dunkin Donuts":
                            holder.textTitle.setText("Dunkin Donuts");
                            holder.resImage.setImageResource(R.drawable.dd);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6627 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.6 stars");
                            fastFoodRating[7] = (float) 3.6;
                            holder.distanceText.setText("0.6 miles");
                            fastFoodDistances[7] = (float) 0.6;
                            distances[7] = (float) 0.6;
                            i[0] = holder.pos;
                            if (fastFoodPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[7] = isChecked;
                                }
                            });
                            break;

                        case "Burger King":
                            holder.textTitle.setText("Burger King");
                            holder.resImage.setImageResource(R.drawable.burger_king);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText("6709 University Blvd, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.1 stars");
                            fastFoodRating[7] = (float) 3.1;
                            holder.distanceText.setText("0.7 miles");
                            fastFoodDistances[7] = (float) 0.7;
                            distances[7] = (float) 0.7;
                            i[0] = holder.pos;
                            if (fastFoodPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[7] = isChecked;
                                }
                            });
                            break;
                        case "KFC":

                            holder.textTitle.setText("KFC");
                            holder.resImage.setImageResource(R.drawable.kfc);
                            holder.textDescription.setText("Fast Food");
                            holder.textAdress.setText(" 4250 Aloma Ave, Winter Park, FL 32792");
                            holder.pos = 1;
                            holder.ratingText.setText("Rating: 3.5 stars");
                            fastFoodRating[7] = (float) 3.5;
                            holder.distanceText.setText("3.0 miles");
                            fastFoodDistances[7] = (float) 3.0;
                            distances[7] = (float) 3.0;
                            i[0] = holder.pos;
                            if (fastFoodPositions[7] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    fastFoodPositions[7] = isChecked;
                                }
                            });

                            break;



                    }




                    break;
                case 8:
                    switch (data.get(8)){
                        case "Kiko Japanese Cuisine":
                            holder.textTitle.setText("Kiko Japanese Cuisine");
                            holder.resImage.setImageResource(R.drawable.kiko_japan);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("110 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            asianRating[8] = (float) 4.5;
                            holder.distanceText.setText("0.4 miles");
                            holder.pos = 0;
                            asianDistances[8] = (float)0.4;
                            if (asianPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Moghul Indian Cuisine":
                            holder.textTitle.setText("Moghul Indian Cuisine");
                            holder.resImage.setImageResource(R.drawable.moghul_indian_cuisine);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("401 N Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[8] = (float) 4.4;
                            holder.distanceText.setText("0.6 miles");
                            asianDistances[8] = (float)0.6;
                            holder.pos = 0;
                            if (asianPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Thai Villa Restaurant":
                            holder.textTitle.setText("Thai Villa Restaurant");
                            holder.resImage.setImageResource(R.drawable.thai_villa);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7355 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[8] = (float) 4.5;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[8] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Arigato Sushi Restaurant":
                            holder.textTitle.setText("Arigato Sushi Restaurant");
                            holder.resImage.setImageResource(R.drawable.arigato_sushi);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1560 Semoran N Cir, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[8] = (float) 4.3;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[8] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Kai Asian Street Restaurant":
                            holder.textTitle.setText("Kai Asian Street Restaurant");
                            holder.resImage.setImageResource(R.drawable.kai_asian);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("1555 FL-436 Suite 1171, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            asianRating[8] = (float) 4.6;
                            holder.distanceText.setText("2.2 miles");
                            asianDistances[8] = (float)2.2;
                            holder.pos = 0;
                            if (asianPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[8] = isChecked;
                                }
                            });
                            break;
                        case "Mei Garden":
                            holder.textTitle.setText("Mei Garden");
                            holder.resImage.setImageResource(R.drawable.mei_garden);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("3760 Howell Branch Rd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.3 stars");
                            asianRating[8] = (float) 4.3;
                            holder.distanceText.setText("3.2 miles");
                            asianDistances[8] = (float)3.2;
                            holder.pos = 0;
                            if (asianPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "He Sheng":
                            holder.textTitle.setText("He Sheng");
                            holder.resImage.setImageResource(R.drawable.he_sheng);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7756 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            asianRating[8] = (float) 4.4;
                            holder.distanceText.setText("1.4 miles");
                            asianDistances[8] = (float)1.4;
                            holder.pos = 0;
                            if (asianPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Viet-Nomz":
                            holder.textTitle.setText("Viet-Nomz");
                            holder.resImage.setImageResource(R.drawable.viet_nomz);
                            holder.textDescription.setText("Asian");
                            holder.textAdress.setText("7581 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.7 stars");
                            asianRating[8] = (float) 4.7;
                            holder.distanceText.setText("1.3 miles");
                            asianDistances[8] = (float)1.3;
                            holder.pos = 0;
                            if (asianPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    asianPositions[8] = isChecked;
                                }
                            });
                            break;



                        case "Costco Food Court":
                            holder.textTitle.setText("Costco Food Court");
                            holder.resImage.setImageResource(R.drawable.costco_food);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[8] = (float) 4.5;
                            holder.distanceText.setText("0.3 miles");
                            americanDistances[8] = (float) 0.3;
                            holder.pos = 0;
                            if (americanPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Miller's Ale House":
                            holder.textTitle.setText("Miller's Ale House");
                            holder.resImage.setImageResource(R.drawable.millers_ale);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[8] = (float) 4.1;
                            holder.distanceText.setText("0.1 miles");
                            americanDistances[8] = (float) 0.1;
                            holder.pos = 0;
                            if (americanPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Arooga's":
                            holder.textTitle.setText("Arooga's");
                            holder.resImage.setImageResource(R.drawable.aroogas_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[8] = (float) 4.2;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[8] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Chili's Grill & Bar":
                            holder.textTitle.setText("Chili's Grill & Bar");
                            holder.resImage.setImageResource(R.drawable.chilis_grill);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[8] = (float) 4.1;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[8] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Firehouse Subs":
                            holder.textTitle.setText("Firehouse Subs");
                            holder.resImage.setImageResource(R.drawable.firehouse_subs);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[8] = (float) 4.4;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[8] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Bolay":
                            holder.textTitle.setText("Bolay");
                            holder.resImage.setImageResource(R.drawable.bolay_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[8] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[8] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[8] = isChecked;
                                }
                            });
                            break;
                        case "Boston's Fish House":
                            holder.textTitle.setText("Boston's Fish House");
                            holder.resImage.setImageResource(R.drawable.bostons_fish);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[8] = (float) 4.5;
                            holder.distanceText.setText("1.0 miles");
                            americanDistances[8] = (float) 1.0;
                            holder.pos = 0;
                            if (americanPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[8] = isChecked;
                                }
                            });
                            break;
                        case "Toasted":
                            holder.textTitle.setText("Toasted");
                            holder.resImage.setImageResource(R.drawable.toasted_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[8] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[8] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Tibby's":
                            holder.textTitle.setText("Tibby's");
                            holder.resImage.setImageResource(R.drawable.tibbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            americanRating[8] = (float) 4.6;
                            holder.distanceText.setText("1.7 miles");
                            americanDistances[8] = (float) 1.7;
                            holder.pos = 0;
                            if (americanPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[8] = isChecked;
                                }
                            });
                            break;
                        case "Mellow Mushroom":
                            holder.textTitle.setText("Mellow Mushroom");
                            holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[8] = (float) 4.5;
                            holder.distanceText.setText("1.8 miles");
                            americanDistances[8] = (float) 1.8;
                            holder.pos = 0;
                            if (americanPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[8] = isChecked;
                                }
                            });
                            break;

                        case "Zaxby's":
                            holder.textTitle.setText("Zaxby's");
                            holder.resImage.setImageResource(R.drawable.zaxbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[8] = (float) 4.2;
                            holder.distanceText.setText("0.6 miles");
                            americanDistances[8] = (float) 0.6;
                            holder.pos = 0;
                            if (americanPositions[8] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[8] = isChecked;
                                }
                            });
                            break;


                    }




                    break;
                case 9:



                    switch (data.get(9)){
                        case "Costco Food Court":
                            holder.textTitle.setText("Costco Food Court");
                            holder.resImage.setImageResource(R.drawable.costco_food);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[9] = (float) 4.5;
                            holder.distanceText.setText("0.3 miles");
                            americanDistances[9] = (float) 0.3;
                            holder.pos = 0;
                            if (americanPositions[9] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[9] = isChecked;
                                }
                            });
                            break;

                        case "Miller's Ale House":
                            holder.textTitle.setText("Miller's Ale House");
                            holder.resImage.setImageResource(R.drawable.millers_ale);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[9] = (float) 4.1;
                            holder.distanceText.setText("0.1 miles");
                            americanDistances[9] = (float) 0.1;
                            holder.pos = 0;
                            if (americanPositions[9] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[9] = isChecked;
                                }
                            });
                            break;

                        case "Arooga's":
                            holder.textTitle.setText("Arooga's");
                            holder.resImage.setImageResource(R.drawable.aroogas_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[9] = (float) 4.2;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[9] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[9] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[9] = isChecked;
                                }
                            });
                            break;

                        case "Chili's Grill & Bar":
                            holder.textTitle.setText("Chili's Grill & Bar");
                            holder.resImage.setImageResource(R.drawable.chilis_grill);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[9] = (float) 4.1;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[9] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[9] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[9] = isChecked;
                                }
                            });
                            break;

                        case "Firehouse Subs":
                            holder.textTitle.setText("Firehouse Subs");
                            holder.resImage.setImageResource(R.drawable.firehouse_subs);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[9] = (float) 4.4;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[9] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[9] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[9] = isChecked;
                                }
                            });
                            break;

                        case "Bolay":
                            holder.textTitle.setText("Bolay");
                            holder.resImage.setImageResource(R.drawable.bolay_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[9] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[9] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[9] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[9] = isChecked;
                                }
                            });
                            break;
                        case "Boston's Fish House":
                            holder.textTitle.setText("Boston's Fish House");
                            holder.resImage.setImageResource(R.drawable.bostons_fish);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[9] = (float) 4.5;
                            holder.distanceText.setText("1.0 miles");
                            americanDistances[9] = (float) 1.0;
                            holder.pos = 0;
                            if (americanPositions[9] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[9] = isChecked;
                                }
                            });
                            break;
                        case "Toasted":
                            holder.textTitle.setText("Toasted");
                            holder.resImage.setImageResource(R.drawable.toasted_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[9] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[9] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[9] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[9] = isChecked;
                                }
                            });
                            break;

                        case "Tibby's":
                            holder.textTitle.setText("Tibby's");
                            holder.resImage.setImageResource(R.drawable.tibbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            americanRating[9] = (float) 4.6;
                            holder.distanceText.setText("1.7 miles");
                            americanDistances[9] = (float) 1.7;
                            holder.pos = 0;
                            if (americanPositions[9] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[9] = isChecked;
                                }
                            });
                            break;
                        case "Mellow Mushroom":
                            holder.textTitle.setText("Mellow Mushroom");
                            holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[9] = (float) 4.5;
                            holder.distanceText.setText("1.8 miles");
                            americanDistances[9] = (float) 1.8;
                            holder.pos = 0;
                            if (americanPositions[9] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[9] = isChecked;
                                }
                            });
                            break;

                        case "Zaxby's":
                            holder.textTitle.setText("Zaxby's");
                            holder.resImage.setImageResource(R.drawable.zaxbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[9] = (float) 4.2;
                            holder.distanceText.setText("0.6 miles");
                            americanDistances[9] = (float) 0.6;
                            holder.pos = 0;
                            if (americanPositions[9] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[9] = isChecked;
                                }
                            });
                            break;
                    }





                    break;
                case 10:



                    switch (data.get(10)){
                        case "Costco Food Court":
                            holder.textTitle.setText("Costco Food Court");
                            holder.resImage.setImageResource(R.drawable.costco_food);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[10] = (float) 4.5;
                            holder.distanceText.setText("0.3 miles");
                            americanDistances[10] = (float) 0.3;
                            holder.pos = 0;
                            if (americanPositions[10] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[10] = isChecked;
                                }
                            });
                            break;

                        case "Miller's Ale House":
                            holder.textTitle.setText("Miller's Ale House");
                            holder.resImage.setImageResource(R.drawable.millers_ale);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[10] = (float) 4.1;
                            holder.distanceText.setText("0.1 miles");
                            americanDistances[10] = (float) 0.1;
                            holder.pos = 0;
                            if (americanPositions[10] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[10] = isChecked;
                                }
                            });
                            break;

                        case "Arooga's":
                            holder.textTitle.setText("Arooga's");
                            holder.resImage.setImageResource(R.drawable.aroogas_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[10] = (float) 4.2;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[10] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[10] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[10] = isChecked;
                                }
                            });
                            break;

                        case "Chili's Grill & Bar":
                            holder.textTitle.setText("Chili's Grill & Bar");
                            holder.resImage.setImageResource(R.drawable.chilis_grill);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[10] = (float) 4.1;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[10] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[10] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[10] = isChecked;
                                }
                            });
                            break;

                        case "Firehouse Subs":
                            holder.textTitle.setText("Firehouse Subs");
                            holder.resImage.setImageResource(R.drawable.firehouse_subs);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[10] = (float) 4.4;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[10] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[10] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[10] = isChecked;
                                }
                            });
                            break;

                        case "Bolay":
                            holder.textTitle.setText("Bolay");
                            holder.resImage.setImageResource(R.drawable.bolay_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[10] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[10] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[10] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[10] = isChecked;
                                }
                            });
                            break;
                        case "Boston's Fish House":
                            holder.textTitle.setText("Boston's Fish House");
                            holder.resImage.setImageResource(R.drawable.bostons_fish);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[10] = (float) 4.5;
                            holder.distanceText.setText("1.0 miles");
                            americanDistances[10] = (float) 1.0;
                            holder.pos = 0;
                            if (americanPositions[10] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[10] = isChecked;
                                }
                            });
                            break;
                        case "Toasted":
                            holder.textTitle.setText("Toasted");
                            holder.resImage.setImageResource(R.drawable.toasted_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[10] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[10] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[10] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[10] = isChecked;
                                }
                            });
                            break;

                        case "Tibby's":
                            holder.textTitle.setText("Tibby's");
                            holder.resImage.setImageResource(R.drawable.tibbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            americanRating[10] = (float) 4.6;
                            holder.distanceText.setText("1.7 miles");
                            americanDistances[10] = (float) 1.7;
                            holder.pos = 0;
                            if (americanPositions[10] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[10] = isChecked;
                                }
                            });
                            break;
                        case "Mellow Mushroom":
                            holder.textTitle.setText("Mellow Mushroom");
                            holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[10] = (float) 4.5;
                            holder.distanceText.setText("1.8 miles");
                            americanDistances[10] = (float) 1.8;
                            holder.pos = 0;
                            if (americanPositions[10] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[10] = isChecked;
                                }
                            });
                            break;

                        case "Zaxby's":
                            holder.textTitle.setText("Zaxby's");
                            holder.resImage.setImageResource(R.drawable.zaxbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[10] = (float) 4.2;
                            holder.distanceText.setText("0.6 miles");
                            americanDistances[10] = (float) 0.6;
                            holder.pos = 0;
                            if (americanPositions[10] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[10] = isChecked;
                                }
                            });
                            break;


                    }



                    break;
                case 11:



                    switch (data.get(11)){
                        case "Costco Food Court":
                            holder.textTitle.setText("Costco Food Court");
                            holder.resImage.setImageResource(R.drawable.costco_food);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[11] = (float) 4.5;
                            holder.distanceText.setText("0.3 miles");
                            americanDistances[11] = (float) 0.3;
                            holder.pos = 0;
                            if (americanPositions[11] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[11] = isChecked;
                                }
                            });
                            break;

                        case "Miller's Ale House":
                            holder.textTitle.setText("Miller's Ale House");
                            holder.resImage.setImageResource(R.drawable.millers_ale);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[11] = (float) 4.1;
                            holder.distanceText.setText("0.1 miles");
                            americanDistances[11] = (float) 0.1;
                            holder.pos = 0;
                            if (americanPositions[11] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[11] = isChecked;
                                }
                            });
                            break;

                        case "Arooga's":
                            holder.textTitle.setText("Arooga's");
                            holder.resImage.setImageResource(R.drawable.aroogas_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[11] = (float) 4.2;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[11] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[11] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[11] = isChecked;
                                }
                            });
                            break;

                        case "Chili's Grill & Bar":
                            holder.textTitle.setText("Chili's Grill & Bar");
                            holder.resImage.setImageResource(R.drawable.chilis_grill);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.1 stars");
                            americanRating[11] = (float) 4.1;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[11] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[11] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[11] = isChecked;
                                }
                            });
                            break;

                        case "Firehouse Subs":
                            holder.textTitle.setText("Firehouse Subs");
                            holder.resImage.setImageResource(R.drawable.firehouse_subs);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.4 stars");
                            americanRating[11] = (float) 4.4;
                            holder.distanceText.setText("0.2 miles");
                            americanDistances[11] = (float) 0.2;
                            holder.pos = 0;
                            if (americanPositions[11] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[11] = isChecked;
                                }
                            });
                            break;

                        case "Bolay":
                            holder.textTitle.setText("Bolay");
                            holder.resImage.setImageResource(R.drawable.bolay_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[11] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[11] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[11] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[11] = isChecked;
                                }
                            });
                            break;
                        case "Boston's Fish House":
                            holder.textTitle.setText("Boston's Fish House");
                            holder.resImage.setImageResource(R.drawable.bostons_fish);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[11] = (float) 4.5;
                            holder.distanceText.setText("1.0 miles");
                            americanDistances[11] = (float) 1.0;
                            holder.pos = 0;
                            if (americanPositions[11] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[11] = isChecked;
                                }
                            });
                            break;
                        case "Toasted":
                            holder.textTitle.setText("Toasted");
                            holder.resImage.setImageResource(R.drawable.toasted_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[11] = (float) 4.5;
                            holder.distanceText.setText("2.0 miles");
                            americanDistances[11] = (float) 2.0;
                            holder.pos = 0;
                            if (americanPositions[11] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[11] = isChecked;
                                }
                            });
                            break;

                        case "Tibby's":
                            holder.textTitle.setText("Tibby's");
                            holder.resImage.setImageResource(R.drawable.tibbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.6 stars");
                            americanRating[11] = (float) 4.6;
                            holder.distanceText.setText("1.7 miles");
                            americanDistances[11] = (float) 1.7;
                            holder.pos = 0;
                            if (americanPositions[11] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[11] = isChecked;
                                }
                            });
                            break;
                        case "Mellow Mushroom":
                            holder.textTitle.setText("Mellow Mushroom");
                            holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.5 stars");
                            americanRating[11] = (float) 4.5;
                            holder.distanceText.setText("1.8 miles");
                            americanDistances[11] = (float) 1.8;
                            holder.pos = 0;
                            if (americanPositions[11] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[11] = isChecked;
                                }
                            });
                            break;

                        case "Zaxby's":
                            holder.textTitle.setText("Zaxby's");
                            holder.resImage.setImageResource(R.drawable.zaxbys_);
                            holder.textDescription.setText("American");
                            holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                            holder.ratingText.setText("Rating: 4.2 stars");
                            americanRating[11] = (float) 4.2;
                            holder.distanceText.setText("0.6 miles");
                            americanDistances[11] = (float) 0.6;
                            holder.pos = 0;
                            if (americanPositions[11] == true) {
                                holder.saveBtn.setChecked(true);

                            } else {
                                holder.saveBtn.setChecked(false);

                            }
                            holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    americanPositions[11] = isChecked;
                                }
                            });
                            break;


                    }

                    break;

            }
        }


        else{

            switch (position){
                case 0:
                    holder.textTitle.setText("Steak n' Shake");
                    holder.resImage.setImageResource(R.drawable.steak_shake);
                    holder.textDescription.setText("Fast Food");
                    holder.textAdress.setText("443 N Semoran Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 3.9 stars");
                    holder.distanceText.setText("0.7 miles");
                    holder.pos = 0;
                    if (positions[0] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[0] = isChecked;
                        }
                    });
                    break;
                case 1:
                    holder.textTitle.setText("Chick-fil-A");
                    holder.resImage.setImageResource(R.drawable.chic_a);
                    holder.textDescription.setText("Fast Food");
                    holder.textAdress.setText("3391 University Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.6 stars");
                    holder.distanceText.setText("0.5 miles");
                    holder.pos = 0;
                    if (positions[1] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 2:
                    holder.textTitle.setText("Perkins Restaurant & Bakery");
                    holder.resImage.setImageResource(R.drawable.perkins_res);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("6425 University Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.4 stars");
                    holder.distanceText.setText("0.5 miles");
                    holder.pos = 0;
                    if (positions[2] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 3:
                    holder.textTitle.setText("Garita Del Sabor");
                    holder.resImage.setImageResource(R.drawable.garita_del_sabor);
                    holder.textDescription.setText("Spanish");
                    holder.textAdress.setText("3413 Forsyth Rd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 1.0 stars");
                    holder.distanceText.setText("0.6 miles");
                    holder.pos = 0;
                    if (positions[3] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 4:
                    holder.textTitle.setText("Rincon Latino Cafe");
                    holder.resImage.setImageResource(R.drawable.rincon_latino);
                    holder.textDescription.setText("Spanish");
                    holder.textAdress.setText("3327 Forsyth Rd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.5 stars");
                    holder.distanceText.setText("0.7 miles");
                    holder.pos = 0;
                    if (positions[4] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 5:
                    holder.textTitle.setText("Costco Food Court");
                    holder.resImage.setImageResource(R.drawable.costco_food);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("3333 University Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.5 stars");
                    holder.distanceText.setText("0.3 miles");
                    holder.pos = 0;
                    if (positions[5] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;

                        }
                    });
                    break;
                case 6:
                    holder.textTitle.setText("Miller's Ale House");
                    holder.resImage.setImageResource(R.drawable.millers_ale);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("101 University Park Dr, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.1 stars");
                    holder.distanceText.setText("0.1 miles");
                    holder.pos = 0;
                    if (positions[6] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 7:
                    holder.textTitle.setText("China Garden Restaurant");
                    holder.resImage.setImageResource(R.drawable.china_garden);
                    holder.textDescription.setText("Asian");
                    holder.textAdress.setText("118 S Semoran Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 3.8 stars");
                    holder.distanceText.setText("0.33 miles");
                    holder.pos = 0;
                    if (positions[7] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 8:
                    holder.textTitle.setText("Arooga's");
                    holder.resImage.setImageResource(R.drawable.aroogas_);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("227 S Semoran Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.2 stars");
                    holder.distanceText.setText("0.2 miles");
                    holder.pos = 0;
                    if (positions[8] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;

                        }
                    });
                    break;
                case 9:
                    holder.textTitle.setText("Chili's Grill & Bar");
                    holder.resImage.setImageResource(R.drawable.chilis_grill);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("303 Semoran Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.1 stars");
                    holder.distanceText.setText("0.2 miles");
                    holder.pos = 0;
                    if (positions[9] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;

                        }
                    });
                    break;
                case 10:
                    holder.textTitle.setText("Firehouse Subs");
                    holder.resImage.setImageResource(R.drawable.firehouse_subs);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("419 S Semoran Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.4 stars");
                    holder.distanceText.setText("0.2 miles");
                    holder.pos = 0;
                    if (positions[10] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;

                        }
                    });
                    break;
                case 11:
                    holder.textTitle.setText("Kiko Japanese Cuisine");
                    holder.resImage.setImageResource(R.drawable.kiko_japan);
                    holder.textDescription.setText("Asian");
                    holder.textAdress.setText("110 S Semoran Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.5 stars");
                    holder.distanceText.setText("0.4 miles");
                    holder.pos = 0;
                    if (positions[11] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;

                        }
                    });
                    break;
                case 12:
                    holder.textTitle.setText("Bolay");
                    holder.resImage.setImageResource(R.drawable.bolay_);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("1971 Aloma Ave, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.5 stars");
                    holder.distanceText.setText("2.0 miles");
                    holder.pos = 0;
                    if (positions[12] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;

                        }
                    });
                    break;
                case 13:
                    holder.textTitle.setText("Boston's Fish House");
                    holder.resImage.setImageResource(R.drawable.bostons_fish);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("6860 Aloma Ave, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.5 stars");
                    holder.distanceText.setText("1.0 miles");
                    holder.pos = 0;
                    if (positions[13] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 14:
                    holder.textTitle.setText("Anna's Polish Restaurant");
                    holder.resImage.setImageResource(R.drawable.annas_polish);
                    holder.textDescription.setText("Polish");
                    holder.textAdress.setText("3586 Aloma Ave # 7, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.7 stars");
                    holder.distanceText.setText("1.2 miles");
                    holder.pos = 0;
                    if (positions[14] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 15:
                    holder.textTitle.setText("Moghul Indian Cuisine");
                    holder.resImage.setImageResource(R.drawable.moghul_indian_cuisine);
                    holder.textDescription.setText("Asian");
                    holder.textAdress.setText("401 N Semoran Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.4 stars");
                    holder.distanceText.setText("0.6 miles");
                    holder.pos = 0;
                    if (positions[15] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 16:
                    holder.textTitle.setText("La Granja");
                    holder.resImage.setImageResource(R.drawable.la_granja);
                    holder.textDescription.setText("Spanish");
                    holder.textAdress.setText("490 N Semoran Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.4 stars");
                    holder.distanceText.setText("0.7 miles");
                    holder.pos = 0;
                    if (positions[16] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 17:
                    holder.textTitle.setText("Habaneros Mexican Restaurant");
                    holder.resImage.setImageResource(R.drawable.habanero_mexican);
                    holder.textDescription.setText("Spanish");
                    holder.textAdress.setText("494 N Semoran Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.3 stars");
                    holder.distanceText.setText("0.7 miles");
                    holder.pos = 0;
                    if (positions[17] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 18:
                    holder.textTitle.setText("La Hacienda");
                    holder.resImage.setImageResource(R.drawable.la_hacienda);
                    holder.textDescription.setText("Spanish");
                    holder.textAdress.setText("3090 Aloma Ave # 145, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.4 stars");
                    holder.distanceText.setText("0.7 miles");
                    holder.pos = 0;
                    if (positions[18] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 19:
                    holder.textTitle.setText("Thai Villa Restaurant");
                    holder.resImage.setImageResource(R.drawable.thai_villa);
                    holder.textDescription.setText("Asian");
                    holder.textAdress.setText("7355 Aloma Ave, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.6 stars");
                    holder.distanceText.setText("1.4 miles");
                    holder.pos = 0;
                    if (positions[19] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 20:
                    holder.textTitle.setText("Mi Raza Restaurant");
                    holder.resImage.setImageResource(R.drawable.mi_raza);
                    holder.textDescription.setText("Spanish");
                    holder.textAdress.setText("1810 FL-436, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.2 stars");
                    holder.distanceText.setText("1.7 miles");
                    holder.pos = 0;
                    if (positions[20] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 21:
                    holder.textTitle.setText("Arigato Sushi Restaurant");
                    holder.resImage.setImageResource(R.drawable.arigato_sushi);
                    holder.textDescription.setText("Asian");
                    holder.textAdress.setText("1560 Semoran N Cir, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.3 stars");
                    holder.distanceText.setText("2.2 miles");
                    holder.pos = 0;
                    if (positions[21] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);
                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 22:
                    holder.textTitle.setText("Kai Asian Street Restaurant");
                    holder.resImage.setImageResource(R.drawable.kai_asian);
                    holder.textDescription.setText("Asian");
                    holder.textAdress.setText("1555 FL-436 Suite 1171, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.6 stars");
                    holder.distanceText.setText("2.2 miles");
                    holder.pos = 0;
                    if (positions[22] == true) {
                        holder.saveBtn.setChecked(true);
                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 23:
                    holder.textTitle.setText("Mei Garden");
                    holder.resImage.setImageResource(R.drawable.mei_garden);
                    holder.textDescription.setText("Asian");
                    holder.textAdress.setText("3760 Howell Branch Rd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.3 stars");
                    holder.distanceText.setText("3.2 miles");
                    holder.pos = 0;
                    if (positions[23] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 24:
                    holder.textTitle.setText("Jalisco");
                    holder.resImage.setImageResource(R.drawable.jalisco_);
                    holder.textDescription.setText("Spanish");
                    holder.textAdress.setText("2021 N Goldenrod Rd, Orlando, FL 32807");
                    holder.ratingText.setText("Rating: 4.5 stars");
                    holder.distanceText.setText("3.1 miles");
                    holder.pos = 0;
                    if (positions[24] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;

                        }
                    });
                    break;
                case 25:
                    holder.textTitle.setText("He Sheng");
                    holder.resImage.setImageResource(R.drawable.he_sheng);
                    holder.textDescription.setText("Asian");
                    holder.textAdress.setText("7756 University Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.4 stars");
                    holder.distanceText.setText("1.4 miles");
                    holder.pos = 0;
                    if (positions[25] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 26:
                    holder.textTitle.setText("Toasted");
                    holder.resImage.setImageResource(R.drawable.toasted_);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("1945 Aloma Ave, Winter Park, FL 32792\n");
                    holder.ratingText.setText("Rating: 4.5 stars");
                    holder.distanceText.setText("2.0 miles");
                    holder.pos = 0;
                    if (positions[26] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 27:
                    holder.textTitle.setText("Tibby's");
                    holder.resImage.setImageResource(R.drawable.tibbys_);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("2203 Aloma Ave, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.6 stars");
                    holder.distanceText.setText("1.7 miles");
                    holder.pos = 0;
                    if (positions[27] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 28:
                    holder.textTitle.setText( "Mellow Mushroom");
                    holder.resImage.setImageResource(R.drawable.mellow_mushroom);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("2015 Aloma Ave, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.5 stars");
                    holder.distanceText.setText("1.8 miles");
                    holder.pos = 0;
                    if (positions[28] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 29:
                    holder.textTitle.setText("Viet-Nomz");
                    holder.resImage.setImageResource(R.drawable.viet_nomz);
                    holder.textDescription.setText("Asian");
                    holder.textAdress.setText("7581 University Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.7 stars");
                    holder.distanceText.setText("1.3 miles");
                    holder.pos = 0;
                    if (positions[29] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 30:
                    holder.textTitle.setText("Zaxby's");
                    holder.resImage.setImageResource(R.drawable.zaxbys_);
                    holder.textDescription.setText("American");
                    holder.textAdress.setText("6503 University Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.2 stars");
                    holder.distanceText.setText("0.6 miles");
                    holder.pos = 0;
                    if (positions[30] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;

                        }
                    });
                    break;
                case 31:
                    holder.textTitle.setText("McDonald's");
                    holder.resImage.setImageResource(R.drawable.mcdonalds);
                    holder.textDescription.setText("Fast Food");
                    holder.textAdress.setText("3162 University Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 3.6 stars");
                    holder.distanceText.setText("0.1 miles");
                    holder.pos = 1;
                    if (positions[31] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;

                        }
                    });
                    break;
                case 32:
                    holder.textTitle.setText("Wendy's");
                    holder.resImage.setImageResource(R.drawable.wendys);
                    holder.textDescription.setText("Fast Food");
                    holder.textAdress.setText("365 University Park Dr, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 3.8 stars");
                    holder.distanceText.setText("0.3 miles");
                    holder.pos = 2;
                    if (positions[32] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 33:
                    holder.textTitle.setText("Little Caesars");
                    holder.resImage.setImageResource(R.drawable.littlecaesars);
                    holder.textDescription.setText("Fast Food");
                    holder.textAdress.setText("495 N Semoran Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 4.1 stars");
                    holder.distanceText.setText("0.8 miles");
                    holder.pos = 3;
                    if (positions[33] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 34:
                    holder.textTitle.setText("Dunkin Donuts");
                    holder.resImage.setImageResource(R.drawable.dd);
                    holder.textDescription.setText("Fast Food");
                    holder.textAdress.setText("6627 University Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 3.6 stars");
                    holder.distanceText.setText("0.6 miles");
                    holder.pos = 4;
                    if (positions[34] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });
                    break;
                case 35:
                    holder.textTitle.setText("Burger King");
                    holder.resImage.setImageResource(R.drawable.burger_king);
                    holder.textDescription.setText("Fast Food");
                    holder.textAdress.setText("6709 University Blvd, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 3.1 stars");
                    holder.distanceText.setText("0.7 miles");
                    holder.pos = 5;
                    if (positions[35] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;

                        }
                    });
                    break;
                case 36:
                    holder.textTitle.setText("KFC");
                    holder.resImage.setImageResource(R.drawable.kfc);
                    holder.textDescription.setText("Fast Food");
                    holder.textAdress.setText(" 4250 Aloma Ave, Winter Park, FL 32792");
                    holder.ratingText.setText("Rating: 3.5 stars");
                    holder.distanceText.setText("3.0 miles");
                    if (positions[36] == true) {
                        holder.saveBtn.setChecked(true);

                    } else {
                        holder.saveBtn.setChecked(false);

                    }
                    holder.saveBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            positions[position] = isChecked;
                        }
                    });


                    holder.pos = 6;
                    break;
            }

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
        ToggleButton saveBtn;


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
