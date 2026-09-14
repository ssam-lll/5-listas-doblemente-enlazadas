package caso1_reproductor;

public class Nodo {
    private ElementoMultimedia dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(ElementoMultimedia dato) {
        this.dato = dato;
    }

    public ElementoMultimedia getDato() {
        return dato;
    }

    public void setDato(ElementoMultimedia dato) {
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
