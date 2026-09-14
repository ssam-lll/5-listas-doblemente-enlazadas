package caso2_planificador;

public abstract class ProcesoSO {
    protected int pid;
    protected String nombre;
    protected int tiempoRestanteMs;
    protected int prioridad;

    public ProcesoSO(int pid, String nombre, int tiempoRestanteMs, int prioridad) {
        this.pid = pid;
        this.nombre = nombre;
        this.tiempoRestanteMs = tiempoRestanteMs;
        this.prioridad = prioridad;
    }

    public int getPid() {
        return pid;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoRestanteMs() {
        return tiempoRestanteMs;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean estaTerminado() {
        return tiempoRestanteMs <= 0;
    }

    public abstract void ejecutarQuantum(int quantumMs);
}
