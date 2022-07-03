package com.example.trabalhom2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormaPagamento extends AppCompatActivity {

    Button botao_pix;
    Button botao_aproxD;
    Button botao_aproxC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forma_pagamento);

        botao_pix = findViewById(R.id.buttonp);
        botao_pix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),Pagamento.class);
                startActivity(intent);
            }


        });

        botao_aproxD = findViewById(R.id.lllllllllllllll);
        botao_aproxD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), Pagamento.class);
                startActivity(intent);
            }
        });

        botao_aproxC = findViewById(R.id.au);
        botao_aproxC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), Pagamento.class);
                startActivity(intent);
            }
        });

    }
}