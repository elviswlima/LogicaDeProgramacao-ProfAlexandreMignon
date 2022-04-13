package Arquivos;

import java.io.FileReader; 
import java.io.BufferedReader;
public class lerArquivo {
    public static void main(String[] args) throws Exception {
        // declara o objeto FileReader e abre o arquivo
        FileReader arquivo = new FileReader("Arquivos/arquivo.txt");
        // cria um sistema e instancia um objeto para fazer a leitura bufferizada
        BufferedReader leBufferizado = new BufferedReader(arquivo);
        
        // lê e imprime a linha de arquivo
        String linha;
        while( (linha = leBufferizado.readLine()) != null) {
            System.out.println(linha);
        }
        
        leBufferizado.close();
    }
}
