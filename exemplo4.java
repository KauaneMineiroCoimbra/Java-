//interativo
public class exemplo4 {

    public static int somaIterativa(int x, int y) {

        int soma = 0;

        for (int i = x; i <= y; i++) {
            soma += i;
        }

        return soma;
    }

    public static void main(String[] args) {
        System.out.println(somaIterativa(1,5));
    }
}


//recursivo
public class exemplo4 {

    public static int soma(int x, int y) {

        if (x == y) { // caso base
            return y;
        }

        return x + soma(x + 1, y);
    }

    public static void main(String[] args) {
        System.out.println(soma(1,5));
    }
}

