package dk.easv.cs5.mytunes.dal.DAO;

import dk.easv.cs5.mytunes.be.Playlist;
import dk.easv.cs5.mytunes.dal.ConnectionManager;
import dk.easv.cs5.mytunes.dal.DAOInterface.IPlaylistDAO;

public class PlaylistDAO implements IPlaylistDAO {
    private ConnectionManager con =  new ConnectionManager();


    @Override
    public void save(Playlist entity) {


    }

    @Override
    public void edit(Playlist entity) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void remove(Playlist entity){        // helper

    }



    @Override
    public void saveSong(int songId, int playlistId) {

    }

    @Override
    public void deleteSong(int songId, int playlistId) {

    }

    @Override
    public void moveSong(int songId, int playlistId) {


    }
}
