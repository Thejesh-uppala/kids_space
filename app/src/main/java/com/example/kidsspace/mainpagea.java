package com.example.kidsspace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mainpagea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpagea);
    }
    public void engnum2(View V) {
        Intent i = new Intent(this, Mainpageb.class);
        startActivity(i);
    }
    public void engnummain (View V){
        Intent i = new Intent(this, Mainpage.class);
        startActivity(i);
    }
}