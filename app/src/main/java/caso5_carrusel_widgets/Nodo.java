package caso5_carrusel_widgets;

public class Nodo {
    private WidgetDashboard dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(WidgetDashboard dato) {
        this.dato = dato;
    }

    public WidgetDashboard getDato() {
        return dato;
    }

    public void setDato(WidgetDashboard dato) {
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
