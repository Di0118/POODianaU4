package uni1a;

public class Actor {

// Atributos 
		private String nombre;
		private String lugar;
		private int edad;
		private int reconocimientos;
// Constructor
		public Actor(String nombre, String lugar, int edad, int reconocimientos) {
	        this.nombre = nombre;
	        this.lugar = lugar;
	        this.edad = edad;
	        this.reconocimientos = reconocimientos;
	    }
// Getter y Setters
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getLugar() {
			return lugar;
		}
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public int getReconocimientos() {
			return reconocimientos;
		}
		public void setReconocimientos(int reconocimientos) {
			this.reconocimientos = reconocimientos;
		}
		public String mostrarInfo() {
	        return nombre + " (" + lugar + ", " + edad + " años, " + reconocimientos + " premios)";
	    }
	}

