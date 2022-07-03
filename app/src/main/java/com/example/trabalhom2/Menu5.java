package com.example.trabalhom2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu5 extends AppCompatActivity {
    Button botao_proximo5;
    Button botao_voltar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu5);

        botao_proximo5 = findViewById(R.id.button7);
        botao_proximo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),Menu3.class);
                startActivity(intent);
            }


        });

        botao_voltar5 = findViewById(R.id.button33);
        botao_voltar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), MenuSopas.class);
                startActivity(intent);
            }
        });


    }
}

