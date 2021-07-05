package com.example.sabtv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import maes.tech.intentanim.CustomIntent;

public class SplashScreen extends AppCompatActivity {

    ImageView splash_logo;
    ImageView splash_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash_screen);

        splash_logo = findViewById(R.id.splash_logo);
        splash_bottom = findViewById(R.id.splash_bottom);

        splash_logo.setTranslationY(-1400);
        splash_logo.setAlpha((float)0.1);
        splash_logo.animate().translationY(0).alpha((float)1.0).setDuration(2000).setStartDelay(0);

        splash_bottom.setTranslationX(-1400);
        splash_bottom.setAlpha((float)0.1);
        splash_bottom.animate().translationX(0).alpha((float)1.0).setDuration(2000).setStartDelay(0);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        splash_logo = findViewById(R.id.splash_logo);
        splash_bottom = findViewById(R.id.splash_bottom);

        splash_logo.setTranslationY(-1400);
        splash_logo.setAlpha((float)0.1);
        splash_logo.animate().translationY(0).alpha((float)1.0).setDuration(2000).setStartDelay(0);

        splash_bottom.setTranslationX(-1400);
        splash_bottom.setAlpha((float)0.1);
        splash_bottom.animate().translationX(0).alpha((float)1.0).setDuration(2000).setStartDelay(0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                outAnimation();
            }
        },4000);

    }

    public void outAnimation()
    {
        splash_logo = findViewById(R.id.splash_logo);
        splash_bottom = findViewById(R.id.splash_bottom);


        YoYo.with(Techniques.RubberBand).duration(700).playOn(splash_logo);
        YoYo.with(Techniques.RubberBand).duration(700).playOn(splash_bottom);

//        splash_logo.setTranslationY(0);
//        splash_logo.setAlpha((float)1.0);
//        splash_logo.animate().translationY(-1400).alpha((float)0.1).setDuration(800).setStartDelay(0);
//
//        splash_bottom.setTranslationY(0);
//        splash_bottom.setAlpha((float)1.0);
//        splash_bottom.animate().translationY(-1400).alpha((float)0.1).setDuration(800).setStartDelay(0);



       new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,Options.class);
                startActivity(intent);
                finish();
                CustomIntent.customType(SplashScreen.this,"bottom-to-up");
            }
        },500);
    }

}