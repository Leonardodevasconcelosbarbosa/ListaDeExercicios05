package exercicios;

import java.util.Scanner;

public class ConceitoNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 100: ");
        int nota = sc.nextInt();

        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida! Digite um valor entre 0 e 100.");
        } else {
            char conceito;

            if (nota >= 90) {
                conceito = 'A';
            } else if (nota >= 80) {
                conceito = 'B';
            } else if (nota >= 70) {
                conceito = 'C';
            } else if (nota >= 60) {
                conceito = 'D';
            } else {
                conceito = 'F';
            }

            System.out.println("Conceito: " + conceito);
        }

        sc.close();
    }
}