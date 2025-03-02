package org.example.comunicacion;

import java.util.List;

public class Chat {
    private String titulo;
    private List<String> mensajes;

    public Chat(String titulo, List<String> mensajes) {
        this.titulo = titulo;
        this.mensajes = mensajes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<String> mensajes) {
        this.mensajes = mensajes;
    }

    public void agregarMensaje(String mensaje) {
        mensajes.add(mensaje);
    }

    public void mostrarChat() {
        System.out.println("Chat: " + titulo);
        for (String mensaje : mensajes) {
            System.out.println(mensaje);
        }
    }
}
