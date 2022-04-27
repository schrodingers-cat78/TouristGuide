package com.example.copy1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
public class Hotelpage1 extends Activity {
    TextView text1, text2, text3, text4,text5, text6, text7, text8, text9, text10,text11, text12,
            text13, text14, text15 ;
    ImageButton hotelbackBt1, hotelnextBt1;
    Button hotelhomeBt1, hotelphraseBt1;
    protected void onCreate (Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.hotelpage1);
        hotelbackBt1 = (ImageButton) findViewById(R.id.hotelbackBt1);
        hotelbackBt1.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent
                        (getApplicationContext(),Hotelpage.class);
                startActivity(i);
            }
        });

        hotelhomeBt1 = (Button) findViewById(R.id.hotelhomeBt1);
        hotelhomeBt1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent
                        (getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        hotelphraseBt1 = (Button) findViewById(R.id.hotelphraseBt1);
        hotelphraseBt1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(),Phrase.class);
                startActivity(i);
            }

        });
        hotelnextBt1 = (ImageButton) findViewById(R.id.hotelnextBt1);
        hotelnextBt1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent
                        (getApplicationContext(), Hotelpage2.class);
                startActivity(i);
            }
        });
    }}
