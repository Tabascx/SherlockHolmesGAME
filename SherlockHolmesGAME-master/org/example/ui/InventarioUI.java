package org.example.ui;

import org.example.objetos.Objeto;
import javax.swing.*;
import java.util.List;

public class InventarioUI {
    public static void mostrarInventario(List<Objeto> objetos) {
        StringBuilder mensaje = new StringBuilder("Inventario:\n");
        for (Objeto objeto : objetos) {
            mensaje.append("- ").append(objeto.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Inventario", JOptionPane.INFORMATION_MESSAGE);
    }
}
