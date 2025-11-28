package dk.easv.cs5.mytunes.dal.DAOInterface;

import dk.easv.cs5.mytunes.be.Playlist;

public interface IPlaylistDAO extends IEntityDAO<Playlist> {
    void remove(Playlist entity);

    public void saveSong(int songId, int playlistId);

    public void deleteSong(int songId, int playlistId);

    public void moveSong(int songId, int playlistId);


}
