/**
 * Class Tutorial
 */
package uni1a;
import java.util.ArrayList;
	// Subclase Tutorial que extiende de ContenidoAudiovisual
	public class Tutorial extends ContenidoAudiovisual {
		private String tema;
		private String plataforma;
		
		private ArrayList<Instructor> instructores = new ArrayList<>();

		
		public Tutorial(String titulo, int duracionEnMinutos, String genero, String tema, String plataforma) {
		    super(titulo, duracionEnMinutos, genero);
		    this.tema = tema;
		    this.plataforma = plataforma;
		}
// Agregar instructor
		public void agregarInstructor(Instructor i) {
	        instructores.add(i);
	    }
	    public void mostrarInstructores() {
	        System.out.println("Instructores:");
	        for (Instructor i : instructores) {
	            System.out.println(" - " + i.getInfo());
	        }
	    }
	    @Override
	    public void mostrarDetalles() {
	        System.out.println("Detalles del Tutorial:");
	        System.out.println("ID: " + getId());
	        System.out.println("Título: " + getTitulo());
	        System.out.println("Duración promedio: " + getDuracionEnMinutos() + " minutos");
	        System.out.println("Género: " + getGenero());
	        System.out.println("Tema: " + tema);
	        System.out.println("Plataforma: " + plataforma);
	        mostrarInstructores(); 
	        System.out.println();
	    }

}