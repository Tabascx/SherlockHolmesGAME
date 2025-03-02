package org.example.juego;

import org.example.casos.Caso;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Caso> casos;
    private int casoActual;

    public Game() {
        this.casos = new ArrayList<>();
        this.casoActual = 0;

    }

    public void agregarCaso(Caso caso) {
        casos.add((caso));
    }

    public Caso getCasoActual() {
        if (casoActual < casos.size()) {
            return casos.get(casoActual);
        }
        return null;
    }
}
