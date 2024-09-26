package mx.unam.fi.poo.g1.p4;

import mx.unam.fi.poo.g1.p4.CuentaBanco;
/**
 * Clase principal de Practica 4
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class Practica4 {
    /**
     * Método main
     * Se ejecuta toda la aplicacion.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        CuentaBanco c1 = new CuentaBanco("Aldo Axel Estrada Zacarias", 57432758, 350);
        CuentaBanco c2 = new CuentaBanco("Johana Berenice Salinas Rodriguez", 78046835, 1000);
        
        System.out.println("Informacion de las cuentas:");
        c1.imprimirInfoCuenta(); 
        c2.imprimirInfoCuenta();
        
        System.out.println("\nDepositos:");
        c1.deposito(1500.5);
        c2.deposito(2300);
        
        System.out.println("\nInformacion de las cuentas despues de depositos:");
        c1.imprimirInfoCuenta();
        c2.imprimirInfoCuenta();
        
        System.out.println("\nRetiros:");
        c1.retiro(500.3);
        c2.retiro(1200.5);
        
        System.out.println("\nInformacion de las cuentas despues de retiros:");
        c1.imprimirInfoCuenta();
        c2.imprimirInfoCuenta();
    }
}
