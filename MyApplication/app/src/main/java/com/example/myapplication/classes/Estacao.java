package com.example.myapplication.classes;

public class Estacao {
    private String nome;
    private String descricao;
    private String proprietario;
    private String localizacao;

    public Estacao(String nome, String descricao, String proprietario, String localizacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.proprietario = proprietario;
        this.localizacao = localizacao;
    }

    public Estacao(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return nome;
    }

}
