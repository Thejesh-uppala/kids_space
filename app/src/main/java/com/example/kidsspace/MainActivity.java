package com.example.kidsspace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void one(View V) {
            Intent i = new Intent(this,Mainpage.class);
            startActivity(i);
    }
    public void two(View V) {
        Intent i = new Intent(this,Mainpagetwo.class);
        startActivity(i);
    }
    public void three(View V) {
        Intent i = new Intent(this,Mainpagethree.class);
        startActivity(i);
    }
    public void four(View V) {
        Intent i = new Intent(this,Mainpagefour.class);
        startActivity(i);
    }
    public void five(View V) {
        Intent i = new Intent(this,Mainpagefive.class);
        startActivity(i);
    }
    public void six(View V) {
        Intent i = new Intent(this,Mainpagesix.class);
        startActivity(i);
    }
}