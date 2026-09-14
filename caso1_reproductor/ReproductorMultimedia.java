package caso1_reproductor;

public class ReproductorMultimedia {
    private Nodo cabeza;
    private Nodo actual;
    private int tamano;

    public void agregar(ElementoMultimedia elemento) {
        Nodo nuevo = new Nodo(elemento);
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
        tamano++;
    }

    public void reproducirActual() {
        if (actual != null) {
            actual.getDato().reproducir();
        }
    }

    public void pausarActual() {
        if (actual != null) {
            actual.getDato().pausar();
        }
    }

    public void siguiente() {
        if (actual != null) {
            actual = actual.getSiguiente();
            actual.getDato().reproducir();
        }
    }

    public void anterior() {
        if (actual != null) {
            actual = actual.getAnterior();
            actual.getDato().reproducir();
        }
    }

    public Nodo getActual() {
        return actual;
    }

    public int getTamano() {
        return tamano;
    }
}
