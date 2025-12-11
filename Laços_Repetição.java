/*Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha,
inclusive o X, se for o caso. Use o laço for.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kauane
 */ import java.util.Scanner;
public class Ado_aula6passada_3 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

  int contador = 0;
  int soma = 0;
  int positivos = 0;

   while (contador < 6) {
   System.out.print("digite um valor: ");
   int valor = sc.nextInt();

  if (valor > 0) {
   soma += valor;
   positivos++;
   }

 contador++;
   }

  if (positivos > 0) {
  double media = (double) soma / positivos;
  System.out.println("soma dos positivos: " + soma);
  System.out.println("quantidade de positivos: " + positivos);
  System.out.println("media dos positivos: " + media);
  } else {
  System.out.println("nenhum numero positivo foi digitado.");
  }
  }
}  

