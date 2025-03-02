package org.example.ui;

import javax.swing.*;
import java.awt.*;

public class PanelDeJuego extends JPanel {
    public PanelDeJuego() {
        setLayout(new GridLayout(2, 2));

        JButton botonInvestigacion = new JButton("Investigar");
        JButton botonInterrogar = new JButton("Interrogar");
        JButton botonRevisarObjetos = new JButton("Revisar Objetos");
        JButton botonResolverCaso = new JButton("Resolver Caso");

        add(botonInvestigacion);
        add(botonInterrogar);
        add(botonRevisarObjetos);
        add(botonResolverCaso);
    }
}
