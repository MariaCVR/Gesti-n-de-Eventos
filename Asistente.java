class Asistente {
    private String nombre;
    private String email;
    private String telefono;

    public Asistente(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public void registrarse (Evento evento) {
        evento.registrarAsistente(this);
    }



