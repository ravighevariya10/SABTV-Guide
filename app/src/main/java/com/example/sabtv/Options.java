package com.example.sabtv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAd;

import java.io.Serializable;

import maes.tech.intentanim.CustomIntent;

public class Options extends AppCompatActivity {

    androidx.cardview.widget.CardView top_card,options;
    ImageView logo,start,share,rate,more;
    TextView title;
    LinearLayout card_layout,start_lo,share_lo,rate_lo,more_lo;

    AdView mAdView;
    AdRequest adRequest;
    AdLoader adLoader;
    NativeAd nativeAd;

    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);

        top_card = findViewById(R.id.top_card);
        logo = findViewById(R.id.logo);
        title = findViewById(R.id.logo_title);

        options = findViewById(R.id.options);
        card_layout = findViewById(R.id.card_layout);
        start_lo = findViewById(R.id.start_lo);
        share_lo = findViewById(R.id.share_lo);
        rate_lo = findViewById(R.id.rate_lo);
        more_lo = findViewById(R.id.more_lo);
        start = findViewById(R.id.start_btn);
        share = findViewById(R.id.share);
        rate = findViewById(R.id.rate);
        more = findViewById(R.id.more);

        animationRTL();
        animationBTU();

        AdLoader adLoader = new AdLoader.Builder(this, "ca-app-pub-3940256099942544/2247696110")
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {
                        TemplateView template = findViewById(R.id.my_template);
                        template.setNativeAd(nativeAd);
                    }
                })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());

        mAdView = findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(start);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        animationRTL2();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                InterstitialAd.load(Options.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                                    @Override
                                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                        mInterstitialAd = interstitialAd;
                                        mInterstitialAd.show(Options.this);

                                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                            @Override
                                            public void onAdDismissedFullScreenContent() {

                                                Intent intent = new Intent(Options.this, Homepage.class);
                                                startActivity(intent);

                                                CustomIntent.customType(Options.this, "left-to-right");

                                            }
                                        });
                                    }
                                });
                            }
                        },500);

                    }
                },500);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(share);
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Body = "Download This App";
                String Sub = "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                intent.putExtra(Intent.EXTRA_TEXT,Body);
                intent.putExtra(Intent.EXTRA_TEXT,Sub);
                startActivity(Intent.createChooser(intent,"Share Using"));
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(rate);
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(more);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        animationRTL2();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(Options.this,More.class);
                                startActivity(intent);

                                CustomIntent.customType(Options.this,"left-to-right");
                            }
                        },1000);

                    }
                },500);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        animationLTR();
        animationUTB();
        CustomIntent.customType(Options.this,"right-to-left");
    }

    public void animationRTL() {

        top_card = findViewById(R.id.top_card);
        logo = findViewById(R.id.logo);
        title = findViewById(R.id.logo_title);

        top_card.setTranslationX(1400);
        top_card.setAlpha((float)0.1);
        top_card.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(0);

        logo.setTranslationX(1400);
        logo.setAlpha((float)0.1);
        logo.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(200);

        title.setTranslationX(1400);
        title.setAlpha((float)0.1);
        title.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(300);

    }

    public void animationRTL2() {

        top_card = findViewById(R.id.top_card);
        logo = findViewById(R.id.logo);
        title = findViewById(R.id.logo_title);

        options = findViewById(R.id.options);
        card_layout = findViewById(R.id.card_layout);
        start_lo = findViewById(R.id.start_lo);
        share_lo = findViewById(R.id.share_lo);
        rate_lo = findViewById(R.id.rate_lo);
        more_lo = findViewById(R.id.more_lo);

        top_card.setTranslationX(0);
        top_card.setAlpha((float)1.0);
        top_card.animate().translationX(-1400).alpha((float)0.1).setDuration(1000).setStartDelay(0);

        logo.setTranslationX(0);
        logo.setAlpha((float)1.0);
        logo.animate().translationX(-1400).alpha((float)0.1).setDuration(1000).setStartDelay(200);

        title.setTranslationX(0);
        title.setAlpha((float)1.0);
        title.animate().translationX(-1400).alpha((float)0.1).setDuration(1000).setStartDelay(300);

        options.setTranslationX(0);
        options.setAlpha((float)1.0);
        options.animate().translationX(-1400).alpha((float)0.1).setDuration(1000).setStartDelay(400);

        card_layout.setTranslationX(0);
        card_layout.setAlpha((float)1.0);
        card_layout.animate().translationX(-1400).alpha((float)0.1).setDuration(1000).setStartDelay(500);

        start_lo.setTranslationX(0);
        start_lo.setAlpha((float)1.0);
        start_lo.animate().translationX(-1400).alpha((float)0.1).setDuration(1000).setStartDelay(600);

        share_lo.setTranslationX(0);
        share_lo.setAlpha((float)1.0);
        share_lo.animate().translationX(-1400).alpha((float)0.1).setDuration(1000).setStartDelay(700);

        rate_lo.setTranslationX(0);
        rate_lo.setAlpha((float)1.0);
        rate_lo.animate().translationX(-1400).alpha((float)0.1).setDuration(1000).setStartDelay(800);

        more_lo.setTranslationX(0);
        more_lo.setAlpha((float)1.0);
        more_lo.animate().translationX(-1400).alpha((float)0.1).setDuration(1000).setStartDelay(900);

    }

    public void animationLTR() {

        top_card = findViewById(R.id.top_card);
        logo = findViewById(R.id.logo);
        title = findViewById(R.id.logo_title);

        top_card.setTranslationX(-1400);
        top_card.setAlpha((float)0.1);
        top_card.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(0);

        logo.setTranslationX(-1400);
        logo.setAlpha((float)0.1);
        logo.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(200);

        title.setTranslationX(-1400);
        title.setAlpha((float)0.1);
        title.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(300);

    }

    public void animationBTU() {
        options = findViewById(R.id.options);
        card_layout = findViewById(R.id.card_layout);
        start_lo = findViewById(R.id.start_lo);
        share_lo = findViewById(R.id.share_lo);
        rate_lo = findViewById(R.id.rate_lo);
        more_lo = findViewById(R.id.more_lo);

        options.setTranslationY(1400);
        options.setAlpha((float)0.1);
        options.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(400);

        card_layout.setTranslationY(1400);
        card_layout.setAlpha((float)0.1);
        card_layout.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(500);

        start_lo.setTranslationY(1400);
        start_lo.setAlpha((float)0.1);
        start_lo.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(600);

        share_lo.setTranslationY(1400);
        share_lo.setAlpha((float)0.1);
        share_lo.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(700);

        rate_lo.setTranslationY(1400);
        rate_lo.setAlpha((float)0.1);
        rate_lo.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(800);

        more_lo.setTranslationY(1400);
        more_lo.setAlpha((float)0.1);
        more_lo.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(900);

    }

    public void animationUTB() {
        options = findViewById(R.id.options);
        card_layout = findViewById(R.id.card_layout);
        start_lo = findViewById(R.id.start_lo);
        share_lo = findViewById(R.id.share_lo);
        rate_lo = findViewById(R.id.rate_lo);
        more_lo = findViewById(R.id.more_lo);

        options.setTranslationX(0);
        options.setTranslationY(-1400);
        options.setAlpha((float)0.1);
        options.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(400);

        card_layout.setTranslationX(0);
        card_layout.setTranslationY(-1400);
        card_layout.setAlpha((float)0.1);
        card_layout.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(500);

        start_lo.setTranslationX(0);
        start_lo.setTranslationY(-1400);
        start_lo.setAlpha((float)0.1);
        start_lo.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(600);

        share_lo.setTranslationX(0);
        share_lo.setTranslationY(-1400);
        share_lo.setAlpha((float)0.1);
        share_lo.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(700);

        rate_lo.setTranslationX(0);
        rate_lo.setTranslationY(-1400);
        rate_lo.setAlpha((float)0.1);
        rate_lo.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(800);

        more_lo.setTranslationX(0);
        more_lo.setTranslationY(-1400);
        more_lo.setAlpha((float)0.1);
        more_lo.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(900);
    }

}