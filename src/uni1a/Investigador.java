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
