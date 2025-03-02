package org.example.objetos;

public class Documento extends Objeto {
    private String contenido;
    private String autor;
    private String fecha;

    public Documento(String nombre, String descripcion, String contenido, String autor, String fecha) {
        super(nombre, descripcion);
        this.contenido = contenido;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "📜 Documento: " + getNombre() + "\n" +
                "📅 Fecha: " + fecha + "\n" +
                "✍️ Autor: " + autor + "\n" +
                "📝 Contenido: " + contenido + "\n" +
                "📖 Descripción: " + getDescripcion();
    }
}
