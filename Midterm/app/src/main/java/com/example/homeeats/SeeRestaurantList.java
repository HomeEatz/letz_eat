package com.example.homeeats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SeeRestaurantList extends AppCompatActivity {

    float DISTANCE;
    float RATING;
    boolean DOLLAR_SIGN1;
    boolean DOLLAR_SIGN2;
    boolean DOLLAR_SIGN3;


    RecyclerView recyclerView;
    Adapter adapter;
    public ArrayList<String> items;
    boolean [] restaurants = new boolean [37];
    public boolean [] p = new boolean [37];
    public float [] dist = new float [37];
    public boolean [] isFav = new boolean[7];
    boolean [] typeOfFood = new boolean [5];
    float [] rating = new float[37];
    int image;
    int count2;

    boolean [] asianRestaurants = new boolean[9];
    boolean [] americanRestaurants = new boolean[12];
    boolean [] fastFoodRestaurants = new boolean[8];
    boolean polishRestaurant;
    boolean [] spanishRestaurants = new boolean[7];
    float [] fastFoodDistances = new float[8];
    float [] spanishDistances = new float[7];
    float [] americanDistances = new float[12];
    float [] asianDistances = new float[9];
    float polishDistance;
    float [] fastFoodRating = new float[8];
    float [] spanishRating = new float[7];
    float [] americanRating = new float[12];
    float [] asianRating = new float[9];
    float polishRating;

    int [] notFavorite = new int [37];



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.see_restaurant_list);


        Intent SeeRestaurantListIntent = getIntent();
        if (SeeRestaurantListIntent != null) {

            restaurants = SeeRestaurantListIntent.getBooleanArrayExtra("RESTAURANTS");
            dist = SeeRestaurantListIntent.getFloatArrayExtra("DISTANCES");
            typeOfFood = SeeRestaurantListIntent.getBooleanArrayExtra("TYPE_OF_FOOD");

            //Intent FilterScreenIntent = getIntent();
            DISTANCE = SeeRestaurantListIntent.getFloatExtra("DISTANCE_VALUE", DISTANCE);
            RATING = SeeRestaurantListIntent.getFloatExtra("RATING_VALUE", RATING);
            DOLLAR_SIGN1 = SeeRestaurantListIntent.getBooleanExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
            DOLLAR_SIGN2 = SeeRestaurantListIntent.getBooleanExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
            DOLLAR_SIGN3 = SeeRestaurantListIntent.getBooleanExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
            rating = SeeRestaurantListIntent.getFloatArrayExtra("RATING_ARRAY");
            image = SeeRestaurantListIntent.getIntExtra("IMAGE_PIC", image);
            count2 = SeeRestaurantListIntent.getIntExtra("NUMBER_OF_CATEGORIES_SELECTED", count2);
            asianRestaurants = SeeRestaurantListIntent.getBooleanArrayExtra("ASIAN_RESTAURANTS");
            asianDistances = SeeRestaurantListIntent.getFloatArrayExtra("ASIAN_DISTANCES");
            asianRating = SeeRestaurantListIntent.getFloatArrayExtra("ASIAN_RATING");
            americanRestaurants = SeeRestaurantListIntent.getBooleanArrayExtra("AMERICAN_RESTAURANTS");
            americanDistances = SeeRestaurantListIntent.getFloatArrayExtra("AMERICAN_DISTANCES");
            americanRating = SeeRestaurantListIntent.getFloatArrayExtra("AMERICAN_RATING");
            polishRestaurant = SeeRestaurantListIntent.getBooleanExtra("POLISH_RESTAURANT", polishRestaurant);
            polishDistance = SeeRestaurantListIntent.getFloatExtra("POLISH_DISTANCE", polishDistance);
            polishRating = SeeRestaurantListIntent.getFloatExtra("POLISH_RATING", polishRating);
            fastFoodRestaurants = SeeRestaurantListIntent.getBooleanArrayExtra("FAST_FOOD_RESTAURANTS");
            fastFoodDistances = SeeRestaurantListIntent.getFloatArrayExtra("FAST_FOOD_DISTANCES");
            fastFoodRating = SeeRestaurantListIntent.getFloatArrayExtra("FAST_FOOD_RATING");
            spanishRestaurants = SeeRestaurantListIntent.getBooleanArrayExtra("SPANISH_RESTAURANTS");
            spanishDistances = SeeRestaurantListIntent.getFloatArrayExtra("SPANISH_DISTANCES");
            spanishRating = SeeRestaurantListIntent.getFloatArrayExtra("SPANISH_RATING");
            notFavorite = SeeRestaurantListIntent.getIntArrayExtra("NOT_FAVORITE");


        }
        if(notFavorite == null){
            notFavorite = new int[37];
            for(int i = 0; i < 37; i++){
                notFavorite[i] = 0;
            }
        }
        if (restaurants == null && dist == null) {
            restaurants = new boolean[37];
            dist = new float[37];
            for (int i = 0; i < 37; i++) {
                restaurants[i] = false;
                dist[i] = (float) 0.0;

            }
        }
        if (dist == null) {
            dist = new float[37];
            for (int i = 0; i < 37; i++) {
                dist[i] = (float) 0.0;

            }
        }
        if (rating == null) {
            rating = new float[37];
            for (int i = 0; i < 37; i++) {
                rating[i] = (float) 0.0;
            }
        }
        if (DISTANCE == 0.0) {
            DISTANCE = (float) 5.0;
            RATING = (float) 5.0;
        }
        if (asianDistances == null) {
            asianDistances = new float[9];
            for (int i = 0; i < asianDistances.length; i++) {
                asianDistances[i] = (float) 0.0;
            }
        }
        if (americanDistances == null) {
            americanDistances = new float[12];
            for (int i = 0; i < americanDistances.length; i++) {
                americanDistances[i] = (float) 0.0;
            }
        }
        if (fastFoodDistances == null) {
            fastFoodDistances = new float[8];
            for (int i = 0; i < fastFoodDistances.length; i++) {
                fastFoodDistances[i] = (float) 0.0;
            }
        }
        if (spanishDistances == null) {
            spanishDistances = new float[7];
            polishDistance = (float) 0.0;
            for (int i = 0; i < spanishDistances.length; i++) {
                spanishDistances[i] = (float) 0.0;
            }
        }
        if (asianRating == null) {
            asianRating = new float[9];
            for (int i = 0; i < asianRating.length; i++) {
                asianRating[i] = (float) 0.0;
            }
        }
        if (americanRating == null) {
            americanRating = new float[12];
            for (int i = 0; i < americanRating.length; i++) {
                americanRating[i] = (float) 0.0;
            }
        }
        if (fastFoodRating == null) {
            fastFoodRating = new float[8];
            for (int i = 0; i < fastFoodRating.length; i++) {
                fastFoodRating[i] = (float) 0.0;
            }
        }
        if (spanishRating == null) {
            spanishRating = new float[7];
            polishRating = (float) 0.0;
            for (int i = 0; i < spanishRating.length; i++) {
                spanishRating[i] = (float) 0.0;
            }
        }
        if (asianRestaurants == null) {
            asianRestaurants = new boolean[9];
            for (int i = 0; i < asianRestaurants.length; i++) {
                asianRestaurants[i] = false;
            }
        }
        if (americanRestaurants == null) {
            americanRestaurants = new boolean[12];
            for (int i = 0; i < americanRestaurants.length; i++) {
                americanRestaurants[i] = false;
            }
        }
        if (fastFoodRestaurants == null) {
            fastFoodRestaurants = new boolean[8];
            for (int i = 0; i < fastFoodRestaurants.length; i++) {
                fastFoodRestaurants[i] = false;
            }
        }
        if (spanishRestaurants == null) {
            spanishRestaurants = new boolean[7];
            polishRestaurant = false;
            for (int i = 0; i < spanishRestaurants.length; i++) {
                spanishRestaurants[i] = false;
            }
        }


        items = new ArrayList<>();
        items.clear();

        if (image != 9) {

            if (image == 0) {

                if (asianDistances[0] <= DISTANCE && asianRating[0] <= RATING) {
                    items.add("Asian");

                }
                if (asianDistances[1] <= DISTANCE && asianRating[1] <= RATING) {
                    items.add("Kiko Japanese Cuisine");

                }
                if (asianDistances[2] <= DISTANCE && asianRating[2] <= RATING) {
                    items.add("Moghul Indian Cuisine");


                }
                if (asianDistances[3] <= DISTANCE && asianRating[3] <= RATING) {
                    items.add("Thai Villa Restaurant");


                }
                if (asianDistances[4] <= DISTANCE && asianRating[4] <= RATING) {
                    items.add("Arigato Sushi Restaurant");


                }
                if (asianDistances[5] <= DISTANCE && asianRating[5] <= RATING) {
                    items.add("Kai Asian Street Restaurant");


                }
                if (asianDistances[6] <= DISTANCE && asianRating[6] <= RATING) {
                    items.add("Mei Garden");


                }
                if (asianDistances[7] <= DISTANCE && asianRating[7] <= RATING) {
                    items.add("He Sheng");


                }
                if (asianDistances[8] <= DISTANCE && asianRating[8] <= RATING) {
                    items.add("Viet-Nomz");

                }


            }


            if (image == 1) {
                if (americanDistances[0] <= DISTANCE && americanRating[0] <= RATING) {
                    items.add("American");
                }
                if (americanDistances[1] <= DISTANCE && americanRating[1] <= RATING) {
                    items.add("Costco Food Court");
                }
                if (americanDistances[2] <= DISTANCE && americanRating[2] <= RATING) {
                    items.add("Miller's Ale House");
                }
                if (americanDistances[3] <= DISTANCE && americanRating[3] <= RATING) {
                    items.add("Arooga's");
                }
                if (americanDistances[4] <= DISTANCE && americanRating[4] <= RATING) {
                    items.add("Chili's Grill & Bar");
                }
                if (americanDistances[5] <= DISTANCE && americanRating[5] <= RATING) {
                    items.add("Firehouse Subs");
                }
                if (americanDistances[6] <= DISTANCE && americanRating[6] <= RATING) {
                    items.add("Bolay");
                }
                if (americanDistances[7] <= DISTANCE && americanRating[7] <= RATING) {
                    items.add("Boston's Fish House");
                }
                if (americanDistances[8] <= DISTANCE && americanRating[8] <= RATING) {
                    items.add("Toasted");
                }
                if (americanDistances[9] <= DISTANCE && americanRating[9] <= RATING) {
                    items.add("Tibby's");
                }
                if (americanDistances[10] <= DISTANCE && americanRating[10] <= RATING) {
                    items.add("Mellow Mushroom");
                }
                if (americanDistances[11] <= DISTANCE && americanRating[11] <= RATING) {
                    items.add("Zaxby's");
                }

            }


            if (image == 2) {
                if (polishDistance <= DISTANCE && polishRating <= RATING) {
                    items.add("Polish");
                }
            }


            if (image == 3) {
                if (fastFoodDistances[0] <= DISTANCE && fastFoodRating[0] <= RATING) {
                    items.add("Fast Food");
                }
                if (fastFoodDistances[1] <= DISTANCE && fastFoodRating[1] <= RATING) {
                    items.add("Chick-fil-A");
                }
                if (fastFoodDistances[2] <= DISTANCE && fastFoodRating[2] <= RATING) {
                    items.add("McDonald's");
                }
                if (fastFoodDistances[3] <= DISTANCE && fastFoodRating[3] <= RATING) {
                    items.add("Wendy's");
                }
                if (fastFoodDistances[4] <= DISTANCE && fastFoodRating[4] <= RATING) {
                    items.add("Little Caesars");
                }
                if (fastFoodDistances[5] <= DISTANCE && fastFoodRating[5] <= RATING) {
                    items.add("Dunkin Donuts");
                }
                if (fastFoodDistances[6] <= DISTANCE && fastFoodRating[6] <= RATING) {
                    items.add("Burger King");
                }
                if (fastFoodDistances[7] <= DISTANCE && fastFoodRating[7] <= RATING) {
                    items.add("KFC");
                }
            }


            if (image == 4) {
                if (spanishDistances[0] <= DISTANCE && spanishRating[0] <= RATING) {
                    items.add("Spanish");
                }
                if (spanishDistances[1] <= DISTANCE && spanishRating[1] <= RATING) {
                    items.add("Rincon Latino Cafe");
                }
                if (spanishDistances[2] <= DISTANCE && spanishRating[2] <= RATING) {
                    items.add("La Granja");
                }
                if (spanishDistances[3] <= DISTANCE && spanishRating[3] <= RATING) {
                    items.add("Habaneros Mexican Restaurant");
                }
                if (spanishDistances[4] <= DISTANCE && spanishRating[4] <= RATING) {
                    items.add("La Hacienda");
                }
                if (spanishDistances[5] <= DISTANCE && spanishRating[5] <= RATING) {
                    items.add("Mi Raza Restaurant");
                }
                if (spanishDistances[6] <= DISTANCE && spanishRating[6] <= RATING) {
                    items.add("Jalisco");
                }
            }


        } else if (count2 < 5) {

            if(dist[0] <= DISTANCE && rating[0] <= RATING) {
                items.add("Steak n' Shake");
            }
            if(dist[1] <= DISTANCE && rating[1] <= RATING) {
                items.add("Chick-fil-A");
            }
            if(dist[2] <= DISTANCE && rating[2] <= RATING) {
                items.add("Perkins Restaurant & Bakery");
            }
            if(dist[3] <= DISTANCE && rating[3] <= RATING) {
                items.add("Garita Del Sabor");
            }
            if(dist[4] <= DISTANCE && rating[4] <= RATING) {
                items.add("Rincon Latino Cafe");
            }
            if(dist[5] <= DISTANCE && rating[5] <= RATING) {
                items.add("Costco Food Court");
            }
            if(dist[6] <= DISTANCE && rating[6] <= RATING) {
                items.add("Miller's Ale House");
            }
            if(dist[7] <= DISTANCE && rating[7] <= RATING) {
                items.add("China Garden Restaurant");
            }
            if(dist[8] <= DISTANCE && rating[8] <= RATING) {
                items.add("Arooga's");
            }
            if(dist[9] <= DISTANCE && rating[9] <= RATING) {
                items.add("Chili's Grill & Bar");
            }
            if(dist[10] <= DISTANCE && rating[10] <= RATING) {
                items.add("Firehouse Subs");
            }
            if(dist[11] <= DISTANCE && rating[11] <= RATING) {
                items.add("Kiko Japanese Cuisine");
            }
            if(dist[12] <= DISTANCE && rating[12] <= RATING) {
                items.add("Bolay");
            }
            if(dist[13] <= DISTANCE && rating[13] <= RATING) {
                items.add("Boston's Fish House");
            }
            if(dist[14] <= DISTANCE && rating[14] <= RATING) {
                items.add("Anna's Polish Restaurant");
            }
            if(dist[15] <= DISTANCE && rating[15] <= RATING) {
                items.add("Moghul Indian Cuisine");
            }
            if(dist[16] <= DISTANCE && rating[16] <= RATING) {
                items.add("La Granja");
            }
            if(dist[17] <= DISTANCE && rating[17] <= RATING) {
                items.add("Habaneros Mexican Restaurant");
            }
            if(dist[18] <= DISTANCE && rating[18] <= RATING) {
                items.add("La Hacienda");
            }
            if(dist[19] <= DISTANCE && rating[19] <= RATING) {
                items.add("Thai Villa Restaurant");
            }
            if(dist[20] <= DISTANCE && rating[20] <= RATING) {
                items.add("Mi Raza Restaurant");
            }
            if(dist[21] <= DISTANCE && rating[21] <= RATING) {
                items.add("Arigato Sushi Restaurant");
            }
            if(dist[22] <= DISTANCE && rating[22] <= RATING) {
                items.add("Kai Asian Street Restaurant");
            }
            if(dist[23] <= DISTANCE && rating[23] <= RATING) {
                items.add("Mei Garden");
            }
            if(dist[24] <= DISTANCE && rating[24] <= RATING) {
                items.add("Jalisco");
            }
            if(dist[25] <= DISTANCE && rating[25] <= RATING) {
                items.add("He Sheng");
            }
            if(dist[26] <= DISTANCE && rating[26] <= RATING) {
                items.add("Toasted");
            }
            if(dist[27] <= DISTANCE && rating[27] <= RATING) {
                items.add("Tibby's");
            }
            if(dist[28] <= DISTANCE && rating[28] <= RATING) {
                items.add("Mellow Mushroom");
            }
            if(dist[29] <= DISTANCE && rating[29] <= RATING) {
                items.add("Viet-Nomz");
            }
            if(dist[30] <= DISTANCE && rating[30] <= RATING) {
                items.add("Zaxby's");
            }
            if(dist[31] <= DISTANCE && rating[31] <= RATING) {
                items.add("McDonald's");
            }
            if(dist[32] <= DISTANCE && rating[32] <= RATING) {
                items.add("Wendy's");
            }
            if(dist[33] <= DISTANCE && rating[33] <= RATING) {
                items.add("Little Caesars");
            }
            if(dist[34] <= DISTANCE && rating[34] <= RATING) {
                items.add("Dunkin Donuts");
            }
            if(dist[35] <= DISTANCE && rating[35] <= RATING) {
                items.add("Burger King");
            }
            if(dist[36] <= DISTANCE && rating[36] <= RATING) {
                items.add("KFC");
            }


        }








        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, items);
        if(restaurants!= null){





            adapter.positions[0] = restaurants[0];
            adapter.positions[1] = restaurants[1];
            adapter.positions[2] = restaurants[2];
            adapter.positions[3] = restaurants[3];
            adapter.positions[4] = restaurants[4];
            adapter.positions[5] = restaurants[5];
            adapter.positions[6] = restaurants[6];
            adapter.positions[7] = restaurants[7];
            adapter.positions[8] = restaurants[8];
            adapter.positions[9] = restaurants[9];
            adapter.positions[10] = restaurants[10];
            adapter.positions[11] = restaurants[11];
            adapter.positions[12] = restaurants[12];
            adapter.positions[13] = restaurants[13];
            adapter.positions[14] = restaurants[14];
            adapter.positions[15] = restaurants[15];
            adapter.positions[16] = restaurants[16];
            adapter.positions[17] = restaurants[17];
            adapter.positions[18] = restaurants[18];
            adapter.positions[19] = restaurants[19];
            adapter.positions[20] = restaurants[20];
            adapter.positions[21] = restaurants[21];
            adapter.positions[22] = restaurants[22];
            adapter.positions[23] = restaurants[23];
            adapter.positions[24] = restaurants[24];
            adapter.positions[25] = restaurants[25];
            adapter.positions[26] = restaurants[26];
            adapter.positions[27] = restaurants[27];
            adapter.positions[28] = restaurants[28];
            adapter.positions[29] = restaurants[29];
            adapter.positions[30] = restaurants[30];
            adapter.positions[31] = restaurants[31];
            adapter.positions[32] = restaurants[32];
            adapter.positions[33] = restaurants[33];
            adapter.positions[34] = restaurants[34];
            adapter.positions[35] = restaurants[35];
            adapter.positions[36] = restaurants[36];



            adapter.ratingPositions[0] = rating[0];
            adapter.ratingPositions[1] = rating[1];
            adapter.ratingPositions[2] = rating[2];
            adapter.ratingPositions[3] = rating[3];
            adapter.ratingPositions[4] = rating[4];
            adapter.ratingPositions[5] = rating[5];
            adapter.ratingPositions[6] = rating[6];
            adapter.ratingPositions[7] = rating[7];
            adapter.ratingPositions[8] = rating[8];
            adapter.ratingPositions[9] = rating[9];
            adapter.ratingPositions[10] = rating[10];
            adapter.ratingPositions[11] = rating[11];
            adapter.ratingPositions[12] = rating[12];
            adapter.ratingPositions[13] = rating[13];
            adapter.ratingPositions[14] = rating[14];
            adapter.ratingPositions[15] = rating[15];
            adapter.ratingPositions[16] = rating[16];
            adapter.ratingPositions[17] = rating[17];
            adapter.ratingPositions[18] = rating[18];
            adapter.ratingPositions[19] = rating[19];
            adapter.ratingPositions[20] = rating[20];
            adapter.ratingPositions[21] = rating[21];
            adapter.ratingPositions[22] = rating[22];
            adapter.ratingPositions[23] = rating[23];
            adapter.ratingPositions[24] = rating[24];
            adapter.ratingPositions[25] = rating[25];
            adapter.ratingPositions[26] = rating[26];
            adapter.ratingPositions[27] = rating[27];
            adapter.ratingPositions[28] = rating[28];
            adapter.ratingPositions[29] = rating[29];
            adapter.ratingPositions[30] = rating[30];
            adapter.ratingPositions[31] = rating[31];
            adapter.ratingPositions[32] = rating[32];
            adapter.ratingPositions[33] = rating[33];
            adapter.ratingPositions[34] = rating[34];
            adapter.ratingPositions[35] = rating[35];
            adapter.ratingPositions[36] = rating[36];

            adapter.asianRating[0] = asianRating[0];
            adapter.asianRating[1] = asianRating[1];
            adapter.asianRating[2] = asianRating[2];
            adapter.asianRating[3] = asianRating[3];
            adapter.asianRating[4] = asianRating[4];
            adapter.asianRating[5] = asianRating[5];
            adapter.asianRating[6] = asianRating[6];
            adapter.asianRating[7] = asianRating[7];
            adapter.asianRating[8] = asianRating[8];

            adapter.asianDistances[0] = asianDistances[0];
            adapter.asianDistances[1] = asianDistances[1];
            adapter.asianDistances[2] = asianDistances[2];
            adapter.asianDistances[3] = asianDistances[3];
            adapter.asianDistances[4] = asianDistances[4];
            adapter.asianDistances[5] = asianDistances[5];
            adapter.asianDistances[6] = asianDistances[6];
            adapter.asianDistances[7] = asianDistances[7];
            adapter.asianDistances[8] = asianDistances[8];

            adapter.americanRating[0] =  americanRating[0];
            adapter.americanRating[1] = americanRating[1];
            adapter.americanRating[2] = americanRating[2];
            adapter.americanRating[3] = americanRating[3];
            adapter.americanRating[4] = americanRating[4];
            adapter.americanRating[5] = americanRating[5];
            adapter.americanRating[6] = americanRating[6];
            adapter.americanRating[7] = americanRating[7];
            adapter.americanRating[8] = americanRating[8];
            adapter.americanRating[9] = americanRating[9];
            adapter.americanRating[10] = americanRating[10];
            adapter.americanRating[11] = americanRating[11];

            adapter.americanDistances[0] =  americanDistances[0];
            adapter.americanDistances[1] = americanDistances[1];
            adapter.americanDistances[2] = americanDistances[2];
            adapter.americanDistances[3] = americanDistances[3];
            adapter.americanDistances[4] = americanDistances[4];
            adapter.americanDistances[5] = americanDistances[5];
            adapter.americanDistances[6] = americanDistances[6];
            adapter.americanDistances[7] = americanDistances[7];
            adapter.americanDistances[8] = americanDistances[8];
            adapter.americanDistances[9] = americanDistances[9];
            adapter.americanDistances[10] = americanDistances[10];
            adapter.americanDistances[11] = americanDistances[11];

            adapter.polishRating = polishRating;
            adapter.polishDistance = polishDistance;

            adapter.fastFoodRating[0] = fastFoodRating[0];
            adapter.fastFoodRating[1] = fastFoodRating[1];
            adapter.fastFoodRating[2] = fastFoodRating[2];
            adapter.fastFoodRating[3] = fastFoodRating[3];
            adapter.fastFoodRating[4] = fastFoodRating[4];
            adapter.fastFoodRating[5] = fastFoodRating[5];
            adapter.fastFoodRating[6] = fastFoodRating[6];
            adapter.fastFoodRating[7] = fastFoodRating[7];

            adapter.fastFoodDistances[0] = fastFoodDistances[0];
            adapter.fastFoodDistances[1] = fastFoodDistances[1];
            adapter.fastFoodDistances[2] = fastFoodDistances[2];
            adapter.fastFoodDistances[3] = fastFoodDistances[3];
            adapter.fastFoodDistances[4] = fastFoodDistances[4];
            adapter.fastFoodDistances[5] = fastFoodDistances[5];
            adapter.fastFoodDistances[6] = fastFoodDistances[6];
            adapter.fastFoodDistances[7] = fastFoodDistances[7];

            adapter.spanishRating[0] = spanishRating[0];
            adapter.spanishRating[1] = spanishRating[1];
            adapter.spanishRating[2] = spanishRating[2];
            adapter.spanishRating[3] = spanishRating[3];
            adapter.spanishRating[4] = spanishRating[4];
            adapter.spanishRating[5] = spanishRating[5];
            adapter.spanishRating[6] = spanishRating[6];

            adapter.spanishDistances[0] = spanishDistances[0];
            adapter.spanishDistances[1] = spanishDistances[1];
            adapter.spanishDistances[2] = spanishDistances[2];
            adapter.spanishDistances[3] = spanishDistances[3];
            adapter.spanishDistances[4] = spanishDistances[4];
            adapter.spanishDistances[5] = spanishDistances[5];
            adapter.spanishDistances[6] = spanishDistances[6];





            if(image == 9){
                adapter.isDefault = true;

            }
            else{
                adapter.isDefault = false;
            }

        }

        recyclerView.setAdapter(adapter);



        Button BackToMain = (Button) findViewById(R.id.BackToOutEatzMainPageButton);
        BackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent1 = new Intent(SeeRestaurantList.this, OutEatzMain.class );
                p = adapter.positions;
                restaurants = p;
                rating = adapter.ratingPositions;

                asianRestaurants = adapter.asianPositions;
                asianDistances = adapter.asianDistances;
                asianRating = adapter.asianRating;
                americanRestaurants = adapter.americanPositions;
                americanDistances = adapter.americanDistances;
                americanRating = adapter.americanRating;
                polishRestaurant = adapter.polishPosition;
                polishDistance = adapter.polishDistance;
                polishRating = adapter.polishRating;
                fastFoodRestaurants = adapter.fastFoodPositions;
                fastFoodDistances = adapter.fastFoodDistances;
                fastFoodRating = adapter.fastFoodRating;
                spanishRestaurants = adapter.spanishPositions;
                spanishDistances = adapter.spanishDistances;
                spanishRating = adapter.spanishRating;
                notFavorite = adapter.notFavorite;

                startIntent1.putExtra("NOT_FAVORITE", notFavorite);
                startIntent1.putExtra("ASIAN_RESTAURANTS" , asianRestaurants);
                startIntent1.putExtra("ASIAN_DISTANCES", asianDistances);
                startIntent1.putExtra("ASIAN_RATING", asianRating);
                startIntent1.putExtra("AMERICAN_RESTAURANTS", americanRestaurants);
                startIntent1.putExtra("AMERICAN_DISTANCES", americanDistances);
                startIntent1.putExtra("AMERICAN_RATING", americanRating);
                startIntent1.putExtra("POLISH_RESTAURANT", polishRestaurant);
                startIntent1.putExtra("POLISH_DISTANCE", polishDistance);
                startIntent1.putExtra("POLISH_RATING", polishRating);
                startIntent1.putExtra("FAST_FOOD_RESTAURANTS", fastFoodRestaurants);
                startIntent1.putExtra("FAST_FOOD_DISTANCES", fastFoodDistances);
                startIntent1.putExtra("FAST_FOOD_RATING", fastFoodRating);
                startIntent1.putExtra("SPANISH_RESTAURANTS", spanishRestaurants);
                startIntent1.putExtra("SPANISH_DISTANCES", spanishDistances);
                startIntent1.putExtra("SPANISH_RATING", spanishRating);

                startIntent1.putExtra("RESTAURANTS", restaurants);
                startIntent1.putExtra("DISTANCE_VALUE", DISTANCE);
                startIntent1.putExtra("RATING_VALUE", RATING);
                startIntent1.putExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
                startIntent1.putExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
                startIntent1.putExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
                dist = adapter.distances;
                startIntent1.putExtra("DISTANCES", dist);
                startIntent1.putExtra("RATING_ARRAY", rating);
                startIntent1.putExtra("TYPE_OF_FOOD", typeOfFood);
                startIntent1.putExtra("IMAGE_PIC", image);
                startIntent1.putExtra("NUMBER_OF_CATEGORIES_SELECTED", count2);
                //setResult(RESULT_OK, startIntent1);
                //finish();

                startActivityForResult(startIntent1, 1);
            }
        });

        Button goToFilter = (Button) findViewById(R.id.FilterRestaurantsButton);
        goToFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startIntent1 = new Intent(SeeRestaurantList.this, FilterScreenActivity.class );
                p = adapter.positions;
                restaurants = p;
                rating = adapter.ratingPositions;

                asianRestaurants = adapter.asianPositions;
                asianDistances = adapter.asianDistances;
                asianRating = adapter.asianRating;
                americanRestaurants = adapter.americanPositions;
                americanDistances = adapter.americanDistances;
                americanRating = adapter.americanRating;
                polishRestaurant = adapter.polishPosition;
                polishDistance = adapter.polishDistance;
                polishRating = adapter.polishRating;
                fastFoodRestaurants = adapter.fastFoodPositions;
                fastFoodDistances = adapter.fastFoodDistances;
                fastFoodRating = adapter.fastFoodRating;
                spanishRestaurants = adapter.spanishPositions;
                spanishDistances = adapter.spanishDistances;
                spanishRating = adapter.spanishRating;

                startIntent1.putExtra("NOT_FAVORITE", notFavorite);
                startIntent1.putExtra("ASIAN_RESTAURANTS" , asianRestaurants);
                startIntent1.putExtra("ASIAN_DISTANCES", asianDistances);
                startIntent1.putExtra("ASIAN_RATING", asianRating);
                startIntent1.putExtra("AMERICAN_RESTAURANTS", americanRestaurants);
                startIntent1.putExtra("AMERICAN_DISTANCES", americanDistances);
                startIntent1.putExtra("AMERICAN_RATING", americanRating);
                startIntent1.putExtra("POLISH_RESTAURANT", polishRestaurant);
                startIntent1.putExtra("POLISH_DISTANCE", polishDistance);
                startIntent1.putExtra("POLISH_RATING", polishRating);
                startIntent1.putExtra("FAST_FOOD_RESTAURANTS", fastFoodRestaurants);
                startIntent1.putExtra("FAST_FOOD_DISTANCES", fastFoodDistances);
                startIntent1.putExtra("FAST_FOOD_RATING", fastFoodRating);
                startIntent1.putExtra("SPANISH_RESTAURANTS", spanishRestaurants);
                startIntent1.putExtra("SPANISH_DISTANCES", spanishDistances);
                startIntent1.putExtra("SPANISH_RATING", spanishRating);

                startIntent1.putExtra("RESTAURANTS", restaurants);
                startIntent1.putExtra("DISTANCE_VALUE", DISTANCE);
                startIntent1.putExtra("RATING_VALUE", RATING);
                startIntent1.putExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
                startIntent1.putExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
                startIntent1.putExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
                startIntent1.putExtra("TYPE_OF_FOOD", typeOfFood);
                startIntent1.putExtra("RATING_ARRAY", rating);
                dist = adapter.distances;
                startIntent1.putExtra("DISTANCES", dist);
                startIntent1.putExtra("IMAGE_PIC", image);
                startIntent1.putExtra("NUMBER_OF_CATEGORIES_SELECTED", count2);
                startActivityForResult(startIntent1, 1);

            }
        });

        Button favBtn = findViewById(R.id.favButton);
        favBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(SeeRestaurantList.this, FavoritesActivity.class);
                p = adapter.positions;
                restaurants = p;
                dist = adapter.distances;

                asianRestaurants = adapter.asianPositions;
                asianDistances = adapter.asianDistances;
                asianRating = adapter.asianRating;
                americanRestaurants = adapter.americanPositions;
                americanDistances = adapter.americanDistances;
                americanRating = adapter.americanRating;
                polishRestaurant = adapter.polishPosition;
                polishDistance = adapter.polishDistance;
                polishRating = adapter.polishRating;
                fastFoodRestaurants = adapter.fastFoodPositions;
                fastFoodDistances = adapter.fastFoodDistances;
                fastFoodRating = adapter.fastFoodRating;
                spanishRestaurants = adapter.spanishPositions;
                spanishDistances = adapter.spanishDistances;
                spanishRating = adapter.spanishRating;

                startIntent.putExtra("NOT_FAVORITE", notFavorite);
                startIntent.putExtra("ASIAN_RESTAURANTS" , asianRestaurants);
                startIntent.putExtra("ASIAN_DISTANCES", asianDistances);
                startIntent.putExtra("ASIAN_RATING", asianRating);
                startIntent.putExtra("AMERICAN_RESTAURANTS", americanRestaurants);
                startIntent.putExtra("AMERICAN_DISTANCES", americanDistances);
                startIntent.putExtra("AMERICAN_RATING", americanRating);
                startIntent.putExtra("POLISH_RESTAURANT", polishRestaurant);
                startIntent.putExtra("POLISH_DISTANCE", polishDistance);
                startIntent.putExtra("POLISH_RATING", polishRating);
                startIntent.putExtra("FAST_FOOD_RESTAURANTS", fastFoodRestaurants);
                startIntent.putExtra("FAST_FOOD_DISTANCES", fastFoodDistances);
                startIntent.putExtra("FAST_FOOD_RATING", fastFoodRating);
                startIntent.putExtra("SPANISH_RESTAURANTS", spanishRestaurants);
                startIntent.putExtra("SPANISH_DISTANCES", spanishDistances);
                startIntent.putExtra("SPANISH_RATING", spanishRating);

                startIntent.putExtra("RESTAURANTS", restaurants);
                startIntent.putExtra("DISTANCES", dist);
                startIntent.putExtra("TYPE_OF_FOOD", typeOfFood);
                startIntent.putExtra("RATING_ARRAY", rating);
                startIntent.putExtra("IMAGE_PIC", image);
                startIntent.putExtra("NUMBER_OF_CATEGORIES_SELECTED", count2);
                startActivityForResult(startIntent, 1);
                // startActivity(startIntent);

            }
        });




    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                DISTANCE = data.getFloatExtra("DISTANCE_VALUE", DISTANCE);
                RATING = data.getFloatExtra("RATING_VALUE", RATING);
                DOLLAR_SIGN1 = data.getBooleanExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
                DOLLAR_SIGN2 = data.getBooleanExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
                DOLLAR_SIGN3 = data.getBooleanExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
                restaurants = data.getBooleanArrayExtra("RESTAURANTS");
                dist = data.getFloatArrayExtra("DISTANCES");
                typeOfFood = data.getBooleanArrayExtra("TYPE_OF_FOOD");
                rating = data.getFloatArrayExtra("RATING_ARRAY");
                image = data.getIntExtra("IMAGE_PIC", image);
                count2 = data.getIntExtra("NUMBER_OF_CATEGORIES_SELECTED", count2);
                asianRestaurants = data.getBooleanArrayExtra("ASIAN_RESTAURANTS");
                asianDistances = data.getFloatArrayExtra("ASIAN_DISTANCES");
                asianRating = data.getFloatArrayExtra("ASIAN_RATING");
                americanRestaurants = data.getBooleanArrayExtra("AMERICAN_RESTAURANTS");
                americanDistances = data.getFloatArrayExtra("AMERICAN_DISTANCES");
                americanRating = data.getFloatArrayExtra("AMERICAN_RATING");
                polishRestaurant = data.getBooleanExtra("POLISH_RESTAURANT", polishRestaurant);
                polishDistance = data.getFloatExtra("POLISH_DISTANCE", polishDistance);
                polishRating = data.getFloatExtra("POLISH_RATING", polishRating);
                fastFoodRestaurants = data.getBooleanArrayExtra("FAST_FOOD_RESTAURANTS");
                fastFoodDistances = data.getFloatArrayExtra("FAST_FOOD_DISTANCES");
                fastFoodRating = data.getFloatArrayExtra("FAST_FOOD_RATING");
                spanishRestaurants = data.getBooleanArrayExtra("SPANISH_RESTAURANTS");
                spanishDistances = data.getFloatArrayExtra("SPANISH_DISTANCES");
                spanishRating = data.getFloatArrayExtra("SPANISH_RATING");
                notFavorite = data.getIntArrayExtra("NOT_FAVORITE");


            }
        }
        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                // TYPE_OF_FOOD = data.getStringExtra("TYPE_OF_FOOD");
            }

        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putFloat("DISTANCE_VALUE", DISTANCE);
        outState.putFloat("RATING_VALUE", RATING);
        outState.putBooleanArray("RESTAURANTS", restaurants);
        outState.putFloatArray("DISTANCES", dist);
        outState.putBooleanArray("TYPE_OF_FOOD", typeOfFood);
        outState.putFloatArray("RATING_ARRAY", rating);
        outState.putInt("IMAGE_PIC", image);
        outState.putInt("NUMBER_OF_CATEGORIES_SELECTED", count2);
        outState.putBooleanArray("ASIAN_RESTAURANTS", asianRestaurants);
        outState.putFloatArray("ASIAN_DISTANCES", asianDistances);
        outState.putFloatArray("ASIAN_RATING", asianRating);
        outState.putBooleanArray("AMERICAN_RESTAURANTS", americanRestaurants);
        outState.putFloatArray("AMERICAN_DISTANCES", americanDistances);
        outState.putFloatArray("AMERICAN_RATING", americanRating);
        outState.putBoolean("POLISH_RESTAURANT", polishRestaurant);
        outState.putFloat("POLISH_DISTANCE", polishDistance);
        outState.putFloat("POLISH_RATING", polishRating);
        outState.putBooleanArray("FAST_FOOD_RESTAURANTS", fastFoodRestaurants);
        outState.putFloatArray("FAST_FOOD_DISTANCES", fastFoodDistances);
        outState.putFloatArray("FAST_FOOD_RATING", fastFoodRating);
        outState.putBooleanArray("SPANISH_RESTAURANTS", spanishRestaurants);
        outState.putFloatArray("SPANISH_DISTANCES", spanishDistances);
        outState.putFloatArray("SPANISH_RATING", spanishRating);


        DISTANCE = outState.getFloat("DISTANCE_VALUE");
        RATING = outState.getFloat("RATING_VALUE");
        restaurants = outState.getBooleanArray("RESTAURANTS");
        dist = outState.getFloatArray("DISTANCES");
        typeOfFood = outState.getBooleanArray("TYPE_OF_FOOD");
        rating = outState.getFloatArray("RATING_ARRAY");
        image = outState.getInt("IMAGE_PIC");
        count2 = outState.getInt("NUMBER_OF_CATEGORIES_SELECTED");
        asianRestaurants = outState.getBooleanArray("ASIAN_RESTAURANTS");
        asianDistances = outState.getFloatArray("ASIAN_DISTANCES");
        asianRating = outState.getFloatArray("ASIAN_RATING");
        americanRestaurants = outState.getBooleanArray("AMERICAN_RESTAURANTS");
        americanDistances = outState.getFloatArray("AMERICAN_DISTANCES");
        americanRating = outState.getFloatArray("AMERICAN_RATING");
        polishRestaurant = outState.getBoolean("POLISH_RESTAURANT");
        polishDistance = outState.getFloat("POLISH_DISTANCE");
        polishRating = outState.getFloat("POLISH_RATING");
        fastFoodRestaurants = outState.getBooleanArray("FAST_FOOD_RESTAURANTS");
        fastFoodDistances = outState.getFloatArray("FAST_FOOD_DISTANCES");
        fastFoodRating = outState.getFloatArray("FAST_FOOD_RATING");
        spanishRestaurants = outState.getBooleanArray("SPANISH_RESTAURANTS");
        spanishDistances = outState.getFloatArray("SPANISH_DISTANCES");
        spanishRating = outState.getFloatArray("SPANISH_RATING");




    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);


        savedInstanceState.putFloat("DISTANCE_VALUE", DISTANCE);
        savedInstanceState.putFloat("RATING_VALUE", RATING);
        savedInstanceState.putBooleanArray("RESTAURANTS", restaurants);
        savedInstanceState.putFloatArray("DISTANCES", dist);
        savedInstanceState.putBooleanArray("TYPE_OF_FOOD", typeOfFood);
        savedInstanceState.putFloatArray("RATING_ARRAY", rating);
        savedInstanceState.putInt("IMAGE_PIC", image);
        savedInstanceState.putInt("NUMBER_OF_CATEGORIES_SELECTED", count2);
        savedInstanceState.putBooleanArray("ASIAN_RESTAURANTS", asianRestaurants);
        savedInstanceState.putFloatArray("ASIAN_DISTANCES", asianDistances);
        savedInstanceState.putFloatArray("ASIAN_RATING", asianRating);
        savedInstanceState.putBooleanArray("AMERICAN_RESTAURANTS", americanRestaurants);
        savedInstanceState.putFloatArray("AMERICAN_DISTANCES", americanDistances);
        savedInstanceState.putFloatArray("AMERICAN_RATING", americanRating);
        savedInstanceState.putBoolean("POLISH_RESTAURANT", polishRestaurant);
        savedInstanceState.putFloat("POLISH_DISTANCE", polishDistance);
        savedInstanceState.putFloat("POLISH_RATING", polishRating);
        savedInstanceState.putBooleanArray("FAST_FOOD_RESTAURANTS", fastFoodRestaurants);
        savedInstanceState.putFloatArray("FAST_FOOD_DISTANCES", fastFoodDistances);
        savedInstanceState.putFloatArray("FAST_FOOD_RATING", fastFoodRating);
        savedInstanceState.putBooleanArray("SPANISH_RESTAURANTS", spanishRestaurants);
        savedInstanceState.putFloatArray("SPANISH_DISTANCES", spanishDistances);
        savedInstanceState.putFloatArray("SPANISH_RATING", spanishRating);


        DISTANCE = savedInstanceState.getFloat("DISTANCE_VALUE");
        RATING = savedInstanceState.getFloat("RATING_VALUE");
        restaurants = savedInstanceState.getBooleanArray("RESTAURANTS");
        dist = savedInstanceState.getFloatArray("DISTANCES");
        typeOfFood = savedInstanceState.getBooleanArray("TYPE_OF_FOOD");
        rating = savedInstanceState.getFloatArray("RATING_ARRAY");
        image = savedInstanceState.getInt("IMAGE_PIC");
        count2 = savedInstanceState.getInt("NUMBER_OF_CATEGORIES_SELECTED");
        asianRestaurants = savedInstanceState.getBooleanArray("ASIAN_RESTAURANTS");
        asianDistances = savedInstanceState.getFloatArray("ASIAN_DISTANCES");
        asianRating = savedInstanceState.getFloatArray("ASIAN_RATING");
        americanRestaurants = savedInstanceState.getBooleanArray("AMERICAN_RESTAURANTS");
        americanDistances = savedInstanceState.getFloatArray("AMERICAN_DISTANCES");
        americanRating = savedInstanceState.getFloatArray("AMERICAN_RATING");
        polishRestaurant = savedInstanceState.getBoolean("POLISH_RESTAURANT");
        polishDistance = savedInstanceState.getFloat("POLISH_DISTANCE");
        polishRating = savedInstanceState.getFloat("POLISH_RATING");
        fastFoodRestaurants = savedInstanceState.getBooleanArray("FAST_FOOD_RESTAURANTS");
        fastFoodDistances = savedInstanceState.getFloatArray("FAST_FOOD_DISTANCES");
        fastFoodRating = savedInstanceState.getFloatArray("FAST_FOOD_RATING");
        spanishRestaurants = savedInstanceState.getBooleanArray("SPANISH_RESTAURANTS");
        spanishDistances = savedInstanceState.getFloatArray("SPANISH_DISTANCES");
        spanishRating = savedInstanceState.getFloatArray("SPANISH_RATING");

    }


}
