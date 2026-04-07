package com.example.practicajavafx01.Repositories;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CancionesRepository {

    private final Path filePath= Paths.get("data", "canciones.csv");

    private void comprobarFile(){
        if(Files.notExists(filePath)){
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<String> leerTodasLasLineas() throws IOException {
        comprobarFile();
        return Files.readAllLines(filePath);

    }

    public void guardarTodasLasLineas(List<String> lineas) throws IOException {
        comprobarFile();
        Files.write(filePath, lineas, StandardCharsets.UTF_8, StandardOpenOption.TRUNCATE_EXISTING);

    }
}
