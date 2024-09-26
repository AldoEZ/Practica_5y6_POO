package mx.unam.fi.poo.g1.p2;

import mx.unam.fi.poo.g1.p2.TrianguloPascal;
/**
 * Clase principal de Practica 2
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class Practica2 {
    /**
     * Metodo main
     * Se ejecutara toda la aplicacion
     * @param args -> Arreglo por defecto del metodo main.
     */
    public static void main(String[] args) {
        TrianguloPascal triangulo = new TrianguloPascal(8);
        triangulo.setN(5);
        
        triangulo.trianguloPascal();
    }
}
