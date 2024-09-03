package com.poo.listas.principal.lista3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class exercicio1{
    public static void resolucao() throws InterruptedException {

        int numeroDigitado;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("Digite um número em segundos:");
            numeroDigitado = leia.nextInt();

            if (numeroDigitado < 1  numeroDigitado > 59) {
                System.out.println("Número inválido. Por favor, digite um número válido entre 1 e 59.");
            }

        } while (numeroDigitado < 1  numeroDigitado > 59);


        for (int i = 0; i <= numeroDigitado; i++) {
            System.out.println( i );
            TimeUnit.SECONDS.sleep(1);
        }
    }
}