package mx.unam.fi.poo.g1.p31;

/**
 * Clase cadena
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class Cadena {
    private String cadena;
    private String nuevaCadena;
    
    /**
     * Método constructor
     * Para construir objetos cadena.
     * @param cadena -> Atributo para la cadena de la Cadena.
     * @param nuevaCadena -> Atributo para la nuevaCadena de la Cadena.
     */
    public Cadena(String cadena, String nuevaCadena) {
        setCadena(cadena);
        setNuevaCadena(nuevaCadena);
    }
    
    /**
     * Metodo get
     * @return cadena -> Regresa el atributo cadena.
     */
    public String getCadena() {
        return this.cadena;
    }
    /**
     * Metodo set
     * @param cadena -> para cambiar el atributo de la cadena de Cadena.
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    /**
     * Metodo set
     * @return nuevaCadena -> Regresa el atributo nuevCadena.
     */
    public String getNuevaCadena() {
        return this.nuevaCadena;
    }
    /**
     * Metodo set
     * @param nuevaCadena -> para cambiar el atributo de la nuevaCadena de Cadena.
     */
    public void setNuevaCadena(String nuevaCadena) {
        this.nuevaCadena = nuevaCadena;
    }
    
    /**
     * Metodo para modificar la cadena original.
     * @param anterior -> Caracter anterior de la cadena original.
     * @param nuevo -> Caracter nuevo de reemplazo.
     */
    public void modificarCadena(char anterior, char nuevo) {
        this.nuevaCadena = this.cadena.replace(anterior, nuevo);
    }
}
