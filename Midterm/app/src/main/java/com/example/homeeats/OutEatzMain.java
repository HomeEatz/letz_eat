package com.example.homeeats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

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


    };

    int picked, lastPicked;
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


        randomView = findViewById(R.id.RandomCategory);

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
                // diplay random image
                randomView.setImageResource(categoriesImg[rand.nextInt(categoriesImg.length)]);
            }
        });




    }
}
