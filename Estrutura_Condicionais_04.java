/*Fazer um algoritmo que lê dois números inteiros
imprimir os números consecutivos desses números
 se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é
consecutivo de 2. –8 é consecutivo de –9)

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora kauane
*/import java.util.Scanner;

public class Exercicio_4 {
 public static void main (String [] args){   
 Scanner entrada = new Scanner (System.in);  
 
 
//declaração de variaveis
int a, b;


//entrada de dados
System.out.print("digite o primeiro numero");
a = entrada.nextInt();
System.out.println("digite o segundo numero");
b = entrada.nextInt();

//processamento 
 System.out.print("consecutivos:" + (a+1) + "e" + (b+1));}
 
 //saida de dados

 

 
 
 
 
}
