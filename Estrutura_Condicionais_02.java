/* algoritmo que leia três números
e imprime o maior deles. 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora kauane
*/import java.util.Scanner;
public class Exercicio_13 {
 public static void main (String [] args){   
 Scanner sc = new Scanner (System.in);  
 
 //declaração de variaveis  
 System.out.print("A: ");
double A = sc.nextDouble();
 System.out.print("B:");
double  B = sc.nextDouble();
 System.out.print("C: ");
double C = sc.nextDouble();

//processamento
double maior = Math.max(A, Math.max  (B,C));

//saida de dados
System.out.printf("maior: %.2f%n", maior);}

//fim






 
 
}
