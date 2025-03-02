package org.example.ui;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Juego de Sherlock Holmes");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Bienvenido al Juego de Investigación", SwingConstants.CENTER);
        titulo.setFont(new Font("Serif", Font.BOLD, 24));

        panel.add(titulo, BorderLayout.NORTH);
        add(panel);
    }

    public void mostrar() {
        setVisible(true);
    }
}
