package com.example.homeeats;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SeeFavCategoriesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FavoriteCategoriesAdapter adapter;
    ArrayList<String> items;
    boolean [] typeOfFood = new boolean [5];
    public boolean [] p = new boolean [5];
    public float [] dist = new float [37];
    boolean [] restaurants = new boolean [37];
    float [] rating = new float[37];

    float DISTANCE;
    float RATING;
    boolean DOLLAR_SIGN1 = true;
    boolean DOLLAR_SIGN2;
    boolean DOLLAR_SIGN3;
    int count = 0;
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
        setContentView(R.layout.favorite_categories);


        Intent MainScreenIntent = getIntent();
        typeOfFood = MainScreenIntent.getBooleanArrayExtra("TYPE_OF_FOOD");
        dist = MainScreenIntent.getFloatArrayExtra("DISTANCES");
        DISTANCE = MainScreenIntent.getFloatExtra("DISTANCE_VALUE", DISTANCE);
        RATING = MainScreenIntent.getFloatExtra("RATING_VALUE", RATING);
        DOLLAR_SIGN1 = MainScreenIntent.getBooleanExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
        DOLLAR_SIGN2 = MainScreenIntent.getBooleanExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
        DOLLAR_SIGN3 = MainScreenIntent.getBooleanExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
        restaurants = MainScreenIntent.getBooleanArrayExtra("RESTAURANTS");
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

        if(typeOfFood == null ){
            typeOfFood = new boolean [5];
            for(int i = 0; i < 5; i++){
                typeOfFood[i] = true;


            }
        }

        items = new ArrayList<>();
        items.clear();

        items.add("Asian");
        items.add("American");
        items.add("Fast Food");
        items.add("Spanish/Latin");


        recyclerView = findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new FavoriteCategoriesAdapter(this, items);
        recyclerView.setAdapter(adapter);

        if(typeOfFood!= null){
            adapter.positions[0] = typeOfFood[0];
            adapter.positions[1] = typeOfFood[1];
            adapter.positions[2] = typeOfFood[2];
            adapter.positions[3] = typeOfFood[3];
            adapter.positions[4] = typeOfFood[4];

        }




        count = count2;



        Button BackToMain = (Button) findViewById(R.id.backButton);
        BackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), OutEatzMain.class );



                p = adapter.positions;
                typeOfFood = p;
                count2 = 0;
                for(int i = 0; i < typeOfFood.length; i++ ){

                    if(typeOfFood[i] == false){
                        count2++;
                    }
                }

                if(count != count2){
                    image = 9;
                }

                if(count2 == typeOfFood.length){
                    image = 9;
                }




                startIntent.putExtra("TYPE_OF_FOOD", typeOfFood);
                startIntent.putExtra("RESTAURANTS", restaurants);
                startIntent.putExtra("DISTANCES", dist);
                startIntent.putExtra("RESTAURANTS", restaurants);
                startIntent.putExtra("DISTANCE_VALUE", DISTANCE);
                startIntent.putExtra("RATING_VALUE", RATING);
                startIntent.putExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
                startIntent.putExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
                startIntent.putExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
                startIntent.putExtra("RATING_ARRAY", rating);
                startIntent.putExtra("IMAGE_PIC", image);
                startIntent.putExtra("NUMBER_OF_CATEGORIES_SELECTED", count2);
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
                startIntent.putExtra("NOT_FAVORITE", notFavorite);
                //setResult(RESULT_OK, startIntent);
                //finish();

                startActivityForResult(startIntent, 1);
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
                typeOfFood = data.getBooleanArrayExtra("TYPE_OF_FOOD");
                dist = data.getFloatArrayExtra("DISTANCES");
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
