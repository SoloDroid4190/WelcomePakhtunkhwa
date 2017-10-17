package com.solodroid4190.welcomepakhtunkhwa.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

import com.solodroid4190.welcomepakhtunkhwa.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        
        new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
          }
        }, 1500);
    }

}
