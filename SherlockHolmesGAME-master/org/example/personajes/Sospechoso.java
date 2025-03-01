public class Sospechoso extends Persona {
    private boolean esCulpable;
    private String coartada;

    public Sospechoso(String name, int edad, double altura, String oficio, String direccion, boolean vivo, boolean esCulpable, String coartada) {
        super(name, edad, altura, oficio, direccion, vivo);
        this.esCulpable = esCulpable;
        this.coartada = coartada;
    }

    public boolean esCulpable() {
        return esCulpable;
    }

    public String getCoartada() {
        return coartada;
    }
}
