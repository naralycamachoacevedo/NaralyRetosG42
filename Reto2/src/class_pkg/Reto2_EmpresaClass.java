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
public class Reto2_EmpresaClass {
    private String nombre_empresa;
    private String NIT;

    public Reto2_EmpresaClass(String nombre_empresa, String NIT) {
        this.nombre_empresa = nombre_empresa;
        this.NIT = NIT;
    }

    /**
     * @return the nombre_empresa
     */
    public String getNombre_empresa() {
        return nombre_empresa;
    }

    /**
     * @param nombre_empresa the nombre_empresa to set
     */
    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
    
}
