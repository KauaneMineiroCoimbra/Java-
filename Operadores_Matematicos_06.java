/*fazer um algoritmo que leia um valor L e
calcula a área de um quadrado de lado L
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora kauane
 */import java.util.Scanner;
public class Exercicio_5 {
 public static void main (String [] args){   
 Scanner entrada = new Scanner (System.in); 
 
 //declaração de variaveis
 System.out.print("digite o valor do lado do quadrado: ");
 
 //entrada de dados
 double L = entrada.nextDouble();
 
 //processamento,calculo
 double area = L*L;
 
 //saida de dados
 System.out.print("a area do quadrado é " + area);}


}
