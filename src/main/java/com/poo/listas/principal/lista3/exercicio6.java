package com.poo.listas.principal.lista3;


import java.util.Scanner;
public class exercicio6 {
    public static void resolucao3()throws InterruptedException{
        
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número de andares desejado:");
    
    int andar = scanner.nextInt();
//i=1 iniciar smp no primeiro andar, i<=andar quantidade total de andares
    for (int i = 1; i <= andar; i++) {
        //a quantidade dos espaços NULOS N U L O S PARA FORMAR PIRAMIDE NÃO RETANGULO
        //LEMBRAR QUE EXISTE PRIMEIRO ANDAR E NOS PROXIMOS SEMPRE HAVERÁ O ESPAÇO NULO
        for (int a = 0; a < andar - i; a++) {
            System.out.print(" ");
        }

        // controla a quantidade do tipo se no terceiro andar i=3 a conta será 2 x 3 - 1
        //que resulta em 5, 3 * e " " " "
        for (int b = 0; b < (2 * i - 1); b++) {
            System.out.print("*");
        }

        System.out.println();
    }

    scanner.close();
}
}