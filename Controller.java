package sample;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class Controller {
    static  Integer in = new Integer(0);
    @FXML
    private Text answer_field;

    @FXML
    private Button next_page;


    @FXML
    void initialize() throws IOException{
        next_page.setOnAction(actionEvent -> {
            try {
                Stage stage = (Stage) next_page.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("SecondPage.fxml"));
                stage.setTitle("Викторина про автомобили");
                stage.setScene(new Scene(root, 750, 550));
                InputStream iconStream =
                        getClass().getResourceAsStream("assets/metor.png");
                Image image = new Image(iconStream);
                stage.getIcons().add(image);
                stage.show();
            } catch (IOException e) {
                throw new Error(e);
            }

        });
    }

}
