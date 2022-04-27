package com.example.copy1;
import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
public class Resturantphrase extends Activity {
    ImageView img1;
    TextView txt1, txt2, txt3, txt4, txt5, txt6,txt7,txt8;
    ImageButton bt1,bt2,bt3,bt4,bt5;
    Button bt6, bt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturantphrase);

        ImageButton bt4 = (ImageButton)findViewById(R.id.restaurantphrase_backButton1);
        ImageButton bt5 = (ImageButton)findViewById(R.id.restaurantphrase_nextButton1);
        Button bt6 = (Button)findViewById(R.id.restaurantphrase_Homebutton);
        Button bt7 = (Button) findViewById(R.id.ResphraseBt);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Phrase.class);
                startActivity(i);

            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        }) ;
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Phrase.class);
                startActivity(i);
            }
        }) ;
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new
                        Intent(getApplicationContext(), Resturantphrase2.class);
                startActivity(i);
            }
        });
    }}