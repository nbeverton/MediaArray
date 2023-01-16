package br.com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MediaArray {
    public static void main(String[] args) {
        System.out.println("Olar, quantas notas você gostaria de informar?");

        Scanner entrada = new Scanner(System.in);
        int quantidadeNotas = entrada.nextInt();

        double[] notas = new double[quantidadeNotas];
        double soma = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("digite a nota: ");
            notas[i] = entrada.nextDouble();
            soma = notas[i] + soma;
        }

        System.out.println(Arrays.toString(notas));
        double media = soma / quantidadeNotas;
        System.out.println(media);

        entrada.close();
    }
}
