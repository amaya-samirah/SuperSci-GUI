module supershow.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens supershow.example to javafx.fxml;
    exports supershow.example;

    opens controllers to javafx.fxml;
    exports controllers;

    opens model to javafx.fxml;
    exports model;
}
