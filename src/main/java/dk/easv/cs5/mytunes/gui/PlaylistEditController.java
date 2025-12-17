package dk.easv.cs5.mytunes.gui;

import dk.easv.cs5.mytunes.be.Playlist;
import dk.easv.cs5.mytunes.be.Song;
import dk.easv.cs5.mytunes.bll.ILogic;
import dk.easv.cs5.mytunes.bll.Logic;
import dk.easv.cs5.mytunes.gui.helpers.AlertHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;





public class PlaylistEditController {

    private ObservableList<Playlist> playlistList = FXCollections.observableArrayList();

    private Playlist playlistToEdit = null;
    private boolean editMode = false;

    public void setPlaylistList(ObservableList<Playlist> playlistList) {
        this.playlistList = playlistList;
    }

    public void setPlaylistToEdit(Playlist playlist) {
        this.playlistToEdit = playlist;
        if (playlist != null) {
            editMode = true;
            txtName.setText(playlistToEdit.getName());
        } else  {
            editMode = false;
            txtName.setText("");
        }
    }


    ILogic logic = new Logic();

    @FXML private TextField txtName;
    @FXML private Button btnSave;
    @FXML private Button btnCancel;

    public void initialize(){

    }

    @FXML
    private void onCancelButton(ActionEvent actionEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }
    @FXML
    private void onSaveButton(ActionEvent actionEvent) {
        String name = txtName.getText().trim();

        List<String> missingFields = new ArrayList();
        if(name.isEmpty()) missingFields.add("name");

        if(!missingFields.isEmpty()) {
            AlertHelper.showWarning("Missing Fields" + missingFields);
            return;
        }


        try {
            if(editMode) {
                // edit existing playlist
            playlistToEdit.setName(name);
            logic.editPlaylist(playlistToEdit);
            AlertHelper.showInfo("Playlist Updated");
                ObservableList<Playlist> temp = FXCollections.observableArrayList(playlistList); //create a copy of observable list to refresh it
                playlistList.setAll(temp);

            }
            else {
                // create new playlist
            Playlist playlist = new Playlist(name);
            logic.createPlaylist(playlist);
            playlistList.add(playlist);
            AlertHelper.showInfo("Playlist Created");
            }

            //close window after saving
            Stage stage = (Stage) btnSave.getScene().getWindow();
            stage.close();

        }catch (Exception e){
            AlertHelper.showError("Error");
            e.printStackTrace();
        }


    }
}
