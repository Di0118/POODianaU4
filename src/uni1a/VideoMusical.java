/* *
 * Class VideoMusical
 */
package uni1a;
import java.util.ArrayList;
	// Subclase VideoMusical que extiende de ContenidoAudiovisual
	public class VideoMusical extends ContenidoAudiovisual {
		private String anfitrion;
		private int episodios;
		private String plataforma;
		
		 private ArrayList<Artista> artistas = new ArrayList<>();
		
		public VideoMusical(String titulo, int duracionEnMinutos, String genero, String anfitrion, int episodios, String plataforma) {
		    super(titulo, duracionEnMinutos, genero);
		    this.anfitrion = anfitrion;
		    this.episodios = episodios;
		    this.plataforma = plataforma;
		}
// Agregar artista
		public void agregarArtista(Artista artista) {
	        artistas.add(artista);
	    }
		public void mostrarArtistas() {
		    System.out.println("Artistas:");
		    for (Artista a : artistas) {
		        System.out.println(" - " + a.mostrarInfo());
		    }
		}
		
	@Override
    public void mostrarDetalles() {
        System.out.println("Detalles del VideoMusical:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración promedio: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Anfitrión: " + anfitrion);
        System.out.println("Episodios: " + episodios);
        System.out.println("Plataforma: " + plataforma);
        mostrarArtistas();
        System.out.println();
    }
}

	
