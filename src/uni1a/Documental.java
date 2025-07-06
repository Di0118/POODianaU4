/**
 * Class Documental
 */
package uni1a;
import java.util.ArrayList;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private ArrayList<Investigador> investigadores = new ArrayList<>();


    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    public void agregarInvestigador(Investigador i) {
        investigadores.add(i);
    }

    public void mostrarInvestigador() {
        System.out.println("Investigadores:");
        for (Investigador i : investigadores) {
            System.out.println(" - " + i.mostrarInfo());
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("**Detalles del documental:**");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        mostrarInvestigador(); // se muestra investigador
        System.out.println();
    }
}