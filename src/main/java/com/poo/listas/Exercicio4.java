package com.poo.listas;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);
        int numero1;

        System.out.println("Digite um numero: ");
        numero1 = sc.nextInt();

        System.out.println("O antecessor é " + (numero1 - 1) +"\n");
        System.out.println("O sucessor é: " + (numero1 + 1));

        sc.close();
    }
}