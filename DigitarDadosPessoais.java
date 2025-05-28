/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.digitardadospessoais;
 import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class DigitarDadosPessoais {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        // Exibição dos dados
        System.out.println("\n--- Dados Informados ---");
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");

        // Fechar o scanner
        scanner.close();
    }
}
