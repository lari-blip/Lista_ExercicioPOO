package com.poo.listas.principal.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio5 {
    public static void resolucao4() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> purchaseList = new ArrayList<>();

        while(true){
            System.out.println("\n--- Lista de compras ---");
            System.out.println("1. Adicionar itens.");
            System.out.println("2. Lista de verificação.");
            System.out.println("3. Saída.");
            System.out.println("Escolha uma opção: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Escolha um item: ");
                    String item = sc.nextLine();
                    purchaseList.add(item);
                    System.out.println("Item adicionado");
                    break;
                case 2:
                    if (purchaseList.isEmpty()){
                        System.out.println("Sua lista está vazia!");
                    }else {
                        System.out.println("\n---- Sua lista de compras ----");
                        for (String i : purchaseList){
                            System.out.println("- " + i);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Tchau!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}