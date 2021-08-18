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
public class Reto2_AdminClass extends Reto2_PersonClass{
    private int num_subordinados;
    private int categoria;

    public Reto2_AdminClass(int num_subordinados, int categoria, int documento_id, String nombre, String correo) {
        super(documento_id, nombre, correo);
        this.num_subordinados = num_subordinados;
        this.categoria = categoria;
    }

    /**
     * @return the num_subordinados
     */
    public int getNum_subordinados() {
        return num_subordinados;
    }

    /**
     * @param num_subordinados the num_subordinados to set
     */
    public void setNum_subordinados(int num_subordinados) {
        this.num_subordinados = num_subordinados;
    }

    /**
     * @return the categoria
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    
    
}
