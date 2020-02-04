package com.example.homeeats;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class FilterScreenActivity extends AppCompatActivity {



    float DISTANCE;
    float RATING;
    boolean DOLLAR_SIGN1 = true;
    boolean DOLLAR_SIGN2;
    boolean DOLLAR_SIGN3;
    public float [] dist = new float [37];
    boolean [] restaurants = new boolean [37];
    boolean [] typeOfFood = new boolean [5];
    int count = 0;
    float [] rating = new float[37];
    int image;


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
        setContentView(R.layout.filter_screen);
        Intent SeeRestaurantListIntent = getIntent();
        DISTANCE = SeeRestaurantListIntent.getFloatExtra("DISTANCE_VALUE", DISTANCE);
        RATING = SeeRestaurantListIntent.getFloatExtra("RATING_VALUE", RATING);
        DOLLAR_SIGN1 = SeeRestaurantListIntent.getBooleanExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
        DOLLAR_SIGN2 = SeeRestaurantListIntent.getBooleanExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
        DOLLAR_SIGN3 = SeeRestaurantListIntent.getBooleanExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
        dist = SeeRestaurantListIntent.getFloatArrayExtra("DISTANCES");
        restaurants = SeeRestaurantListIntent.getBooleanArrayExtra("RESTAURANTS");
        typeOfFood = SeeRestaurantListIntent.getBooleanArrayExtra("TYPE_OF_FOOD");
        rating = SeeRestaurantListIntent.getFloatArrayExtra("RATING_ARRAY");
        image = SeeRestaurantListIntent.getIntExtra("IMAGE_PIC", image);
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

        if(dist == null){
            for (int i =0; i <7; i++){
                dist[i] = 0;
            }
        }
        if(rating == null){
            rating = new float[7];
            for(int i = 0; i < 7; i++){
                rating[i] = (float) 0.0;
            }
        }

        ImageView closePupUp = (ImageView) findViewById(R.id.CloseScreenImageView);
        closePupUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(DISTANCE != 0.0 && RATING != 0.0){
                    Intent startIntent = new Intent(FilterScreenActivity.this, SeeRestaurantList.class);
                    startIntent.putExtra("DISTANCE_VALUE", DISTANCE);
                    startIntent.putExtra("RATING_VALUE", RATING);
                    startIntent.putExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
                    startIntent.putExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
                    startIntent.putExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
                    startIntent.putExtra("DISTANCES", dist);
                    startIntent.putExtra("RESTAURANTS", restaurants);
                    startIntent.putExtra("TYPE_OF_FOOD", typeOfFood);
                    startIntent.putExtra("RATING_ARRAY", rating);
                    startIntent.putExtra("IMAGE_PIC", image);

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

                    //setResult(RESULT_OK , startIntent);
                    startActivityForResult(startIntent, 1);
                    //finish();

                }
                else{
                    Toast.makeText(FilterScreenActivity.this, "No Restaurants available", Toast.LENGTH_SHORT).show();
                }

            }
        });
        if(DISTANCE == 0.0){
            DISTANCE = (float) 5.0;
            RATING = (float) 5.0;

        }

        TextView distanceText = (TextView) findViewById(R.id.milestextView4);
        distanceText.setText(("" + DISTANCE));
        final SeekBar simpleSeekBar =(SeekBar)findViewById(R.id.simpleSeekBar);
        simpleSeekBar.setProgress((int)DISTANCE*10);
        // perform seek bar change listener event used for getting the progress value
        simpleSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            float progressChangedValue = DISTANCE;
            TextView distanceText = (TextView) findViewById(R.id.milestextView4);
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                progressChangedValue = (float)(progress/10.0); //((progress * (seekBar.getWidth() - 2 * seekBar.getThumbOffset())) / 0.5);
                distanceText.setText("" + progressChangedValue);
                //distanceText.setX(seekBar.getX() + progressChangedValue + seekBar.getThumbOffset() / 2);
                DISTANCE = progressChangedValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        } );

        final  RatingBar StarsRatingBar = findViewById(R.id.StarsRatingBar);
        StarsRatingBar.setRating(RATING);
        StarsRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                RATING = rating;

            }
        });

        final ToggleButton dollarSign1 = findViewById(R.id.toggleButton1);
        final ToggleButton dollarSign2 = findViewById(R.id.toggleButton2);
        final ToggleButton dollarSign3 = findViewById(R.id.toggleButton3);
        dollarSign1.setChecked(DOLLAR_SIGN1);
        dollarSign1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    dollarSign1.setChecked(true);
                    dollarSign2.setChecked(false);
                    dollarSign3.setChecked(false);
                    count++;
                }
                else if(isChecked == false){
                    count =0;

                    dollarSign1.setChecked(true);
                    dollarSign2.setChecked(false);
                    dollarSign3.setChecked(false);
                }
                DOLLAR_SIGN1 = isChecked;
            }
        });



        dollarSign2.setChecked(DOLLAR_SIGN2);
        dollarSign2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true) {

                    dollarSign1.setChecked(true);
                    dollarSign2.setChecked(true);
                    dollarSign3.setChecked(false);

                }
                 if(isChecked == false){
                    dollarSign1.setChecked(true);
                    dollarSign2.setChecked(false);
                    dollarSign3.setChecked(false);
                }
//                if(DOLLAR_SIGN3 == true && DOLLAR_SIGN1 == true && DOLLAR_SIGN2 == true){
//                    DOLLAR_SIGN2 = isChecked;
//                    if(isChecked == true){
//                        dollarSign1.setChecked(true);
//                        dollarSign2.setChecked(true);
//                        dollarSign3.setChecked(false);
//                    }
//
//                }
                DOLLAR_SIGN2 = isChecked;

            }
        });



        dollarSign3.setChecked(DOLLAR_SIGN3);
        dollarSign3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true) {
                    dollarSign1.setChecked(true);
                    dollarSign2.setChecked(true);
                    dollarSign3.setChecked(true);
                }
                else if(isChecked == false){

                    dollarSign1.setChecked(true);
                    dollarSign2.setChecked(false);
                    dollarSign3.setChecked(false);
                }
                DOLLAR_SIGN3 = isChecked;
            }
        });



        Button resetButton = findViewById(R.id.resetFilterButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DISTANCE = (float)5.0;
                RATING = (float) 5.0;
                DOLLAR_SIGN1 = true;
                DOLLAR_SIGN2 = false;
                DOLLAR_SIGN3 = false;
                simpleSeekBar.setProgress((int)DISTANCE*10);
                StarsRatingBar.setRating(RATING);
                dollarSign1.setChecked(DOLLAR_SIGN1);
                dollarSign2.setChecked(DOLLAR_SIGN2);
                dollarSign3.setChecked(DOLLAR_SIGN3);

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
                dist = data.getFloatArrayExtra("DISTANCES");
                restaurants = data.getBooleanArrayExtra("RESTAURANTS");
                typeOfFood = data.getBooleanArrayExtra("TYPE_OF_FOOD");
                rating = data.getFloatArrayExtra("RATING_ARRAY");
                image = data.getIntExtra("IMAGE_PIC", image);
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




//public void onCustomToggleClick(View view){
    //   Toast.makeText(this, "CustomToggle",Toast.LENGTH_SHORT).show();

    // }
}
