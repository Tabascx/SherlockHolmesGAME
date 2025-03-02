package org.example.casos;

import org.example.personajes.Sospechoso;
import org.example.personajes.Victima;

import java.util.ArrayList;
import java.util.List;

public class Caso {
    private String titulo;
    private String descripcion;
    private List<Sospechoso> sospechosos;
    private Victima victima;

    public Caso(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.sospechosos = new ArrayList<>();
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Sospechoso> getSospechosos() {
        return sospechosos;
    }

    public void setSospechosos(List<Sospechoso> sospechosos) {
        this.sospechosos = sospechosos;
    }

    public Victima getVictima() {
        return victima;
    }

    public void setVictima(Victima victima) {
        this.victima = victima;
    }

    public void agregarSospechoso(Sospechoso sospechoso) {
        sospechosos.add(sospechoso);
    }
}
