package com.example.trabalhom2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioBanco {


    private Connector connector;
    private SQLiteDatabase banco;

    public FuncionarioBanco(Context context){

        connector = new Connector(context);
        banco = connector.getWritableDatabase();
    }

    public long Inserir(Funcionario funcionario) {
        ContentValues values = new ContentValues();
        values.put("email", funcionario.getEmail());
        values.put("senha", funcionario.getSenha());

        return banco.insert("Funcionario", null, values);
    }

    public void excluirFuncionario(Funcionario funcionario){
        banco.delete("Funcionario", "id=?", new String[]{String.valueOf(funcionario.getId())});
    }


    public List<Funcionario> funcionariosCadastrados(){
        List<Funcionario> funcionario = new ArrayList<>();
        Cursor cursor = banco.query("Funcionario", new String[]{"id", "senha", "email"},null,
                null,null,null, null,null);

        while (cursor.moveToNext()){
            Funcionario funcionario1 = new Funcionario();
            funcionario1.setId(cursor.getInt(0));
            funcionario1.setEmail(cursor.getString(1));
            funcionario1.setSenha(cursor.getString(2));
            funcionario.add(funcionario1);
        }
        return funcionario;
    }

}
