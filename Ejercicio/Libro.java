package mx.unam.fi.poo.g1.p56;

/**
 * Clase libro
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class Libro {
    private String titulo;
    private String autor;
    
    /**
     * Metodo constructor
     * Para construir objetos libros.
     * @param titulo -> Atributo para el título del libro.
     * @param autor -> Atributo para el autor del liro.
     */
    public Libro(String titulo, String autor) {
        setTitulo(titulo);
        setAutor(autor);
    }
    
    /**
     * Método get
     * @return titulo -> Regresa el atributo título.
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Método set
     * @param titulo -> Para cambiar el dato de título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Método get
     * @return autor -> Regresa el atributo autor.
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * Método set
     * @param autor -> para cambiar el dato de autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
