/**
 * Alumno: Miranda Sanchez Maria Fernanda
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package solidsingleresponsibility;

/**
 *
 * @author Fernanda
 */
public class SOLIDSingleResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * En el principio de unica responsabilidad, cada clase debe hacer una accion especifica 
         * El main ejecuta el programa
         */
       sumadora ob = new sumadora();
       ob.operacion();
        
    }
    
}
