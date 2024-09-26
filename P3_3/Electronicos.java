package mx.unam.fi.poo.g1.p33;

import java.util.HashMap;
/**
 * Clase Electronicos
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class Electronicos {
    private HashMap<Integer,String> electronicos = new HashMap<Integer,String>();
    
    /**
     * Método constructor
     * Para constuir objetos Electronicos.
     * @param e1 -> Atributo para el primer electronico.
     * @param e2 -> Atributo para el segundo electronico.
     * @param e3 -> Atributo para el tercer electronico.
     * @param e4 -> Atributo para el cuarto electronico.
     * @param e5 -> Atributo para el quinto electronico.
     */
    public Electronicos(String e1, String e2, String e3, String e4, String e5) {
        setElectronicos(1, e1);
        setElectronicos(2, e2);
        setElectronicos(3, e3);
        setElectronicos(4, e4);
        setElectronicos(5, e5);
    }
    
    /**
     * Metodo get
     * @return electronicos -> Regresa el atributo electronicos.
     */
    public HashMap<Integer,String> getElectronicos() {
        return this.electronicos;
    }
    /**
     * Metodo set
     * @param llave -> Para especificar la llave del valor a insertar.
     * @param electronico -> Para agregar un valor de electronico al atributo electronicos.
     */
    public void setElectronicos(int llave, String electronico) {
        this.electronicos.put(llave, electronico);
    }
    
    /**
     * Metodo para verficar el valor de una llave
     * @param llave -> Llave a verificar dentro del atributo electronicos.
     */
    public void verificarLlave(int llave) {
        if(this.electronicos.containsKey(llave)) {
            System.out.println("El contenido de la llave " + llave + " es: " + this.electronicos.get(llave));
        } else {
            System.out.println("La llave no existe en el mapa...");
        }
    }
}
