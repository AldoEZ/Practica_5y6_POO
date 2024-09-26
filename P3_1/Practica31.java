package mx.unam.fi.poo.g1.p31;

import mx.unam.fi.poo.g1.p31.Cadena;
/**
 * Clase principal de Practica 3_1
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class Practica31 {
    /**
     * Método main
     * Se ejecuta toda la aplicacion.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Cadena cadena = new Cadena("anita lava la tina", "");
        System.out.println("Cadena original: " + cadena.getCadena());
        cadena.modificarCadena('a', 'A');
        System.out.println("Cadena modificada: " + cadena.getNuevaCadena());
    }
}
