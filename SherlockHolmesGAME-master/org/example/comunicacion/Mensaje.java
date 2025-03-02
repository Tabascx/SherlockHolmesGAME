package org.example.comunicacion;

import java.util.Date;

public class Mensaje {
    private String contenido;
    private Date fecha;

    public Mensaje(String contenido, Date fecha) {
        this.contenido = contenido;
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }
}
