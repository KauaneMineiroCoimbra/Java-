/*fazer um algoritmo que le dois numeros,
a base e o expoente 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kauane 
 */import java.util.Scanner;
public class Exercicio_2 {
public static void main (String [] args){   
 Scanner entrada = new Scanner (System.in);  
 
//declaração de variavel
  double base, expoente, resultado;
  
//entrada de dados
System.out.println("base: ");
base = entrada.nextDouble();
System.out.println("expoente: ");
expoente = entrada.nextDouble();


//processamento
resultado =Math.pow(base, expoente);

//saida de dados
System.out.println("resultado" + resultado);}
}

        

  

