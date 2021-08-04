/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import reto1.Reto1_PersonClass;
/**
 *
 * @author naral
 */
public class ControladorReto1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.Instanciar la clase persona
        Reto1_PersonClass insPerson = new Reto1_PersonClass("Naraly", "t.i", 1005092752, 17, "soltera", "estudiante", false);
        System.out.println("Su nombre es: " + insPerson.getNombre());
        System.out.println("Su tipo de documento es: " + insPerson.getTipo_doc());
        System.out.println("Su número de documento es: " + insPerson.getNro_documento());
        System.out.println("Su edad es: " + insPerson.getEdad());
        System.out.println("Su estado civil es: " + insPerson.getEstado_civil());
        System.out.println("Su ocupación es: " + insPerson.getOcupacion());
        System.out.println("¿Tiene hijos?: " + insPerson.isHijos());

    }
    
}
