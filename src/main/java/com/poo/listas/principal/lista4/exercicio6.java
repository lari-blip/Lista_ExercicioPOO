package com.poo.listas.principal.lista4;

import java.sql.SQLOutput;
import java.util.*;

public class exercicio6 {
    public static void resolucao4() {


        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ArrayList<String> purchaseList = new ArrayList<>();
        Map<String, Double> buy = new HashMap<>();

        while(true){
            System.out.println("\n--- Lista de compras ---");
            System.out.println("1. Adicionar itens.");
            System.out.println("2. Lista de verificação.");
            System.out.println("3. Remove item.");
            System.out.println("4. Saída.");
            System.out.println("Escolha uma opção: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Choose an item: ");
                    String item = sc.nextLine();

                    System.out.println("Item adicionado: ");
                    Double price = sc.nextDouble();

                    buy.put(item,price);

                    purchaseList.add(item);
                    System.out.println("Item adicionado");
                    break;
                case 2:
                    if (purchaseList.isEmpty()){
                        System.out.println("Sua lista está vazia!");
                    }else {
                        System.out.println("\n---- Sua lista de compras ----");
                        List<Map.Entry<String, Double>> list = new ArrayList<>((buy.entrySet()));
                        list.sort(Map.Entry.comparingByValue());
                        for (String i : purchaseList){
                            System.out.println("- " + buy );
                            break;
                        }
                    }
                    break;
                case 3:
                    if (purchaseList.isEmpty()){
                        System.out.println("Não há itens para remover! ");
                    }else {
                        System.out.println("\n--- Sua lista de compras ---");
                        for (int i = 0; i < purchaseList.size(); i++){
                            System.out.println((i+1)+ ". " + purchaseList.get(i));
                        }
                        System.out.println("Escolha o número de itens que deseja remover");
                        int removeItem = sc.nextInt();

                        if (removeItem > 0 && removeItem <= purchaseList.size()){
                            purchaseList.remove(removeItem - 1);
                            System.out.println("Item removido com sucesso! ");
                        }else {
                            System.out.println("Número inválido, tente novamente!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Tchau! Volte sempre!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}