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

public class IncomeReportController {

    @FXML
    private AnchorPane ancrEight;

    @FXML
    private JFXButton btnHome;

    @FXML
    void annualOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/AnnualReport.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrEight.getScene().getWindow();
        primaryStage.setTitle("Annual Report");
        primaryStage.setScene(scene);

    }

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/AdminMainWindow.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrEight.getScene().getWindow();
        primaryStage.setTitle("Admin Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void homeOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrEight.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void monthOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/MonthReport.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrEight.getScene().getWindow();
        primaryStage.setTitle("Month Report");
        primaryStage.setScene(scene);

    }

}
