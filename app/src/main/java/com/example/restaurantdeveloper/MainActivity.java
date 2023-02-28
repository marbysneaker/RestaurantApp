package com.example.restaurantdeveloper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {


    CardView startercard;
    CardView maincard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startercard = findViewById(R.id.card_view_starters);
        maincard = findViewById(R.id.card_view_main);
    }
}