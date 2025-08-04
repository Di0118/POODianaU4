/**
 * Class Pelicula
 */
package uni1a;

import java.util.ArrayList;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
	private int id;
    
 // Lista de actores
    private ArrayList<Actor> actores = new ArrayList<>();
    
    private String estudio;

	public Pelicula(int id,String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.id= id;
        this.estudio= estudio;
    }
// Getters y Setters
    public int getId() {return id;}
	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Actor> getActores() {	return actores;}		
	public void setActores(ArrayList<Actor> actores) {
		this.actores = actores;
	}
// Agregar un actor a la lista
	public void agregarActor(Actor actor) {
        actores.add(actor);
    }
// Mostrar actores
	public void mostrarActores() {
        System.out.println("Actores:");
        for (Actor actor : actores) {
            actor.mostrarDetalles();
        }
    }
// CSV
    public static Pelicula desdeCSV(String[] datos) {
        int id = Integer.parseInt(datos[0]);           
        String titulo = datos[1];                      
        int duracionEnMinutos = Integer.parseInt(datos[2]);     
        String genero = datos[3];                      
        String estudio = datos[4];                     
        return new Pelicula (id,titulo, duracionEnMinutos, genero, estudio);
    }
    
    
    @Override
    public void mostrarDetalles() {
        System.out.println("**Detalles de la película:**");
        System.out.println("ID: " + id);
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
       
        System.out.println();
        
    }
}

