package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.image.AreaAveragingScaleFilter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class KController implements Initializable {

    Controller controller= Main.loader.getController();
    @FXML
    private Button saveButton;

    @FXML
    private TextField startBox;

    @FXML
    private TextField iterationsBox;

    @FXML
    private TextField stepBox;
    public void passParam(){
        int kStep,kStart,itr;
        kStep = Integer.parseInt(stepBox.getText());
        kStart = Integer.parseInt(startBox.getText());
        itr = Integer.parseInt(iterationsBox.getText());
        controller.getPorpertiesOfK(kStart,kStep,itr);
        Stage stage = (Stage) startBox.getScene().getWindow();
        stage.close();

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<Integer> val =controller.passCurrentValue();
        startBox.setText(String.valueOf(val.get(0)));
        stepBox.setText(String.valueOf(val.get(1)));
        iterationsBox.setText(String.valueOf(val.get(2)));


    }
}
