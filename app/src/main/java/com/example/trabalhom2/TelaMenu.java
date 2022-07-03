package com.example.trabalhom2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaMenu extends AppCompatActivity {

    Button botao_proximo;
    Button botao_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);

        botao_proximo = findViewById(R.id.proximo);
        botao_proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),Menu2.class);
                startActivity(intent);
            }
        });

        botao_voltar = findViewById(R.id.voolta);
        botao_voltar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();

            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    });


}
}



