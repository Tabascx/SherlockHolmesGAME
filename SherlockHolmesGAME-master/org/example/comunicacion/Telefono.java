import org.example.personajes.Persona;

public class Telefono {
    private int numero;
    private List<Persona> listaContactos;
    private List<Chat> listaChats;
    private List<Llamada> registroLlamadas;

    public void agregarContacto(Persona contacto) {
        listaContactos.add(contacto);
    }

    public void iniciarLlamada(Persona destino) {
        System.out.println("Llamando a " + destino.getName());
    }
}
