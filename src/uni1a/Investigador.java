package uni1a;

public class Investigador {

	// Atributos 
		private String nombre;
		private String especialidad;
		private String institucion;
// Constructor
	 public Investigador(String nombre, String especialidad, String institucion) {
		      this.nombre = nombre;
		      this.especialidad = especialidad;
		      this.institucion = institucion;
		    }
	// Método mostrarDetalles()
	    public void mostrarDetalles() {
	        System.out.println("Investigador: " + nombre + ", Especialidad: " + especialidad+ ",Institución:"+ institucion);
	    }
	//  CSV
	    public static Investigador desdeCSV(String[] datos) {
	        String nombre = datos[0];
	        String especialidad = datos[1];
	        String institucion= datos[2];
	        return new Investigador(nombre, especialidad, institucion);
	    }
	
// Getter y Setters

		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getEspecialdad() {
			return especialidad;
		}
		public void setEspecialdad(String especialdad) {
			this.especialidad = especialdad;
		}
		public String getInstitucion() {
			return institucion;
		}
		public void setInstitucion(String institucion) {
			this.institucion = institucion;
		}
		 public String mostrarInfo() {
		        return nombre + " – " + especialidad + " (" + institucion + ")";
		    }
		}
