import java.util.Scanner;

public class Laboratorio {

    // part.1

    // Funcao p calcular o diâmetro
    public static double getDiametro(double comprimento) {
        return comprimento / 3.14;
    }

    // Função p calcular o raio
    public static double getRaio(double diametro) {
        return diametro / 2;
    }

    // Função p calcular a área
    public static double getArea(double raio) {
        return raio * raio * 3.14;
    }

    // part.2

    // Funcao p calcular o tempo de queda
    public static double calcularTempoQueda(double altura) {
        double g = 9.8; // gravidade
        return Math.sqrt((2 * altura) / g);
    }

    // Função para calcular fatorial
    public static int calcularFatorial(int numero) {
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    // main

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // part.1
        System.out.print("Digite o comprimento do círculo: ");
        double comprimento = scanner.nextDouble();

        double diametro = getDiametro(comprimento);
        double raio = getRaio(diametro);
        double area = getArea(raio);

        System.out.println("\n--- Resultados do Círculo ---");
        System.out.println("Diâmetro: " + diametro);
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area);

        // part.2

        // Tempo de queda
        System.out.print("\nDigite a altura (em metros) para calcular o tempo de queda: ");
        double altura = scanner.nextDouble();

        double tempo = calcularTempoQueda(altura);
        System.out.println("Tempo de queda: " + tempo + " segundos");

        // Fatorial
        System.out.print("\nDigite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = calcularFatorial(numero);
        System.out.println("Fatorial: " + fatorial);

        scanner.close();
    }
}