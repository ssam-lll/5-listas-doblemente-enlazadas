package caso4_buffer_comandos;

public class InsercionTexto extends ComandoEditor {
    private String textoInsertado;
    private int posicion;

    public InsercionTexto(String textoInsertado, int posicion) {
        super("Insercion de texto");
        this.textoInsertado = textoInsertado;
        this.posicion = posicion;
    }

    @Override
    public void ejecutar() {
        System.out.println("Insertar '" + textoInsertado + "' en posicion " + posicion);
    }

    @Override
    public void deshacer() {
        System.out.println("Eliminar '" + textoInsertado + "' de posicion " + posicion);
    }
}
