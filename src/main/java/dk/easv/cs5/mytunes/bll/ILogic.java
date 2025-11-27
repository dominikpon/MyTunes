package dk.easv.cs5.mytunes.bll;

import dk.easv.cs5.mytunes.be.Playlist;
import dk.easv.cs5.mytunes.be.Song;

public interface ILogic {
    public void createSong(Song song);
    public void deleteSong(Song song);
    public void editSong(Song song);

    public void createPlaylist(Playlist playlist);
    public void deletePlaylist(Playlist playlist);
    public void editPlaylist(Playlist playlist);

    public void addSongToPlaylist(Song song);
    public void removeSongFromPlaylist(Song song);
    public void moveSongInPlaylist(Song song);


}
