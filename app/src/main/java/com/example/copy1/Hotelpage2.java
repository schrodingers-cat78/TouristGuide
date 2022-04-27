package com.example.copy1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
public class Hotelpage2 extends Activity {
    TextView text1, text2, text3, text4, text5, text6, text7, text8, text9, text10,
            text11, text12 ;
    ImageButton hotelbackBt2;
    Button hotelhomeBt2, hotelphraseBt2;
    protected void onCreate (Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);

        setContentView(R.layout.hotelpage2);
        text1 = (TextView)findViewById(R.id.hoteltextView2_1);
        text2 = (TextView)findViewById(R.id.hoteltextView2_2);
        text3 = (TextView)findViewById(R.id.hoteltextView2_3);
        text4 = (TextView)findViewById(R.id.hoteltextView2_4);
        text5 = (TextView)findViewById(R.id.hoteltextView2_5);
        text6 = (TextView)findViewById(R.id.hoteltextView2_6);
        text7 = (TextView)findViewById(R.id.hoteltextView2_7);
        text8 = (TextView)findViewById(R.id.hoteltextView2_8);
        text9 = (TextView)findViewById(R.id.hoteltextView2_9);
        text10 = (TextView)findViewById(R.id.hoteltextView2_10);
        text11 = (TextView)findViewById(R.id.hoteltextView2_11);
        text12 = (TextView)findViewById(R.id.hoteltextView2_12);

        hotelbackBt2 = (ImageButton) findViewById(R.id.hotelbackBt2);
        hotelbackBt2.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent
                        (getApplicationContext(), Hotelpage1.class);
                startActivity(i);
            }
        });
        hotelhomeBt2 = (Button) findViewById(R.id.hotelhomeBt2);
        hotelhomeBt2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent
                        (getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        hotelphraseBt2 = (Button) findViewById(R.id.hotelphraseBt2);
        hotelphraseBt2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(),Phrase.class);
                startActivity(i);
            }
        });
    }}