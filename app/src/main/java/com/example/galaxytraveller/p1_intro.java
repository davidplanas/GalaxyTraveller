package com.example.galaxytraveller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class p1_intro extends AppCompatActivity {

    private Typeface fuenteApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p1_intro);

        String ruta_fuente = "fonts/MidNight.ttf";
        this.fuenteApp = Typeface.createFromAsset(getAssets(), ruta_fuente);

        Button p1_buttonEmpezar = (Button) findViewById(R.id.p1_buttonEmpezar);
        Button p1_buttonAyuda = (Button) findViewById(R.id.p1_buttonAyuda);
        TextView textView_titulo = (TextView) findViewById(R.id.textView_titulo);
        TextView textView_desc1 = (TextView) findViewById(R.id.textView_desc1);
        TextView textView_desc2 = (TextView) findViewById(R.id.textView_desc2);
        TextView textView_desc3 = (TextView) findViewById(R.id.textView_desc3);

        p1_buttonEmpezar.setTypeface(fuenteApp);
        p1_buttonAyuda.setTypeface(fuenteApp);
        textView_titulo.setTypeface(fuenteApp);
        textView_desc1.setTypeface(fuenteApp);
        textView_desc2.setTypeface(fuenteApp);
        textView_desc3.setTypeface(fuenteApp);

        p1_buttonEmpezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p1_buttonEmpezar = new Intent(p1_intro.this, p2_start.class);
                startActivity(p1_buttonEmpezar);
            }

        });




    }
}
