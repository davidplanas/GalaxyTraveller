package com.example.galaxytraveller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class p1_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p1_intro);

        Button p1_buttonComenzar = (Button) findViewById(R.id.p1_buttonComenzar);

        p1_buttonComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p1_buttonComenzar = new Intent(p1_intro.this, p2_start.class);
                startActivity(p1_buttonComenzar);
            }

        });















    }
}
