package exercicios;

import java.util.Scanner;

public class CalculaImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite seu peso em kg: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = sc.nextDouble();

        
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade Grau II");
        } else {
            System.out.println("Classificação: Obesidade Grau III (Mórbida)");
        }

        sc.close();
    }
}