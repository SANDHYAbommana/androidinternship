package com.example.examplelife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("SANDHYA","Second Activity Started");


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("SANDHYA"," Second Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SANDHYA","Second Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SANDHYA","Second Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("SANDHYA","Second Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SANDHYA","Second Activity Destroyed");
    }
}