class Participante {
    private String nombre;
    private String email;
    private String telefono;
    private String rol;

    public Participante(String nombre, String email, String telefono, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.rol = rol;
    }

    public void presentar(Evento evento) {
        // Lógica para presentar en el evento
    }

    // Otros métodos...
}
