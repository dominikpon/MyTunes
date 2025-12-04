package dk.easv.cs5.mytunes.dal.DAOInterface;

import dk.easv.cs5.mytunes.be.Playlist;

public interface IPlaylistDAO  {

    public void save(Playlist playlist);
    public void edit(Playlist playlist);
    public void remove(int playlistId);

    public void saveSong(int songId, int playlistId);

    public void deleteSong(int songId, int playlistId);

    public void moveSong(int songId, int playlistId);


}
