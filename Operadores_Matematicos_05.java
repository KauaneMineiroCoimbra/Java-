/*Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:  
a) a área do triângulo retângulo que tem A por base e C por altura.  
b) a área do círculo de raio C. (π = 3.14159)  
c) a área do trapézio que tem A e B por bases e C por altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lados A e B. 
f) o perímetro do retângulo que tem lados A e B. 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authora kauane
 */import java.util.Scanner;
public class Exercicio_6 {
 public static void main (String [] args){   
 Scanner entrada = new Scanner (System.in);  
 
 //declaração de variaveis
 double A, B, C;
 double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo,areaPerimetro;
 final double PI= 3.14159;
 
//entrada de dados
System.out.print("Digite A:");
A = entrada.nextDouble();
System.out.print("Digite B:");
B = entrada.nextDouble(); 
System.out.print("Digite C:");
C = entrada.nextDouble();
 
//processamento
areaTriangulo = (A * C) / 2.0;
areaCirculo = PI * (C * C);
areaTrapezio = ((A + B) * C) / 2.0;
areaQuadrado = B * B;
areaRetangulo = A * B; 
areaPerimetro = 2 * (A + B);

//saida de dados
System.out.println("Área do triângulo = " + areaTriangulo);
System.out.println("Área do Circulo = " + areaCirculo);
System.out.println("Área do Trapezio = " + areaTrapezio);
System.out.println("Área do Trapezio = " + areaTrapezio);
System.out.println("Área do Quadrado = " + areaQuadrado);
System.out.println("Área do Retangulo = " + areaRetangulo);
System.out.println("Área do Perimetro = " + areaPerimetro);}
 





 
 

 }
