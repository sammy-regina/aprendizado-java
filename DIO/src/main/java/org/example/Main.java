package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var scanner = new Scanner(System.in);
        System.out.print("Quanto é 2 + 2? ");
        var resposta = scanner.nextInt();
        var estaIgual = resposta == 4;
        System.out.printf("A resposta está correta é 4, Você acertou? (%s) ", estaIgual);

    }
}