/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naral
 */
package class_pkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class Reto2_ClienteClass extends Reto2_PersonClass{
    private static final Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[32m";
    
    public Reto2_ClienteClass(int documento_id, String nombre, String correo) {
        super(documento_id, nombre, correo);
    }

    public void crud_cliente(){
        ArrayList<Reto2_ClienteClass> cliente_list = new ArrayList<>();
        boolean exit_program = false;
        //Ciclo para mostrar el menú de opciones
        //while(exit_program == true)
        while(!exit_program){
            System.out.println(ANSI_CYAN+"=================================================================="+ ANSI_RESET);
            System.out.println(ANSI_PURPLE + "SELECCIONA UNA OPCIÓN DEL MENÚ"+ ANSI_RESET);
            System.out.println("    1. Crear cliente");
            System.out.println("    2. Consultar clientes de Camacho´s 2021");
            System.out.println("    3. Editar cliente");
            System.out.println("    4. Eliminar cliente");
            System.out.println(ANSI_RED + "    5. SALIR"+ ANSI_RESET);
            System.out.println(ANSI_PURPLE +"Ingresa tu respuesta"+ ANSI_RESET);
            int option = Integer.parseInt(inst_datos.nextLine());
            // add(valor) => añadir al final
            // get(indice) => consultar un valor
            // set(indice, valor nuevo) => modificar determinado valor
            // remove(indice) => eliminar determinado valor
            switch(option){
                case 1:
                    System.out.println(ANSI_RED +"Cuántos clientes deseas añadir?"+ ANSI_RESET);
                    int num_clientes = Integer.parseInt(inst_datos.nextLine());
                    System.out.println("\n" +ANSI_CYAN +"=================================================================="+ ANSI_RESET);
                    System.out.println(ANSI_PURPLE + "FORMULARIO DE REGISTRO DE CLIENTES"+ ANSI_RESET);
                    for (int i = 1; i <= num_clientes; i++) {
                        System.out.println("\n" +ANSI_PURPLE +"       Cliente " + i +ANSI_RESET);
                        System.out.println(ANSI_PURPLE +"Documento:" + ANSI_RESET);
                        int documento_id = Integer.parseInt(inst_datos.nextLine());
                        
                        System.out.println(ANSI_PURPLE +"Nombre:" + ANSI_RESET);
                        String nombre = inst_datos.nextLine();
                        
                        System.out.println(ANSI_PURPLE +"Correo:" + ANSI_RESET);
                        String correo = inst_datos.nextLine();
                        
                        
                        Reto2_ClienteClass cliente = new Reto2_ClienteClass(documento_id, nombre, correo);
                        cliente_list.add(cliente);
                        System.out.println(ANSI_RED +"=======================CLIENTE CREADO CON ÉXITO======================="+ ANSI_RESET);
                    }
                    break;
                case 2:
                    System.out.println(ANSI_PURPLE + "BASE DE DATOS EMPLEADOS Camacho´s 2021" + ANSI_RESET);
                    for (int i = 0; i < cliente_list.size(); i++) {
                        System.out.println("\n" + ANSI_PURPLE + "       Empleado " + (i + 1) + ANSI_RESET);
                        Reto2_ClienteClass cliente = cliente_list.get(i);
                        System.out.println(ANSI_PURPLE + "Documento: " + ANSI_RESET + cliente.getDocumento_id());
                        System.out.println(ANSI_PURPLE + "Nombre: " + ANSI_RESET + cliente.getNombre());
                        System.out.println(ANSI_PURPLE + "Correo: " + ANSI_RESET + cliente.getCorreo());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_PURPLE + "EDITAR INFORMACIÓN DE EMPLEADO" + ANSI_RESET);
                    System.out.println("Ingresa el indice del empleado a Editar");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= cliente_list.size()) {
                        Reto2_ClienteClass client = cliente_list.get(index);
                        System.out.println(ANSI_RED + "=======================INFORMACIÓN ACTUAL DEL EMPLEADO=======================" + ANSI_RESET);
                        System.out.println(ANSI_PURPLE + "     Documento: " + ANSI_RESET + client.getDocumento_id());
                        System.out.println(ANSI_PURPLE + "     Nombre: " + ANSI_RESET + client.getNombre());
                        System.out.println(ANSI_PURPLE + "     Correo: " + ANSI_RESET + client.getCorreo());
                        
                        System.out.println("Que campo deseas editar?\n      1. Documento\n      2. Nombre\n      3. Correo");
                        int edit_field = Integer.parseInt(inst_datos.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.println(ANSI_CYAN + "Documento nuevo" + ANSI_RESET);
                                int documento_id = Integer.parseInt(inst_datos.nextLine());
                                client.setDocumento_id(documento_id);
                                break;
                            case 2:
                                System.out.println(ANSI_CYAN + "Nombre nuevo" + ANSI_RESET);
                                String nombre = inst_datos.nextLine();
                                client.setNombre(nombre);
                                break;
                            case 3:
                                System.out.println(ANSI_CYAN + "Correo nuevo" + ANSI_RESET);
                                String correo = inst_datos.nextLine();
                                client.setCorreo(correo);
                                break;
                            default:
                                    System.out.println(ANSI_CYAN + "OPCIÓN INVÁLIDA" + ANSI_RESET);
                                break;
                        }
                        System.out.println(ANSI_RED + "=================LA INFORMACIÓN DEL CLIENTE SE HA ACTUALIZADO EXITOSAMENTE=================" + ANSI_RESET);
                    }

                    break;
                case 4:
                    System.out.println(ANSI_RED + "ELIMINAR CLIENTE DE Camacho´s 2021" + ANSI_RESET);
                    System.out.println("Ingresa el indice del cliente a Eliminar");
                    int index_remove = Integer.parseInt(inst_datos.nextLine());
                    if (index_remove >= 0 && index_remove <= cliente_list.size()) {
                        Reto2_ClienteClass client = cliente_list.get(index_remove);
                        System.out.println(ANSI_RED + "=======================INFORMACIÓN DEL CLIENTE=======================" + ANSI_RESET);
                        System.out.println(ANSI_PURPLE + "     Documento: " + ANSI_RESET + client.getDocumento_id());
                        System.out.println(ANSI_PURPLE + "     Nombre: " + ANSI_RESET + client.getNombre());
                        System.out.println("Estás seguro que deseas eliminar a " + ANSI_PURPLE + client.getNombre() + "? (Si, No)" + ANSI_RESET);
                        String remove = inst_datos.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            cliente_list.remove(index_remove);
                        } else {
                            System.out.println(ANSI_RED + "=======================CANCELANDO PROCESO=======================" + ANSI_RESET);
                        }
                        System.out.println(ANSI_PURPLE + "BASE DE DATOS DE CLIENTES ACTUALIZADA Camacho´s 2021" + ANSI_RESET);
                        for (int i = 0; i < cliente_list.size(); i++) {
                            System.out.println("\n" + ANSI_PURPLE + "       Cliente " + (i + 1) + ANSI_RESET);
                            Reto2_ClienteClass client_new = cliente_list.get(i);
                            System.out.println(ANSI_PURPLE + "Documento: " + ANSI_RESET + client_new.getDocumento_id());
                            System.out.println(ANSI_PURPLE + "Nombre: " + ANSI_RESET + client_new.getNombre());
                            System.out.println(ANSI_PURPLE + "Correo: " + ANSI_RESET + client_new.getCorreo());
                        }
                    }

                    break;
                case 5:
                    exit_program=true;
                    System.out.println(ANSI_RED + "=======================SALIENDO DEL PROGRAMA=======================" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "=========================OPCIÓN INVÁLIDA========================="+ ANSI_RESET);
            }
        }
    }
}