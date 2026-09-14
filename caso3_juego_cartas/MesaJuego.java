package caso3_juego_cartas;

public class MesaJuego {
    private Nodo cabeza;
    private Nodo actual;
    private boolean sentidoHorario;
    private int totalJugadores;

    public MesaJuego() {
        this.sentidoHorario = true;
    }

    public void agregarJugador(ParticipanteJuego jugador) {
        Nodo nuevo = new Nodo(jugador);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(cabeza);
            cabeza.setAnterior(cabeza);
            actual = cabeza;
        } else {
            Nodo cola = cabeza.getAnterior();
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
        }
        totalJugadores++;
    }

    public void invertirSentido() {
        sentidoHorario = !sentidoHorario;
        System.out.println(" -> Giro invertido a " + (sentidoHorario ? "horario" : "antihorario"));
    }

    public void avanzarTurno() {
        if (actual != null) {
            actual = sentidoHorario ? actual.getSiguiente() : actual.getAnterior();
        }
    }

    public void ejecutarTurnoActual() {
        if (actual != null) {
            actual.getDato().tomarTurno(this);
        }
    }

    public void simularRondas(int turnos) {
        for (int i = 1; i <= turnos; i++) {
            System.out.println("\nTurno " + i + " (" + (sentidoHorario ? "horario" : "antihorario") + "):");
            ejecutarTurnoActual();
            avanzarTurno();
        }
    }

    public boolean isSentidoHorario() {
        return sentidoHorario;
    }

    public int getTotalJugadores() {
        return totalJugadores;
    }
}
