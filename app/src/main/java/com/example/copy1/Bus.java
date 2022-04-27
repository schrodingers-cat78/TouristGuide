package com.example.copy1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Bus extends Activity {

    ImageButton imgbuttonback ;
    Button imghome, imgphrase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus);
        imgbuttonback = (ImageButton)findViewById(R.id.bus_backBt);
        imgbuttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Phrase.class);
                startActivity(i);
            }
        });
        imghome = (Button)findViewById(R.id.bus_homeBt);
        imghome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(i);
            }});
        imgphrase = (Button)findViewById(R.id.bus_phraseBt);
        imgphrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Phrase.class);
                startActivity(i);
            }
        });
    }}