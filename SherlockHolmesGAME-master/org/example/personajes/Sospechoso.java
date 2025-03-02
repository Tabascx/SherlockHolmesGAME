package org.example.personajes;

import org.example.casos.Pista;

import java.util.ArrayList;
import java.util.List;

public class Sospechoso extends Persona {
    private boolean culpable;
    private List<Pista> pistasRelacionadas;

    public Sospechoso(String nombre, int edad, double altura, String oficio, String direccion, boolean vivo, boolean culpable) {
        super(nombre, edad, altura, oficio, direccion, vivo);
        this.culpable = culpable;
        this.pistasRelacionadas = new ArrayList<>();
    }

    // Getters y Setters
    public boolean isCulpable() {
        return culpable;
    }

    public void setCulpable(boolean culpable) {
        this.culpable = culpable;
    }

    public List<Pista> getPistasRelacionadas() {
        return pistasRelacionadas;
    }

    public void setPistasRelacionadas(List<Pista> pistasRelacionadas) {
        this.pistasRelacionadas = pistasRelacionadas;
    }
}
