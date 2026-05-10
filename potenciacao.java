//exemplo1 

public class potenciacao {
    public static void imprimirIterativo(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        imprimirIterativo(5);
    }
}

//exemplo1
public class recursividade {
    public static void imprimirRecursivo(int n) {
        if (n == 0) { // caso base
            System.out.println(0);
        } else {
            imprimirRecursivo(n - 1); // chamada recursiva
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        imprimirRecursivo(5);
    }
}