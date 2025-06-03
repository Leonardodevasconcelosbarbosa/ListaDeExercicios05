package exercicios;

import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " NÃO é um número primo.");
        } else {
            boolean isPrimo = true;

            
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " NÃO é um número primo.");
            }
        }

        sc.close();
    }
}