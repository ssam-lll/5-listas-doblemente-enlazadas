package caso3_juego_cartas;

public class BotConservador extends ParticipanteJuego {
    public BotConservador(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void tomarTurno(MesaJuego mesa) {
        System.out.println(nombre + " jugo una carta.");
    }
}
