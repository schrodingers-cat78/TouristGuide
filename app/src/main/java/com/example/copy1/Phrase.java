package com.example.copy1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Phrase extends Activity {

    Button button1, button2, button3, button4;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrases);


        button1 = (Button)findViewById(R.id.phrasebutton);
        button2 = (Button)findViewById(R.id.phrasebutton1);
        button3 = (Button)findViewById(R.id.phrasebutton2);
        button4 = (Button)findViewById(R.id.phrasebutton3);

        text1 = (TextView)findViewById(R.id.phrasetextView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),
                        Resturantphrase.class);

                startActivity(i);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Bus.class);

                startActivity(i);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(i);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),
                        Hotelpage.class);

                startActivity(i);
            }
        });
    }

}