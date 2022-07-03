package com.example.trabalhom2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Connector extends SQLiteOpenHelper {


    private static final int versao = 1;
    private static final String banco_cadastro = "bancocadastro";


    public Connector (Context context)  {
        super(context, banco_cadastro, null, versao);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Funcionario(id int primary key autoincrement," +
                "email varchar(50), senha integer(50))");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
