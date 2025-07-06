package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");
        
        // Pelicula y actor
        Actor actor1 = new Actor("Keanu Reeves", "Canadá", 60, 4);
        Pelicula peli1 = new Pelicula("John Wick", 101, "Acción", "Lionsgate");
        peli1.agregarActor(actor1); // Asociación entre película y actor

        // Serie y temporada
        Temporada t1 = new Temporada(1, 7, 2017);
        SerieDeTV serie1= new SerieDeTV("Anne with an E", 47, "Drama histórico", 3);
        serie1.agregarTemporada(t1);

        //  Documental e investigador 
        Investigador i1 = new Investigador("Carl Sagan", "Astrofísica", "Cornell University");
        Documental docu = new Documental("Cosmos", 45, "Ciencia", "Astronomía");
        docu.agregarInvestigador(i1);

        // VideoMusical
        Artista morat = new Artista("Morat", 4);
        VideoMusical video= new VideoMusical("Cuando Nadie ve", 4, "Pop Latino","Universal Music",1,"Youtube");
        video.agregarArtista(morat);
        
        // Tutorial
        Instructor instructor1 = new Instructor("Sofía Mendoza", "Desarrollo Web");
        Tutorial tuto = new Tutorial("HTML para Principiantes", 30, "Educación", "Platzi", "Programación Frontend");
        tuto.agregarInstructor(instructor1);

        // Arreglo con los 5 contenidos
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = peli1;
        contenidos[1] = serie1;
        contenidos[2] = docu;
        contenidos[3]= video;
        contenidos[4]= tuto;

        // Mostrar detalles
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
