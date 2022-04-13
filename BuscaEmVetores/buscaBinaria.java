package BuscaEmVetores;

public class buscaBinaria {
    public static void main(String[] args) {
        int numBusca = 17;
        int[] vetor = {32, 17, 51, 8, 23};
        int resultado = buscaBinaria(vetor, numBusca);
        System.out.println(resultado);
        if(resultado < 0) {
        System.out.println("Número não econtrado.");
        } else {
            System.out.printf("O número %d foi encontrado no vetor[%d]", numBusca, resultado);
        }
    }
    
    public static int buscaBinaria(int v[], int x) {
        int i = 0;
        int f = v.length-1; 
        int m;
        while (i <= f) {
          m = (i + f) / 2;
          if (v[m] == x)
            return m;
          if (x < v[m]) // esquerda
            f = m - 1;
          else // x > v[m] - direita
            i = m + 1; 
        }
        return -1; 
      }
}
