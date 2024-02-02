module com.example.lab_task {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_task to javafx.fxml;
    exports com.example.lab_task;
}