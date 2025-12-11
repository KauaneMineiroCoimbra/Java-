/*Fazer um algoritmo que leia 
quatro números 
imprime a média aritmética dos quatro números.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora kauane
 */import java.util.Scanner;
public class Exercicio_8 {
public static void main (String [] args){   
 Scanner entrada = new Scanner (System.in);  
 
 //declaração de variaveis
 double n1, n2, n3, n4, media;
 
 //entrada de dados
 System.out.print("Digite o primeiro número:");
  n1 = entrada.nextDouble();
 System.out.print("Digite o segundo número:");
  n2 = entrada.nextDouble(); 
 System.out.print("Digite o terceiro número:");
  n3 = entrada.nextDouble();
 System.out.print("Digite o quarto número:");
  n4 = entrada.nextDouble();
  
  //processamento 
  media = (n1 + n2 + n3 + n4) / 4;
   
  //saida de dados 
  System.out.println("media = " + media ); }
  
  
 
}
