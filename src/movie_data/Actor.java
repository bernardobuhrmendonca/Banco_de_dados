package movie_data;

public class Actor {
    //Atributos:

    private int id;
    private String first_name;
    private String last_name;
    private String gender;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Construtor:

    public Actor(int id, String first_name, String last_name, String gender) {
        setId(id);
        setFirst_name(first_name);
        setLast_name(last_name);
        setGender(gender);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Setters:

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Getters:

    public int getId() {
        return this.id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public String getGender() {
        return this.gender;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //To String:

    @Override
    public String toString() {
        return super.toString();
    }
}
