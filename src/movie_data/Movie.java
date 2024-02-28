package movie_data;

public class Movie {
    //Atributos:
    private int id;
    private String name;
    private int year;
    private double rank;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Construtores:

    public Movie() {

    }
    public Movie(int id, String name, int year, double rank){

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Setters:

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Getters:

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getRank() {
        return rank;
    }
}
