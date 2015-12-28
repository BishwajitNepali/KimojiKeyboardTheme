package com.thanglastudio.kimoji;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    Button button_enable,button_choose;
    InputMethodManager inputMethodManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_enable=(Button)findViewById(R.id.button_enable);
        button_choose=(Button)findViewById(R.id.button_choose);


        AdView mAdView = (AdView) findViewById(R.id.adView);

        AdRequest.Builder adRequest = new AdRequest.Builder().addTestDevice("C6C832DED13CA3AC6F9F6C3A924F11D4");
        AdRequest aadRequest = adRequest.build();
        mAdView.loadAd(aadRequest);
        inputMethodManager=(InputMethodManager)getApplicationContext().getSystemService(INPUT_METHOD_SERVICE);
        button_enable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent("android.settings.INPUT_METHOD_SETTINGS"));



            }
        });
        button_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inputMethodManager!=null){

                    inputMethodManager.showInputMethodPicker();
                }

            }
        });



    }

}
