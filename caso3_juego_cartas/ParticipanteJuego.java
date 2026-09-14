package caso3_juego_cartas;

public abstract class ParticipanteJuego {
    protected int id;
    protected String nombre;

    public ParticipanteJuego(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void tomarTurno(MesaJuego mesa);
}
