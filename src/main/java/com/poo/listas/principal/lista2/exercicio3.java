package com.poo.listas.principal.lista2;

import java.util.Scanner;

public class exercicio3 {
    public static void resolucao2() {

        Scanner sc = new Scanner(System.in);
        String nome;
        String condicao;
        int idade;

        System.out.println("Olá seja bem-vindo ao BB, por favor digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Por favor, me diga se você possui alguma condição especial Gestante/Deficiência: ");
        condicao = sc.next();

        System.out.println("Ótimo " + nome +
                " agora por favor, digite sua idade: ");
        idade = sc.nextInt();


        if (idade > 65 || condicao.equals("Gestante") || condicao.equals("Deficiência")) {
            System.out.println("Ótimo, dirija-se a fila preferencial!");
        }else {
            System.out.println("Ótimo, dirija-se a fila comum!");
        }

        sc.close();
    }
}