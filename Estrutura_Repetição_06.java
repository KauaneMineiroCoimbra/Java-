/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_01;

/**
 *
 * @author kauane.mcoimbra
 */
import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" inicio: ");
        int inicio = input.nextInt();
        System.out.println(" fim: ");
        int fim = input.nextInt();

        System.out.println("Antes da repeticao...");
        if (inicio < fim) {

            for (int i = inicio; i < fim; i++) {
                if (i % 2 == 0) {

                    System.out.println("  i: " + i);
                }
            }
        } else {
            for (int i = inicio; i > fim; i--) {
                if (i % 2 == 1) {
                
                System.out.println(" i:" + i);
            }
            }
        }
    }
}

