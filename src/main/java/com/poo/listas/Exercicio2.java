package com.poo.listas;

import java.util.Scanner;

public class Exercicio2 {
        public static void resolucao(){
            String nome, sobrenome;
            
            Scanner sc = new Scanner(System.in);

            System.out.print("\nNome: ");
            nome = sc.nextLine();
            System.out.print("\nSobrenome: ");
            sobrenome = sc.nextLine();

            System.out.printf("Olá, -%s %s-", nome, sobrenome);

            sc.close();
        }
}