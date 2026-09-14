package caso4_buffer_comandos;

public class Nodo {
    private ComandoEditor dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(ComandoEditor dato) {
        this.dato = dato;
    }

    public ComandoEditor getDato() {
        return dato;
    }

    public void setDato(ComandoEditor dato) {
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
