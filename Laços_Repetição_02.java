/*Cenário:
Crie um programa que valide a segurança de uma senha com base em critérios de comprimento. O
programa deve solicitar ao usuário que digite uma senha e, em seguida, classificar sua segurança.
Regras de Classificação:
• Fraca: A senha tem menos de 6 caracteres.
• Normal: A senha tem entre 6 e 10 caracteres (inclusive).
• Forte: A senha tem mais de 10 caracteres.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kauane
 */import java.util.Scanner;
public class Exercicio_api2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    System.out.print("digite sua senha: ");
   String senha = sc.nextLine();

     
 if (senha.length() < 6) {
    System.out.println("a segurança da senha e: Fraca");
  } else if (senha.length() <= 10) {
    System.out.println("a segurança da senha e: Normal");
 } else {
    System.out.println("a segurança da senha e: Forte");
  }
   }
    
    
 
}
