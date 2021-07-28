/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

/**
 *
 * @author naraly
 */
public class PersonClass {
    
    //1.Declarar las variables globales con tipo de visibilidad privada
    //2.Encapsulate fields, clic secundario + Refactor + Encapsulate fields (GET y SET)
    //3.Insertar método ejecutor de la clase, clic secundario + Insert code + Constructor
    //4.Creación de la función que permite consultar info de la persona (GETTER)
    
    private int nro_documento; 
    private String nombre;
    private String tipo_doc;
    private int edad; 
    private String estado_civil;
    private String ocupacion;
    private boolean hijos;

    //Los métodos utilizan la palabra reservada VOID (vacío)
    //Las funciones no utilizan VOID pero si el tipo de dato que retornan
    
    public PersonClass(int nro_documento, String nombre, String tipo_doc, int edad, String estado_civil, String ocupacion, boolean hijos) {
        this.nro_documento = nro_documento;
        this.nombre = nombre;
        this.tipo_doc = tipo_doc;
        this.edad = edad;
        this.estado_civil = estado_civil;
        this.ocupacion = ocupacion;
        this.hijos = hijos;   
    }
    
    /**
     * @return the nro_documento
     */
    public int getNro_documento() {
        return nro_documento;
    }

    /**
     * @param nro_documento the nro_documento to set
     */
    public void setNro_documento(int nro_documento) {
        this.nro_documento = nro_documento;
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
     * @return the tipo_doc
     */
    public String getTipo_doc() {
        return tipo_doc;
    }

    /**
     * @param tipo_doc the tipo_doc to set
     */
    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the estado_civil
     */
    public String getEstado_civil() {
        return estado_civil;
    }

    /**
     * @param estado_civil the estado_civil to set
     */
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * @return the ocupacion
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * @param ocupacion the ocupacion to set
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * @return the hijos
     */
    public boolean isHijos() {
        return hijos;
    }

    /**
     * @param hijos the hijos to set
     */
    public void setHijos(boolean hijos) {
        this.hijos = hijos;
    }
    
    //La función debe retornar una expresión
    //El tipo de dato de la expresión que retorna es String
    public String funcion_consultar_info_P(){
        return "Consulta de información de la persona\n*****FORMA 1: Función*****" + getNro_documento() + " " + getNombre() + " " + getTipo_doc() + " " + getEdad() + " " + getEstado_civil() + " " + getOcupacion() + " " + isHijos();
    }
    
    //El método lo debemos declarar utilizando la palabra reservada VOID
    public void metodo_consultar_info_P(){
        System.out.println("Consulta de información de la persona\n*****FORMA 2: Método*****" + getNro_documento() + " " + getNombre() + " " + getTipo_doc() + " " + getEdad() + " " + getEstado_civil() + " " + getOcupacion() + " " + isHijos()); 
    }    
}
    
