package caso4_buffer_comandos;

public abstract class ComandoEditor {
    protected String descripcion;

    public ComandoEditor(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract void ejecutar();
    public abstract void deshacer();
}
