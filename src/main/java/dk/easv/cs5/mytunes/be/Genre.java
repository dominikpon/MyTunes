package dk.easv.cs5.mytunes.be;

public class Genre {
    private int id;
    private String name;

    public Genre(String name) {
        this.id = 0; //placeholder for ID from DB
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void getName() {
        this.name = this.name;
    }
    public void setName(String name) {      //for future editing
        this.name = name;
    }

}
