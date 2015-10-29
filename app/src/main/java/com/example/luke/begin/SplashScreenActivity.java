package com.example.luke.begin;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

public class SplashScreenActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        /* Creating handler for splash screen timeout */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an empty Intent */
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                /* Starting new activity */
                startActivity(intent);
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
