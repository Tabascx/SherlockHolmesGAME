import java.util.ArrayList;
import java.util.List;

public class Pista {
    private String contexto;
    private List<Objeto> listaObjetos;

    public Pista(String contexto) {
        this.contexto = contexto;
        this.listaObjetos = new ArrayList<>();
    }

    public void agregarObjeto(Objeto objeto) {
        listaObjetos.add(objeto);
    }

    public void mostrarPista() {
        System.out.println("Pista: " + contexto);
        for (Objeto obj : listaObjetos) {
            System.out.println(" - " + obj.getNombre());
        }
    }
}
