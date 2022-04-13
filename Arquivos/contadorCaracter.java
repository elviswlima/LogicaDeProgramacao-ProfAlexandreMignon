package Arquivos;

import java.io.File; 
import java.util.Scanner;

public class contadorCaracter {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("caractere: ");
        char c = teclado.next().charAt(0);
        int qtde = 0;
        String linha;
        Scanner leitorArquivo = new Scanner(new File ("Arquivos/arquivo.txt"));
        while(leitorArquivo.hasNextLine()) {
            linha = leitorArquivo.nextLine();
            qtde += contaCaractere(linha, c);
        }
        System.out.printf("Quantidade de %c = %d", c, qtde);
    }
    
    public static int contaCaractere(String s, char c) throws Exception {
        int cont = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                cont++;
            }
        }
        return cont;
    }
}
