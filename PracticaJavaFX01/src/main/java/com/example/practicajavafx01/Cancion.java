package com.example.practicajavafx01;

public class Cancion {

    private String titulo;
    private String artista;
    private String categoria;

    public Cancion(String titulo, String artista, String categoria){
        this.titulo = titulo;
        this.artista = artista;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return this.titulo + " - " + this.artista + " - " + this.categoria;
    }

}
