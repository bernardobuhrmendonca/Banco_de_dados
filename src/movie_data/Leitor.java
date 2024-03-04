package movie_data;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leitor {
    private String caminhoArquivo;

    List<String> preenchimento;

    public Leitor(String caminhoArquivo){
        setCaminhoArquivo(caminhoArquivo);
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void ler() {
        try {
            FileReader fileReader = new FileReader(caminhoArquivo);
            BufferedReader bufferedreader = new BufferedReader(fileReader);
            List<String> linhas = new ArrayList<>();
            String linha;
            preenchimento = new ArrayList<>();
            int cont = 0;

            while ((linha = bufferedreader.readLine()) != null){
                linhas.add(linha);
                 if (cont > 0){
                    String[] palavras = linhas.get(cont).split(";");
                    preenchimento.addAll(Arrays.asList(palavras));
                }
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
