
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora Kauane Mineiro 
 */
//Aula 05- Exercicio 02
//Exercicio 02 - se o aluno esta de recuperação, aprovado, reprovado
    public class Estrutura_Condicionais_02 {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.println("(Nota 0-10): ");
     double nota = sc.nextDouble();
     if (nota >= 7.0 ) {
         System.out.println("Aprovado ");
     } else if (nota >= 5.0) {
         System.out.println("Recuperação ");
     } else {
         System.out.println("Reprovado ");
     }
      sc.close();
    }
 
}
