package com.example.pc.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by PC on 7/23/2017.
 */

public class Nagasaki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nagasaki);
    }
    public void nagasaki(View view){
        Intent wikipediaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Nagasaki"));
        startActivity(wikipediaIntent);
    }
}