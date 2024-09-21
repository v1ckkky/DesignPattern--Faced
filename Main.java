package com.atv07;

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
 
        System.out.println("Selecione seu combo:");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");
 
        int tipo = input.nextInt();
        Combo combo = new Combo();
        combo.CriarCombo(tipo);
 
        System.out.println(combo);
    }
}

