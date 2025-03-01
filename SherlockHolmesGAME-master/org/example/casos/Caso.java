package Policia;

import java.util.ArrayList;
import java.util.List;

public class Caso {
    private int id;
    private String titulo;
    private String contexto;
    private List<Sospechoso> listaSospechosos;
    private List<Persona> listaPersonas;
    private List<Objeto> listaObjetos;
    private List<Pista> listaPistas;
    private Informe informe;

    public Caso(int id, String titulo, String contexto) {
        this.id = id;
        this.titulo = titulo;
        this.contexto = contexto;
        this.listaSospechosos = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
        this.listaObjetos = new ArrayList<>();
        this.listaPistas = new ArrayList<>();
    }

    public void agregarSospechoso(Sospechoso sospechoso) {
        listaSospechosos.add(sospechoso);
    }

    public void agregarObjeto(Objeto objeto) {
        listaObjetos.add(objeto);
    }

    public void agregarPista(Pista pista) {
        listaPistas.add(pista);
    }
}
