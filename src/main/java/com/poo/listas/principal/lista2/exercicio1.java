package com.poo.listas.principal.lista2;

import java.util.Scanner;

public class exercicio1 {
    public static void resolucao2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();

        if(numero%2==0){
            System.out.println("Número par");
        }
        else{
            System.out.println("Número ímpar");
        }


        scanner.close();
    }

}