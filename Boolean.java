/*O objetivo desta atividade é criar um programa que calcula o preço de um ingresso de cinema com
base na idade do cliente e no dia da semana. Isso exige o uso de múltiplas condições e a aplicação
de regras específicas.
Desafio Extra
Para um desafio adicional e para aprofundar a compreensão das condicionais, adicione a seguinte
funcionalidade:
• Se o cliente for um estudante, ele tem um desconto adicional de 15% sobre o preço final.
• Exceção: O desconto de estudante não se aplica às quartas-feiras, já que o preço já é
promocional.
Para isso, você pode:
1. Adicionar uma variável boolean ehEstudante.
2. Perguntar ao usuário se ele é estudante (ex: "sim" ou "nao") e atribuir true ou false à
variável.
3. Dentro do switch-case (ou logo após, mas antes de imprimir o preço final), use uma
estrutura if para aplicar o desconto de estudante, desde que o dia não seja quarta-feira.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kauane
 */import java.util.Scanner;
public class Exercicio_api1 {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);     
   
   System.out.println("digite sua idade:");
   int idade = sc.nextInt();
   sc.nextLine();

   System.out.println("digite o dia da semana:");
    String dia = sc.nextLine().toLowerCase();
    
    double precoBase;
    if (idade <= 12) {
    precoBase = 15 ;
    } else if (idade <= 17) {
      precoBase = 20 ;  
    } else if (idade <= 59 ) {
         precoBase = 30 ;  
    } else {
          precoBase = 18 ; 
    }
   
    double precoFinal;
    switch (dia) {
     case "segunda" :
    precoFinal = precoBase * 0.9;
    break;
    
     case "quarta":
     precoFinal = 10;
     break;
     default:
         
    precoFinal = precoBase;
    break; 
    
    }
    System.out.println("voce e estudante ? (sim/nao): ");
    String respostaEstudante = sc.nextLine().toLowerCase();
    boolean ehEstudante = respostaEstudante.equals("sim");
    
    if (ehEstudante && !dia.equals("quarta")){
        precoFinal = precoFinal * 0.85;
 }
    System.out.println("o preco do ingresso e R$" +  precoFinal);
    
   
   
    }
}
