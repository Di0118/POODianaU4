package uni1a;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoUtil {

	public static List<String[]> leerCSV(String ruta) {
	    List<String[]> resultado = new ArrayList<>();
	    try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
	        String linea;
	        boolean primera = true;
	        while ((linea = br.readLine()) != null) {
	            if (primera) {
	                primera = false; // saltar el encabezado
	                continue;
	            }
	            resultado.add(linea.split(","));
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return resultado;
	}

    public static void escribirCSV(String rutaArchivo, List<String> lineas) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(rutaArchivo))) {
            for (String linea : lineas) {
                writer.println(linea);
            }
            System.out.println("✅ Archivo guardado: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("❌ Error al guardar el archivo: " + e.getMessage());
        }
    }
}