/** fazer um algoritmo que leia dois numeros
imprima na tela o produto
multiplicacao de dois numeros
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora kauane
 */import java.util.Scanner;
public class Exercicio_1 {
public static void main (String [] args){ 
    
 Scanner entrada = new Scanner (System.in);
 
 //fazer um algoritmo que leia dois numeros e imprima o produto (multiplicação
 //de dois numeros)
 //1|receber dois numeros 
 
 // pedir 1, receber 1, pedir 2, receber 2.
  //2|multiplicar
 //3|colocar o resultado para o usuario 
 
 //entrada de dados
  float n1, n2, produto ;
  System.out.println("multiplicacao");
  System.out.println("Qual o primeiro numero?");
  
   //processamento
  n1 = entrada.nextFloat();
  System.out.println("Qual e o segundo numero?");
   n2 = entrada.nextFloat(); 
   
   //saida de dados
   produto = n1*n2;
   System.out.println("o resultado da multiplicacao é" + produto);}
      
}
