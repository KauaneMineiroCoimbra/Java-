/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula6funcoes;
import java.util.Scanner;


public class Aula6Funcoes {

static int obterNumero() {
    System.out.println(">>> obter numero>>>");
Scanner input = new Scanner (System.in);
    System.out.println("numero: " );

 int n = input.nextInt();
 return n ;
}

static void imprimir(int menor){
 System.out.println(">>> imprimir >>>");
    System.out.println("menor: " + menor);
}





    //especificao da funcao

   static int minimo (int n1, int n2) {
 System.out.println(">>> minimo >>>");
    int menor = 0;
    if (n1<n2){
        menor = n1;
       
    } else {
    menor = n2;
        
    }
    return menor;
   }


//teste do programa
public static void main(String [] args) {
int x= obterNumero();
int y= obterNumero();
 //int menor = minimo(x, y);
 //imprimir (menor);
imprimir(minimo(y, y));
}

}
