package dk.easv.cs5.mytunes.dal.DAOInterface;

import dk.easv.cs5.mytunes.be.Playlist;
import dk.easv.cs5.mytunes.be.Song;

public interface ISongDAO {
    public void save(Song song);
    public void edit(Song song);
    public void remove(int songId);
}
