package org.example;

import org.example.Policia.Informe;

import java.util.List;

public class Caso {
    public int id;
    public String titulo;
    public String contexto;
    public String sospechosos;
    public List<Persona> listaPersonas;
    public List<Object> listaObjetos;
    public List<Pista> listaPistas;
    private Informe informe;

    public void agregarObjetoAPista(Object objeto, Pista pista) {
        this.listaObjetos.add(objeto);
        for (Pista pistaI: listaPistas) {
            if (pistaI.equals(pista)) {
                pistaI.getListaObjetos().add(objeto);
            }
        }
    }
}
