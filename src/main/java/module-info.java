module com.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.uniclub to javafx.fxml;
    exports com.uniclub;
}