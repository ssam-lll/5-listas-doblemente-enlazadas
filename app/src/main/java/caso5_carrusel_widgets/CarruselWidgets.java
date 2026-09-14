package caso5_carrusel_widgets;

public class CarruselWidgets {
    private Nodo cabeza;
    private Nodo actual;
    private int totalWidgets;

    public void agregarWidget(WidgetDashboard widget) {
        Nodo nuevo = new Nodo(widget);
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
        totalWidgets++;
    }

    public void mostrarActual() {
        if (actual != null) {
            actual.getDato().renderizarGrafico();
        }
    }

    public void rotarSiguiente() {
        if (actual != null) {
            actual = actual.getSiguiente();
            mostrarActual();
        }
    }

    public void rotarAnterior() {
        if (actual != null) {
            actual = actual.getAnterior();
            mostrarActual();
        }
    }

    public void iniciarCicloMonitoreo(int iteraciones) {
        if (actual == null) {
            System.out.println("No hay widgets registrados en el dashboard.");
            return;
        }

        System.out.println("Widget actual:");
        mostrarActual();

        for (int i = 1; i <= iteraciones; i++) {
            System.out.println("\nRotacion " + i + ":");
            rotarSiguiente();
        }
    }

    public int getTotalWidgets() {
        return totalWidgets;
    }
}
