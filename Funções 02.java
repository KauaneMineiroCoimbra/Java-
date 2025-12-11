/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6funcoes;
import java.util.Scanner;
/**
 *
 * @author kauane.mcoimbra
 */ 
public class exemplo2 {
    //obter nota 
    // calcular media 
    //verificar status
    //imprimir
    
    
    
    static float obternota(){
    Scanner input = new Scanner(System.in);
    System.out.println("nota: ");
    float nota = input.nextInt();
    return nota;
    }
    
    static float calcularMedia (float n1, float n2, float n3) {
    float media = (n1+n2+n3) /3;
return media;

    }   
     static String verificaStatus(float media ) {
       String status;
         if (media>=6){
           return "aprovado";
       }  else {
             status = "reprovado";
      
         }
         return status;
         
     } 
     
    static void imprimirStatus (String status){
            System.out.println("status: " + status);
    } 
    
    public static void main(String[] args) {
        
     float n1= obternota();
     float n2= obternota();
     float n3= obternota();
        var media = calcularMedia(n1,n2,n3);
     String  status = verificaStatus(media);
     imprimirStatus (status);
    }
   }

    
