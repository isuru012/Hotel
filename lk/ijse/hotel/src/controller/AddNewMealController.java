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

public class AddNewMealController {
    @FXML
    private AnchorPane ancrSeven;
    @FXML
    private JFXButton btnHome;

     @FXML
     void addMealOnAction(ActionEvent actionEvent) {
        Alert alert=new Alert(Alert.AlertType.INFORMATION,"Meal Is Added", ButtonType.OK);
        alert.show();
    }

     @FXML
     void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/MealPackage.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrSeven.getScene().getWindow();
        primaryStage.setTitle("Meal Package");
        primaryStage.setScene(scene);

    }

     @FXML
     void homeOnAction(ActionEvent actionEvent) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrSeven.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);

    }
}
