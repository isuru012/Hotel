package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistMainWindowController {

    @FXML
    private AnchorPane ancrEleven;

    @FXML
    private JFXButton btnHome;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrEleven.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void homeOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrEleven.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);

    }

    public void markMaintenanceOnAction(ActionEvent actionEvent) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/Maintenance.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrEleven.getScene().getWindow();
        primaryStage.setTitle("Maintenance Window");
        primaryStage.setScene(scene);

    }

    public void reserveRoomOnAction(ActionEvent actionEvent) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/ReserveRoomMainWindow.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrEleven.getScene().getWindow();
        primaryStage.setTitle("Reserve Room Main Window");
        primaryStage.setScene(scene);

    }
}
