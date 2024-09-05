package com.poo.listas.principal.lista3;

import java.util.Scanner;

import java.io.Console; //adicionado para inserir console.

public class exercicio5 {

public static void resolucao() {
            
        Scanner leia = new Scanner(System.in);
        Console console = System.console(); //item para ler sem exibir os caracteres.
        String cad_login, cad_senha;
        int chances = 3;

        System.out.println("Para realizar um cadastro preencha os campos a seguir.");
        System.out.print("Digite um usuário: ");
        cad_login = leia.nextLine();
        System.out.print("Digite uma senha: ");
        cad_senha = leia.nextLine();

        System.out.println("-------------------------------");
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("-------------------------------");
        boolean loginCorreto = false;

        System.out.println("\nInsira seus dados para realizar o login. ");

        while (!loginCorreto) {
        
        String login, senha;

        System.out.print("\nDigite o seu usuário: ");
        login = leia.nextLine();
        System.out.print("Digite sua senha: ");

        char [] senhaArray2 = console.readPassword();
        senha = new String(senhaArray2);
  
        if (cad_login.equals(login) && cad_senha.equals(senha)) {
            System.out.println("\n----------------------------");
            System.out.println("Login realizado com sucesso.");
            System.out.println("----------------------------");
            loginCorreto = true;
        } else if (!cad_login.equals(login) && chances != 0){
                System.out.println("\n--------------------------------------------------------");
                System.out.println("O login informado não esta correto, tente novamente.");
                System.out.println("--------------------------------------------------------");
                chances--;

        } else if (!cad_senha.equals(senha)&& chances != 0){
            System.out.println("\n--------------------------------------------------------");
            System.out.println("A senha informada não esta correta, tente novamente.");
            System.out.println("--------------------------------------------------------");
                chances--;
        }if(chances ==1){
                System.out.println("\n--------------------------------------------------------");
                System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
                System.out.println("--------------------------------------------------------");
                }else{
        }if(chances == 0){
                System.out.println("\n--------------------------------------------------------");
                System.out.println("Seu acesso foi bloqueado.");
                System.out.println("--------------------------------------------------------");
        break;
        }else{
}
}
}
}
