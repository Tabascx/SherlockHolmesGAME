public class Persona {
    private String name;
    private int edad;
    private double altura;
    private String oficio;
    private String direccion;
    private boolean vivo;

    public Persona(String name, int edad, double altura, String oficio, String direccion, boolean vivo) {
        this.name = name;
        this.edad = edad;
        this.altura = altura;
        this.oficio = oficio;
        this.direccion = direccion;
        this.vivo = vivo;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
