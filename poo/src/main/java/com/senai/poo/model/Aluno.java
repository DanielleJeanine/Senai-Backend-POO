package com.senai.poo.model;

public class Aluno {
    
    private String nome;
    private int matricula;
    private int anoNascimento;

    public Aluno(){
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public int getMatricula(){
        return matricula;
    }


}
