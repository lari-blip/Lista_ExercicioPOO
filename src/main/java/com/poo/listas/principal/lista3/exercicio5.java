package com.poo.listas.principal.lista3;

import java.util.Scanner;

public class exercicio5 {
    public static void resolucao3(){
    
    String login ="Luis123";
    String senha ="Lu123";
    String verificaLogin;
    String verificaSenha;
    String vezesLogin;

    System.out.println("Login: ");
    Scanner leia = new Scanner(System.in);
    verificaLogin = leia.nextLine();

    System.out.println("Senha: ");
    verificaSenha = leia.nextLine();

    
    if(!verificaLogin.equals(login)){
            System.out.println("Login incorreto!");
    }
    else if (!verificaSenha.equals(senha)){
            System.out.println("Senha incorreta!");
    }
    else if(verificaLogin.equalsIgnoreCase(login) && verificaSenha.equalsIgnoreCase(senha)){
            System.out.println("Bem vindo ao sistema!");
        }
    }
}