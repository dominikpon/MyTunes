package dk.easv.cs5.mytunes.gui;

import dk.easv.cs5.mytunes.Application;
import dk.easv.cs5.mytunes.be.Genre;
import dk.easv.cs5.mytunes.be.Playlist;
import dk.easv.cs5.mytunes.be.Song;
import dk.easv.cs5.mytunes.bll.ILogic;
import dk.easv.cs5.mytunes.bll.Logic;
import dk.easv.cs5.mytunes.bll.tools.FormattingTool;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {


    //Buttons


    //Table with songs
    @FXML private TableView<Song> songsTable; //<Song> to know that Table will consist of songs
    @FXML private TableColumn<Song, String> colTitle;      //Each column will consist of String from Song table
    @FXML private TableColumn<Song, String> colArtist;
    @FXML private TableColumn<Song, String> colGenre;
    @FXML private TableColumn<Song, String> colDuration;

    //Table with playlists
    @FXML private TableView<Playlist> playlistsTable;
    @FXML private TableColumn<Playlist, String> colPlaylistName;
    @FXML private TableColumn<Playlist, String> colPlaylistDuration;
    @FXML private TableColumn<Playlist, String> colPlaylistSongs;


    //Observable lists for manual refreshing of Lists
    private ObservableList<Song> songList = FXCollections.observableArrayList();
    private ObservableList<Playlist> playlistList = FXCollections.observableArrayList();

    private ILogic logic = new Logic();
    @FXML
    private void initialize(){



        //set columns for Songs table
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colArtist.setCellValueFactory(new PropertyValueFactory<>("artist"));
        colGenre.setCellValueFactory(new PropertyValueFactory<>("genre"));

        //format duration to mm:ss
        colDuration.setCellValueFactory(cellData ->{
            int seconds = cellData.getValue().getDuration();
            String formatted = FormattingTool.format(seconds);
                    return new ReadOnlyStringWrapper(formatted);
        });

        //set columns for Playlists table
        colPlaylistName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colPlaylistDuration.setCellValueFactory(cd ->
                new ReadOnlyStringWrapper(FormattingTool.format(cd.getValue().getDuration())));

        colPlaylistSongs.setCellValueFactory(new PropertyValueFactory<>("songs"));

        songsTable.setItems(songList);
        playlistsTable.setItems(playlistList);



        //Load songs from database
        songList.setAll(logic.getAllSongs());
        //Load playlists from database
        playlistList.setAll(logic.getAllPlaylists());

    }



    @FXML
    private void onNewSongButtonAction(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("gui/SongEditWindow.fxml"));
            Parent root = fxmlLoader.load();
            SongEditController controller = fxmlLoader.getController();
            controller.setSongList(songList);
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("New/Edit Song");
            stage.setScene(scene);
            stage.show();
        }
    @FXML
    private void onSearchButtonAction(ActionEvent actionEvent) {
    }
    @FXML
    private void onPreviousSongButtonAction(ActionEvent actionEvent) {
    }
    @FXML
    private void onPlayPauseButtonActtion(ActionEvent actionEvent) {
    }
    @FXML
    private void onNextSongButtonAction(ActionEvent actionEvent) {
    }
    @FXML
    private void onEditSongButtonAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("gui/SongEditWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle("New/Edit Song");
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    private void onDeleteSongAction(ActionEvent actionEvent) {
    }
    @FXML
    private void onUpButtonAction(ActionEvent actionEvent) {
    }
    @FXML
    private void onDownButtonAction(ActionEvent actionEvent) {
    }
    @FXML
    private void onDeleteSongInPlaylistAction(ActionEvent actionEvent) {
    }
    @FXML
    private void onNewButtonPlaylistAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("gui/PlaylistEditWindow.fxml"));
        Parent root = fxmlLoader.load();
        PlaylistEditController controller = fxmlLoader.getController();
        controller.setPlaylistList(playlistList);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle("New/Edit Playlist");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void onEditButtonPlaylistAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("gui/PlaylistEditWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle("New/Edit Song");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void onDeleteButtonPlaylistAction(ActionEvent actionEvent) {
    }
    @FXML
    private void onCloseButtonAction(ActionEvent actionEvent) {
        javafx.application.Platform.exit();
    }
}
