package br.com.arqdesis.projects.laercio.myapplication;

/**
 * Created by Laercio on 09/10/2016.
 */

public class Disciplinas {
    private String nome;
    private String descricao;
    public Disciplinas (String nome, String descricao){
        setNome(nome);
        setDescricao(descricao);
    }
    public String getNome(){
        this.nome = nome;
        return nome;
    }
    public String getDescricao(){
        this.descricao = descricao;
        return descricao;
    }
    public void setNome(String nome){
        this.nome = nome;

    }
    public void setDescricao(String descricao){
        this.descricao = descricao;

    }
}
