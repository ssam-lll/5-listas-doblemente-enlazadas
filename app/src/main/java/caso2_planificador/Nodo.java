package caso2_planificador;

public class Nodo {
    private ProcesoSO dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(ProcesoSO dato) {
        this.dato = dato;
    }

    public ProcesoSO getDato() {
        return dato;
    }

    public void setDato(ProcesoSO dato) {
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
