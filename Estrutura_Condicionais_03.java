/*Fazer um algoritmo que lê um número
 se ele é negativo, Se for negativo, imprimir na tela a 
mensagem "Numero negativo".
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora kauane 
 */import java.util.Scanner;
   public class  Exercicio_11 {
  public static void main (String[] args){   
 Scanner sc = new Scanner(System.in);  
 
//declaracao de variaveis
double N;

//entrada de dados 
System.out.println("digite um numero:");
 N = sc.nextDouble();


//processamento
if( N < 0 ){
    
 //saida de dados
 System.out.println("numero negativo");
} else {
 System.out.println("numero nao é negativo"); }
 

}
       
//fim
       
       
   

