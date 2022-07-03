package com.example.trabalhom2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuFuncionario extends AppCompatActivity {

    Button botao_voltarF;
    Button botao_menuF;

    private EditText email;
    private EditText senha;
    private FuncionarioBanco funcionarioBanco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_funcionario);

        ///USAR TELA P INSERIR EMAIL

        //email = findViewById(R.id.editEmail);
        //senha = findViewById(R.id.editSenha);
        funcionarioBanco = new FuncionarioBanco(this);

        botao_voltarF = findViewById(R.id.button11);
        botao_voltarF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }


        });

        botao_menuF = findViewById(R.id.button12);
        botao_menuF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), TelaMenu.class);
                startActivity(intent);
            }
        });
    }
    public long Salvar(View view){
        Funcionario funcionario = new Funcionario();
        funcionario.setEmail(email.getText().toString());
        funcionario.setSenha(senha.getText().toString());
        return funcionarioBanco.Inserir(funcionario);
    }

}

