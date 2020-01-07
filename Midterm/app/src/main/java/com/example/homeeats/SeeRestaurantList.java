package com.example.homeeats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SeeRestaurantList extends AppCompatActivity {

    float DISTANCE = (float)1.0;
    float RATING = (float) 3.0;
    boolean DOLLAR_SIGN1 = true;
    boolean DOLLAR_SIGN2;
    boolean DOLLAR_SIGN3;
    //RecyclerView mRecyclerView = findViewById(R.id.recyclerView);

    // String TYPE_OF_FOOD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.see_restaurant_list);


//        MyAdapter mMyAdapter;
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mMyAdapter = new MyAdapter(this, getMyList());
//        mRecyclerView.setAdapter(mMyAdapter);

        Intent FilterScreenIntent = getIntent();
        DISTANCE = FilterScreenIntent.getFloatExtra("DISTANCE_VALUE", DISTANCE);
        RATING = FilterScreenIntent.getFloatExtra("RATING_VALUE", RATING);
        DOLLAR_SIGN1 = FilterScreenIntent.getBooleanExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
        DOLLAR_SIGN2 = FilterScreenIntent.getBooleanExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
        DOLLAR_SIGN3 = FilterScreenIntent.getBooleanExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
        // TYPE_OF_FOOD = FilterScreenIntent.getStringExtra("TYPE_OF_FOOD");



        Button BackToMain = (Button) findViewById(R.id.BackToOutEatzMainPageButton);
        BackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class );
                // startIntent.putExtra("TYPE_OF_FOOD", TYPE_OF_FOOD);
                //startActivityForResult(startIntent, 2);
//                setResult(RESULT_OK , startIntent);
//                finish();
                startActivity(startIntent);
            }
        });

        Button goToFilter = (Button) findViewById(R.id.FilterRestaurantsButton);
        goToFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startIntent1 = new Intent(SeeRestaurantList.this, FilterScreenActivity.class );

                startIntent1.putExtra("DISTANCE_VALUE", DISTANCE);
                startIntent1.putExtra("RATING_VALUE", RATING);
                startIntent1.putExtra("DOLLAR_SIGN1_VALUE", DOLLAR_SIGN1);
                startIntent1.putExtra("DOLLAR_SIGN2_VALUE", DOLLAR_SIGN2);
                startIntent1.putExtra("DOLLAR_SIGN3_VALUE", DOLLAR_SIGN3);
                startActivityForResult(startIntent1, 1);

            }
        });

        TextView typeOfFoodText = findViewById(R.id.RandomRestaurantTextView);
        //typeOfFoodText.setText(TYPE_OF_FOOD);

    }

//    private ArrayList<Model> getMyList(){
//
//        ArrayList<Model> models = new ArrayList<>();
//
//        Model m = new Model();
//
//        m.setTitle("Taco Bell");
//        m.setDescription("Fast Food");
//        m.setImage(R.drawable.taco_bell);
//        models.add(m);
//
//        m = new Model();
//
//        m.setTitle("Chili's Grill & Bar");
//        m.setDescription("Tex Mex");
//        m.setImage(R.drawable.chilis);
//        models.add(m);
//
//        m = new Model();
//
//        m.setTitle("McDonald's");
//        m.setDescription("Fast Food");
//        m.setImage(R.drawable.mcdonalds);
//        models.add(m);
//
//        m = new Model();
//
//        m.setTitle("Wendy's");
//        m.setDescription("Fast Food");
//        m.setImage(R.drawable.wendys);
//        models.add(m);
//
//        m = new Model();
//
//        m.setTitle("Little Caesars Pizza");
//        m.setDescription("Pizza");
//        m.setImage(R.drawable.littlecaesars);
//        models.add(m);
//
//        m = new Model();
//
//        m.setTitle("La Hacienda");
//        m.setDescription("Mexican");
//        m.setImage(R.drawable.lahacienda);
//        models.add(m);
//
//        return models;
//
//    }

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
        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                // TYPE_OF_FOOD = data.getStringExtra("TYPE_OF_FOOD");
            }

        }
    }


}
