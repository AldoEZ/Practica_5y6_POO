package mx.unam.fi.poo.g1.p33;

import mx.unam.fi.poo.g1.p33.Electronicos;
/**
 * Clase principal de Practica 3_3
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class Practica33 {
    /**
     * Método main
     * Se ejecuta toda la aplicacion.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Electronicos electronicos = new Electronicos("Computadora", "Telefono", "Teclado", "Audifonos", "Cargador");
        
        electronicos.verificarLlave(3);
        electronicos.verificarLlave(7);
        System.out.println("Los electronicos son: " + electronicos.getElectronicos());
    }
}
