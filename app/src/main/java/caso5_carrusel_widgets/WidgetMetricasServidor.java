package caso5_carrusel_widgets;

public class WidgetMetricasServidor extends WidgetDashboard {
    private double usoCpu;
    private double usoRam;

    public WidgetMetricasServidor(String id, String titulo, double usoCpu, double usoRam) {
        super(id, titulo);
        this.usoCpu = usoCpu;
        this.usoRam = usoRam;
    }

    @Override
    public void renderizarGrafico() {
        System.out.println(titulo + " (" + id + "): CPU " + usoCpu + "% | RAM " + usoRam + " GB");
    }
}
