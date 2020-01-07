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



    float DISTANCE = (float)1.0;
    float RATING = (float) 3.0;
    boolean DOLLAR_SIGN1 = true;
    boolean DOLLAR_SIGN2;
    boolean DOLLAR_SIGN3;
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

        ImageView closePupUp = (ImageView) findViewById(R.id.CloseScreenImageView);
        closePupUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(FilterScreenActivity.this, SeeRestaurantList.class);
                startIntent.putExtra("DISTANCE_VALUE", DISTANCE);
                startIntent.putExtra("RATING_VALUE", RATING);
                startIntent.putExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
                startIntent.putExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
                startIntent.putExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
                setResult(RESULT_OK , startIntent);
                finish();

            }
        });

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
        dollarSign1.setChecked(DOLLAR_SIGN1);
        dollarSign1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                DOLLAR_SIGN1 = isChecked;
            }
        });


        final ToggleButton dollarSign2 = findViewById(R.id.toggleButton2);
        dollarSign2.setChecked(DOLLAR_SIGN2);
        dollarSign2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                DOLLAR_SIGN2 = isChecked;
            }
        });


        final ToggleButton dollarSign3 = findViewById(R.id.toggleButton3);
        dollarSign3.setChecked(DOLLAR_SIGN3);
        dollarSign3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                DOLLAR_SIGN3 = isChecked;
            }
        });



        Button resetButton = findViewById(R.id.resetFilterButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DISTANCE = (float)1.0;
                RATING = (float) 3.0;
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
            }
        }
    }




//public void onCustomToggleClick(View view){
    //   Toast.makeText(this, "CustomToggle",Toast.LENGTH_SHORT).show();

    // }
}
