package org.example.personajes;

public class Victima extends Persona {
    private String causaMuerte;

    public Victima(String nombre, int edad, double altura, String genero, String direccion, String causaMuerte) {
        super(nombre, edad, altura, genero, direccion, false);  // Siempre está muerta
        this.causaMuerte = causaMuerte;
    }

    // Getters y Setters
    public String getCausaMuerte() {
        return causaMuerte;
    }

    public void setCausaMuerte(String causaMuerte) {
        this.causaMuerte = causaMuerte;
    }
}
