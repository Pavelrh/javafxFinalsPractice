module com.example.javafxfinalspractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxfinalspractice to javafx.fxml;
    exports com.example.javafxfinalspractice;
}