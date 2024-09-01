package com.poo.listas.principal.lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {

        double  distanciaPercorridaEmKm;
        double totalGasto, consumoMedio;

        System.out.print("Distância percorrida (Km): ");
        try (Scanner leia = new Scanner(System.in)) {
            distanciaPercorridaEmKm = leia.nextDouble();

            System.out.print("Total gasto de combustível (L): ");
            totalGasto = leia.nextDouble();
        }
        consumoMedio = distanciaPercorridaEmKm / totalGasto;

        System.out.printf("Consumo médio (Km/l): %.2f%n", consumoMedio);

     }
}