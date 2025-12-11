/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.pi;

/**
 *
 * @author kauane
 */ import java.util.Scanner;
public class Exercicio_5 {
public static void main(String[] args) {
 Scanner sc  = new Scanner(System.in);
 
 String  senhaCerta = "java2025";
 int tentativas = 0;
 
 
 do {
     System.out.print("digite sua senha: ");
    String senhaDigitada = sc.nextLine();
    tentativas++;
    
    if (senhaDigitada.equals(senhaCerta)) {
        System.out.println("login bem sucessido!");   
        return;
        
    } else 
    {
        System.out.println("senha incorreta, tentativa" + tentativas + "de 3");
    }
 }while (tentativas <3);
    System.out.println("conta bloqueada, tente mais tarde");
 }
    }





