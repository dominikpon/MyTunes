package dk.easv.cs5.mytunes.be;

public class Playlist {
    private int id;
    private String name;
    private String songs;
    private int duration;

    public Playlist(int id, String name, int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }
    public Playlist(String title){
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
