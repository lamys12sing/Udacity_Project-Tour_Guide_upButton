package com.example.taichungtourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt_attraction, txt_hotel, txt_restaurant, txt_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        setListener();
    }

    /**
     * Find the view from xml.
     */
    private void findView(){
        txt_attraction = (TextView) findViewById(R.id.txt_attraction);
        txt_hotel = (TextView) findViewById(R.id.txt_hotel);
        txt_restaurant = (TextView) findViewById(R.id.txt_restaurant);
        txt_food = (TextView) findViewById(R.id.txt_food);
    }

    /**
     * Set on click listener for each category.
     */
    private void setListener(){
        txt_attraction.setOnClickListener(categoryListener);
        txt_hotel.setOnClickListener(categoryListener);
        txt_restaurant.setOnClickListener(categoryListener);
        txt_food.setOnClickListener(categoryListener);
    }

    /**
     * Go to other activity when the user click on the category.
     */
    private TextView.OnClickListener categoryListener = new TextView.OnClickListener(){
        @Override
        public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewPagerActivity.class);
                startActivity(intent);
        }
    };
}
