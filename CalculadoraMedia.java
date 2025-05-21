/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoramedia;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        // Definição das 4 notas
        // Solicitar as notas ao usuário
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();
       // Realizando as operações da média
       
       double somaNotas = nota1 + nota2 + nota3 + nota4;
       
       double media = somaNotas / 4;
    
       System.out.println("Soma das Notas: " + somaNotas);
       System.out.println("Média das Notas: " + media);
       
       sc.close();
    }
}
