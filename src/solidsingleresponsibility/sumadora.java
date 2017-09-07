/**
 * Alumno: Miranda Sanchez Maria Fernanda
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package solidsingleresponsibility;

import java.util.Scanner;

/**
 *
 * @author Fernanda 
 */

/**
 * Realiza la operacion que se necesita 
 * Este programa sigue el primer principio ya que cada clase cumple con realizar una sola funcion
 * romperia con el principio si todo se encontrara en el metodo main 
 */ 
public class sumadora {
    Scanner leer=new Scanner(System.in);
    datos obj = new datos();
    int n1; 
    int n2;
    void operacion(){
        System.out.println("Ingresa  numero 1");
        n1=leer.nextInt();
         System.out.println("Ingresa numero 2");
        n2=leer.nextInt();
        obj.setNum1(n1);
        obj.setNum2(n2);
        
        int resultado = obj.getNum1()+obj.getNum2();
        System.out.println("El resultado es:  "+resultado);
        
    }
    
    
    
}
