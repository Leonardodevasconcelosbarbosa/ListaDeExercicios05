package exercicios;

import java.util.Scanner;

public class ParImparPositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        
        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }

       
        if (numero > 0) {
            System.out.println(numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        sc.close();
    }
}