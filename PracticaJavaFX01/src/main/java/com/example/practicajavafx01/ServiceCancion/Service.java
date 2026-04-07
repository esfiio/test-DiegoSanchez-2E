package com.example.practicajavafx01.ServiceCancion;

import com.example.practicajavafx01.Cancion;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Service {

    private  ObservableList<Cancion> listaCanciones =FXCollections.observableArrayList();

    public ObservableList<Cancion> getAllCanciones() {
        return listaCanciones;
    }

    public void agregarCancion(String titulo, String artista, String categoria){
        validarCancion(titulo, artista, categoria);
        listaCanciones.add(new Cancion(titulo, artista, categoria));
        //falta refrescar el csv y limpiar los campos
    }

    //public void buscarCancion

    private void validarCancion(String titulo, String artista, String categoria){

        if(titulo == null || titulo.trim().isBlank()){
            throw new IllegalArgumentException("El titulo de la cancion no puede estar vacio");
        }
        if(artista == null || artista.isBlank()){
            throw new IllegalArgumentException("El artista no puede estar vacio");
        }
        if (categoria == null){
            throw new IllegalArgumentException("La categoria no puede estar vacia");
        }
    }
}
