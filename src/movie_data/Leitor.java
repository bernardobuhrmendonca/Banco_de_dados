package movie_data;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leitor {
    private FileReader fileReader;
    private BufferedReader bufferedreader;
    private String caminhoArquivo;
    private int numeroColunas;
    List<String> preenchimento;

    public Leitor(String caminhoArquivo, int numeroColunas){
        setCaminhoArquivo(caminhoArquivo);
        setNumeroColunas(numeroColunas);
    }


    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void setNumeroColunas(int numeroColunas) {
        this.numeroColunas = numeroColunas;
    }

    public FileReader getFileReader() {
        return fileReader;
    }

    public BufferedReader getBufferedreader() {
        return bufferedreader;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public int getNnumeroColunas() {
        return numeroColunas;
    }

    public List<String> getPreenchimento() {
        return preenchimento;
    }

    public void ler() {
        try {
            fileReader = new FileReader(caminhoArquivo);
            bufferedreader = new BufferedReader(fileReader);
            List<String> linhas = new ArrayList<>();
            String linha;
            preenchimento = new ArrayList<>();
            int cont = 0;

            while ((linha = bufferedreader.readLine()) != null){
                linhas.add(linha);
                String[] palavras = linhas.get(cont).split(";");
                preenchimento.addAll(Arrays.asList(palavras));
                cont++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (RuntimeException exception) {
            System.out.println("Erro de Runtime.");
        } catch (IOException ioException) {
            System.out.println("IOExcepition.");
        }
    }


}
