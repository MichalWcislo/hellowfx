package pl.michalwcislo.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainHelloFx extends Application {
    public MainHelloFx() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/HelloView.fxml"));
        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        System.out.println("Start");
        stage.setTitle("Application window");
        stage.show();
    }

    @Override
    public void init() {
        System.out.println("Init");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}