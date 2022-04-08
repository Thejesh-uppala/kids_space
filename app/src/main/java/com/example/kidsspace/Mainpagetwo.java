package com.example.kidsspace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mainpagetwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpagetwo);
    }
    public void kangohome(View V) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}