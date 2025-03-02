package org.example.casos;

import org.example.personajes.Persona;

import java.util.Date;

public class Informe {
    private String casoID;
    private Date fecha;
    private Persona victima;
    private String descripcion;

    public Informe(String casoID, Date fecha, Persona victima, String descripcion) {
        this.casoID = casoID;
        this.fecha = fecha;
        this.victima = victima;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getCasoID() {
        return casoID;
    }

    public void setCasoID(String casoID) {
        this.casoID = casoID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getVictima() {
        return victima;
    }

    public void setVictima(Persona victima) {
        this.victima = victima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void generarInforme() {
        System.out.println("Informe del caso " + casoID);
        System.out.println("Fecha: " + fecha);
        System.out.println("Víctima: " + victima.getNombre());
        System.out.println("Descripción: " + descripcion);
    }
}
