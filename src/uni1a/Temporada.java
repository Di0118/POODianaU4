package uni1a;

public class Temporada {

//Atributos 
		private int  numeroTemporada;
		private int episodios;
		private int añoEstreno;
//Constructor
		public Temporada(int numeroTemporada , int episodios, int añoEstreno) {
			this.numeroTemporada = numeroTemporada;
	        this.episodios = episodios;
	        this.añoEstreno = añoEstreno;
		}
// Método mostrarDetalles()
	    public  void mostrarDetalles() {
	        System.out.println("Temporada: " + numeroTemporada + ", Episodios: " + episodios+ ",Estreno:"+ añoEstreno);
	    }
	 // CSV
	    public static Temporada desdeCSV(String[] datos) {
	        int numeroTemporada = Integer.parseInt(datos[0]);
	        int episodios = Integer.parseInt(datos[1]);
	        int añoEstreno = Integer.parseInt(datos[2]);
	        return new Temporada(numeroTemporada, episodios, añoEstreno);
	    }

// Getter y Setters

		public int getNumeroTemporada() {
			return numeroTemporada;
		}
		public void setNumeroTemporada(int numeroTemporada) {
			this.numeroTemporada = numeroTemporada;
		}
		public int getEpisodios() {
			return episodios;
		}
		public void setEpisodios(int episodios) {
			this.episodios = episodios;
		}
		public int getAñoEstreno() {
			return añoEstreno;
		}
		public void setAñoEstreno(int añoEstreno) {
			this.añoEstreno = añoEstreno;
		}
		public String mostrarInfo() {
		    return "Temporada " + numeroTemporada + ": " + episodios + " episodios (" + añoEstreno + ")";
		}
}