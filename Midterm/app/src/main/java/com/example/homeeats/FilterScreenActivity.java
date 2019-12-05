package com.example.homeeats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class FilterScreenActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filter_screen);

        ImageView closePupUp = (ImageView) findViewById(R.id.CloseScreenImageView);
        closePupUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SeeRestaurantList.class);
                startActivity(startIntent);
            }
        });

        SeekBar simpleSeekBar =(SeekBar)findViewById(R.id.simpleSeekBar);
        // perform seek bar change listener event used for getting the progress value
        simpleSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            float progressChangedValue = 0;
            TextView distanceText = (TextView) findViewById(R.id.milestextView4);
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                progressChangedValue = (float)(progress/10.0); //((progress * (seekBar.getWidth() - 2 * seekBar.getThumbOffset())) / 0.5);
                distanceText.setText("" + progressChangedValue);
                //distanceText.setX(seekBar.getX() + progressChangedValue + seekBar.getThumbOffset() / 2);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        } );


    }

    //public void onCustomToggleClick(View view){
     //   Toast.makeText(this, "CustomToggle",Toast.LENGTH_SHORT).show();

   // }
}
