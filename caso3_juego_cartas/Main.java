package caso3_juego_cartas;

public class Main {
    public static void main(String[] args) {
        MesaJuego mesa = new MesaJuego();

        mesa.agregarJugador(new JugadorHumano(1, "Jugador 1"));
        mesa.agregarJugador(new BotAgresivo(2, "Jugador 2"));
        mesa.agregarJugador(new BotConservador(3, "Jugador 3"));
        mesa.agregarJugador(new JugadorHumano(4, "Jugador 4"));

        mesa.simularRondas(7);
    }
}
