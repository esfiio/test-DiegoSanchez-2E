package com.example.practicajavafx01.CancionControllers;

import com.example.practicajavafx01.Cancion;
import com.example.practicajavafx01.ServiceCancion.Service;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    private Service servicioCancion = new Service();

    private String[] listaCategorias ={"Entrada", "Alabanza", "Especial", "Cierre"};

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtArtista;

    @FXML
    private ComboBox<String> cbCategoria;

    @FXML
    private ListView<Cancion> cancionListView;

    @FXML
    private Label lblMensaje;

    @FXML
    private void initialize(){
        cbCategoria.getItems().addAll(listaCategorias);
        cancionListView.setItems(servicioCancion.getAllCanciones());
    }

    @FXML
    private void onAdd(){
        try {
            String titulo = txtTitulo.getText();
            String artista = txtArtista.getText();
            String categoria = cbCategoria.getValue();

            servicioCancion.agregarCancion(titulo, artista, categoria);
            lblMensaje.setText("Contacto anadido con exito");
            // limpiar

        } catch (IllegalArgumentException e){
            lblMensaje.setText(e.getMessage());
        }


    }
}
