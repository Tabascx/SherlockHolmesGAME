package org.example.comunicacion;

import java.util.List;

public class Telefono {
    private int numero;
    private List<Chat> chats;

    public Telefono(int numero, List<Chat> chats) {
        this.numero = numero;
        this.chats = chats;
    }
}
