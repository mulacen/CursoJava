/**
 * Ordenador
 * @author JCG 
 * @version (VER 2015)
 */
public class Ordenador {
    
    // Atributos
    private boolean esSobremesa;
    private double precio;
    private boolean esTactil;
    
    //Metodos
    /**
     * Constructor
     */
    public Ordenador(boolean esSobremesa, double precio,boolean esTactil){
        this.esSobremesa    = esSobremesa;
        this.precio         = precio;
        this.esTactil       = esTactil;  
    }
    
    /**
     * Getter el atributo ordenador.
     */
    public boolean getEsSobremesa() {
        return this.esSobremesa;
    }
    
    /**
     * Setter el atributo ordenador.
     */
    public void setEsSobremesa(boolean esSobremesa) {
        this.esSobremesa = esSobremesa;
    }

     /**
     * Getter el atributo ordenador.
     */
    public double getPrecio() {
        return this.precio;
    }
    
    /**
     * Setter el atributo ordenador.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     /**
     * Getter el atributo ordenador.
     */
    public boolean getEsTactil() {
        return this.esTactil;
    }
    
    /**
     * Setter el atributo ordenador.
     */
    public void setEsTactil(boolean esTactil) {
        this.esTactil = esTactil;
    }
    
    /**
     * calcula el precio total del numero de ordenadores
     */
    public double calcularPrecio(int numeroOrdenadores){
        return this.precio * numeroOrdenadores;
    }
    
    /**
     * Ordenador caro o barato.
     */
    public boolean esCaro() {
        return this.precio > 1000;
    }
    
    
    
}