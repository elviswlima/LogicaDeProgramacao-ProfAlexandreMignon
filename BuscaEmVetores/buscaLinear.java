package BuscaEmVetores;

public class buscaLinear {
    public static void main(String[] args) {
        int numBusca = 23;
        int[] v = {9, 7, 23, 3, 55, 10};
        int resultado = buscaLinearInt(v, numBusca);
        if(resultado < 0) {
            System.out.println("Número não encontrado");
        } else {
            System.out.printf("O número %d foi encontrado no vetor[%d]", numBusca, resultado);
        }
    }
    
    public static int buscaLinearInt(int v[], int x) {
        for(int i = 0; i < v.length; i++) {
            if(v[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
