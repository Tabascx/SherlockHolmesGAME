package org.example.personajes;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    private String oficio;
    private String direccion;
    private boolean vivo;

    public Persona(String nombre, int edad, double altura, String oficio, String direccion, boolean vivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.oficio = oficio;
        this.direccion = direccion;
        this.vivo = vivo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
