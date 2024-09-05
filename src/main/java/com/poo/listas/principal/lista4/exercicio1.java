package com.poo.listas.principal.lista4;

import java.util.Scanner;

public class exercicio1 {
    public static void resolucao4(){

        Scanner leia = new Scanner(System.in);

        System.out.println("Número de vendas do dia: ");
        int numeroVendas = leia.nextInt();

        double vendas[] = new double [numeroVendas];
        double totalVendas = 0;

        for (int i = 0; i <= numeroVendas; i++) {
            System.out.println("Digite o valor da venda " + (i + 1) + ":");
            vendas[i] = leia.nextDouble();
        }
        for (double venda : vendas) {
            totalVendas += venda;
        }
        System.out.println("Total das vendas do dia: R$" + totalVendas);

    leia.close();
    }
}