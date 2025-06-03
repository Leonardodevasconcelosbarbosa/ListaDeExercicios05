package exercicios;

import java.util.Scanner;

public class ClassificaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida.");
        } else if (idade <= 12) {
            System.out.println("Categoria: Criança");
        } else if (idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else if (idade <= 59) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Categoria: Idoso");
        }

        sc.close();
    }
}