package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MaintenanceController {

    @FXML
    private AnchorPane ancrTwelve;

    @FXML
    private JFXButton btnHome;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/ReceptionistMainWindow.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrTwelve.getScene().getWindow();
        primaryStage.setTitle("Receptionist Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void homeOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrTwelve.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
    }

    @FXML
    void maintenanceOnAction(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.INFORMATION,"Room Is Added To Maintenance", ButtonType.OK);
        alert.show();

    }

}
