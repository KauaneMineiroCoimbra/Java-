/*Fazer um algoritmo que leia os dois lados A e B
1 triângulo retângulo e calcula a hipotenusa do triângulo. 
onsidere que ℎ𝑖𝑝𝑜𝑡𝑒𝑛𝑢𝑠𝑎 = √𝐴 2+𝐵 2 .
Dica:função matemática Math.sqrt(). 
Por ex, a raiz de 121 ficaria Math.sqrt(121)
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora kauane
 */import java.util.Scanner;
public class Exercicio_7 {
  public static void main (String [] args){   
 Scanner entrada = new Scanner (System.in);  
 
 //declaração de variaveis
  double A, B, hipotenusa;
  
  //entrada de dados 
  System.out.print("Digite o valor do cateto A:");
  A = entrada.nextDouble();
  System.out.print("Digite o valor do cateto B:");
  B = entrada.nextDouble();
  
  //processamento
  hipotenusa = Math.sqrt((A * A) + (B * B));
  
  //saida de dados
  System.out.println("hipotenusa = " + hipotenusa);}
  
 //fim
 
  
  
    
}