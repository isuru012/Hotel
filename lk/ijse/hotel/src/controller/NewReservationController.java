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

public class NewReservationController {

    @FXML
    private AnchorPane ancrSeventeen;

    @FXML
    private JFXButton btnHome;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/Reservation.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrSeventeen.getScene().getWindow();
        primaryStage.setTitle("Reservation Window");
        primaryStage.setScene(scene);
    }

    @FXML
    void homeOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrSeventeen.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void reserveOnAction(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.INFORMATION,"Reserved Succesfully", ButtonType.OK);
        alert.show();

    }

}
