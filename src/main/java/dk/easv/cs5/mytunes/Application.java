package dk.easv.cs5.mytunes;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("gui/MainWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("MyTunes");
        stage.setScene(scene);
        stage.show();
    }
}
