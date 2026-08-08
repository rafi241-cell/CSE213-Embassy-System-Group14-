package com.example.high_commission.rafi;

import com.example.high_commission.DocumentCheckList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DocumentCheckListViewController {

    DocumentCheckList checklist = new DocumentCheckList();

    @javafx.fxml.FXML
    private CheckBox passportCopyCB;
    @javafx.fxml.FXML
    private CheckBox passportPhotoCB;
    @javafx.fxml.FXML
    private CheckBox bankStatementCB;
    @javafx.fxml.FXML
    private CheckBox invitationLetterCB;
    @javafx.fxml.FXML
    private CheckBox travelItineraryCB;
    @javafx.fxml.FXML
    private CheckBox healthInsuranceCB;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void verifyButtonOA(ActionEvent actionEvent) {
        updateChecklist(passportCopyCB, "Passport Copy");
        updateChecklist(passportPhotoCB, "Passport Photo");
        updateChecklist(bankStatementCB, "Bank Statement");
        updateChecklist(invitationLetterCB, "Invitation Letter");
        updateChecklist(travelItineraryCB, "Travel Itinerary");
        updateChecklist(healthInsuranceCB, "Health Insurance");

        statusLabel.setText(checklist.getSubmissionStatus());

        Alert myAlert = new Alert(
                checklist.verifyChecklistCompletion() ? Alert.AlertType.INFORMATION : Alert.AlertType.WARNING
        );
        myAlert.setContentText(checklist.verifyChecklistCompletion()
                ? "All documents submitted!"
                : "Checklist incomplete: " + checklist.getSubmissionStatus());
        myAlert.show();
    }

    private void updateChecklist(CheckBox box, String docName) {
        if (box.isSelected()) {
            checklist.markDocumentSubmitted(docName);
        } else {
            checklist.unmarkDocument(docName);
        }
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("applicantDashboardView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}