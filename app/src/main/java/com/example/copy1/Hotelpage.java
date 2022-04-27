package com.example.copy1;
import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
public class Hotelpage extends Activity {
    TextView text1, text2, text3, text4,text5, text6, text7, text8, text9, text10, text11,
            text12, text13, text14, text15, text16 ;
    ImageButton hotelbackBt, hotelnextBt;
    Button hotelhomeBt, hotelphraseBt;
    protected void onCreate (Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.hotelpage);
        hotelbackBt = (ImageButton) findViewById(R.id.hotelbackBt);
        hotelbackBt.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent
                        (getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        hotelhomeBt = (Button) findViewById(R.id.hotelhomeBt);
        hotelhomeBt.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent
                        (getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        hotelphraseBt = (Button) findViewById(R.id.hotelphraseBt);
        hotelphraseBt.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(),Phrase.class);
                startActivity(i);
            }
        });
        hotelnextBt = (ImageButton) findViewById(R.id.hotelnextBt);
        hotelnextBt.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent
                        (getApplicationContext(), Hotelpage1.class);
                startActivity(i);
            }
        });
    }}