package caso1_reproductor;

public class Main {
    public static void main(String[] args) {
        ReproductorMultimedia reproductor = new ReproductorMultimedia();

        reproductor.agregar(new Cancion("Cancion 1", 354, "Artista 1"));
        reproductor.agregar(new Podcast("Podcast 1", 1800, 42, "Anfitrion 1"));
        reproductor.agregar(new VideoMusical("Video 1", 830, "Calidad 1"));

        reproductor.reproducirActual();
        reproductor.siguiente();
        reproductor.siguiente();
        reproductor.siguiente();
        reproductor.anterior();
        reproductor.anterior();
    }
}
