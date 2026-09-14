package caso5_carrusel_widgets;

public class Main {
    public static void main(String[] args) {
        CarruselWidgets carrusel = new CarruselWidgets();

        carrusel.agregarWidget(new WidgetMetricasServidor("1", "Widget Servidor", 48.5, 12.4));
        carrusel.agregarWidget(new WidgetEstacionClimatica("2", "Widget Clima", 21.3, 65.0));
        carrusel.agregarWidget(new WidgetSensoresIoT("3", "Widget Sensores", 16, 1013.25));

        System.out.println("Monitoreo de widgets:");
        carrusel.iniciarCicloMonitoreo(4);

        System.out.println("\nRetroceder widget:");
        carrusel.rotarAnterior();
    }
}
