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

public class ReserveRoomMainWindowController {

    @FXML
    private AnchorPane ancrThirteen;

    @FXML
    private JFXButton btnHome;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/ReceptionistMainWindow.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrThirteen.getScene().getWindow();
        primaryStage.setTitle("Receptionist Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void homeOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrThirteen.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);

    }
    @FXML
    void mealSelectOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/MealSelect.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrThirteen.getScene().getWindow();
        primaryStage.setTitle("Meal Select Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void reservationOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/Reservation.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrThirteen.getScene().getWindow();
        primaryStage.setTitle("Reservation Window");
        primaryStage.setScene(scene);


    }

    @FXML
    void availabilityOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/RoomAvailability.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrThirteen.getScene().getWindow();
        primaryStage.setTitle("Room Availability Window");
        primaryStage.setScene(scene);

    }

}
