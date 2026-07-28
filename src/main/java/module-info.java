module com.example.simulatingoperationsofanembassy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulatingoperationsofanembassy to javafx.fxml;
    exports com.example.simulatingoperationsofanembassy;
}