package org.example.objetos;

public class Objeto {
    private String nombre;
    private  String descripcion;

    public Objeto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;

    }
    public  String getNombre() {
        return nombre;
    }
}
