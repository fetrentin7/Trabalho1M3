package com.example.trabalhom2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu2 extends AppCompatActivity {

    Button botao_proximo2;
    Button botao_voltar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        botao_proximo2 = findViewById(R.id.prrox);
        botao_proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),MenuSopas.class);
                startActivity(intent);
            }


        });

        botao_voltar2 = findViewById(R.id.vvvvv);
        botao_voltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), TelaMenu.class);
                startActivity(intent);
            }
        });


    }
}