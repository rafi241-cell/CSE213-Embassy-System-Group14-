package com.example.high_commission.rafi;

import com.example.high_commission.VisaApplication;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;


public class addApplicationController {

    ArrayList<VisaApplication> applicationList;


    @javafx.fxml.FXML
    private TextField fullNameTF;
    @javafx.fxml.FXML

    private DatePicker travelDateDP;
    @javafx.fxml.FXML
    private ComboBox<String> visaTypeCB;
    @javafx.fxml.FXML
    private TextField passportNumberTF;
    @javafx.fxml.FXML
    private TextField nationalityTF;
    @javafx.fxml.FXML
    private TableColumn<VisaApplication,String> statusTableC;
    @javafx.fxml.FXML
    private TableColumn<VisaApplication,String> passportNumberTableC;
    @javafx.fxml.FXML
    private TableColumn<VisaApplication,String> visaTypeTableC;
    @javafx.fxml.FXML
    private TableColumn<VisaApplication,String> idTableC;
    @javafx.fxml.FXML
    private TableColumn<VisaApplication,String> travelDateTableC;
    @javafx.fxml.FXML
    private TableColumn<VisaApplication,String> fullNameTableC;
    @javafx.fxml.FXML
    private TableColumn<VisaApplication,String> nationalityTableC;
    @javafx.fxml.FXML

    private TableView<VisaApplication> applicationTableView;


    public void initialize(){
        visaTypeCB.getItems().addAll("Tourist", "Business", "Student", "Work", "Transit");
        applicationList = new ArrayList<>();

        idTableC.setCellValueFactory(new PropertyValueFactory<>("id"));
        fullNameTableC.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        passportNumberTableC.setCellValueFactory(new PropertyValueFactory<>("passportNumber"));
        nationalityTableC.setCellValueFactory(new PropertyValueFactory<>("nationality"));
        visaTypeTableC.setCellValueFactory(new PropertyValueFactory<>("visaType"));
        travelDateTableC.setCellValueFactory(new PropertyValueFactory<>("travelDate"));
        statusTableC.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
        if (fullNameTF.getText().isEmpty() || passportNumberTF.getText().isEmpty() ||
                nationalityTF.getText().isEmpty() || visaTypeCB.getValue() == null || travelDateDP.getValue()== null){
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Please Enter Necessary Information.");
            myAlert.show();
            return;
        }

        //int id, String fullName, String passportNumber, String visaType, String nationality, LocalDate travelDate, String status

        VisaApplication app = new VisaApplication(
                applicationList.size() + 1,
                fullNameTF.getText(),
                passportNumberTF.getText(),
                visaTypeCB.getValue(),
                nationalityTF.getText(),
                travelDateDP.getValue(),
                "Submitted"
        );
        applicationList.add(app);
        applicationTableView.getItems().add(app);


        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setContentText("Application Submitted!");
        myAlert.show();

        fullNameTF.clear();
        passportNumberTF.clear();
        nationalityTF.clear();
        visaTypeCB.setValue(null);
        travelDateDP.setValue(null);



    }
}
