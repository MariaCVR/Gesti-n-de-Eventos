import java.util.ArrayList;
import java.util.List;

class Categoria {
    private String nombre;
    private String descripcion;
    private List<Evento> eventos;

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.eventos = new ArrayList<>();
    }

    public void asignarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Otros métodos...
}
