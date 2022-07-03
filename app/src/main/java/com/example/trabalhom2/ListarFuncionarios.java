package com.example.trabalhom2;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ListarFuncionarios extends AppCompatActivity {


    private ListView listView;
    private FuncionarioBanco funcionarioBanco;
    private List<Funcionario> funcionario;
    private List<Funcionario> funcionariosCadastrados;


    @SuppressLint("WrongViewCast")


    protected void OnCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funcionario);

        listView = findViewById(R.id.botaofuncionario);

        funcionarioBanco = new FuncionarioBanco(this);
        funcionario = funcionarioBanco.funcionariosCadastrados();
        funcionariosCadastrados.addAll(funcionario);

        ArrayAdapter<Funcionario> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, funcionario);
        listView.setAdapter(adapter);


        registerForContextMenu(listView);
    }


    @SuppressLint("ResourceType")


    public void excluirFuncionario(MenuItem menu){
        AdapterView.AdapterContextMenuInfo menuInfo =
                (AdapterView.AdapterContextMenuInfo) menu.getMenuInfo();
        final Funcionario excluir = funcionariosCadastrados.get(menuInfo.position);


        AlertDialog dialog = new AlertDialog.Builder(this)
                .setMessage("Deseja excluir?")
                .setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        funcionariosCadastrados.remove(excluir);
                        funcionario.remove(excluir);
                        listView.invalidateViews();
                    }
                }).create();
        dialog.show();
    }

    public void cadastrarFuncionario(MenuItem menu){
        Intent intent = new Intent(this, Funcionario.class);
        startActivity(intent);

    }


    public void procurarFuncionario(String email){
        funcionariosCadastrados.clear();

        for(Funcionario funcionario: funcionario){
            if(funcionario.getEmail().toLowerCase().contains(email.toLowerCase())){
                funcionariosCadastrados.add(funcionario);
            }
        }
        listView.invalidateViews();
    }

    @Override
    public void onResume(){
        super.onResume();
        funcionario = funcionarioBanco.funcionariosCadastrados();
        funcionariosCadastrados.clear();
        funcionariosCadastrados.addAll(funcionario);
        listView.invalidateViews();

    }
}
