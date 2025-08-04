/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
	private int id;
	private String estudio;
	
//Lista de temporadas
    private ArrayList<Temporada> listaTemporadas = new ArrayList<>();

    public SerieDeTV(int id,String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.id=id;
       this.estudio= estudio;
    }
// Gettrer y Setters
    public int getId() {return id;}
	public void setId(int id) {
		this.id = id;
	}
 public String getEstudio() {return estudio;}
 public void setEstudio(String estudio) { this.estudio = estudio;
 }
 public ArrayList<Temporada> getListaTemporadas() { return listaTemporadas; }
 public void setListaTemporadas(ArrayList<Temporada> listaTemporadas) {
     this.listaTemporadas = listaTemporadas;
 }

 // Agregar una temporada
 public void agregarTemporada(Temporada temporada) {
     listaTemporadas.add(temporada);
 }

 public void mostrarTemporadas() {
     System.out.println(" Temporadas:");
     for (Temporada t : listaTemporadas) {
         System.out.println(" - " + t.mostrarInfo());
     }
 }
 //  CSV
 public static SerieDeTV desdeCSV(String[] datos) {
     int id = Integer.parseInt(datos[0].trim());
     String titulo = datos[1].trim();
     int duracionEnMinutos = Integer.parseInt(datos[2].trim());
     String genero = datos[3].trim();
     String estudio = datos[4].trim();
     return new SerieDeTV(id, titulo, duracionEnMinutos, genero, estudio);
 }

 @Override
 public void mostrarDetalles() {
     System.out.println("Detalles de la Serie de TV:");
     System.out.println("ID: " + id);
     System.out.println("Título: " + getTitulo());
     System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
     System.out.println("Género: " + getGenero());
     System.out.println("Estudio: " + estudio);
 
   
     System.out.println();
 }
}
