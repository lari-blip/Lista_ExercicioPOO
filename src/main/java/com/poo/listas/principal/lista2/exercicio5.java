package com.poo.listas.principal.lista2;

import java.util.Scanner;

public class exercicio5 {
    public static void resolucao2() {
       /* 5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
        algum deles estiver errado o programa deve retornar ao usuário quais das opções
        está errada, se é o login ou a senha.*/

        Scanner sc = new Scanner(System.in);

        String login = "lari@gmail.com";
        String senha = "la3006!@";
        String verificaLogin;
        String verificaSenha;

        System.out.println("Entre com seu login: ");
        verificaLogin = sc.nextLine();

        System.out.println("Entre com sua senha: ");
        verificaSenha = sc.nextLine();

        if (!verificaLogin.equals(login)){
            System.out.println("Login incorreto!");
        }else if(!verificaSenha.equals(senha)){
            System.out.println("Senha incorreta!");
        }else {
            System.out.println("Bem vindo ao sistema " + login);
        }


        sc.close();
    }
}