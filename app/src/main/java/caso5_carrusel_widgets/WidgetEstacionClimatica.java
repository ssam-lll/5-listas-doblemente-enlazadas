package caso5_carrusel_widgets;

public class WidgetEstacionClimatica extends WidgetDashboard {
    private double temperatura;
    private double humedad;

    public WidgetEstacionClimatica(String id, String titulo, double temperatura, double humedad) {
        super(id, titulo);
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    @Override
    public void renderizarGrafico() {
        System.out.println(titulo + " (" + id + "): Temp " + temperatura + " C | Humedad " + humedad + "%");
    }
}
