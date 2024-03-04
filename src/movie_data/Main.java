package movie_data;

public class Main {

    public static void main(String[] args) {

        Leitor actors;
        actors = new Leitor("C:\\Users\\d22698\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\Área de Trabalho\\Documentos\\BANCO DE DADOS\\BANCO DE DADOS - Exercícios\\Ex01\\01-Arquivos CSV\\CSV\\actors.CSV");
        Leitor movies;
        movies = new Leitor("C:\\Users\\d22698\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\Área de Trabalho\\Documentos\\BANCO DE DADOS\\BANCO DE DADOS - Exercícios\\Ex01\\01-Arquivos CSV\\CSV\\movies.CSV");
        Leitor role;
        role = new Leitor("C:\\Users\\d22698\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\Área de Trabalho\\Documentos\\BANCO DE DADOS\\BANCO DE DADOS - Exercícios\\Ex01\\01-Arquivos CSV\\CSV\\roles.CSV");

        actors.ler();
        movies.ler();
        role.ler();

        Actor[] lista;
        lista = new Actor[(actors.preenchimento.toArray().length) / 4];
        Movie[] lista2;
        lista2 = new Movie[(movies.preenchimento.toArray().length) / 4];
        Role[] lista3;
        lista3 = new Role[(role.preenchimento.toArray().length) / 4];

        for (Actor item : lista) {
            for (int aux = 0; aux < lista.length; aux++) {
                if (aux == 0 | aux % 4 == 0) {
                    //id
                    lista[aux].setId(Integer.parseInt(actors.preenchimento.get(aux)));
                } else if (aux == 1 | (aux - 1) % 4 == 0) {
                    //nome
                    lista[aux].setFirst_name(actors.preenchimento.get(aux));
                } else if (aux == 2 | (aux - 2) % 4 == 0) {
                    //sobrenome
                    lista[aux].setLast_name(actors.preenchimento.get(aux));
                } else {
                    //genero
                    lista[aux].setGender(actors.preenchimento.get(aux));
                }
            }
        }
        for (Movie item : lista2) {
            for (int aux = 0; aux < lista2.length; aux++) {
                if (aux == 0 | aux % 4 == 0) {
                    //id
                    item.setId(Integer.parseInt(movies.preenchimento.get(aux)));
                } else if (aux == 1 | (aux - 1) % 4 == 0) {
                    //nome
                    item.setName(movies.preenchimento.get(aux));
                } else if (aux == 2 | (aux - 2) % 4 == 0) {
                    //ano
                    item.setYear(Integer.parseInt(movies.preenchimento.get(aux)));
                } else {
                    //rank
                    item.setRank(Double.parseDouble(movies.preenchimento.get(aux)));
                }
            }
        }
        for (Role item : lista3) {
            for (int aux = 0; aux < lista3.length; aux++) {
                if (aux == 0 | aux % 3 == 0) {
                    //ator id
                    item.setActorld(Integer.parseInt(role.preenchimento.get(aux)));
                } else if (aux == 1 | (aux - 1) % 3 == 0) {
                    //filme id
                    item.setMovieId(Integer.parseInt(role.preenchimento.get(aux)));
                } else {
                    //papel
                    item.setRole(role.preenchimento.get(aux));
                }
            }
        }

        System.out.println("Questão 1:");
        System.out.println("=========================================================================================");
        System.out.println("first_name   last_name");

        for (Actor actor : lista) {
            if (actor.getGender().equalsIgnoreCase("F")) {
                System.out.print(actor.getFirst_name() + "    ");
                System.out.println(actor.getLast_name());
                System.out.println();
            }
        }

        System.out.println();

        System.out.println("Questão 2:");
        System.out.println("=========================================================================================");
        System.out.println("movie_name");

        for (Movie movie : lista2) {
            if (movie.getYear() > 1999) {
                System.out.println(movie.getName());
            }
        }

        System.out.println();

        System.out.println("Questão 3:");
        System.out.println("=========================================================================================");
        System.out.println("movie_name   role   actor_first_name   actor_last_name");

        for (Movie movie : lista2) {
            if (movie.getRank() > 6) {
                System.out.print(movie.getName() + "   ");
                for (Role value : lista3) {
                    if (value.getMovieId() == movie.getId()) {
                        System.out.print(role + "   ");
                        for (Actor actor : lista) {
                            if (actor.getId() == value.getActorId()){
                                System.out.print(actor.getFirst_name());
                                System.out.println(actor.getLast_name());
                            }
                        }
                    }
                }
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}
