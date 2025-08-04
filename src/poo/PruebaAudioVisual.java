package poo;
import java.util.List;
import java.util.ArrayList;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        
	
// Películas 
        System.out.println("----------------------");
        List<String[]> datosPeliculas = ArchivoUtil.leerCSV("data/peliculas.csv");
        List<Pelicula> peliculas = new ArrayList<>();
        for (String[] linea : datosPeliculas) {
            peliculas.add(Pelicula.desdeCSV(linea));
        }
        System.out.println("\n PELÍCULAS:");
        for (Pelicula pelicula : peliculas) {
            pelicula.mostrarDetalles(); 
        }
     // Actor
        List<String[]> datosActor = ArchivoUtil.leerCSV("data/actores.csv");
        List<Actor> actores = new ArrayList<>();
        for (String[] linea : datosActor) {
            actores.add(Actor.desdeCSV(linea));
        }
        System.out.println("\n ACTORES:");
        for (Actor actor : actores) {
            actor.mostrarDetalles(); 
        }
// Documentales
        System.out.println("----------------------");
        List<String[]> datosDocumentales = ArchivoUtil.leerCSV("data/documentales.csv");
        List<Documental> documentales = new ArrayList<>();
        for (String[] linea : datosDocumentales) {
            documentales.add(Documental.desdeCSV(linea));
        }
        System.out.println("\n DOCUMENTALES:");
        for (Documental doc : documentales) {
            doc.mostrarDetalles(); 
        }
       // Investigadores 
        List<String[]> datosInvestigadores = ArchivoUtil.leerCSV("data/investigadores.csv");
        List<Investigador> investigadores = new ArrayList<>();
        for (String[] linea : datosInvestigadores) {
            investigadores.add(Investigador.desdeCSV(linea));
        }

        System.out.println("\n INVESTIGADORES:");
        for (Investigador investigador : investigadores) {
            investigador.mostrarDetalles();
        }
      
        // Series
        System.out.println("--------------------");
        List<String[]> datosSeries = ArchivoUtil.leerCSV("data/series.csv");
        List<SerieDeTV> series = new ArrayList<>();
        for (String[] linea : datosSeries) {
            series.add(SerieDeTV.desdeCSV(linea));
        }
        System.out.println("\n SERIES DE TV:");
        for (SerieDeTV serie : series) {
            serie.mostrarDetalles(); //
        }
     // Temporadas 
        List<String[]> datosTemporadas = ArchivoUtil.leerCSV("data/temporadas.csv");
        List<Temporada> temporadas = new ArrayList<>();
        for (String[] linea : datosTemporadas) {
        	temporadas.add(Temporada.desdeCSV(linea));
        }

        System.out.println("\n TEMPORADAS:");
        for (Temporada temporada : temporadas) {
            temporada.mostrarDetalles();
        }

}

}