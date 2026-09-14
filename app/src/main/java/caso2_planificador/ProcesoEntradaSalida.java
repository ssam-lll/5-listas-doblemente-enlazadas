package caso2_planificador;

public class ProcesoEntradaSalida extends ProcesoSO {
    public ProcesoEntradaSalida(int pid, String nombre, int tiempoRestanteMs) {
        super(pid, nombre, tiempoRestanteMs, 3);
    }

    @Override
    public void ejecutarQuantum(int quantumMs) {
        int tiempoEjecutado = Math.min(tiempoRestanteMs, quantumMs);
        tiempoRestanteMs -= tiempoEjecutado;
        System.out.println(
                nombre + " (PID " + pid + ") ejecuto " + tiempoEjecutado + "ms | restante: " + tiempoRestanteMs + "ms");
    }
}
