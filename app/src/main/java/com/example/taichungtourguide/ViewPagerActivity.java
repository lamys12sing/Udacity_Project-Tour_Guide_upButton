package com.example.taichungtourguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ViewPagerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        //Get suport action bar
        ActionBar ab = getSupportActionBar();

        //Enable the up button
        ab.setDisplayHomeAsUpEnabled(true);

        //Get ViewPager from xml
        ViewPager2 viewPager = (ViewPager2) findViewById(R.id.viewPager);

        //Get the customer adapter for viewPager
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);

        //Set the adapter for viewPager
        viewPager.setAdapter(adapter);

        //Get TabLayout from xml
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);

        //Connect the tabs with the viewPager
        new TabLayoutMediator(tabs, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if (position == 0){
                    tab.setText(R.string.category_attraction);
                }
                else if (position == 1){
                    tab.setText(R.string.category_hotel);
                }
                else if (position == 2){
                    tab.setText(R.string.category_restaurant);
                }
                else {
                    tab.setText(R.string.category_food);
                }
            }
        }).attach();
    }
}
