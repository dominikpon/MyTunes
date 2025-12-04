package dk.easv.cs5.mytunes.dal.DAO;

import dk.easv.cs5.mytunes.be.Song;
import dk.easv.cs5.mytunes.dal.ConnectionManager;
import dk.easv.cs5.mytunes.dal.DAOInterface.ISongDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SongDAO implements ISongDAO {

    @Override
    public void save(Song song) {
        String sql = "INSERT INTO Song (title) VALUES (?)";

        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString (1, song.getTitle());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void edit(Song song) {

    }

    @Override
    public void remove(int id) {

    }

}
