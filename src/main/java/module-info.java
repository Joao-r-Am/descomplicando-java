module com.example.learnjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learnjava to javafx.fxml;
    exports com.example.learnjava;
    exports com.example.learnjava.VariaveisETipos;
    opens com.example.learnjava.VariaveisETipos to javafx.fxml;
}