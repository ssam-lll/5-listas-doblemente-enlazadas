package caso2_planificador;

public class PlanificadorRoundRobin {
    private Nodo cabeza;
    private int cantidadProcesos;

    public void agregarProceso(ProcesoSO proceso) {
        Nodo nuevo = new Nodo(proceso);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(cabeza);
            cabeza.setAnterior(cabeza);
        } else {
            Nodo cola = cabeza.getAnterior();
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
        }
        cantidadProcesos++;
    }

    public void desenlazar(Nodo nodo) {
        if (cantidadProcesos == 1) {
            cabeza = null;
        } else {
            nodo.getAnterior().setSiguiente(nodo.getSiguiente());
            nodo.getSiguiente().setAnterior(nodo.getAnterior());
            if (nodo == cabeza) {
                cabeza = nodo.getSiguiente();
            }
        }
        cantidadProcesos--;
    }

    public void ejecutarPlanificacion(int quantumMs) {
        if (cabeza == null) {
            System.out.println("No hay procesos en la cola de ejecucion.");
            return;
        }

        Nodo actual = cabeza;
        int ciclo = 1;

        while (cantidadProcesos > 0) {
            System.out.println("\nCiclo " + ciclo + " (procesos restantes: " + cantidadProcesos + "):");
            int procesosEnRonda = cantidadProcesos;

            for (int i = 0; i < procesosEnRonda; i++) {
                Nodo siguienteNodo = actual.getSiguiente();
                actual.getDato().ejecutarQuantum(quantumMs);

                if (actual.getDato().estaTerminado()) {
                    System.out.println(" -> " + actual.getDato().getNombre() + " terminado.");
                    desenlazar(actual);
                }

                actual = siguienteNodo;
                if (cantidadProcesos == 0) {
                    break;
                }
            }
            ciclo++;
        }

        System.out.println("\nTodos los procesos terminaron.");
    }

    public int getCantidadProcesos() {
        return cantidadProcesos;
    }
}
