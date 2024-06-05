module supershow.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens supershow.example to javafx.fxml;
    exports supershow.example;
}
