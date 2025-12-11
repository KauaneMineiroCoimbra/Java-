/*Escreva um programa que leia o número de cadastro de um funcionário,
seu número de horas trabalhadas, 
o valor que recebe por hora
e calcula o salário desse funcionário.
 mostrar na tela o número, salário 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora kauane
 */import java.util.Scanner;
public class Exercicio_9 {
  
 public static void main (String [] args){   
 Scanner entrada = new Scanner (System.in);  
 
 //declaração de variaveis
 int numero;
 double valorHora, salario, Horas;
 
 //entrada de dados 
 System.out.print("Digite o número do funcionário:");
 numero = entrada.nextInt();
 System.out.print("Digite o horas do funcionário: ");
 Horas = entrada.nextInt();
 System.out.print("Digite o valor por Hora: ");
 valorHora = entrada.nextInt();
 
//processamento 
 salario = Horas * valorHora;
 
//saida de dados
System.out.println("Número do funcionário = " + numero);
System.out.println("salario = R$" +salario); }
 
 

//fim
 
 
}
