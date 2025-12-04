package dk.easv.cs5.mytunes.gui;

import dk.easv.cs5.mytunes.be.Song;
import dk.easv.cs5.mytunes.bll.ILogic;
import dk.easv.cs5.mytunes.bll.Logic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SongEditController {

    @FXML private TextField txtTitle;
    @FXML private TextField txtArtist;
    @FXML private ComboBox comboGenre;
    @FXML private TextField txtDuration;
    @FXML private TextField txtPath;
    @FXML private Button btnChoosePath;



    @FXML
    private Button btnSave;
    @FXML
    private Button btnCancel;

    @FXML
    private void onCancelButton(ActionEvent actionEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }
    @FXML
    private void onSaveButton(ActionEvent actionEvent) throws IOException {
        String title = txtTitle.getText().trim();

        ILogic logic = new Logic();
        Song song = new Song(title);

        logic.createSong(song);
    }
}
