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