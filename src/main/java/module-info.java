module dev.nicolasorteg.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens dev.nicolasorteg.demo to javafx.fxml;
    exports dev.nicolasorteg.demo;

    opens dev.nicolasorteg.demo.controller to javafx.fxml;
    exports dev.nicolasorteg.demo.controller;
}