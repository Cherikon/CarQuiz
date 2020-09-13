package sample;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.io.IOException;

public class FivePageController {

    @FXML
    private Text text_field;

    @FXML
    void initialize() throws IOException {
        text_field.setText(Controller.in.toString() + "/3 баллов" );
    }
}
