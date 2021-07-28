/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladoReto1;

import reto1.PersonClass;

/**
 *
 * @author naral
 */
public class EjecutorClass {
    
    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        //1.Instanciar la clase persona
        PersonClass insPerson = new PersonClass(7542165, "Naraly", "c.c", 17, "casada", "estudiante", true);
        System.out.println("Su número de documento es: " + insPerson.getNro_documento());
        System.out.println("Su nombre es: " + insPerson.getNombre());
        System.out.println("Su tipo de documento es: " + insPerson.getTipo_doc());
        System.out.println("Su edad es: " + insPerson.getEdad());
        System.out.println("Su estado civil es: " + insPerson.getEstado_civil());
        System.out.println("Su ocupación actual es: " + insPerson.getOcupacion());
        System.out.println("¿Tiene hijos?: " + insPerson.isHijos());
    }
    
}
