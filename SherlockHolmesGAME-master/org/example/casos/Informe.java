import org.example.personajes.Persona;

import java.util.Date;

public class Informe {
    private int casoID;
    private Date fecha;
    private Persona victima;
    private String relato;

    public Informe(int casoID, Date fecha, Persona victima, String relato) {
        this.casoID = casoID;
        this.fecha = fecha;
        this.victima = victima;
        this.relato = relato;
    }

    public String getRelato() {
        return relato;
    }

    public Persona getVictima() {
        return victima;
    }
}
