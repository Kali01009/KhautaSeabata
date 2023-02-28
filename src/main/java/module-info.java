module com.example.khautaseabata {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.khautaseabata to javafx.fxml;
    exports com.example.khautaseabata;
}