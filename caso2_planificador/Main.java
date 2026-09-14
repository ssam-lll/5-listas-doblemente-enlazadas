package caso2_planificador;

public class Main {
    public static void main(String[] args) {
        PlanificadorRoundRobin planificador = new PlanificadorRoundRobin();

        planificador.agregarProceso(new ProcesoSistema(1, "tarea 1", 50));
        planificador.agregarProceso(new ProcesoUsuario(2, "tarea 2", 120));
        planificador.agregarProceso(new ProcesoEntradaSalida(3, "tarea 3", 30));
        planificador.agregarProceso(new ProcesoUsuario(4, "tarea 4", 70));

        planificador.ejecutarPlanificacion(40);
    }
}
