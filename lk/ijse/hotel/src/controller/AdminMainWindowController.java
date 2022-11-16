package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminMainWindowController {

    @FXML
    private AnchorPane ancrThree;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrThree.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void incomeReportsOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/IncomeReport.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrThree.getScene().getWindow();
        primaryStage.setTitle("Income Report Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void mealPackagesOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/MealPackage.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrThree.getScene().getWindow();
        primaryStage.setTitle("Meal Packages");
        primaryStage.setScene(scene);

    }

    @FXML
    void roomPackagesOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/RoomPackage.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrThree.getScene().getWindow();
        primaryStage.setTitle("Room Packages");
        primaryStage.setScene(scene);

    }

    public void homeOnAction(ActionEvent actionEvent) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrThree.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
    }
}
