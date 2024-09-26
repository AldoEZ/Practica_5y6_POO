package mx.unam.fi.poo.g1.p56;

import mx.unam.fi.poo.g1.p56.*;
/**
 * Clase principal de Proyecto 1
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class Proyecto1 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        
        Libro libro1 = new Libro("Un mundo feliz", "Aldous Hux");
        Libro libro2 = new Libro("La historia interminable", "Michael Ende");
        Libro libro3 = new Libro("Las crónicas del barrio", "Andrei Peña");
        Libro libro4 = new Libro("Los hermanos Karamazov", "Fiodor Dostoyevski");
        
        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);
        libreria.agregarLibro(libro3);
        libreria.agregarLibro(libro4);
        
        System.out.println("Libros disponibles en la libreria:");
        for(Libro libro : libreria.getLibros()) {
            System.out.println(libro.getTitulo() + " por " + libro.getAutor());
        }
        
        libreria.quitarLibro(libro2);
        
        System.out.println("\nLibros disponiles despúes de quitar " + libro2.getTitulo() + ":");
        for(Libro libro : libreria.getLibros()) {
            System.out.println(libro.getTitulo() + " por " + libro.getAutor());
        }
    }
}
