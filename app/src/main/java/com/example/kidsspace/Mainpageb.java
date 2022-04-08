package com.example.kidsspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mainpageb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpageb);
    }
    public void engnumback(View V) {
        Intent i = new Intent(this, mainpagea.class);
        startActivity(i);
    }
    public void engnumnext(View V) {
        Intent i = new Intent(this, Mainpagec.class);
        startActivity(i);
    }
}