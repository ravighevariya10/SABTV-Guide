package com.example.sabtv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import maes.tech.intentanim.CustomIntent;

public class Homepage extends AppCompatActivity {

    Button show_live,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    androidx.cardview.widget.CardView show1,show2,show3,show4,show5,show6,show7,show8,show9;
    int choice;
    ImageView arrow_home;

    AdView mAdView;
    AdRequest adRequest;

    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        show_live = findViewById(R.id.show_live);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        show1 = findViewById(R.id.show1);
        show2 = findViewById(R.id.show2);
        show3 = findViewById(R.id.show3);
        show4 = findViewById(R.id.show4);
        show5 = findViewById(R.id.show5);
        show6 = findViewById(R.id.show6);
        show7 = findViewById(R.id.show7);
        show8 = findViewById(R.id.show8);
        show9 = findViewById(R.id.show9);
        arrow_home = findViewById(R.id.arrow_home);

        mAdView = findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        arrow_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(arrow_home);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Options.class);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                },1000);

            }
        });

        show_live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = 0;
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(show_live);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(btn1);
                choice = 1;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });

                    }
                }, 1000);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(btn2);
                choice = 2;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(btn3);
                choice = 3;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(btn4);
                choice = 4;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(btn5);
                choice = 5;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(btn6);
                choice = 6;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(btn7);
                choice = 7;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(btn8);
                choice = 8;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(btn9);
                choice = 9;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(show1);
                choice = 1;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(show2);
                choice = 2;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(show3);
                choice = 3;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        show4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(show4);
                choice = 4;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        show5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(show5);
                choice = 5;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        show6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(show6);
                choice = 6;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        show7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(show7);
                choice = 7;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        show8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(show8);
                choice = 8;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

        show9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(show9);
                choice = 9;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        InterstitialAd.load(Homepage.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Homepage.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {

                                        Intent intent = new Intent(Homepage.this,Information.class);
                                        intent.putExtra("choice",choice);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });
                    }
                }, 1000);
            }
        });

    }
}