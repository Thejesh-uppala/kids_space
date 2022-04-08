package com.example.kidsspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mainpagec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpagec);
    }
    public void engnumback1(View V) {
        Intent i = new Intent(this, Mainpageb.class);
        startActivity(i);
    }
    public void engnummain2(View V) {
        Intent i = new Intent(this, Mainpage.class);
        startActivity(i);
    }
}