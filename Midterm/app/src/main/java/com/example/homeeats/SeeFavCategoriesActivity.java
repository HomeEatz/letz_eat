package com.example.homeeats;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SeeFavCategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.see_favorite_categories);

        Button BackToMain = (Button) findViewById(R.id.BackToMainButton);
        BackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), OutEatzMain.class );
                startActivity(startIntent);
            }
        });

        Button DoneButton = (Button) findViewById(R.id.DoneButton);
        DoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), OutEatzMain.class );
                startActivity(startIntent);
            }
        });
    }


    public void onCustomToggleClick(View view) {
        Toast.makeText(this, "CustomToggle", Toast.LENGTH_SHORT).show();
    }
}
