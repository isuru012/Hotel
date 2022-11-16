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

public class OldReservationController {

    @FXML
    private AnchorPane ancrEighteen;

    @FXML
    private JFXButton btnHome;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/Reservation.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrEighteen.getScene().getWindow();
        primaryStage.setTitle("Reservation Window");
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

    @FXML
    void delete3OnAction(ActionEvent event) {
        alertForDelete();
    }

    @FXML
    void homeOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrEighteen.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
    }
    private void alertForDelete() {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Do you want to Delete Reservation?", ButtonType.YES,ButtonType.NO);

        Optional<ButtonType> buttonType=alert.showAndWait();

        if (buttonType.get()==ButtonType.YES){
            Alert alert2=new Alert(Alert.AlertType.INFORMATION,"Reservation Deleted");
            alert2.show();

        }else if (buttonType.get()==ButtonType.NO){
            Alert alert3=new Alert(Alert.AlertType.INFORMATION,"Reservation Not Deleted");
            alert3.show();
        }
    }

}
