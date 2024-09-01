package com.poo.listas.principal.lista2;

import java.util.Scanner;

public class exercicio6 {
    public static void resolucao2() {
      

        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;

        System.out.println("Digite a 1° nota do aluno: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a 2° nota do aluno: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2)/2;

        if (media >=6){
            System.out.println("Parabéns! Você foi aprovado!");
        }else {
            System.out.println("Você está de recuperação!");
            double menorNota = (nota1 < nota2) ? nota1 : nota2;

            System.out.println("Digite a nota de recuperação");
            double notaRec = sc.nextDouble();

            double novaMedia = (notaRec + Math.max(nota1, nota2)/2);
            if (novaMedia >= 6){
                System.out.println("Aprovado na recuperação!");
            }else {
                System.out.println("Você foi Reprovado!");
            }
        }

        sc.close();
    }
}