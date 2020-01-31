package com.example.homeeats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SeeFavoriteRestaurants extends AppCompatActivity {




    boolean [] restaurants = new boolean [37];
    RecyclerView recyclerView;
    FavoritesAdapter adapter;
    ArrayList<String> items;
    public float [] dist = new float [37];
    float DISTANCE;
    float RATING ;
    boolean DOLLAR_SIGN1 = true;
    boolean DOLLAR_SIGN2;
    boolean DOLLAR_SIGN3;

    boolean [] typeOfFood = new boolean [5];
    Integer [] favCategoriesImg = new Integer[9];
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
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.favorites);
        Intent MainScreenIntent = getIntent();
        //restaurants = MainScreenIntent.getIntArrayExtra("RESTAURANTS");
        restaurants = MainScreenIntent.getBooleanArrayExtra("RESTAURANTS");
        dist = MainScreenIntent.getFloatArrayExtra("DISTANCES");

        //Intent SeeResListIntent = getIntent();
        typeOfFood = MainScreenIntent.getBooleanArrayExtra("TYPE_OF_FOOD");
        DISTANCE = MainScreenIntent.getFloatExtra("DISTANCE_VALUE", DISTANCE);
        RATING = MainScreenIntent.getFloatExtra("RATING_VALUE", RATING);
        DOLLAR_SIGN1 = MainScreenIntent.getBooleanExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
        DOLLAR_SIGN2 = MainScreenIntent.getBooleanExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
        DOLLAR_SIGN3 = MainScreenIntent.getBooleanExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
        rating = MainScreenIntent.getFloatArrayExtra("RATING_ARRAY");
        image = MainScreenIntent.getIntExtra("IMAGE_PIC", image);
        count2 = MainScreenIntent.getIntExtra("NUMBER_OF_CATEGORIES_SELECTED", count2);
        asianRestaurants = MainScreenIntent.getBooleanArrayExtra("ASIAN_RESTAURANTS");
        asianDistances = MainScreenIntent.getFloatArrayExtra("ASIAN_DISTANCES");
        asianRating = MainScreenIntent.getFloatArrayExtra("ASIAN_RATING");
        americanRestaurants = MainScreenIntent.getBooleanArrayExtra("AMERICAN_RESTAURANTS");
        americanDistances = MainScreenIntent.getFloatArrayExtra("AMERICAN_DISTANCES");
        americanRating = MainScreenIntent.getFloatArrayExtra("AMERICAN_RATING");
        polishRestaurant = MainScreenIntent.getBooleanExtra("POLISH_RESTAURANT", polishRestaurant);
        polishDistance = MainScreenIntent.getFloatExtra("POLISH_DISTANCE", polishDistance);
        polishRating = MainScreenIntent.getFloatExtra("POLISH_RATING", polishRating);
        fastFoodRestaurants = MainScreenIntent.getBooleanArrayExtra("FAST_FOOD_RESTAURANTS");
        fastFoodDistances = MainScreenIntent.getFloatArrayExtra("FAST_FOOD_DISTANCES");
        fastFoodRating = MainScreenIntent.getFloatArrayExtra("FAST_FOOD_RATING");
        spanishRestaurants = MainScreenIntent.getBooleanArrayExtra("SPANISH_RESTAURANTS");
        spanishDistances = MainScreenIntent.getFloatArrayExtra("SPANISH_DISTANCES");
        spanishRating = MainScreenIntent.getFloatArrayExtra("SPANISH_RATING");
        notFavorite = MainScreenIntent.getIntArrayExtra("NOT_FAVORITE");

        int count = 0;

        if(restaurants == null ){
            restaurants = new boolean [37];

            for(int i = 0; i < 37; i++){
                restaurants[i] = false;


            }
        }

        items = new ArrayList<>();
        items.clear();

        if(image != 9){

            if(asianRestaurants[0] == true){
                items.add("China Garden Restaurant");
            }
            if(asianRestaurants[1] == true){
                items.add("Kiko Japanese Cuisine");
            }
            if(asianRestaurants[2] == true){
                items.add("Moghul Indian Cuisine");
            }
            if(asianRestaurants[3] == true){
                items.add("Thai Villa Restaurant");
            }
            if(asianRestaurants[4] == true){
                items.add("Arigato Sushi Restaurant");
            }
            if(asianRestaurants[5] == true){
                items.add("Kai Asian Street Restaurant");
            }
            if(asianRestaurants[6] == true){
                items.add("Mei Garden");
            }
            if(asianRestaurants[7] == true){
                items.add("He Sheng");
            }
            if(asianRestaurants[8] == true){
                items.add("Viet-Nomz");
            }

            if(americanRestaurants[0] == true){
                items.add("Perkins Restaurant & Bakery");
            }
            if(americanRestaurants[1] == true){
                items.add("Costco Food Court");
            }
            if(americanRestaurants[2] == true){
                items.add("Miller's Ale House");
            }
            if(americanRestaurants[3] == true){
                items.add("Arooga's");
            }
            if(americanRestaurants[4] == true){
                items.add("Chili's Grill & Bar");
            }
            if(americanRestaurants[5] == true){
                items.add("Firehouse Subs");
            }
            if(americanRestaurants[6] == true){
                items.add("Bolay");
            }
            if(americanRestaurants[7] == true){
                items.add("Boston's Fish House");
            }
            if(americanRestaurants[8] == true){
                items.add("Toasted");
            }
            if(americanRestaurants[9] == true){
                items.add("Tibby's");
            }
            if(americanRestaurants[10] == true){
                items.add("Mellow Mushroom");
            }
            if(americanRestaurants[11] == true){
                items.add("Zaxby's");
            }

            if(polishRestaurant == true){
                items.add("Anna's Polish Restaurant");
            }

            if(fastFoodRestaurants[0] == true){
                items.add("Steak n' Shake");
            }
            if(fastFoodRestaurants[1] == true){
                items.add("Chick-fil-A");
            }
            if(fastFoodRestaurants[2] == true){
                items.add("McDonald's");
            }
            if(fastFoodRestaurants[3] == true){
                items.add("Wendy's");
            }
            if(fastFoodRestaurants[4] == true){
                items.add("Little Caesars");
            }
            if(fastFoodRestaurants[5] == true){
                items.add("Dunkin Donuts");
            }
            if(fastFoodRestaurants[6] == true){
                items.add("Burger King");
            }
            if(fastFoodRestaurants[7] == true){
                items.add("KFC");
            }

            if(spanishRestaurants[0] == true){
                items.add("Garita Del Sabor");
            }
            if(spanishRestaurants[1] == true){
                items.add("Rincon Latino Cafe");
            }
            if(spanishRestaurants[2] == true){
                items.add("La Granja");
            }
            if(spanishRestaurants[3] == true){
                items.add("Habaneros Mexican Restaurant");
            }
            if(spanishRestaurants[4] == true){
                items.add("La Hacienda");
            }
            if(spanishRestaurants[5] == true){
                items.add("Mi Raza Restaurant");
            }
            if(spanishRestaurants[6] == true){
                items.add("Jalisco");
            }

        }
        else if(count2 < 5){

            if(restaurants[0] == true){
                items.add("Steak n' Shake");
            }
            if(restaurants[1] == true){
                items.add("Chick-fil-A");
            }
            if(restaurants[2] == true){
                items.add("Perkins Restaurant & Bakery");
            }
            if(restaurants[3] == true){
                items.add("Garita Del Sabor");
            }
            if(restaurants[4] == true){
                items.add("Rincon Latino Cafe");
            }
            if(restaurants[5] == true){
                items.add("Costco Food Court");
            }
            if(restaurants[6] == true){
                items.add("Miller's Ale House");
            }
            if(restaurants[7] == true){
                items.add("China Garden Restaurant");
            }
            if(restaurants[8] == true){
                items.add("Arooga's");
            }
            if(restaurants[9] == true){
                items.add("Chili's Grill & Bar");
            }
            if(restaurants[10] == true){
                items.add("Firehouse Subs");
            }
            if(restaurants[11] == true){
                items.add("Kiko Japanese Cuisine");
            }
            if(restaurants[12] == true){
                items.add("Bolay");
            }
            if(restaurants[13] == true){
                items.add("Boston's Fish House");
            }
            if(restaurants[14] == true){
                items.add("Anna's Polish Restaurant");
            }
            if(restaurants[15] == true){
                items.add("Moghul Indian Cuisine");
            }
            if(restaurants[16] == true){
                items.add("La Granja");
            }
            if(restaurants[17] == true){
                items.add("Habaneros Mexican Restaurant");
            }
            if(restaurants[18] == true){
                items.add("La Hacienda");
            }
            if(restaurants[19] == true){
                items.add("Thai Villa Restaurant");
            }
            if(restaurants[20] == true){
                items.add("Mi Raza Restaurant");
            }
            if(restaurants[21] == true){
                items.add("Arigato Sushi Restaurant");
            }
            if(restaurants[22] == true){
                items.add("Kai Asian Street Restaurant");
            }
            if(restaurants[23] == true){
                items.add("Mei Garden");
            }
            if(restaurants[24] == true){
                items.add("Jalisco");
            }
            if(restaurants[25] == true){
                items.add("He Sheng");
            }
            if(restaurants[26] == true){
                items.add("Toasted");
            }
            if(restaurants[27] == true){
                items.add("Tibby's");
            }
            if(restaurants[28] == true){
                items.add("Mellow Mushroom");
            }
            if(restaurants[29] == true){
                items.add("Viet-Nomz");
            }
            if(restaurants[30] == true){
                items.add("Zaxby's");
            }
            if(restaurants[31] == true){
                items.add("McDonald's");
            }
            if(restaurants[32] == true){
                items.add("Wendy's");
            }
            if(restaurants[33] == true){
                items.add("Little Caesars");
            }
            if(restaurants[34] == true){
                items.add("Dunkin Donuts");
            }
            if(restaurants[35] == true){
                items.add("Burger King");
            }
            if(restaurants[36] == true){
                items.add("KFC");
            }

        }

        recyclerView = findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new FavoritesAdapter(this, items);
        recyclerView.setAdapter(adapter);

        Button backBtn = findViewById(R.id.backButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent1 = new Intent(SeeFavoriteRestaurants.this, OutEatzMain.class );
                startIntent1.putExtra("NOT_FAVORITE", notFavorite);
                startIntent1.putExtra("RESTAURANTS", restaurants);
                startIntent1.putExtra("DISTANCES", dist);
                startIntent1.putExtra("RESTAURANTS", restaurants);
                startIntent1.putExtra("DISTANCE_VALUE", DISTANCE);
                startIntent1.putExtra("RATING_VALUE", RATING);
                startIntent1.putExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
                startIntent1.putExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
                startIntent1.putExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
                startIntent1.putExtra("DISTANCES", dist);
                startIntent1.putExtra("TYPE_OF_FOOD", typeOfFood);
                startIntent1.putExtra("RATING_ARRAY", rating);
                startIntent1.putExtra("IMAGE_PIC", image);
                startIntent1.putExtra("NUMBER_OF_CATEGORIES_SELECTED", count2);
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
                startActivityForResult(startIntent1, 1);
//                setResult(RESULT_OK , startIntent1);
//                finish();



            }
        });









    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                restaurants = data.getBooleanArrayExtra("RESTAURANTS");
                dist = data.getFloatArrayExtra("DISTANCES");
                DISTANCE = data.getFloatExtra("DISTANCE_VALUE", DISTANCE);
                RATING = data.getFloatExtra("RATING_VALUE", RATING);
                DOLLAR_SIGN1 = data.getBooleanExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
                DOLLAR_SIGN2 = data.getBooleanExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
                DOLLAR_SIGN3 = data.getBooleanExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
                restaurants = data.getBooleanArrayExtra("RESTAURANTS");
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
