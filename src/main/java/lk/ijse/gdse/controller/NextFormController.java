package lk.ijse.gdse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class NextFormController {

    public AnchorPane NextForm;
    @FXML
    private Button btnNext;
    @FXML
    void btnNextOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/StudentForm.fxml"));

        Stage stage = (Stage) NextForm.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

}

