
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora Kauane Mineiro 
 */
//Aula 05- exercicio 01 
//exercicio 01-  qual o numero e maior
public class Estrutura_Condicionais_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        int n =sc.nextInt();
        if (n > 0) {
        System.out.println("Positivo");
        } else if (n < 0 ) {
         System.out.println("Negativo");
    } else {
            System.out.println("zero");
        }
       sc.close(); 
        
        
    }
   
}
