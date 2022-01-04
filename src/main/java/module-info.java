module com.example.downloadmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.downloadmanager to javafx.fxml;
    exports com.downloadmanager;
}