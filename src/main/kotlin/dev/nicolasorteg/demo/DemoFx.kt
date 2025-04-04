package dev.nicolasorteg.demo

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class HelloApplication: Application() {
    override fun start(stage: Stage) {
        println("On Application Start")
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("views/demo-view.fxml"))

        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Lector Nombre"
        stage.scene = scene
        stage.show()
    }

    override fun stop() {
        println("On Application Stop")
    }

    override fun init() {
        println("On Application Init")
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}