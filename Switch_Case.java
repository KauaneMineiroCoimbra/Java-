/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3_condicionais;

/**
 *
 * @author kauane.mcoimbra
 */
import java.util.Scanner;

public class exercicio1_switch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("***media***");
        System.out.println("qual a primeira nota?");
        int N1 = entrada.nextDouble();
        System.out.println("qual a segunda nota?");
        int N2 = entrada.nextDouble();
        System.out.println("qual  aterceira nota?");
        int N3 = entrada.nextDouble();

        double media = (N1 + N2 + N3) / 3;

        String conceito = "A";

        if ((10 <= media) && (media >= 9)) {
            conceito = "A";
        } else if ((9 <= media) && (media >= 8)) {
            conceito = "B";
        } else if ((8 <= media) && (media >= 7)) {
            conceito = "C";
        } else if ((7 <= media) && (media >= 6)) {
            conceito = "D";
        } else if (media < 6) {

            conceito = "E";
       
        }
    }
}

switch (conceito) {

        case "A":

            break;
        case "B":

            System.out.println("bem feito");
            break;
        case "C":
            System.out.println("bom");
            break;
        case "D":
            System.out.println("regular");
            break;
        case "E":
            System.out.println("ruim");
            break;
        default:
            System.out.println("conceito invalido");
    }
  
}
}
