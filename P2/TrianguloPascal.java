package mx.unam.fi.poo.g1.p2;

/**
 * Clase triangulo de pascal
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024
 */

public class TrianguloPascal {
    private int n;
    
    /**
     * Metodo constructor
     * Para construir objetos triangulo pascal.
     * @param n -> Atributo para el numero de filas del triangulo de pascal.
     */
    public TrianguloPascal(int n) {
        setN(n);
    }
    
    /**
     * Metodo get
     *  @return n -> Regresa el atributo n.
     */
    public int getN() {
        return this.n;
    }
    /**
     * Metodo set
     * @param n -> Para cambiar el dato de n del triangulo de pascal.
     */
    public void setN(int n) {
        this.n = n;
    }
    
    /**
     * Metodo para generar triangulo de pascal
     */
    public void trianguloPascal() {
        for(int i = 0; i < this.n; i++) {
            int num = 1;
            
            for(int j = 1; j <= (this.n-i); j++)
                System.out.print(" ");
            
            for(int k = 0; k <= i; k++){
                System.out.print(num  + " ");
                num = num * (i-k) / (k+1);
            }
            System.out.println("");
        }
    }
}
