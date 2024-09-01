package com.poo.listas.principal.lista1;

import java.util.Scanner;

public class Exercicio3 {

    public static void resolucao(){

        double txDolar = 5.25;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double valorReal = scanner.nextDouble();


        double valorDolares = valorReal / txDolar;


        System.out.printf("O valor de R$%.2f equivale a US$%.2f.%n", valorReal, valorDolares);


        scanner.close();
    }

}
