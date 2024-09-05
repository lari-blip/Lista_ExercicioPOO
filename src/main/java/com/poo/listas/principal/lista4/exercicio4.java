package com.poo.listas.principal.lista4;

import java.util.Scanner;

public class exercicio4 {
    private static int numero;

    public static void resolucao4()throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int[] lista = {3, 5, 6, 7, 8, 10, 22, 55, 110};
        int par = 0;
        

        for ( int numero : lista);{

            
            if (numero % 2 == 0){
                lista[numero] += par;
                par++;
            }
               
        }
        System.out.println("Quantidade de números pares: " + par);
}

}