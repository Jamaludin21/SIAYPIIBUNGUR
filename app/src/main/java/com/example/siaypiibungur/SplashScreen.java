package com.example.siaypiibungur;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        int waktu_loading = 4000;
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this,Login.class);
            startActivities(new Intent[]{intent});
            finish();
        }, waktu_loading);
    }
}
