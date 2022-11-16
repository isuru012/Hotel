package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;

import java.io.IOException;

public class LoginFormController {


    private void checkLogin() throws IOException {
            User user=new User();
            user.setUserName(txtUsername.getText());
            user.setPassWord(txtPassword.getText());

            if (MainFormController.count==1){
                if (user.getUserName().equals("admin") && user.getPassWord().equals("admin")){
                    Parent ancrTwo= FXMLLoader.load(getClass().getResource("../view/AdminMainWindow.fxml"));
                    Scene scene=new Scene(ancrTwo);
                    Stage primaryStage =(Stage) this.ancrTwo.getScene().getWindow();
                    primaryStage.setTitle("Admin Window");
                    primaryStage.setScene(scene);


                }else{

                    Alert alert=new Alert(Alert.AlertType.ERROR,"Wrong Username or Password", ButtonType.OK);
                    alert.show();

                }

            }if (MainFormController.count==2){
                if(user.getUserName().equals("reception") && user.getPassWord().equals("reception")){
                Parent ancrOne= FXMLLoader.load(getClass().getResource("../view/ReceptionistMainWindow.fxml"));
                Scene scene=new Scene(ancrOne);
                Stage primaryStage =(Stage) this.ancrTwo.getScene().getWindow();
                primaryStage.setTitle("Receptionist Window");
                primaryStage.setScene(scene);
            }
            else{

                Alert alert=new Alert(Alert.AlertType.ERROR,"Wrong Username or Password", ButtonType.OK);
                alert.show();

            }

        }


    }

    @FXML
    private AnchorPane ancrTwo;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(getClass().getResource("../view/MainForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrTwo.getScene().getWindow();
        primaryStage.setTitle("Main Window");
        primaryStage.setScene(scene);

    }



    @FXML
    void loginOnAction(ActionEvent event) throws IOException {
        checkLogin();


    }

}

