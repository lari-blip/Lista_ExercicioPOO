package com.poo.listas.principal.lista3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
    
    public class exercicio1{
        public static void resolucao3() throws InterruptedException {
            
            int numeroDigitado;
    
            System.out.println("Digite um número em segundos ente 1 e 59:");
            Scanner leia = new Scanner(System.in);
            numeroDigitado = leia.nextInt();
            
            do {
                System.out.println("Digite um número valido:");
                numeroDigitado = leia.nextInt();  
    
        } while (numeroDigitado < 1 || numeroDigitado > 59);
    
    
        for (int i = 0; i <= numeroDigitado; i++) {
                System.out.println( "00:" + i );
                TimeUnit.SECONDS.sleep(1);
        }
    }
}