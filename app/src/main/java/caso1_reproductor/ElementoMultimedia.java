package caso1_reproductor;

public abstract class ElementoMultimedia {
    protected String titulo;
    protected int duracionSegundos;

    public ElementoMultimedia(String titulo, int duracionSegundos) {
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public abstract void reproducir();
    public abstract void pausar();
}
