package com.poo.listas.principal.lista2;

import java.util.Scanner;

public class exercicio4 {
    public static void resolucao2() {
       
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Bem-vindo!! Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 16 && idade <= 18){
            System.out.println("Entrada só com acompanhado pelos pais.");
        }else if(idade > 18){
            System.out.println("Entrada permitida!");
        }else {
            System.out.println("Entrada não permitida!");
        }

        sc.close();
    }
}