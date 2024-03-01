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

        Actor[] lista = new Actor[actors.preenchimento.toArray().length];
        Movie[] lista2 = new Movie[movies.preenchimento.toArray().length];
        Role[] lista3 = new Role[role.preenchimento.toArray().length];


        for (int aux2 = 0; aux2 < (actors.preenchimento.toArray().length)/3; aux2++){
            for (int aux = 0; aux < actors.preenchimento.toArray().length; aux++){
                if (aux == 0 | aux % 4 == 0) {
                    //id
                    lista[aux2].setId(Integer.parseInt(actors.preenchimento.get(aux)));
                } else if (aux==1 | (aux - 1) % 4 == 0) {
                    //nome
                    lista[aux2].setFirst_name(actors.preenchimento.get(aux));
                } else if (aux==2 | (aux - 2) % 4 == 0) {
                    //sobrenome
                    lista[aux2].setLast_name(actors.preenchimento.get(aux));
                } else {
                    //genero
                    lista[aux2].setGender(actors.preenchimento.get(aux));
                }
            }
        }
        for (int aux2 = 0; aux2 < (movies.preenchimento.toArray().length / 3); aux2++) {
            for (int aux = 0; aux < movies.preenchimento.toArray().length; aux++){
                if (aux == 0 | aux % 4 == 0) {
                    //id
                    lista2[aux2].setId(Integer.parseInt(movies.preenchimento.get(aux)));
                } else if (aux==1 | (aux - 1) % 4 == 0) {
                    //nome
                    lista2[aux2].setName(movies.preenchimento.get(aux));
                } else if (aux==2 | (aux - 2) % 4 == 0) {
                    //ano
                    lista2[aux2].setYear(Integer.parseInt(movies.preenchimento.get(aux)));
                } else {
                    //rank
                    lista2[aux2].setRank(Double.parseDouble(movies.preenchimento.get(aux)));
                }
            }
        }
        for (int aux2 = 0; aux2 < (role.preenchimento.toArray().length / 3); aux2++) {
            for (int aux = 0; aux < role.preenchimento.toArray().length; aux++){
                if (aux == 0 | aux % 3 == 0) {
                    //ator id
                    lista3[aux2].setActorld(Integer.parseInt(role.preenchimento.get(aux)));
                } else if (aux==1 | (aux - 1) % 3 == 0) {
                    //filme id
                    lista3[aux2].setMovieId(Integer.parseInt(role.preenchimento.get(aux)));
                } else {
                    //papel
                    lista3[aux2].setRole(role.preenchimento.get(aux));
                }
            }
        }

        //Pesquisa

    }
}
