package Recursividade;

public class recursividadePotencia {
    public static void main(String[] args) {
        int base = 3;
        int expoente = 4;
        int resultado = potencia(base, expoente);
        System.out.println(resultado);
    }

    public static int potencia (int a, int n) {
        if (n == 0)
            return 1;
        else
            return a * potencia(a, n-1);
    }
}
