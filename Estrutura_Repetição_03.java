/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.pi;

/**
 *
 * @author kauane
 */ import java.util.Scanner;
public class Exercicio_4 {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 
 System.out.print("digite um numero de linhas de triangulo:");
int N =  sc.nextInt();

for ( int i= 1; i<= N; i++){
for (int j = 1; j<=i; j++){
    System.out.print("*");
}   
}
    System.out.println( );
}
  
}
