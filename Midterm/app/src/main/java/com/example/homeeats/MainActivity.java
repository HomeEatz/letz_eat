package com.example.homeeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_eats_main_screen);

        Button OutEatsBtn = (Button) findViewById(R.id.OutEatzBtn);
        OutEatsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), OutEatzMain.class );
                startActivity(startIntent);
            }
        });

        Button GoToFridgeBtn = (Button) findViewById(R.id.button);
        GoToFridgeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), GoToFridgeActivity.class );
                startActivity(startIntent);
            }
        });
    }
}
