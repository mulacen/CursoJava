
/**
 * ClaSe ProgramaAlumno
 * 
 * @author Joaquin
 * @version 2015
 */
public class ProgramaAlumo {
   /**
    * mETODO PRINCIPAL DEL PROGRAMA
    */
    public static void main(String[] args) {
        Alumno paula = new Alumno("Paula", 18, 8.4, 3.2, true);
        System.out.println(paula.getNombre());
        System.out.println(paula.getEdad());
        System.out.println(paula.calcularNotaFinal());
    }
    
    
}
