package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class ThirdPageController {

        @FXML
        private Text text_field1;

        @FXML
        private Button Next_button;

        @FXML
        private Button next1;

        @FXML
        private Button next3;


        @FXML
        private Button next2;

    @FXML
    void initialize() throws IOException {
        Next_button.setOnAction(actionEvent -> {
            try {
                Controller.in++;
                Stage stage = (Stage) Next_button.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("4Page.fxml"));
                stage.setTitle("Викторина про автомобили");
                stage.setScene(new Scene(root, 750, 550));
                InputStream iconStream =
                        getClass().getResourceAsStream("assets/metor.png");
                Image image = new Image(iconStream);
                stage.getIcons().add(image);
                stage.show();
            } catch (IOException e) {
                throw new Error(e); } });
        next1.setOnAction(actionEvent -> {
            try {
                Stage stage = (Stage) next1.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("4Page.fxml"));
                stage.setTitle("Викторина про автомобили");
                stage.setScene(new Scene(root, 750, 550));
                InputStream iconStream =
                        getClass().getResourceAsStream("assets/metor.png");
                Image image = new Image(iconStream);
                stage.getIcons().add(image);
                stage.show();
            } catch (IOException e) {
                throw new Error(e); } });
        next2.setOnAction(actionEvent -> {
            try {
                Stage stage = (Stage) next2.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("4Page.fxml"));
                stage.setTitle("Викторина про автомобили");
                stage.setScene(new Scene(root, 750, 550));
                InputStream iconStream =
                        getClass().getResourceAsStream("assets/metor.png");
                Image image = new Image(iconStream);
                stage.getIcons().add(image);
                stage.show();
            } catch (IOException e) {
                throw new Error(e); } });
        next3.setOnAction(actionEvent -> {
            try {
                Stage stage = (Stage) next3.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("4Page.fxml"));
                stage.setTitle("Викторина про автомобили");
                stage.setScene(new Scene(root, 750, 550));
                InputStream iconStream =
                        getClass().getResourceAsStream("assets/metor.png");
                Image image = new Image(iconStream);
                stage.getIcons().add(image);
                stage.show();
            } catch (IOException e) {
                throw new Error(e); } });
    }
}
