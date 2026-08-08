module com.example.high_commission {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.high_commission to javafx.fxml;
    opens com.example.high_commission.rafi to javafx.fxml;
    exports com.example.high_commission;
}