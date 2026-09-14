package caso3_juego_cartas;

public class BotAgresivo extends ParticipanteJuego {
    public BotAgresivo(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void tomarTurno(MesaJuego mesa) {
        System.out.println(nombre + " jugo una carta de reversa.");
        mesa.invertirSentido();
    }
}
