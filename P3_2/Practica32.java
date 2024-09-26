package mx.unam.fi.poo.g1.p32;

import mx.unam.fi.poo.g1.p32.*;
/**
 * Clase principal de Practica 3_2
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class Practica32 {
    /**
     * Método main
     * Se ejecuta toda la aplicacion.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Animales animales = new Animales("Perro", "Gato", "Caballo", "Burro", "Pajaro");
        
        System.out.println("ArrayList original: " + animales.getAnimales());
        
        animales.reemplazarAnimal("Tiburon");
        
        System.out.println("ArrayList nuevo: " + animales.getAnimales());
    }
}
