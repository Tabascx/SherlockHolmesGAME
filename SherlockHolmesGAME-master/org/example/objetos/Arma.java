package org.example.objetos;

public class Arma extends Objeto {
    private boolean conSangre;

    public Arma(String nombre, String descripcion, boolean conSangre) {
        super(nombre, descripcion);
        this.conSangre = conSangre;
    }
}
