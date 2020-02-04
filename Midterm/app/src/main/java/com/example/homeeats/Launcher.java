package com.example.homeeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Launcher extends AppCompatActivity {

    int _splashTime = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                finish();
                Intent i3 = new Intent(Launcher.this, OutEatzMain.class);
                startActivity(i3);
            }
        }, _splashTime);
    }
}
