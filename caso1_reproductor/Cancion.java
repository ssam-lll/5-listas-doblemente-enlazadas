package caso1_reproductor;

public class Cancion extends ElementoMultimedia {
    private String artista;

    public Cancion(String titulo, int duracionSegundos, String artista) {
        super(titulo, duracionSegundos);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo cancion: " + titulo + " (" + duracionSegundos + "s)");
    }

    @Override
    public void pausar() {
        System.out.println("Pausada: " + titulo);
    }
}
