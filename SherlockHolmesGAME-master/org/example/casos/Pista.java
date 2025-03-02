package org.example.casos;

public class Pista {
    private String descripcion;
    private boolean encontrada;

    public Pista(String descripcion) {
        this.descripcion = descripcion;
        this.encontrada = false;
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEncontrada() {
        return encontrada;
    }

    public void setEncontrada(boolean encontrada) {
        this.encontrada = encontrada;
    }

    public void marcarComoEncontrada() {
        encontrada = true;
    }
}
