package uni1a;

public class Actor {

// Atributos 
		private String nombre;
		private String nacionalidad;
		private int edad;
// Constructor
		public Actor( String nombre, String nacionalidad, int edad ) {    
			this.nombre = nombre;
	        this.nacionalidad = nacionalidad;
	        this.edad = edad;
	    }
		// Método mostrarDetalles()
	    public void mostrarDetalles() {
	        System.out.println("Actor: " + nombre + ", Edad: " + edad+ ",Nacionalidad:"+ nacionalidad);
	    }
	
//  CSV
	    public static Actor desdeCSV(String[] datos) {
	        String nombre = datos[0];
	        String nacionalidad = datos[1];
	        int edad = Integer.parseInt(datos[2]);
	        return new Actor(nombre, nacionalidad, edad);
	    }
 
	//  Getter y Setters
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getNacionalidad() {
			return nacionalidad;
		}
		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
}
		

