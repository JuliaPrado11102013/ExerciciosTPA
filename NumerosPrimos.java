/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosprimos;
 import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class NumerosPrimos {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        // Saída
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
