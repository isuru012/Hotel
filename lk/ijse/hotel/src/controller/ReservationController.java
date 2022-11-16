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

public class ReservationController {

    @FXML
    private AnchorPane ancrSixteen;

    @FXML
    private JFXButton btnHome;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/ReserveRoomMainWindow.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrSixteen.getScene().getWindow();
        primaryStage.setTitle("Reserve Room Main Window");
        primaryStage.setScene(scene);
    }

    @FXML
    void homeOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrSixteen.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
    }

    public void newReservationOnAction(ActionEvent actionEvent) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/NewReservation.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrSixteen.getScene().getWindow();
        primaryStage.setTitle("New Reservation Window");
        primaryStage.setScene(scene);
    }

    public void oldReservationOnAction(ActionEvent actionEvent) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/OldReservation.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrSixteen.getScene().getWindow();
        primaryStage.setTitle("Old Reservation Window");
        primaryStage.setScene(scene);
    }
}
