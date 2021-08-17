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
public class Reto2_ClienteClass extends Reto2_PersonClass{
    private Reto2_EmpresaClass empresa;
    public Reto2_ClienteClass(int documento_id, String nombre, String correo) {
        super(documento_id, nombre, correo);
    }

    /**
     * @return the empresa
     */
    public Reto2_EmpresaClass getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Reto2_EmpresaClass empresa) {
        this.empresa = empresa;
    }
    
}
