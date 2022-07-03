package com.example.trabalhom2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuSopas extends AppCompatActivity {

    Button botao_proximo3;
    Button botao_voltar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sopas);

        botao_proximo3 = findViewById(R.id.prox2);
        botao_proximo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),Menu5.class);
                startActivity(intent);
            }


        });

        botao_voltar3 = findViewById(R.id.button13);
        botao_voltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), Menu2.class);
                startActivity(intent);
            }
        });


    }
}