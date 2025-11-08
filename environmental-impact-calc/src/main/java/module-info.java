module com.example.environmentalimpactcalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.environmentalimpactcalc to javafx.fxml;
    exports com.example.environmentalimpactcalc;
}