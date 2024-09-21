package com.atv07;

public class Burger implements IProduto{
    private String descricao;
    private double preco;
    private int gramas;
 
    public Burger(String descricao, double preco, int gramas) {
        this.descricao = descricao;
        this.preco = preco;
        this.gramas = gramas;
    }
 
    @Override
    public String getDescricao() {
        return descricao;
    }
 
    @Override
    public double getPreco() {
        return preco;
    }
 
    public int getGramas() {
        return gramas;
    }
}

