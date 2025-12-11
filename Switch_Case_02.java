/*Crie um programa que, dado o número de um mês, determine a estação do ano correspondente no
hemisfério sul.
Regras de Estações (simplificadas para o hemisfério sul):
• Verão: Dezembro (12), Janeiro (1), Fevereiro (2)
• Outono: Março (3), Abril (4), Maio (5)
• Inverno: Junho (6), Julho (7), Agosto (8)
• Primavera: Setembro (9), Outubro (10), Novembro (11)
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kauane
 */ import java.util.Scanner;
public class Exercicio_api3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("digite um numero do mes (1 a 12): ");
    int numeroDoMes = sc.nextInt();
    
    switch (numeroDoMes) {
    case 12:  case 1:  case 2:
     System.out.println(" o mes " + numeroDoMes + " e verao.");
     break;
     
     case 3:  case 4:  case 5:
     System.out.println(" o mes " + numeroDoMes + " e outono.");
     break;
     
     case 6:  case 7:   case 8:
     System.out.println(" o mes " + numeroDoMes + " e inverno.");
     break;
     
     case 9:  case 10:   case 11: 
     System.out.println(" o mes " + numeroDoMes + " e primavera.");
     break;
     default:
      
     System.out.println(" numero do mes invalido. ");
     break;
     
     
    }
    }
 
}
