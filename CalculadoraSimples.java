/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorasimples;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class CalculadoraSimples {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha a operação matemática:");
            System.out.println("1 - Soma");
            System.out.println("2 - Multiplicação");
            System.out.println("3 - Subtração");
            System.out.println("4 - Divisão");
            
            int opcao = scanner.nextInt();
            
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            double resultado;
            
            switch (opcao) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.println("Resultado da soma: " + resultado);
                }
                case 2 -> {
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                }
                case 3 -> {
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                }
                case 4 -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    }
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
