package aula03;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        String nomeAluno; // camelOcase 
        double nota1 = 0, nota2 = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite seu nome: ");
        nomeAluno = input.nextLine();

        System.out.print("Digite nota 1: ");
        nota1 = input.nextDouble();

        System.out.print("Digite nota 2: ");
        nota2 = input.nextDouble();

        double media = (nota1 + nota2)/2;

        System.out.println("\nMédia: " + media);

        if (media >= 6) {
            System.out.println("Parabéns, " + nomeAluno + "! Você passou de ano!");
        } else {
            System.out.println("É... " + nomeAluno + ", você reprovou, boa sorte no próximo ano...");
        }
    }
}
