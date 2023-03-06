package com.example.restaurantdeveloper;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {


    CardView startercard;
    CardView maincard;

    TextView emailText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startercard = findViewById(R.id.card_view_starters);
        maincard = findViewById(R.id.card_view_main);
        emailText = findViewById(R.id.text_view_email_address);

        startercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class );
                startActivity(startersActivityIntent);
            }
        });
        maincard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(MainActivity.this, MainCourseActivity.class);
                startActivity(mainActivityIntent);
            }
        });

        emailText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);

                launchEmailAppIntent.setData(Uri.parse("mailto:marby_restaurant@developer.com"));
                startActivity(launchEmailAppIntent);
            }


        });
    }
}
