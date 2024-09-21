package com.atv07;

public class Sobremesa implements IProduto {
    private String descricao;
    private double preco;
    private String tamanho;
 
    public Sobremesa(String descricao, double preco, String tamanho) {
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
    }
 
    @Override
    public String getDescricao() {
        return descricao;
    }
 
    @Override
    public double getPreco() {
        return preco;
    }
 
    public String getTamanho() {
        return tamanho;
    }
}
