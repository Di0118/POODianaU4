/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private ArrayList<Temporada> listaTemporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
 // Agregar temporada
    public void agregarTemporada(Temporada temporada) {
        listaTemporadas.add(temporada);
    }
    public void mostrarTemporada() {
        System.out.println("Temporada:");
        for (Temporada t : listaTemporadas) {
            System.out.println(" - " + t.mostrarInfo());
        }
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("**Detalles de la serie:**");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        mostrarTemporada(); // se muestra temporada
        System.out.println();
    }
}