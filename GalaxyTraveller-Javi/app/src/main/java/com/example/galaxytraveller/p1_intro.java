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

        Button p1_buttonEmpezar = (Button) findViewById(R.id.p1_buttonEmpezar);

        p1_buttonEmpezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p1_buttonEmpezar = new Intent(p1_intro.this, p2_start.class);
                startActivity(p1_buttonEmpezar);
            }

        });















    }
}
