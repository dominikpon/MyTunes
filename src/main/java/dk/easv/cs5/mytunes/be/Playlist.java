package dk.easv.cs5.mytunes.be;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private int id;
    private String name;
    private int duration;
    private List<Song> songList = new ArrayList<Song>();

    public Playlist(int id, String name) {
        this.id = id;
        this.name = name;
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
