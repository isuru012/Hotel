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

public class MainFormController {
     static int count=0;

    public static JFXButton btnAdmin;
    public static JFXButton btnRecep;
    @FXML
    private AnchorPane ancrOne;


    @FXML
     void  loginAdminOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrOne.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
        count=1;

    }

    @FXML
     void loginRecepOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrOne.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
        count=2;
    }



}
