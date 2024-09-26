package mx.unam.fi.poo.g1.p4;

/**
 * Clase CuentaBanco
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class CuentaBanco {
    private String nombre;
    private int cuenta;
    private double depositoInicial;
    
    /**
     * Metodo constructor
     * Para construir objetos CuentaBanco.
     * @param nombre -> Atributo para asignar el nombre de usuario.
     * @param cuenta -> Atributo para asignar el numero de cuenta del usuario.
     * @param depositoInicial -> Atributo para dar un deposito inicial.
     */
    public CuentaBanco(String nombre, int cuenta, double depositoInicial) {
        setNombre(nombre);
        setCuenta(cuenta);
        setDepositoInicial(depositoInicial);
    }
    
    /**
     * Metodo get
     * @return nombre ->  Regresa el atributo nombre.
     */
    public String getNombre() {
        return this.nombre;
    }
    /**
     * Metodo set
     * @param nombre -> Atributo para asignar un nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo get
     * @return cuenta ->  Regresa el atributo cuenta.
     */
    public int getCuenta() {
        return this.cuenta;
    }
    /**
     * Metodo set
     * @param cuenta -> Atributo para asignar una cuenta.
     */
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * Metodo get
     * @return depositoInicial ->  Regresa el atributo depositoInicial.
     */
    public double getDepositoInicial() {
        return this.depositoInicial;
    }
    /**
     * Metodo set
     * @param depositoInicial -> Atributo para asignar un valor a depositoInicial.
     */
    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
    
    /**
     * Metodo para imprimir la informacion de la cuenta.
     */
    public void imprimirInfoCuenta() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("No. de Cuenta: " + this.getCuenta());
        System.out.println("Dinero en la cuenta: " + this.getDepositoInicial());
    }
    /**
     * Metodo para hacer un deposito al depositoInicial.
     * @param deposito -> Parametro que especifica el deposito a realizar.
     */
    public void deposito(double deposito) {
        this.setDepositoInicial(this.getDepositoInicial() + deposito);;
        System.out.println("El deposito por " + deposito + " se realizo exitosamente.");
    }
    /**
     * Metodo para hacer un retiro al depositoInicial.
     * @param retiro -> Parametro que indica el retiro a realizar.
     */
    public void retiro(double retiro) { 
        this.setDepositoInicial(this.getDepositoInicial() - retiro);;
        System.out.println("El retiro por " + retiro + " se realizo exitosamente.");
    }
}
