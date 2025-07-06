/**
 * Class Pelicula
 */
package uni1a;

import java.util.ArrayList;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
 // Atributo (clase actor)
    private ArrayList<Actor> actores = new ArrayList<>();
    
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
 // Agregar actores
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }
    public void mostrarActores() {
        System.out.println("Actores:");
        for (Actor actor : actores) {
            System.out.println(" - " + actor.mostrarInfo());
        }
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("**Detalles de la película:**");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        mostrarActores(); //  se muestran los actores también
        System.out.println();
    }
}


