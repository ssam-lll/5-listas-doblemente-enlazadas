package caso2_planificador;

public class ProcesoSistema extends ProcesoSO {
    public ProcesoSistema(int pid, String nombre, int tiempoRestanteMs) {
        super(pid, nombre, tiempoRestanteMs, 1);
    }

    @Override
    public void ejecutarQuantum(int quantumMs) {
        int tiempoEjecutado = Math.min(tiempoRestanteMs, quantumMs);
        tiempoRestanteMs -= tiempoEjecutado;
        System.out.println(nombre + " (PID " + pid + ") ejecuto " + tiempoEjecutado + "ms | restante: " + tiempoRestanteMs + "ms");
    }
}
