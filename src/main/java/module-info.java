module com.example.colorex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.colorex to javafx.fxml;
    exports com.example.colorex;
}