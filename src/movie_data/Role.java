package movie_data;

public class Role {
    //Atributos:
    private int actorId;
    private int movieId;
    private String role;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Construtor:

    public Role(int actorId, int movieId, String role) {
        setActorld(actorId);
        setMovieId(movieId);
        setRole(role);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Setters:

    public void setActorld(int actorId) {
        this.actorId = actorId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Getters:

    public int getActorId() {
        return actorId;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getRole() {
        return role;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //To String:

    @Override
    public String toString() {
        return super.toString();
    }
}
