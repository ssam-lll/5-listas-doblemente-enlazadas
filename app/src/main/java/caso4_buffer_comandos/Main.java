package caso4_buffer_comandos;

public class Main {
    public static void main(String[] args) {
        BufferComandos buffer = new BufferComandos(5);

        System.out.println("Ejecutando operaciones:");
        buffer.registrarYEjecutar(new InsercionTexto("texto 1", 0));
        buffer.registrarYEjecutar(new FormatoTipografico("Negrita", 0, 10));
        buffer.registrarYEjecutar(new InsercionTexto("texto 2", 10));
        buffer.registrarYEjecutar(new EliminacionTexto("texto 1", 0));

        System.out.println("\nDeshacer operaciones:");
        buffer.deshacer();
        buffer.deshacer();

        System.out.println("\nRehacer operaciones:");
        buffer.rehacer();
        buffer.rehacer();
    }
}
