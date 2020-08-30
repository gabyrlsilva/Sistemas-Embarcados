package com.example.myapplication.classes;

public class Sensor {
    private String nome;
    private String saida;
    private String alcance;
    private String velocidade;
    private String unidade;
    private String localizacao;
    private String status;

    public Sensor(String nome, String saida, String alcance, String velocidade, String unidade, String localizacao, String status) {
        this.nome = nome;
        this.saida = saida;
        this.alcance = alcance;
        this.velocidade = velocidade;
        this.unidade = unidade;
        this.localizacao = localizacao;
        this.status = status;
    }

    public Sensor (){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return nome;
    }
}
