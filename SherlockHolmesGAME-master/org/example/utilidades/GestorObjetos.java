package org.example.utilidades;

import org.example.objetos.Objeto;
import java.util.ArrayList;
import java.util.List;

public class GestorObjetos {
    private List<Objeto> objetos;

    public GestorObjetos() {
        this.objetos = new ArrayList<>();
    }

    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    public List<Objeto> getObjetos() {
        return objetos;
    }

    public Objeto buscarObjeto(String nombre) {
        for (Objeto objeto : objetos) {
            if (objeto.getNombre().equalsIgnoreCase(nombre)) {
                return objeto;
            }
        }
        return null;
    }
}
