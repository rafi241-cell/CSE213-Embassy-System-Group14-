package com.example.high_commission.rafi;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;



public class ApplicantDashboardController {
    private void switchSecene(ActionEvent actionEvent, String fxmlFile) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("High Commission");
        stage.setScene(scene);
        stage.show();
    }
    @javafx.fxml.FXML
    public void viewMyApplicationButtonOA(ActionEvent actionEvent)throws IOException{
        switchSecene(actionEvent,"myApplicationView.fxml");
    }

    @javafx.fxml.FXML
    public void bookAppointmentButtonOA(ActionEvent actionEvent) throws IOException{
        switchSecene(actionEvent,"bookAppointmentView.fxml");
    }

    @javafx.fxml.FXML
    public void submitNewApplicationButtonOA(ActionEvent actionEvent)throws IOException{
        switchSecene(actionEvent,"addApplicationView.fxml");

    }

    @javafx.fxml.FXML
    public void logoutButtonOA(ActionEvent actionEvent) throws IOException{
        switchSecene(actionEvent, "loginView.fxml");
    }

    @javafx.fxml.FXML
    public void documentChecklistButtonOA(ActionEvent actionEvent) throws IOException{
        switchSecene(actionEvent,"documentChecklistView.fxml");
    }
}
