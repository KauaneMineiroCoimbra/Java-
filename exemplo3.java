// Iterativo
public class exemplo3 {

    public static int potenciaIterativa(int base, int exp) {

        int pot = 1;

        for (int i = 1; i <= exp; i++) {
            pot *= base;
        }

        return pot;
    }

    public static void main(String[] args) {
        System.out.println(potenciaIterativa(2,4));
    }
}

//recursivo 
public class exemplo3 {

    public static int potencia(int b, int e) {

        if (e == 0) { // caso base
            return 1;
        }

        return b * potencia(b, e - 1);
    }

    public static void main(String[] args) {
        System.out.println(potencia(2,4));
    }
}