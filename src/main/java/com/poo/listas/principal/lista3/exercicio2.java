package com.poo.listas.principal.lista3;

import java.util.Scanner;

public class exercicio2 {
    public static void resolucao3(){
    
        int num1, resultado;

        System.out.print("Digite um numero para visualizar a tabuada dele: \n");
        Scanner leia = new Scanner(System.in);
        num1 = leia.nextInt();

        for (int tabuada = 0; tabuada <= 10; tabuada ++) {
            resultado = num1 * tabuada;
            System.out.println(num1 + " x " + tabuada + " = " + resultado);
        }
    }
}