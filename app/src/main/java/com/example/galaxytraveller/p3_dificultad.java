package com.example.galaxytraveller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class p3_dificultad extends AppCompatActivity {

    private Typeface fuenteApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p3_dificultad);

        String ruta_fuente = "fonts/MidNight.ttf";
        this.fuenteApp = Typeface.createFromAsset(getAssets(), ruta_fuente);

        Button p3_buttonArrowBack = (Button) findViewById(R.id.p3_buttonArrowBack);
        Button p3_buttonDifBaja = (Button) findViewById(R.id.p3_buttonDifBaja);
        Button p3_buttonDifMedia = (Button) findViewById(R.id.p3_buttonDifMedia);
        Button p3_buttonDifAlta = (Button) findViewById(R.id.p3_buttonDifAlta);
        Button p1_buttonAyuda = (Button) findViewById(R.id.p1_buttonAyuda);

        p3_buttonDifBaja.setTypeface(fuenteApp);
        p3_buttonDifMedia.setTypeface(fuenteApp);
        p3_buttonDifAlta.setTypeface(fuenteApp);
        p1_buttonAyuda.setTypeface(fuenteApp);


        p3_buttonArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p3_buttonArrowBack = new Intent(p3_dificultad.this, p2_start.class);
                startActivity(p3_buttonArrowBack);
            }

        });





    }
}