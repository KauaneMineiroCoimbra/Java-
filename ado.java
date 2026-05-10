import java.util.Scanner;

public class RecursividadeADO {

    // ---------------- POTENCIA ----------------

    public static int potenciaRec(int b, int e) {
        if (e == 0) {
            return 1;
        }

        return b * potenciaRec(b, e - 1);
    }

    public static int potenciaIt(int b, int e) {
        int pot = 1;

        for (int i = 1; i <= e; i++) {
            pot *= b;
        }

        return pot;
    }

    // ---------------- SOMATORIO ----------------

    public static int somaRec(int x, int y) {

        if (x == y) {
            return y;
        }

        return x + somaRec(x + 1, y);
    }

    public static int somaIt(int x, int y) {

        int soma = 0;

        for (int i = x; i <= y; i++) {
            soma += i;
        }

        return soma;
    }

    // ------------ SOMA REAIS ----------------

    public static double somaReais(double x, double y) {

        if (x >= y) {
            return y;
        }

        return x + somaReais(x + 1, y);
    }

    // ------------ FATORIAL DUPLO ------------

    public static int fatorialDuplo(int n) {

        if (n <= 1) {
            return 1;
        }

        return n * fatorialDuplo(n - 2);
    }

    // ------------ FIBONACCI -----------------

    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void serieFibonacci(int limite) {

        for (int i = 0; i < limite; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();
    }

    // ---------------- MAIN ------------------

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int op;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Potencia Recursiva");
            System.out.println("2 - Potencia Iterativa");
            System.out.println("3 - Somatorio Recursivo");
            System.out.println("4 - Somatorio Iterativo");
            System.out.println("5 - Soma de Reais");
            System.out.println("6 - Fatorial Duplo");
            System.out.println("7 - Fibonacci");
            System.out.println("0 - Sair");

            op = entrada.nextInt();

            switch(op) {

                case 1:

                    System.out.print("Base: ");
                    int b1 = entrada.nextInt();

                    System.out.print("Expoente: ");
                    int e1 = entrada.nextInt();

                    System.out.println(
                        "Resultado = " +
                        potenciaRec(b1, e1)
                    );

                break;

                case 2:

                    System.out.print("Base: ");
                    int b2 = entrada.nextInt();

                    System.out.print("Expoente: ");
                    int e2 = entrada.nextInt();

                    System.out.println(
                        "Resultado = " +
                        potenciaIt(b2, e2)
                    );

                break;

                case 3:

                    System.out.print("X: ");
                    int x1 = entrada.nextInt();

                    System.out.print("Y: ");
                    int y1 = entrada.nextInt();

                    System.out.println(
                        "Resultado = " +
                        somaRec(x1, y1)
                    );

                break;

                case 4:

                    System.out.print("X: ");
                    int x2 = entrada.nextInt();

                    System.out.print("Y: ");
                    int y2 = entrada.nextInt();

                    System.out.println(
                        "Resultado = " +
                        somaIt(x2, y2)
                    );

                break;

                case 5:

                    System.out.print("X: ");
                    double r1 = entrada.nextDouble();

                    System.out.print("Y: ");
                    double r2 = entrada.nextDouble();

                    System.out.println(
                        "Resultado = " +
                        somaReais(r1, r2)
                    );

                break;

                case 6:

                    System.out.print("Numero: ");
                    int n = entrada.nextInt();

                    System.out.println(
                        "Fatorial Duplo = " +
                        fatorialDuplo(n)
                    );

                break;

                case 7:

                    System.out.print("Limite: ");
                    int limite = entrada.nextInt();

                    serieFibonacci(limite);

                break;

                case 0:
                    System.out.println("Programa encerrado.");
                break;

                default:
                    System.out.println("Opcao invalida!");

            }

        } while(op != 0);

        entrada.close();
    }
}
