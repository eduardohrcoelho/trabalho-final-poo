package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeArquivos {
    
    // Método que recebe o nome do arquivo (ex: "clientes.txt") e o texto a ser salvo
    public static void salvar(String nomeArquivo, String conteudo){
        // Define o arquivo
        File arquivo = new File(nomeArquivo);

        try{
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(conteudo);
            bw.newLine();
            bw.flush();
            bw.close();

            System.out.println("Conteúdo inserido!");
        }catch(IOException e){
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        
    }

    // Método para ler todas as linhas do arquivo e devolver uma lista de String
    public static List<String> ler(String nomeArquivo){
        List<String> linhas = new ArrayList<>();
        File arquivo = new File(nomeArquivo);

        // Se o arquivo não existe, devolve lista vazia
        if(!arquivo.exists()){return linhas;}

        try{
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            String linha;

            // Enquanto tiver linha para ler (não for nulo)
            while((linha = br.readLine()) != null){
                linhas.add(linha);
            }
        }catch(IOException e){
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return linhas;
    }

    public static void main(String[] args) {
        GerenciadorDeArquivos.salvar("teste.txt", "Eduardo Henrique");
        List<String> dados = GerenciadorDeArquivos.ler("teste.txt");

        for(String s : dados){
            System.out.println("Lido do arquivo: " + s);
        }
    }
}
