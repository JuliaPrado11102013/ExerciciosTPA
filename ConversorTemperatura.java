/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversortemperatura;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ConversorTemperatura {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Conversão para Kelvin
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        scanner.close();
    }
}