package com.example.bancodados;

/*
Cliente.java
A classe Cliente.java deve ser criada de maneira que contenha os dados id, nome e cpf, com seus
respectivos métodos "get" e "set", dois métodos construtores, sendo um com parâmetros para o
nome e o CPF e outro com parâmetros referentes a todos os atributos da classe, além da
sobrescrita do método "toString".
 */
public class cliente {

    private long id;
    private String nome;
    private String cpf;

    // Construtor
    public cliente(long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public long getId() {
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " - " + cpf;
    }
}
