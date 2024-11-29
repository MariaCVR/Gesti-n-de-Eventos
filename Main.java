import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear organizador
        Organizador organizador = new Organizador("Juan Pérez", "juan@example.com", "123456789");

        // Crear lugar
        Lugar lugar = new Lugar("Auditorio Principal", "Calle Falsa 123", 200);

        // Crear categoría
        Categoria categoria = new Categoria("Conferencias", "Eventos de tipo conferencia");

        // Crear evento
        Evento evento = organizador.crearEvento("Conferencia sobre IA", new Date(), lugar.getDireccion(), "Una conferencia sobre inteligencia artificial", categoria, lugar);

        // Crear asistentes
        Asistente asistente1 = new Asistente("Ana Gómez", "ana@example.com", "987654321");
        Asistente asistente2 = new Asistente("Luis Rodríguez", "luis@example.com", "654321987");

        // Registrar asistentes al evento
        asistente1.registrarse(evento);
        asistente2.registrarse(evento);

        // Crear participantes
        Participante participante1 = new Participante("Carlos Díaz", "carlos@example.com", "321654987", "Ponente");
        evento.agregarParticipante(participante1);

        // Crear tickets
        Ticket ticket1 = new Ticket("General", 50.0f, asistente1, evento);
        Ticket ticket2 = new Ticket("VIP", 100.0f, asistente2, evento);

        // Vender tickets
        ticket1.vender();
        ticket2.vender();

        // Mostrar información del evento
        System.out.println("Evento: " + evento.getNombre());
        System.out.println("Fecha: " + evento.getFecha());
        System.out.println("Lugar: " + evento.getUbicacion());
        System.out.println("Categoría: " + evento.getCategoria().getNombre());
        System.out.println("Asistentes: " + evento.getAsistentes().size());
        System.out.println("Participantes: " + evento.getParticipantes().size());
    }
}
