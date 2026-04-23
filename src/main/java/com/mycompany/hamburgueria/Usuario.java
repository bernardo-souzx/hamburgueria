package com.mycompany.hamburgueria;

public abstract class Usuario {
    private String login;
    private String senha;
    private String cargo;
    private String nome;
    private String cpf;
    private String telefone;

    public Usuario(String login, String senha, String cargo, String nome, String cpf, String telefone) {
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}