package com.example.galaxytraveller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class p2_start extends AppCompatActivity {

    private Typeface fuenteApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p2_start);

        String ruta_fuente = "fonts/MidNight.ttf";
        this.fuenteApp = Typeface.createFromAsset(getAssets(), ruta_fuente);

        Button p2_buttonJugar = (Button) findViewById(R.id.p2_buttonJugar);
        Button p2_buttonInicio = (Button) findViewById(R.id.p2_buttonInicio);
        Button p2_buttonPersonPj = (Button) findViewById(R.id.p2_buttonPersonPj);
        Button p2_buttonRanking = (Button) findViewById(R.id.p2_buttonRanking);
        Button p1_buttonAyuda = (Button) findViewById(R.id.p1_buttonAyuda);

        p2_buttonJugar.setTypeface(fuenteApp);
        p2_buttonInicio.setTypeface(fuenteApp);
        p2_buttonPersonPj.setTypeface(fuenteApp);
        p2_buttonRanking.setTypeface(fuenteApp);
        p1_buttonAyuda.setTypeface(fuenteApp);

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

        /*
        p2_buttonRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p2_buttonRanking = new Intent(p2_start.this, ranking.class);
                startActivity(ranking);
            }

        });
        */



    }
}
