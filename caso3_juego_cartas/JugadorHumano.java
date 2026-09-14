package caso3_juego_cartas;

public class JugadorHumano extends ParticipanteJuego {
    public JugadorHumano(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void tomarTurno(MesaJuego mesa) {
        System.out.println(nombre + " jugo una carta.");
    }
}
