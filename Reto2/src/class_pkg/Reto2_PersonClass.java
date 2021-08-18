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
public class Reto2_PersonClass {
    //1.Declarar variables clase
    private int documento_id;
    private String nombre;
    private String correo;
    
    //2.Insertar constructor clase
    
    public Reto2_PersonClass(int documento_id, String nombre, String correo) {
        this.documento_id = documento_id;
        this.nombre = nombre;
        this.correo = correo;
    }

    //3.Insertar GETTER y SETTER
    /**
     * @return the documento_id
     */
    public int getDocumento_id() {
        return documento_id;
    }

    /**
     * @param documento_id the documento_id to set
     */
    public void setDocumento_id(int documento_id) {
        this.documento_id = documento_id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
