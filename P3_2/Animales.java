package mx.unam.fi.poo.g1.p32;

import java.util.ArrayList;
/**
 * Clase Animales
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class Animales {
    private ArrayList<String> animales = new ArrayList<String>();
    
    /**
     * Método constructor
     * Para constuir objetos Animales.
     * @param a1 -> Atributo para el primer animal.
     * @param a2 -> Atributo para el segundo animal.
     * @param a3 -> Atributo para el tercer animal.
     * @param a4 -> Atributo para el cuarto animal.
     * @param a5 -> Atributo para el quinto animal.
     */
    public Animales(String a1, String a2, String a3, String a4, String a5) {
        setAnimales(a1);
        setAnimales(a2);
        setAnimales(a3);
        setAnimales(a4);
        setAnimales(a5);
    }
    
    /**
     * Método get
     * @return animales -> Regresa el atributo animales.
     */
    public ArrayList<String> getAnimales() {
        return this.animales;
    }
    /**
     * Método set
     * @param animal -> Para agregar un animal al atributo animales.
     */
    public void setAnimales(String animal) {
        this.animales.add(animal);
    }
    
    /**
     * Método para modificar un animal
     * @param animal -> Para reemplazar un animal de animales.
     */
    public void reemplazarAnimal(String animal) {
        this.animales.set(1, animal);
    }
}
