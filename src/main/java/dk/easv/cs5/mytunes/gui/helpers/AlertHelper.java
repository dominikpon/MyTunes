package dk.easv.cs5.mytunes.gui.helpers;

import javafx.scene.control.Alert;

public class AlertHelper {
    public static void showWarning(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
