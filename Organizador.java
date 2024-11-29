import java.util.Date;

class Organizador {
    private String nombre;
    private String email;
    private String telefono;

    public Organizador(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public Evento crearEvento(String nombre, Date fecha , String ubicacion, String descripcion, Categoria categoria, Lugar lugar) {
        return new Evento(nombre, fecha, ubicacion, descripcion, this, lugar, categoria);
    }

    public void modificarEvento(Evento evento) {
        // Lógica para modificar el evento
    }

    // Otros métodos...
}
