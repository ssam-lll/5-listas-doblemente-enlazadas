package caso3_juego_cartas;

public class Nodo {
    private ParticipanteJuego dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(ParticipanteJuego dato) {
        this.dato = dato;
    }

    public ParticipanteJuego getDato() {
        return dato;
    }

    public void setDato(ParticipanteJuego dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
