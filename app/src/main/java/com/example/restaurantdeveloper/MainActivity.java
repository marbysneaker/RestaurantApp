package com.example.restaurantdeveloper;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

        startercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class );
                startActivity(startersActivityIntent);
            }
        });
    }
}