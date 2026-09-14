package caso5_carrusel_widgets;

public class WidgetSensoresIoT extends WidgetDashboard {
    private int actuadoresActivos;
    private double presionBarometrica;

    public WidgetSensoresIoT(String id, String titulo, int actuadoresActivos, double presionBarometrica) {
        super(id, titulo);
        this.actuadoresActivos = actuadoresActivos;
        this.presionBarometrica = presionBarometrica;
    }

    @Override
    public void renderizarGrafico() {
        System.out.println(titulo + " (" + id + "): Presion " + presionBarometrica + " hPa | Actuadores: " + actuadoresActivos);
    }
}
