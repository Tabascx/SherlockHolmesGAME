package org.example.utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaUtil {
    private static final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static String obtenerFechaActual() {
        return formato.format(new Date());
    }
}
