package com.example.trabalhom2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuCliente extends AppCompatActivity {

    Button botao_menuR;
    Button botao_voltarR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cliente);

        botao_menuR= findViewById(R.id.pedidos);
        botao_menuR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),TelaMenu.class);
                startActivity(intent);
            }


        });

        botao_voltarR = findViewById(R.id.button55);
        botao_voltarR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
