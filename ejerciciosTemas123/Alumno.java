/**
 * Clase Alumno
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno {
    
    // Atributos
    private String     nombre;
    private int        edad;
    private double     notaTeoria;
    private double     notaPractica;
    private boolean    esChica;
     
    //Metodos 
    
    /**
     * Construye un alumno con los siguientes parametros
     * @param String nombre 
     * @param int edad
     * @param double notaTeorica
     * @param double notaPractica
     * @param boolean esChica
     */ 
    public Alumno(String nombre, int edad, double notaTeoria, double notaPractica, boolean esChica) {
        this.nombre         = nombre;
        this.edad           = edad;
        this.notaPractica   = notaPractica;
        this.notaTeoria     = notaTeoria;
        this.esChica        = esChica;
    }
    
    /**
    * Getter del atributo nombre.
    */
    public  String getNombre() {
        return this.nombre;
    } 
    
    /**
    * Setter del atributo nombre.
    */
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    } 
    
    /**
    * Getter del atributo edad.
    */
    public  int getEdad() {
        return this.edad;
    } 
    
    /**
    * Setter del atributo edad.
    */
    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    } 
    
    /**
     * Calcula la nota final del alumno.
     */
    public double calcularNotaFinal() {
         return notaTeoria * 0.8 + notaPractica * 0.2;
    }
    
    /** 
     * Indica si el alumno ha aprobado o no
     */
    public boolean estaAprobado (double notaUmbral) {
        double notaFinal =  this.calcularNotaFinal();
        return notaFinal >= notaUmbral;
    }
}