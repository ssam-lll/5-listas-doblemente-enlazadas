package caso1_reproductor;

public class Podcast extends ElementoMultimedia {
    private int episodio;
    private String anfitrion;

    public Podcast(String titulo, int duracionSegundos, int episodio, String anfitrion) {
        super(titulo, duracionSegundos);
        this.episodio = episodio;
        this.anfitrion = anfitrion;
    }

    public int getEpisodio() {
        return episodio;
    }

    public String getAnfitrion() {
        return anfitrion;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo podcast: " + titulo + " (Ep. " + episodio + ")");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado: " + titulo);
    }
}
