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

public class MealSelectController {

    @FXML
    private AnchorPane ancrFourteen;

    @FXML
    private JFXButton btnHome;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/ReserveRoomMainWindow.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrFourteen.getScene().getWindow();
        primaryStage.setTitle("Reserve Main Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void homeOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrFourteen.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
    }

}
