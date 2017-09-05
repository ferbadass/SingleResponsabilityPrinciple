/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidsingleresponsibility;

/**
 *
 * @author 1047330056
 */
public class SOLIDSingleResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // En el principio de unica responsabilidad, cada clase debe hacer una accion especifica 
        //El main ejecuta el programa
       sumadora ob = new sumadora();
       ob.operacion();
        
    }
    
}
