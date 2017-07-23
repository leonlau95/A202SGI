package com.example.pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static android.R.attr.start;

/**
 * Created by PC on 7/23/2017.
 */

public class choosing extends AppCompatActivity {
    Button Tokyo;
    Button Kyoto;
    Button Okinawa;
    Button Osaka;
    Button Nagoya;
    Button Akihabara;
    Button Nagasaki;
    Button Hokkaido;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing);

        Tokyo = (Button) findViewById(R.id.button18);
        Tokyo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent start = new Intent(choosing.this, Tokyo.class);
                startActivity(start);
            }
        });
        Kyoto = (Button) findViewById(R.id.button19);
        Kyoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent start = new Intent(choosing.this, Kyoto.class);
                startActivity(start);
            }
        });
        Okinawa = (Button) findViewById(R.id.button20);
        Okinawa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent start = new Intent(choosing.this, Okinawa.class);
                startActivity(start);
            }
        });
        Osaka = (Button) findViewById(R.id.button21);
        Osaka.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent start = new Intent(choosing.this, Osaka.class);
                startActivity(start);
            }
        });
        Nagoya = (Button) findViewById(R.id.button22);
        Nagoya.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent start = new Intent(choosing.this, Nagoya.class);
                startActivity(start);
            }
        });
        Akihabara = (Button) findViewById(R.id.button23);
        Akihabara.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent start = new Intent(choosing.this, Akihabara.class);
                startActivity(start);
            }
        });
        Nagasaki = (Button) findViewById(R.id.button24);
        Nagasaki.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent start = new Intent(choosing.this, Nagasaki.class);
                startActivity(start);
            }
        });
        Hokkaido = (Button) findViewById(R.id.button25);
        Hokkaido.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent start = new Intent(choosing.this, Hokkaido.class);
                startActivity(start);
            }
        });
    }



}
