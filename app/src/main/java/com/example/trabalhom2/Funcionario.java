package com.example.trabalhom2;

import java.io.Serializable;

public class Funcionario implements Serializable {

    private String email;
    private String senha;
    private int id;

    public Funcionario(String email, String senha, int id){
        this.senha = senha;
        this.email = email;
        this.id = id;
    }
    public Funcionario(){}

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getId() {
        return id;
    }
}
