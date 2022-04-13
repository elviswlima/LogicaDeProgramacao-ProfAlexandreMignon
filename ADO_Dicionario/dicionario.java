package ADO_Dicionario;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class dicionario {
    public static void main(String[] args) throws Exception {
		String[] dicionario = lerArquivo();
                int cont = 0;
                for(String d : dicionario) {
                    if(d != null) {
                        System.out.println(d);
                        cont++;
                    }
                }
                System.out.println("total de palavras diferentes no dicionario = " + cont);
	}
        
	public static String[] lerArquivo() throws FileNotFoundException {
		Scanner leitor = new Scanner(new File("ADO_Dicionario/Livro.txt"));
		String[] dicionario = new String[1000];

		while (leitor.hasNextLine()) {
			String[] valor = leitor.next().toLowerCase().split(" ");

			for (int i = 0; i < valor.length; i++) {
				dicionario = insereVetor(dicionario, valor[i]);
			}
		}

		return dicionario;
	}

	public static void ordenaValores(String[] v) {
		String aux = null;

		for (int i = 0; i < v.length - 1; i++) {
			for (int j = 0; j < v.length - i - 1; j++) {
				if (comparaPalavra(v[j], v[j + 1]) > 0) {
					aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}

	}

	public static String[] insereVetor(String[] vetor, String palavra) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == null && buscaBinaria(vetor, palavra) == -1) {
				vetor[i] = palavra;
				break;
                                }
			}
		ordenaValores(vetor);
		return vetor;
	}

	public static int buscaBinaria(String v[], String x) {
		int i = 0;
		int f = v.length - 1;
		int m;

		while (i <= f) {
			m = (i + f) / 2;

			if (v[m] == null) {
				v[m] = x;
			}

			if (comparaPalavra(v[m], x) == 0) {
				return m;
			}

			if (comparaPalavra(v[m], x) > 0) {
				f = m - 1;
			} else {
				i = m + 1;
			}
		}

		return -1;
	}

	public static int comparaPalavra(String chave, String valor) {
		return chave != null && valor != null ? chave.compareTo(valor) : -1;
	}
}
