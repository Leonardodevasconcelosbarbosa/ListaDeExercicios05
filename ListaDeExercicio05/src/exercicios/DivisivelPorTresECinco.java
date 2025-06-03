package exercicios;

import java.util.Scanner;

public class DivisivelPorTresECinco {

		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = sc.nextInt();

	        if (numero % 3 == 0 && numero % 5 == 0) {
	            System.out.println(numero + " é divisível por 3 e por 5.");
	        } else {
	            System.out.println(numero + " NÃO é divisível por 3 e por 5.");
	        }

	        sc.close();
	    }
}
