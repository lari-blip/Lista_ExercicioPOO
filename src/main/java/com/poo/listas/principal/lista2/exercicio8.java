package com.poo.listas.principal.lista2;

import java.util.Scanner;

public class exercicio8 {
    public static void resolucao2() {
     
        Scanner sc = new Scanner(System.in);
        int chances = 3;
        int pontuacao = 0;

        System.out.println("Seja bem-vindo ao jogo de perguntas!");
        
        System.out.println("Quantos planetas Terra cabem dentro do sol?" +
                "\n" +
                "a) Um milhão\n" +
                "b) Cem\n" +
                "c) Cento e ciquenta\n" +
                "d) 1");
        char resposta1 = sc.next().toLowerCase().charAt(0);
        if (resposta1 == 'a'){
            pontuacao ++;
        }else {
            chances--;
            System.out.println("Respota errada, você tem apenas " + chances + " chances restantes");
        }

        if (chances > 0){
            System.out.println("Em que lugar vivem mais cangurus do que pessoas?" +
                    "\n" +
                    "a) China\n" +
                    "b) Rússia\n" +
                    "c) Austrália\n" +
                    "d) Israel");
            char resposta2 = sc.next().toLowerCase().charAt(0);
            if (resposta2 == 'c'){
                pontuacao ++;
            }else {
                chances --;
                System.out.println("Respota errada, você tem apenas " + chances + " chances restantes");
            }
        }
        if (chances > 0){
            System.out.println("Quantos olhos a maior parte das aranhas tem?" +
                    "\n" +
                    "a) 1\n" +
                    "b) 2\n" +
                    "c) 3\n" +
                    "d) 4");
            char resposta3 = sc.next().toLowerCase().charAt(0);
            if (resposta3 == 'd'){
                pontuacao ++;
            }else {
                chances --;
                System.out.println("Respota errada, você tem apenas " + chances + " chances restantes");
            }
        }
        if (chances > 0){
            System.out.println("O que mede a Escala Mercali?" +
                    "\n" +
                    "a) Top Gun: Maverick\n" +
                    "b)Intensidade sísmica de acordo com os danos provocados\n" +
                    "c) Intensidade dos ventos\n" +
                    "d) Eletronegatividade");
            char resposta4 = sc.next().toLowerCase().charAt(0);
            if (resposta4 == 'b'){
                pontuacao ++;
            }else {
                chances --;
                System.out.println("Respota errada, você tem apenas " + chances + " chances restantes");
            }
        }
        if (chances > 0){
            System.out.println("Quanto mede uma girafa?" +
                    "\n" +
                    "a) Entre 4,8 e 5,5\n" +
                    "b) 2 metros\n" +
                    "c) 2,5 metros\n" +
                    "d) 4 metros");
            char resposta5 = sc.next().toLowerCase().charAt(0);
            if (resposta5 == 'a'){
                pontuacao ++;
            }else {
                chances --;
                System.out.println("Respota errada, você tem apenas " + chances + " chances restantes");
            }
        }

        if (chances == 0){
            System.out.println("Você esgotou suas chances! Fim de jogo.");
        }else {
            System.out.println("Sua pontuação final: " + pontuacao + " de 5");
        }


        sc.close();
    }
}
