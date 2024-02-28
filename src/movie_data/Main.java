package movie_data;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Leitor actors = new Leitor("C:\\Users\\d22698\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\Área de Trabalho\\Documentos\\BANCO DE DADOS\\BANCO DE DADOS - Exercícios\\Ex01\\01-Arquivos CSV\\CSV\\actors.CSV",4);
        Leitor movies = new Leitor("C:\\Users\\d22698\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\Área de Trabalho\\Documentos\\BANCO DE DADOS\\BANCO DE DADOS - Exercícios\\Ex01\\01-Arquivos CSV\\CSV\\movies.CSV",4);
        Leitor role = new Leitor("C:\\Users\\d22698\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\Área de Trabalho\\Documentos\\BANCO DE DADOS\\BANCO DE DADOS - Exercícios\\Ex01\\01-Arquivos CSV\\CSV\\roles.CSV",3);

        List<String> actorsA = new ArrayList<>();
        String[] actorsV = new String[3];
        actorsA.addAll(Arrays.asList(actorsV));

        List<String> moviesA = new ArrayList<>();
        String[] moviesV = new String[3];
        moviesA.addAll(Arrays.asList(moviesV));

        List<String> roleA = new ArrayList<>();
        String[] roleV = new String[3];
        roleA.addAll(Arrays.asList(roleV));


    }
}
