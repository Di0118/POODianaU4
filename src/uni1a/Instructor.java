package uni1a;

public class Instructor {
	
// Atributos 
	private String nombre;
	private String especialidad;
		
//Constructor
		public Instructor(String nombre,String especialidad) {
	        this.nombre = nombre;
	        this.especialidad= especialidad;
		}
		 public String getInfo() {
		        return nombre + " – " + especialidad;
		    }
		}

