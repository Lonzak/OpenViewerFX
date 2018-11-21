package org.jpedal;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.jpedal.examples.viewer.OpenViewerFX;

public class ExampleApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple OpenViewerFX Test application");

        StackPane root = new StackPane();
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();

        String filePath = new File("").getAbsolutePath() + "/src/test/resources/" + "OpenFXViewerGUI.xml";

        OpenViewerFX viewer = new OpenViewerFX(root, filePath);
        viewer.setupViewer();

    }
}