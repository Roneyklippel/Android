package br.senac.es.trabalhoreferencia.model;

import androidx.annotation.NonNull;

import java.util.Date;

public class Chamado {

    private int id;

    private String descricao;
    private  String solucoes;
    private Date dataAbertura;
    private String status;


    public Chamado () {
    }

    public Chamado (int id, String descricao, Date dataAbertura, String solucoes,
                    String status)
    {
        this.id = id;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.status = status;
        this.solucoes = solucoes;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSolucoes() {
        return solucoes;
    }

    public void setSolucoes(String solucoes) {
        this.solucoes = solucoes;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @NonNull
    @Override
    public String toString() {
        return this.descricao;
    }
}
