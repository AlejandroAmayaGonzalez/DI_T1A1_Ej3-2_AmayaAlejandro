package ieslosmontecillos.di_t1a1_ej6_amayaalejandro;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AnonymousHandlerDemo extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Creamos el contenedor
        FlowPane root = new FlowPane();

        //Lo colocamos en el centro de la pantalla
        root.setAlignment(Pos.CENTER);

        //Creamos los componentes
        Button bt_nuevo = new Button("Nuevo");
        Button bt_abrir = new Button("Abrir");
        Button bt_guardar = new Button("Guardar");
        Button bt_imprimir = new Button("Imprimir");

        //Añadimos el escuchador de eventos con clases anonimas
        bt_nuevo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo Proceso.");
            }
        });
        bt_abrir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir Proceso.");
            }
        });
        bt_guardar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar Proceso.");
            }
        });
        bt_imprimir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprimir Proceso.");
            }
        });

        //Añadimos los botones al StackPane
        root.getChildren().add(bt_nuevo);
        root.getChildren().add(bt_abrir);
        root.getChildren().add(bt_guardar);
        root.getChildren().add(bt_imprimir);

        //Creamos y mostramos la ventana
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("AnonymousHandlerDemo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}