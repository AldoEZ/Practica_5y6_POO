package mx.unam.fi.poo.g1.p1;

import mx.unam.fi.poo.g1.p1.*;
/**
 * Clase principal de Práctica 1
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class Practica1 {
    /**
     * Método main
     * Se ejecutara toda la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Punto punto = new Punto(8.1, 7.9, -14.014, 3.34);
        punto.setX1(5.4);
        
        double distancia = punto.distaciaPuntos();
        
        System.out.println("La distancia entre los puntos P1(" 
        + punto.getX1() + "," + punto.getY1() + ") y P2(" 
        + punto.getX2() + "," + punto.getY2() + ") es: " + distancia);
    }
}
