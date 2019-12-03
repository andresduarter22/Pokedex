package bo.upb.programacion3.codelabpokedex.model;

public class User {
    private String name;
    private String password;
    private int[] favorites;

    public User(String name, String pasword, int[] favorites) {
        this.name = name;
        this.password = pasword;
        this.favorites = favorites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasword() {
        return password;
    }

    public void setPasword(String pasword) {
        this.password = pasword;
    }

    public int[] getFavorites() {
        return favorites;
    }

    public void setFavorites(int[] favorites) {
        this.favorites = favorites;
    }
}
