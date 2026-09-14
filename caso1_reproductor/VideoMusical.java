package caso1_reproductor;

public class VideoMusical extends ElementoMultimedia {
    private String resolucion;

    public VideoMusical(String titulo, int duracionSegundos, String resolucion) {
        super(titulo, duracionSegundos);
        this.resolucion = resolucion;
    }

    public String getResolucion() {
        return resolucion;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo video: " + titulo + " (" + resolucion + ")");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado: " + titulo);
    }
}
