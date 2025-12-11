/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.pi;

/**
 *
 * @author kauane
 */
import java.util.Scanner;
public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = 42;
        int tentativas = 0;
        int maxTentativas = 5;
        int palpite;

        while (tentativas < maxTentativas) {
            System.out.print("digite um numero entre 1 e 100: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("parabens! voce acertou em " + tentativas + " tentativas!");
                return;
            }

            int diferenca = Math.abs(palpite - numeroSecreto);

            if (diferenca > 20) {
                System.out.println("muito frio! tente um numero mais no meio.");
            } else if (diferenca >= 10) {
                System.out.println("frio, voce esta se aproximando!");
            } else if (diferenca >= 5) {
                System.out.println("quente, esta quase la!");
            } else {
                if (palpite > numeroSecreto) {
                    System.out.println("muito quente! tente um numero um pouco menor!");
                } else {
                    System.out.println("muito quente! tente um numero um pouco maior!");
                }
            }

            System.out.println("Tentativas restantes: " + (maxTentativas - tentativas));
            System.out.println();
        }

        System.out.println("game over, O numero secreto era " + numeroSecreto + ".");
    }
}

