package caso5_carrusel_widgets;

public abstract class WidgetDashboard {
    protected String id;
    protected String titulo;

    public WidgetDashboard(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void renderizarGrafico();
}
