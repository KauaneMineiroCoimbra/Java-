/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.pi;

/**
 *
 * @author kauane
 */import java.util.Scanner;
 public class Exercicio_3 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
     
     
     double soma = 0;
     int quantidadeNotas = 0;
     double nota;

     System.out.println("digite as notas (-1 para encerrar):");

     while (true) {
         System.out.print("nota: ");
         nota = sc.nextDouble();

         if (nota == -1) {
             break; 
         }

         soma += nota;
         quantidadeNotas++;
     }

     if (quantidadeNotas > 0) {
         System.out.println("Quantidade de notas: " + quantidadeNotas);
         System.out.println("media das notas: " + (soma / quantidadeNotas));
     } else {
         System.out.println("Nenhuma nota foi digitada.");
     }


  }
  
}
