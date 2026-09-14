package caso4_buffer_comandos;

public class FormatoTipografico extends ComandoEditor {
    private String estilo;
    private int inicio;
    private int fin;

    public FormatoTipografico(String estilo, int inicio, int fin) {
        super("Formato tipografico");
        this.estilo = estilo;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void ejecutar() {
        System.out.println("Aplicar estilo " + estilo + " (" + inicio + " a " + fin + ")");
    }

    @Override
    public void deshacer() {
        System.out.println("Quitar estilo " + estilo + " (" + inicio + " a " + fin + ")");
    }
}
