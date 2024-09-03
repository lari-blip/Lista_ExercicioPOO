package com.poo.listas.principal.lista2;

import java.util.Scanner;

public class exercicio7 {
    public static void resolucao2() {
       
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Digite um número: ");
        n1 = sc.nextInt();

        System.out.println("Digite um número: ");
        n2 = sc.nextInt();

        if(n1 % n2 == 0){
            System.out.println("O número " + n1 + " é divisível por " + n2);
        }else {
            System.out.println("Eles não são divisíveis.");
        }
        sc.close();
    }
}