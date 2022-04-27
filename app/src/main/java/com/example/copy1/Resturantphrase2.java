package com.example.copy1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
public class Resturantphrase2 extends Activity{
    ImageView img2;
    ImageButton bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13;
    Button b1, b2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturantphrase2);
        b1 = (Button)findViewById(R.id.restaurantphrase_Homebutton);
        b2 = (Button)findViewById(R.id.ResphraseBt);

        ImageButton bt12 = (ImageButton)findViewById(R.id.restaurantphrase_backButton1);
        ImageButton bt13 = (ImageButton)findViewById(R.id.restaurantphrase_nextButton1);
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent
                        (getApplicationContext(),Resturantphrase3.class);
                startActivity(i);
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new
                        Intent(getApplicationContext(),Resturantphrase.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent i = new
                        Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Phrase.class);
                startActivity(i);
            }
        });

    }
}