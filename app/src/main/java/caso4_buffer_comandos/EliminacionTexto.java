package caso4_buffer_comandos;

public class EliminacionTexto extends ComandoEditor {
    private String textoEliminado;
    private int posicion;

    public EliminacionTexto(String textoEliminado, int posicion) {
        super("Eliminacion de texto");
        this.textoEliminado = textoEliminado;
        this.posicion = posicion;
    }

    @Override
    public void ejecutar() {
        System.out.println("Eliminar '" + textoEliminado + "' de posicion " + posicion);
    }

    @Override
    public void deshacer() {
        System.out.println("Restaurar '" + textoEliminado + "' en posicion " + posicion);
    }
}
