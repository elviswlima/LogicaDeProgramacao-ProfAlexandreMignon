package Recursividade;

public class recursividade {
    public static void main(String[] args) {
        int n = 5;
        int resultado = fatorial(n);
        int resultado2 = fatorial(n);
        System.out.println("O resultado é " + resultado);
        System.out.println("O resultado é " + resultado2);
    }

    public static int fatorial (int n) {
        // base da recursão (condição de parada)
        if (n == 0)
        return 1;
        else
        return n * fatorial(n-1);
    }

    public static int fatorial2 (int n) {
        int fat = 1;
        for (int termo = 1; termo <= n; termo++) {
            fat = fat * termo;
        }
        return fat;
    }
}