package caso4_buffer_comandos;

public class BufferComandos {
    private Nodo cabeza;
    private Nodo cursor;
    private int capacidadMaxima;
    private int tamanoActual;

    public BufferComandos(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.tamanoActual = 0;
    }

    public void registrarYEjecutar(ComandoEditor comando) {
        comando.ejecutar();
        Nodo nuevo = new Nodo(comando);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(cabeza);
            cabeza.setAnterior(cabeza);
            cursor = cabeza;
            tamanoActual = 1;
        } else {
            if (tamanoActual < capacidadMaxima) {
                Nodo cola = cabeza.getAnterior();
                cola.setSiguiente(nuevo);
                nuevo.setAnterior(cola);
                nuevo.setSiguiente(cabeza);
                cabeza.setAnterior(nuevo);
                cursor = nuevo;
                tamanoActual++;
            } else {
                cursor = cursor.getSiguiente();
                cursor.setDato(comando);
            }
        }
    }

    public void deshacer() {
        if (cursor != null) {
            System.out.print("Deshacer -> ");
            cursor.getDato().deshacer();
            cursor = cursor.getAnterior();
        } else {
            System.out.println("No hay acciones para deshacer.");
        }
    }

    public void rehacer() {
        if (cursor != null) {
            cursor = cursor.getSiguiente();
            System.out.print("Rehacer -> ");
            cursor.getDato().ejecutar();
        } else {
            System.out.println("No hay acciones para rehacer.");
        }
    }

    public int getTamanoActual() {
        return tamanoActual;
    }
}
