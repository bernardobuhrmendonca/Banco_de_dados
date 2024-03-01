package movie_data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Leitor actors = new Leitor("C:\\Users\\d22698\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\Área de Trabalho\\Documentos\\BANCO DE DADOS\\BANCO DE DADOS - Exercícios\\Ex01\\01-Arquivos CSV\\CSV\\actors.CSV",4);
        Leitor movies = new Leitor("C:\\Users\\d22698\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\Área de Trabalho\\Documentos\\BANCO DE DADOS\\BANCO DE DADOS - Exercícios\\Ex01\\01-Arquivos CSV\\CSV\\movies.CSV",4);
        Leitor role = new Leitor("C:\\Users\\d22698\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\Área de Trabalho\\Documentos\\BANCO DE DADOS\\BANCO DE DADOS - Exercícios\\Ex01\\01-Arquivos CSV\\CSV\\roles.CSV",3);

        actors.ler();
        movies.ler();
        role.ler();

        int digito;
        int digito2;
        System.out.println("Selecione uma das opções para qual a tabela de interesse:");
        System.out.println("1 - Atores \n2 - Filmes \n3 - Papéis");
        digito = teclado.nextInt();
        System.out.println();

        switch (digito) {
            case 1:
                for (int aux = 0; aux < actors.preenchimento.toArray().length; aux++){
                    int cont = 0;
                    cont++;
                    if (aux == 0 | aux % 4 == 0) {

                    } else if (aux==1 | (aux - 1) % 4 == 0) {

                    } else if (aux==2 | (aux - 2) % 4 == 0) {

                    } else {

                    }
                }
                break;
            case 2:
                for (int aux = 0; aux < movies.preenchimento.toArray().length; aux++){
                    int cont = 0;
                    cont++;
                    if (aux == 0 | aux % 4 == 0) {

                    } else if (aux==1 | (aux - 1) % 4 == 0) {

                    } else if (aux==2 | (aux - 2) % 4 == 0) {

                    } else {

                    }
                }
                break;
            case 3:
                for (int aux = 0; aux < role.preenchimento.toArray().length; aux++){
                    int cont = 0;
                    cont++;
                    if (aux == 0 | aux % 3 == 0) {

                    } else if (aux==1 | (aux - 1) % 3 == 0) {

                    } else {

                    }
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
