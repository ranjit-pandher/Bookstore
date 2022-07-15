module com.info.capstonebookstore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.info.capstonebookstore to javafx.fxml;
    exports com.info.capstonebookstore;
}