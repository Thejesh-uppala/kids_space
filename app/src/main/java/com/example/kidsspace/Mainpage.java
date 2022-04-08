package com.example.kidsspace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
    }
    public void engnum(View V) {
        Intent i = new Intent(this, mainpagea.class);
        startActivity(i);
    }

    public void gohome(View V) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}