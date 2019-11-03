package com.example.jimcrowmuseumapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Timer waitTime = new Timer();
        waitTime.schedule(showMainActivity, 3000);
    }

    // End the current activity and launch the MainActivity
    private TimerTask showMainActivity = new TimerTask() {
        @Override
        public void run() {
            finish();
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
        }
    };
}
