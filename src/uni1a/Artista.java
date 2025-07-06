package uni1a;

public class Artista {
	
// Atributos 
	private String nombre;
	private int integrantes;
	
//Constructor
	public Artista(String nombre, int integrantes) {
        this.nombre = nombre;
        this.integrantes= integrantes;
	}
	public String mostrarInfo() {
        return nombre + " (" + integrantes + " integrantes)";

}
}