
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora Kauane Mineiro 
 */
//Aula 3 - Operadores Matematicos
//Exercicio 01 - Declarar int
//exercicio: Fazer soma, subtração, mult, divisão, resto.

    public class Operadores_Matematicos_01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a= 8;
    int b= 9;
    System.out.println(" O valor da soma e "  + (a+b));
    System.out.println("O valor da subtração e " + (a-b)); 
    System.out.println("O valor da multiplicação e " + (a*b));    
    System.out.println("O valor da divisão inteira e " + (a/b)); 
     System.out.println("O valor do resto e " + (a%b));    
    }
}
