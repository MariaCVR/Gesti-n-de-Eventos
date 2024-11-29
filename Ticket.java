class Ticket {
    private String tipo;
    private float precio;
    private Asistente asistente;
    private Evento evento;

    public Ticket(String tipo, float precio, Asistente asistente, Evento evento) {
        this.tipo = tipo;
        this.precio = precio;
        this.asistente = asistente;
        this.evento = evento;
    }

    public void vender() {
        // Lógica para vender el ticket
    }

    public void cancelar() {
        // Lógica para cancelar el ticket
    }

    // Otros métodos...
}
