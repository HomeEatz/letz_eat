package com.example.homeeats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class OutEatzMain extends AppCompatActivity {


    ImageView randomView;
    Random rand;
    Integer[] categoriesImg = {
            R.drawable.china,
            R.drawable.france,
            R.drawable.germany,
            R.drawable.india,
            R.drawable.italy2,
            R.drawable.mexico,
//            R.drawable.chineseFood,
//            R.drawable.frenchFood,
//            R.drawable.germanFood,
//            R.drawable.italianFood,
//            R.drawable.japaneseFood,
//            R.drawable.spanishFood,
//            R.drawable.koreanFood,
//            R.drawable.russianFood

    };

    int picked = 0, lastPicked =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.out_eatz_main);

        Button BackToMain = (Button) findViewById(R.id.GoToMainPageButton);
        BackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class );
                startActivity(startIntent);
            }
        });

        Button FavCatBtn = (Button) findViewById(R.id.FavCategoriesButton);
        FavCatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), SeeFavCategoriesActivity.class );
                startActivity(startIntent);
            }
        });


        Button FavResBtn = (Button) findViewById(R.id.FavRestaurantsButton);
        FavResBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), SeeFavoriteRestaurants.class );
                startActivity(startIntent);
            }
        });

        Button PickBtn = (Button) findViewById(R.id.SeeFullRestaurantListButton);
        PickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), SeeRestaurantList.class );
                startActivity(startIntent);
            }
        });

        TextView finalChoiceTextView = (TextView) findViewById(R.id.PicktextView);
        finalChoiceTextView.setText("Food!");
        randomView = findViewById(R.id.RandomCategory);
        randomView.setImageResource(R.drawable.def);

        Button randomizeView = (Button) findViewById(R.id.RandomizeCategoriesButton);

        rand = new Random();

        randomizeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //remove duplicates
                do{
                    picked = rand.nextInt(categoriesImg.length);
                }
                while(picked == lastPicked);

                lastPicked = picked;
                // display random image
                randomView.setImageResource(categoriesImg[picked]);

                TextView finalChoiceTextView = (TextView) findViewById(R.id.PicktextView);
                switch(categoriesImg[picked]){
                    case R.drawable.china:
                        finalChoiceTextView.setText("Chinese Food!");
                        break;
                    case R.drawable.france:
                        finalChoiceTextView.setText("French Food!");
                        break;
                    case R.drawable.germany:
                        finalChoiceTextView.setText("German Food!");
                        break;
                    case R.drawable.india:
                        finalChoiceTextView.setText("Indian Food!");
                        break;
                    case R.drawable.italy2:
                        finalChoiceTextView.setText("Italian Food!");
                        break;
                    case R.drawable.mexico:
                        finalChoiceTextView.setText("Mexican Food!");
                        break;

                }





            }
        });

        Button resetCategoriesBtn = (Button) findViewById(R.id.ResetButton);
        resetCategoriesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView finalChoiceTextView = (TextView) findViewById(R.id.PicktextView);
                finalChoiceTextView.setText("Food!");

                randomView.setImageResource(R.drawable.def);

            }
        });



    }
}
