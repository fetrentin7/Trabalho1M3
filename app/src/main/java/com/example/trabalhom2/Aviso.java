package com.example.trabalhom2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Aviso extends AppCompatActivity {

    Button botao_proximo22;
    Button botao_voltar22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso);

        botao_proximo22 = findViewById(R.id.button222);
        botao_proximo22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),Fim.class);
                startActivity(intent);
            }


        });

        botao_voltar22 = findViewById(R.id.button444);
        botao_voltar22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}