package com.poo.listas.principal.lista3;

    import java.util.Scanner;
    public class exercicio7 {
        public static void resolucao(){
    
            int largura;
            int altura;
    
            System.out.println("Altura: ");
            Scanner leia = new Scanner(System.in);
            altura = leia.nextInt();
    
            System.out.println("Largura: ");
            largura = leia.nextInt();
    
            for (int j = 0; j < altura; j++) {
                for (int i = 0; i < largura; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
    }

