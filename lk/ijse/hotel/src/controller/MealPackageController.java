package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;


public class MealPackageController {

    @FXML
    private AnchorPane ancrSix;

    @FXML
    private JFXButton btnHome;

    @FXML
    void addNewMealOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/AddNewMeal.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrSix.getScene().getWindow();
        primaryStage.setTitle("Add New Meal");
        primaryStage.setScene(scene);


    }

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/AdminMainWindow.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrSix.getScene().getWindow();
        primaryStage.setTitle("Admin Window");
        primaryStage.setScene(scene);

    }

    @FXML
    void chineseDetailOnAction(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Chinese Meal Details");
        ImageView imageView = new ImageView(getClass().getResource("../assests/china.png").toExternalForm());
        alert.setGraphic(imageView);
        alert.showAndWait();

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
    void frenchDetailOnAction(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("French Meal Details");

        ImageView imageView = new ImageView(getClass().getResource("../assests/french.png").toExternalForm());
        alert.setGraphic(imageView);
        alert.showAndWait();

    }

    @FXML
    void homeOnAction(ActionEvent event) throws IOException {
        Parent ancrOne= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(ancrOne);
        Stage primaryStage =(Stage) this.ancrSix.getScene().getWindow();
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
    }

    @FXML
    void localDetailOnAction(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Local Meal Details");

        ImageView imageView = new ImageView(getClass().getResource("../assests/Untitleddesign.png").toExternalForm());
        alert.setGraphic(imageView);
        alert.showAndWait();

    }
    private void alertForDelete() {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Do you want to Delete Meal?", ButtonType.YES,ButtonType.NO);

        Optional<ButtonType> buttonType=alert.showAndWait();

        if (buttonType.get()==ButtonType.YES){
            Alert alert2=new Alert(Alert.AlertType.INFORMATION,"Meal Deleted");
            alert2.show();

        }else if (buttonType.get()==ButtonType.NO){
            Alert alert3=new Alert(Alert.AlertType.INFORMATION,"Meal Not Deleted");
            alert3.show();
        }
    }

}
