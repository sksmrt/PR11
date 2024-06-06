package com.example.Pr9BarsukPr21101;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class steps extends AppCompatActivity implements View.OnClickListener{
    ImageButton s;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
        s = findViewById(R.id.strelka);
        s.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, web.class);
        startActivity(intent);
    }

}