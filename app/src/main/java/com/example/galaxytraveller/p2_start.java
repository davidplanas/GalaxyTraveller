package com.example.galaxytraveller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class p2_start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p2_start);

        Button p2_buttonInicio = (Button) findViewById(R.id.p2_buttonInicio);
        Button p2_buttonJugar = (Button) findViewById(R.id.p2_buttonJugar);

        p2_buttonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p2_buttonInicio = new Intent(p2_start.this, p1_intro.class);
                startActivity(p2_buttonInicio);
            }

        });

        p2_buttonJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p2_buttonJugar = new Intent(p2_start.this, p3_dificultad.class);
                startActivity(p2_buttonJugar);
            }

        });



    }
}
