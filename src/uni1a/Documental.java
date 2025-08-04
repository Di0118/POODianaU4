/**
 * Class Documental
 */
package uni1a;
import java.util.ArrayList;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
	private int id;
	
    private ArrayList<Investigador> investigadores = new ArrayList<>();

    public Documental(int id,String titulo, int duracion, String genero, String tema) {
        super(titulo, duracion, genero);
        this.id= id;
        this.tema = tema;
    }
    private String tema;
 // Getters y Setters
    public int getId() {return id;}
	public void setId(int id) {
		this.id = id;
	}
    	
    public ArrayList<Investigador> getInvestigadores() { return investigadores; }
    public void setInvestigadores(ArrayList<Investigador> investigadores) {
        this.investigadores = investigadores;
    }

 // Agregar un investigador
    public void agregarInvestigador(Investigador i) {
        investigadores.add(i);
    }
    public void mostrarInvestigadores() {
        System.out.println("Investigadores:");
        for (Investigador i : investigadores) {
            System.out.println(" - " + i.mostrarInfo());
        }
    }
    // CSV
    public static Documental desdeCSV(String[] datos) {
        int id = Integer.parseInt(datos[0].trim());
        String titulo = datos[1].trim();
        int duracion = Integer.parseInt(datos[2].trim());
        String genero = datos[3].trim();
        String tema = datos[4].trim();
        return new Documental(id, titulo, duracion, genero, tema);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("*** Detalles del Documental: ***");
        System.out.println("ID: " + id);
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
        
        System.out.println();
    }
}
