/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

/**
 *
 * @author naral
 */
public class Reto2_CargoClass {
    private String nombre_cargo;
    private String nivel_jerarquico;

    public Reto2_CargoClass(String nombre_cargo, String nivel_jerarquico) {
        this.nombre_cargo = nombre_cargo;
        this.nivel_jerarquico = nivel_jerarquico;
    }
    
    /**
     * @return the nombre_cargo
     */
    public String getNombre_cargo() {
        return nombre_cargo;
    }

    /**
     * @param nombre_cargo the nombre_cargo to set
     */
    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }

    /**
     * @return the nivel_jerarquico
     */
    public String getNivel_jerarquico() {
        return nivel_jerarquico;
    }

    /**
     * @param nivel_jerarquico the nivel_jerarquico to set
     */
    public void setNivel_jerarquico(String nivel_jerarquico) {
        this.nivel_jerarquico = nivel_jerarquico;
    }
           
    
}
