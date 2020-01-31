package com.example.homeeats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutEatzMain extends AppCompatActivity {

    int count = 0;
    int count2 = 0;
    ImageView randomView;
    Random rand;
    Integer[] categoriesImg = {
            R.drawable.asia_titled,
            R.drawable.american_food,
            R.drawable.polish_food,
            R.drawable.fastfood,
            R.drawable.spanish_food,

    };

    int picked = 0, lastPicked =0;

    boolean [] restaurants = new boolean [37];
    public float [] dist = new float [37];
    float DISTANCE;
    float RATING;
    boolean DOLLAR_SIGN1 = true;
    boolean DOLLAR_SIGN2;
    boolean DOLLAR_SIGN3;

    boolean [] typeOfFood = new boolean [5];
    Integer [] favCategoriesImg = new Integer[5];
    float [] rating = new float[37];
    int  image = 9;

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
    int favRestaurantCount = 0;
    int [] notFavorite = new int [37];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.out_eatz_main);

        Intent SeeRestaurantListIntent = getIntent();

        if(SeeRestaurantListIntent != null) {

            restaurants = SeeRestaurantListIntent.getBooleanArrayExtra("RESTAURANTS");
            dist = SeeRestaurantListIntent.getFloatArrayExtra("DISTANCES");

            //Intent SeeResListIntent = getIntent();
            typeOfFood = SeeRestaurantListIntent.getBooleanArrayExtra("TYPE_OF_FOOD");
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



        Button FavCatBtn = (Button) findViewById(R.id.FavCategoriesButton);
        FavCatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent1 = new Intent(OutEatzMain.this, SeeFavCategoriesActivity.class );
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
                startIntent1.putExtra("NOT_FAVORITE", notFavorite);

                startActivityForResult(startIntent1, 1);
            }
        });

        if (restaurants == null) {
            restaurants = new boolean[37];
            dist = new float[37];
            for (int i = 0; i < 37; i++) {
                restaurants[i] = false;

            }
        }


        for(int i = 0; i < restaurants.length; i++){
            if(restaurants[i] == false){
                favRestaurantCount++;
            }
        }


        Button FavResBtn = (Button) findViewById(R.id.FavRestaurantsButton);
        FavResBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(favRestaurantCount != 37){
                    Intent startIntent1 = new Intent(getApplicationContext(), SeeFavoriteRestaurants.class );
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
                    startIntent1.putExtra("NOT_FAVORITE", notFavorite);

                    startActivityForResult(startIntent1, 1);
                }
                else{
                    Toast.makeText(OutEatzMain.this, "No Restaurants in your Favorites", Toast.LENGTH_SHORT).show();
                }



            }
        });



        if(typeOfFood == null){
            typeOfFood = new boolean[5];
            for(int i =0; i < 5; i++){
                typeOfFood[i] = true;
            }
        }

        final ArrayList<Integer> saved = new ArrayList<>();
        count2 = 0;

        for(int i = 0; i <typeOfFood.length; i++){
            if(typeOfFood[i] == false){
                count2++;
            }
        }



        Button PickBtn = (Button) findViewById(R.id.SeeFullRestaurantListButton);


            PickBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(count2 != typeOfFood.length){
                        Intent startIntent1 = new Intent(OutEatzMain.this, SeeRestaurantList.class );
                        startIntent1.putExtra("NOT_FAVORITE", notFavorite);
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
                    }
                    else{
                        Toast.makeText(OutEatzMain.this, "No Categories Selected", Toast.LENGTH_SHORT).show();
                    }


                }
            });











        TextView finalChoiceTextView = (TextView) findViewById(R.id.PicktextView);
        final Button resList = findViewById(R.id.SeeFullRestaurantListButton);
        randomView = findViewById(R.id.RandomCategory);


        if(count2 == typeOfFood.length || image == 9){
            randomView.setImageResource(R.drawable.outeatzlogo);
            finalChoiceTextView.setText("Food!");
            resList.setText("See All Restaurants");
        }
        else{

            switch (image) {
                case 0:
                    randomView.setImageResource(R.drawable.asia_titled);

                    resList.setText("See Asian Restaurants");
                    finalChoiceTextView.setText("Asian Food!");
                    break;
                case 1:
                    randomView.setImageResource(R.drawable.american_food);
                    finalChoiceTextView.setText("American Food!");
                    resList.setText("See American Restaurants");
                    break;
                case 2:
                    randomView.setImageResource(R.drawable.polish_food);
                    finalChoiceTextView.setText("Polish Food!");
                    resList.setText("See Polish Restaurants");
                    break;
                case 3:
                    randomView.setImageResource(R.drawable.fastfood);
                    finalChoiceTextView.setText("Fast Food!");
                    resList.setText("See Fast Food Restaurants");
                    break;
                case 4:
                    randomView.setImageResource(R.drawable.spanish_food);
                    finalChoiceTextView.setText("Spanish/Latin Food!");
                    resList.setText("See Spanish/Latin Restaurants");
                    break;
                    default:
                        randomView.setImageResource(R.drawable.outeatzlogo);
                        finalChoiceTextView.setText("Food!");
                        resList.setText("See All Restaurants");
                        break;
            }


        }




















        Button randomizeView = (Button) findViewById(R.id.RandomizeCategoriesButton);

        rand = new Random();


//////////////////////////////////////////////////////////


        for(int i = 0; i < typeOfFood.length; i++){

            favCategoriesImg[i] = 0;

            if(typeOfFood[i] == true){

                switch (i){
                    case 0:
                        favCategoriesImg[i] = R.drawable.asia_titled;
                        saved.add(0);
                        break;
                    case 1:
                        favCategoriesImg[i] = R.drawable.american_food;
                        saved.add(1);
                        break;
                    case 2:
                        favCategoriesImg[i] = R.drawable.polish_food;
                        saved.add(2);
                        break;
                    case 3:
                        favCategoriesImg[i] = R.drawable.fastfood;
                        saved.add(3);
                        break;
                    case 4:
                        favCategoriesImg[i] = R.drawable.spanish_food;
                        saved.add(4);
                        break;

                }
                count++;

            }





        }







        ////////////////////////////////////////////////////////////////////////////////////////////




            randomizeView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (saved.size() != 0) {

                        if (count2 == typeOfFood.length) {
                            for (int i = 0; i < typeOfFood.length; i++) {
                                if (typeOfFood[i] == false) {
                                    typeOfFood[i] = true;
                                }
                            }
                        }
                        int r  = 0;
                        if(saved.size() != 1){
                            //remove duplicates
                            do {

                                r = rand.nextInt(saved.size());
                                picked = saved.get(r);





                            }
                            while (picked == lastPicked);
                        }
                        picked = saved.get(r);


                        lastPicked = picked;
                        // display random image


                        TextView finalChoiceTextView = (TextView) findViewById(R.id.PicktextView);

                        switch (picked) {
                            case 0:

                                randomView.setImageResource(favCategoriesImg[picked]);
                                finalChoiceTextView.setText("Asian Food!");
                                resList.setText("See Asian Restaurants");
                                image = 0;
                                break;
                            case 1:

                                randomView.setImageResource(favCategoriesImg[picked]);
                                finalChoiceTextView.setText("American Food!");
                                resList.setText("See American Restaurants");
                                image = 1;
                                break;
                            case 2:

                                randomView.setImageResource(favCategoriesImg[picked]);
                                finalChoiceTextView.setText("Polish Food!");
                                resList.setText("See Polish Restaurants");
                                image = 2;

                                break;
                            case 3:

                                    randomView.setImageResource(favCategoriesImg[picked]);
                                    finalChoiceTextView.setText("Fast Food!");
                                    resList.setText("See Fast Food Restaurants");
                                image = 3;
                                break;
                            case 4:

                                randomView.setImageResource(favCategoriesImg[picked]);
                                finalChoiceTextView.setText("Spanish/Latin Food!");
                                resList.setText("See Spanish/Latin Restaurants");
                                image = 4;
                                break;

                        }


//                    switch(favCategoriesImg[picked]){
//                        case R.drawable.china:
//                            finalChoiceTextView.setText("Chinese Food!");
//                            resList.setText("See Chinese Restaurants");
//                            break;
//                        case R.drawable.france:
//                            finalChoiceTextView.setText("French Food!");
//                            resList.setText("See French Restaurants");
//                            break;
//                        case R.drawable.germany:
//                            finalChoiceTextView.setText("German Food!");
//                            resList.setText("See German Restaurants");
//                            break;
//                        case R.drawable.india:
//                            finalChoiceTextView.setText("Indian Food!");
//                            resList.setText("See Indian Restaurants");
//                            break;
//                        case R.drawable.italy:
//                            finalChoiceTextView.setText("Italian Food!");
//                            resList.setText("See Italian Restaurants");
//                            break;
//                        case R.drawable.mexico:
//                            finalChoiceTextView.setText("Mexican Food!");
//                            resList.setText("See Mexican Restaurants");
//                            break;
//                        case R.drawable.spain:
//                            finalChoiceTextView.setText("Spanish Food!");
//                            resList.setText("See Mexican Restaurants");
//                            break;
//                        case R.drawable.united_states:
//                            finalChoiceTextView.setText("American Food!");
//                            resList.setText("See Mexican Restaurants");
//                            break;
//                        case R.drawable.japan:
//                            finalChoiceTextView.setText("Japanese Food!");
//                            resList.setText("See Mexican Restaurants");
//                            break;
//
//
//
//                    }

                        //}


                    }
                    else{
                        Toast.makeText(OutEatzMain.this, "No Categories Selected", Toast.LENGTH_SHORT).show();
                    }

                }







            });







        Button resetCategoriesBtn = (Button) findViewById(R.id.ResetButton);
        resetCategoriesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView finalChoiceTextView = (TextView) findViewById(R.id.PicktextView);
                randomView.setImageResource(R.drawable.outeatzlogo);
                finalChoiceTextView.setText("Food!");
                resList.setText("See All Restaurants");
                for(int i =0; i < typeOfFood.length; i++){
                    typeOfFood[i] = true;
                    saved.add(i);
                }

                favCategoriesImg = categoriesImg;
                image = 9;

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


