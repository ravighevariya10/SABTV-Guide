package com.example.sabtv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class Information extends AppCompatActivity {

    Button btn1_information,btn2_information,btn3_information,btn4_information,btn5_information,btn6_information,btn7_information,btn8_information,btn9_information;
    ImageView arrow_info;
    int choice,choice2=0;
    static int select=0;
    WebView webView;
    androidx.cardview.widget.CardView show1_information,show2_information,show3_information,show4_information,show5_information,show6_information,show7_information,show8_information,show9_information;

    Intent restart;

    AdView mAdView;
    InterstitialAd mInterstitialAd;
    AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        choice = getIntent().getIntExtra("choice",0);

        restart = getIntent();

        arrow_info = findViewById(R.id.arrow_info);
        webView = findViewById(R.id.webView);

        show1_information = findViewById(R.id.show1_information);
        show2_information = findViewById(R.id.show2_information);
        show3_information = findViewById(R.id.show3_information);
        show4_information = findViewById(R.id.show4_information);
        show5_information = findViewById(R.id.show5_information);
        show6_information = findViewById(R.id.show6_information);
        show7_information = findViewById(R.id.show7_information);
        show8_information = findViewById(R.id.show8_information);
        show9_information = findViewById(R.id.show9_information);

//        btn1_information = findViewById(R.id.btn1_information);
//        btn2_information = findViewById(R.id.btn2_information);
//        btn3_information = findViewById(R.id.btn3_information);
//        btn4_information = findViewById(R.id.btn4_information);
//        btn5_information = findViewById(R.id.btn5_information);
//        btn6_information = findViewById(R.id.btn6_information);
//        btn7_information = findViewById(R.id.btn7_information);
//        btn8_information = findViewById(R.id.btn8_information);
//        btn9_information = findViewById(R.id.btn9_information);

        btnName();

        mAdView = findViewById(R.id.adView_info);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        arrow_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(arrow_info);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        choice = -1;
                        select = 0;
                        choice2 = 0;

                        InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.show(Information.this);

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        Intent intent = new Intent(Information.this,Homepage.class);
                                        startActivity(intent);

                                    }
                                });
                            }
                        });

                    }
                },1000);

            }
        });

        if(select == 0) {
            if (choice == 0 || choice == 1 || select == 1) {
                webView.loadUrl("file:///android_asset/live.html");
                updateName();
                choice2 = 1;
                choice = -1;
            }

            if (choice == 2 || select == 2) {
                choice = -1;
                webView.loadUrl("file:///android_asset/aboutTV.html");
            }
            if (choice == 3 || select == 3) {
                choice = -1;
                webView.loadUrl("file:///android_asset/history.html");
            }
            if (choice == 4 || select == 4) {
                choice = -1;
                webView.loadUrl("file:///android_asset/content.html");
            }
            if (choice == 5 || select == 5) {
                choice = -1;
                webView.loadUrl("file:///android_asset/awards.html");
            }
            if (choice == 6 || select == 6) {
                choice = -1;
                webView.loadUrl("file:///android_asset/contro.html");
            }
            if (choice == 7 || select == 7) {
                choice = -1;
                webView.loadUrl("file:///android_asset/watch.html");
            }
            if (choice == 8 || select == 8) {
                choice = -1;
                webView.loadUrl("file:///android_asset/stream.html");
            }
            if (choice == 9 || select == 9) {
                choice = -1;
                webView.loadUrl("file:///android_asset/lives.html");
            }
        }
        else {
            choice = -1;
            if (choice == 0 || choice == 1 || select == 1) {
                webView.loadUrl("file:///android_asset/live.html");
                updateName();
                choice2 = 1;
                choice = -1;
            }

            if (choice == 2 || select == 2) {
                choice = -1;
                webView.loadUrl("file:///android_asset/aboutTV.html");
            }
            if (choice == 3 || select == 3) {
                choice = -1;
                webView.loadUrl("file:///android_asset/history.html");
            }
            if (choice == 4 || select == 4) {
                choice = -1;
                webView.loadUrl("file:///android_asset/content.html");
            }
            if (choice == 5 || select == 5) {
                choice = -1;
                webView.loadUrl("file:///android_asset/awards.html");
            }
            if (choice == 6 || select == 6) {
                choice = -1;
                webView.loadUrl("file:///android_asset/contro.html");
            }
            if (choice == 7 || select == 7) {
                choice = -1;
                webView.loadUrl("file:///android_asset/watch.html");
            }
            if (choice == 8 || select == 8) {
                choice = -1;
                webView.loadUrl("file:///android_asset/stream.html");
            }
            if (choice == 9 || select == 9) {
                choice = -1;
                webView.loadUrl("file:///android_asset/lives.html");
            }
        }

        show1_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 1;

                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });

            }
        });

        show2_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 2;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        show3_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 3;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        show4_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 4;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        show5_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 5;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        show6_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 6;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        show7_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 7;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        show8_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 8;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        show9_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 9;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        btn1_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 1;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        btn2_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 2;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        btn3_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 3;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        btn4_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 4;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        btn5_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 5;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        btn6_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 6;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        btn7_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 7;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        btn8_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 8;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

        btn9_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice2 == 0)
                    select = 9;
                InterstitialAd.load(Information.this, "ca-app-pub-3940256099942544/8691691433", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(Information.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                startActivity(restart);

                            }
                        });
                    }
                });
            }
        });

    }

    public void btnName()
    {
        btn1_information = findViewById(R.id.btn1_information);
        btn2_information = findViewById(R.id.btn2_information);
        btn3_information = findViewById(R.id.btn3_information);
        btn4_information = findViewById(R.id.btn4_information);
        btn5_information = findViewById(R.id.btn5_information);
        btn6_information = findViewById(R.id.btn6_information);
        btn7_information = findViewById(R.id.btn7_information);
        btn8_information = findViewById(R.id.btn8_information);
        btn9_information = findViewById(R.id.btn9_information);
    }

    public void updateName()
    {
        btnName();
        btn1_information.setText("Office Office");
        btn2_information.setText("Taarak Mehta");
        btn3_information.setText("Lapataganj");
        btn4_information.setText("F.I.R.");
        btn5_information.setText("Sajan Re Jhoot Mat Bolo");
        btn6_information.setText("Yes Boss");
        btn7_information.setText("R.K. Laxman Ki Duniya");
        btn8_information.setText("Jugni Chali Jalandhar");
        btn9_information.setText("Chidiya Ghar");
    }

    public void sameName()
    {
        btn1_information.setText("Watch Live Show");
        btn2_information.setText("About SAB TV");
        btn3_information.setText("SAB TV History");
        btn4_information.setText("SAB TV Content");
        btn5_information.setText("SAB Ke Anokhe Awards");
        btn6_information.setText("Controversy of SAB TV");
        btn7_information.setText("How TO Watch Movie in SAB");
        btn8_information.setText("SAB TV Stream");
        btn9_information.setText("Live Streaming on SAB TV");
    }

    @Override
    protected void onRestart() {
        choice = -1;
        select = 0;
        choice2 = 0;
        super.onRestart();
    }
}