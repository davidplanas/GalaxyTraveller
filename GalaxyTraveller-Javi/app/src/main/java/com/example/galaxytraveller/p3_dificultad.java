package com.example.galaxytraveller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class p3_dificultad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p3_dificultad);

        Button p3_buttonArrowBack = (Button) findViewById(R.id.p3_buttonArrowBack);

        p3_buttonArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p3_buttonArrowBack = new Intent(p3_dificultad.this, p2_start.class);
                startActivity(p3_buttonArrowBack);
            }

        });





    }
}