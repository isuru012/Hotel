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
import java.util.Optional;

public class RoomPackageController {

    @FXML
    private JFXButton btnHome;
    @FXML
    void addNewRoomOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/AddNewRoom.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrFour.getScene().getWindow();
        primaryStage.setTitle("Add New Room");
        primaryStage.setScene(scene);

    }

    @FXML
    void homeOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrFour.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
    }

    @FXML
    private AnchorPane ancrFour;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/AdminMainWindow.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrFour.getScene().getWindow();
        primaryStage.setTitle("Admin Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void delete1OnAction(ActionEvent event) {
        alertForDelete();


    }

    @FXML
    void delete2OnAction(ActionEvent event) {
        alertForDelete();

    }

    private void alertForDelete() {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Do you want to Delete Room?", ButtonType.YES,ButtonType.NO);

        Optional<ButtonType> buttonType=alert.showAndWait();

        if (buttonType.get()==ButtonType.YES){
            Alert alert2=new Alert(Alert.AlertType.INFORMATION,"Room Deleted");
            alert2.show();

        }else if (buttonType.get()==ButtonType.NO){
            Alert alert3=new Alert(Alert.AlertType.INFORMATION,"Room Not Deleted");
            alert3.show();
        }
    }

    @FXML
    void delete3OnAction(ActionEvent event) {
        alertForDelete();
    }

    @FXML
    void delete4OnAction(ActionEvent event) {
        alertForDelete();
    }

}
