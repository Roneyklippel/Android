package model;

import java.util.Date;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;
    private int lote;
    private Date fabricacao;
    private Date validade;
    private int codfornecedor;
    private String categoria;

    public Produto(int codigo, String nome, int quantidade, double preco, int lote, Date fabricacao, Date validade, int codfornecedor, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.lote = lote;
        this.fabricacao = fabricacao;
        this.validade = validade;
        this.codfornecedor = codfornecedor;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public Date getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public int getCodfornecedor() {
        return codfornecedor;
    }

    public void setCodfornecedor(int codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
