package com.poo.listas.principal.lista1;

import java.util.Scanner;

public class Exercicio8 {
public static void resolucao() {

double celsius;
double fahrenheit;

System.out.println("Leia os graus em Fahrenheit: ");
try (Scanner leia = new Scanner(System.in)) {
    fahrenheit = leia.nextDouble();
}
celsius = (fahrenheit - 32) / 1.8;
System.out.printf("Celsius:%.2f", celsius);

    }
}