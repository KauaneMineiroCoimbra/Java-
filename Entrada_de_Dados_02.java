
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora Kauane Mineiro 
 */
//Aula 4 - Entrada de dados
//Exercicio 2 - declarar scanner 
public class Entrada_de_Dados_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: ");
      int idade = 18;
     if (idade<18) {
        System.out.println("Faltam "+ (18 - idade)+ "anos para 18");
    } else {
     System.out.println("Já tem 18 anos ou mais");
    }
        
    }
 
}
