import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Evento {
    private String nombre;
    private Date fecha;
    private String ubicacion;
    private String descripcion;
    private List<Asistente> asistentes;
    private Organizador organizador;
    private Lugar lugar;
    private Categoria categoria;
    private List<Participante> participantes;

    public Evento(String nombre, Date fecha, String ubicacion, String descripcion, Organizador organizador, Lugar lugar, Categoria categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.organizador = organizador;
        this.lugar = lugar;
        this.categoria = categoria;
        this.asistentes = new ArrayList<>();
        this.participantes = new ArrayList<>();
        categoria.asignarEvento(this); // Asigna el evento a la categoría
    }

    public void registrarAsistente(Asistente asistente) {
        asistentes.add(asistente);
    }

    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }

    // Otros métodos...
}
