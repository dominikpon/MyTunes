package dk.easv.cs5.mytunes.be;

public class Song {
    private int id;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private String filePath;

    public Song(int id, String title, String artist, String genre, int duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public String getGenre() {
        return genre;
    }
    public int getDuration() {
        return duration;
    }
    public String getDurationInSeconds() {  // Converting and formatting duration
        int minutes = duration / 60;
        int seconds = duration % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
    public String toString() {
        return "ID: "+id+" Title: "+title+" Artist: "+artist+" Genre: "+genre;
    }
}
