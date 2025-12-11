
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora Kauane Mineiro
 */
//Aula 4 - entrada de dados
//Exercicio 01 - declarar scanner 
public class Entrada_de_Dados_01 {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + "!");  
        sc.close(); //fim
    }
}
