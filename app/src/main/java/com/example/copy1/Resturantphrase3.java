package com.example.copy1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
public class Resturantphrase3 extends Activity{
    ImageView img3;
    ImageButton bt14,bt15,bt16,bt17,bt18,bt19,bt20,bt21,bt22,bt23;
    Button bt24, bt25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturantphrase3);
        ImageButton bt22 = (ImageButton)findViewById(R.id.restaurantphrase_backButton3);
        bt24 = (Button)findViewById(R.id.Resphrase3Bt);
        bt25 = (Button)findViewById(R.id.restaurantphrase3_Homebutton);

        bt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Phrase.class);
                startActivity(i);
            }
        });
        bt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new
                        Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        bt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new
                        Intent(getApplicationContext(), Resturantphrase2.class);

                startActivity(i);
            }
        });
        ;}}
