
//interativo 
public class exemplo2 {
    public static int fatorialIterativo(int n) {
        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat *= i;
        }

        return fat;
    }

    public static void main(String[] args) {
        System.out.println(fatorialIterativo(4));
    }
}

//recursivo
public class exemplo2 {

    public static int fatorial(int n) {

        if (n == 0) { // caso base
            return 1;
        }

        return n * fatorial(n - 1); // função recursiva
    }

    public static void main(String[] args) {
        System.out.println(fatorial(4));
    }
}

