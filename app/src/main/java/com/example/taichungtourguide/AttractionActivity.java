package com.example.taichungtourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AttractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, new AttractionFragment())
                .commit();
    }
}
