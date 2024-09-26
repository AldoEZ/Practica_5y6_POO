package mx.unam.fi.poo.g1.p1;

/**
 * Clase Punto
 * @author Estrada Zacarias Aldo Axel
 * @version Septiembre-2024 
 */

public class Punto {
    /**
     * Atributo de radio de la Tierra.
     */
    public final double RADIO = 6371.01;
    
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    /**
     * Método constructor
     * Para construir objetos distancias.
     * @param x1 -> Atributo para una coordenada en x del punto 1
     * @param y1 -> Atributo para una coordenada en y del punto 1
     * @param x2 -> Atributo para una coordenada en x del punto 2
     * @param y2 -> Atributo para una coordenada en y del punto 2
     */
    public Punto(double x1, double y1, double x2, double y2) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }
    
    /**
     * Método get
     * @return x1 -> Regresa el atributo x1.
     */
    public double getX1() {
        return x1;
    }
    /**
     * Método set
     * @param x1 -> Para cambiar el dato de x1 de la distancia.
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }
    
    /**
     * Método get
     * @return y1 -> Regresa el atributo y1.
     */
    public double getY1() {
        return y1;
    }
    /**
     * Método set
     * @param y1 -> Para cambiar el dato de y1 de la distancia.
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }
    
    /**
     * Método get
     * @return x2 -> Regresa el atributo x2.
     */
    public double getX2() {
        return x2;
    }
    /**
     * Método set
     * @param x2 -> Para cambiar el dato de x2 de la distancia.
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    /**
     * Método get
     * @return y2 -> Regresa el atributo y2.
     */
    public double getY2() {
        return y2;
    }
    /**
     * Método set
     * @param y2 -> Para cambiar el dato de y2 de la distancia.
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    /**
     * Método para mostrar la distancia entre puntos
     * @return distancia -> Regresa la distacia entre los puntos.
     */
    public double distaciaPuntos() {
        double sin = (Math.sin(this.x1) * Math.sin(this.x2));
        double cos = (Math.cos(this.x1) * (Math.cos(this.x2) * Math.cos((this.y2-this.y1))));
        double sumSinCos = sin + cos;
        return this.RADIO * Math.acos(sumSinCos);
    }
}
