package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.hsalf.smilerating.SmileRating;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SmileRating smileRating = (SmileRating)findViewById(R.id.smile_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {
                switch (smiley){
                    case SmileRating.BAD:
                        //Log.i(TAG,"BAd");
                        Toast.makeText(MainActivity.this, "Bad", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GOOD:
                        // Log.i(TAG,"Good");
                        Toast.makeText(MainActivity.this, "Good", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GREAT:
                        //Log.i(TAG,"Great");
                        Toast.makeText(MainActivity.this, "Great", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.OKAY:
                        //Log.i(TAG,"Okay");
                        Toast.makeText(MainActivity.this, "Okay", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.TERRIBLE:
                        //Log.i(TAG,"Terrible");
                        Toast.makeText(MainActivity.this, "Terrible", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener() {
            @Override
            public void onRatingSelected(int level, boolean reselected) {
                Toast.makeText(MainActivity.this, "Selected Rating", Toast.LENGTH_SHORT).show();

            }
        });

    }
}