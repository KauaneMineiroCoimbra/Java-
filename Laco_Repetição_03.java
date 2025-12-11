/*2. Contagem Regressiva Interativa (Foco no while e do-while)
Crie um programa que simule uma contagem regressiva para o lançamento de um
foguete, mas com uma confirmação de segurança.
• Requisito 1 (Contagem): Use o laço while para realizar a contagem regressiva
de 10 até 1. A cada número, exiba "Contagem: [Número]". Ao chegar em zero,
exiba "Lançamento!".
• Requisito 2 (Confirmação): Antes de iniciar a contagem, use o laço do-while
para solicitar ao usuário que digite a palavra de segurança "PRONTO" (em letras
maiúsculas). O programa deve continuar solicitando a palavra até que a entrada
seja exatamente "PRONTO".

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.pi;

/**fazer contagem regressiva, ter as palavras contagem e pronto
 * e exiba o lançamento, dar entrada a saida.
 *
 * @author kauane
 */ import java.util.Scanner;
public class Exercicio_2 {
 public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);


  String palavra;
   do{
 System.out.println("digite ---pronto--- para iniciar a contagem :  ");
  palavra = sc.nextLine();
  }
  
  while (!palavra.equals("pronto")); 
   int i = 10;
  
   while (i >= 1) {
   System.out.println(" contagem: " + i);
   i--;
   }
     System.out.println("lancamento");
     
     
 }
  }
  
    
    
    
   
    


    

