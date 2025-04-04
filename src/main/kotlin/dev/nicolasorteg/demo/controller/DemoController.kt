package dev.nicolasorteg.demo.controller

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextField

class DemoController {

    @FXML
    private lateinit var textNombre: TextField

    @FXML
    private lateinit var helloText: Label

    @FXML
    private fun onHelloButtonClick() {
        println("Boton pulsado.")
        println("Texto ingresado: ${textNombre.text}")
        helloText.text = "Bienvenido ${textNombre.text}"
    }
}
