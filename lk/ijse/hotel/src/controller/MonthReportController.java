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

public class MonthReportController {

    @FXML
    private AnchorPane ancrNine;

    @FXML
    private JFXButton btnHome;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/IncomeReport.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrNine.getScene().getWindow();
        primaryStage.setTitle("Income Report");
        primaryStage.setScene(scene);

    }

    @FXML
    void homeOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrNine.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
    }

}
