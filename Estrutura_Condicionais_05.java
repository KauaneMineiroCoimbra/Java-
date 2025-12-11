/*fazer um algoritmo que leia dois numeros 
imprime a somar dos quadrados dos dois numeros
quadrado= reprsentado por a2 = a * a

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora kauane
*/import java.util.Scanner;

public class Exercicio_3 {
 public static void main (String [] args){   
 Scanner entrada = new Scanner (System.in);  
 
 //declaração de variaveis
  double a, b, soma;
  
  //entrada de dados 
  System.out.println("digite o primeiro numero");
  a = entrada.nextDouble();
  System.out.println("digite o segundo numero");
  b = entrada.nextDouble();
  
  //processamento
  soma = (a*a) + (b*b);
  
  //saida de dados
     System.out.println("soma dos quadrados= " + soma);
 }  
  
  
    
}
