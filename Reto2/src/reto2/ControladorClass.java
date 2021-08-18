/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import class_pkg.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author naraly
 */
public class ControladorClass {
    private static final Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[32m";
    
    public static void main(String[] args) {
        Reto2_EmpleadoClass empleado = new Reto2_EmpleadoClass();
        Reto2_ClienteClass cliente = new Reto2_ClienteClass();
        System.out.println(ANSI_PURPLE + "==================================================================" + ANSI_RESET);
         System.out.println(ANSI_PURPLE +"CAMACHO´S 2021"+ ANSI_RESET);
        System.out.println(ANSI_PURPLE +"=================================================================="+ ANSI_RESET);
        System.out.println("Deseas trabajar con:\n      1. Empleados\n      2. Clientes");
        int option = Integer.parseInt(inst_datos.nextLine());
        if(option == 1){
            Reto2_EmpleadoClass.crud_empleados();
        }else if(option == 2){
            cliente.crud_cliente();
        }else{
            System.out.println(ANSI_RED + "OPCIÓN INVÁLIDA"+ ANSI_RESET);
        }
    }
    
}
                    
    