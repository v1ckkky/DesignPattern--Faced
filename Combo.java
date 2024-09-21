package com.atv07;

class Combo {
    private IProduto burger;
    private IProduto sobremesa;
    private IProduto bebida;
 
    public void CriarCombo(int tipo) {
        if (tipo == 1) {
            this.burger = new Burger("Burguer Master", 15.00, 250);
            this.sobremesa = new Sobremesa("Sorvete", 5.00, "grande");
            this.bebida = new Bebida("Refrigerante", 4.00, 150);
        } else if (tipo == 2) {
            this.burger = new Burger("Super Burguer", 18.00, 200);
            this.sobremesa = new Sobremesa("Torta de maçã", 6.00, "pequeno");
            this.bebida = new Bebida("Suco", 5.50, 150);
        }
    }
 
    @Override
    public String toString() {
        double total = burger.getPreco() + sobremesa.getPreco() + bebida.getPreco();
        return "Combo: \n" +
                "Sanduíche: " + burger.getDescricao() + " - R$" + burger.getPreco() + "\n" +
                "Sobremesa: " + sobremesa.getDescricao() + " - R$" + sobremesa.getPreco() + "\n" +
                "Bebida: " + bebida.getDescricao() + " - R$" + bebida.getPreco() + "\n" +
                "Total: R$" + total;
    }
}
 
