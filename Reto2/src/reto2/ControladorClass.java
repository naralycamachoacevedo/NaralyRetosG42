/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;


/**
 *
 * @author apmejiar
 */
public class Controlador {
    private int salario;
    private static final Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[32m";
    private Reto2_CargoClass cargo;
    
    public Reto2_EmpleadoClass(int documento_id, String nombre, String correo, Reto2_CargoClass cargo, int salario) {
        super(documento_id, nombre, correo);
        this.cargo = cargo;
        this.salario = salario;   
    }
 
    public static Scanner getInst_datos() {
        return inst_datos;
   
    }
    
    public Reto2_CargoClass getCargo() {
        return cargo;
    }
    
    public void setCargo(Reto2_CargoClass cargo) {
        this.cargo = cargo;
    }
    
    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }    
   
     public static void crud_empleados(boolean exit_program){
        ArrayList<Reto2_EmpleadoClass> empleado_list = new ArrayList<>();
        boolean exit_system = false;
        //while(exit_system == true)
        while(!exit_system){
            System.out.println(ANSI_PURPLE + "MENU" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "SELECCIONA UNA OPCIÓN DEL MENU" + ANSI_RESET);
            System.out.println("    1. Crear empleado");
            System.out.println("    2. Listar empleados");
            System.out.println("    3. Editar empleado específico");
            System.out.println("    4. Eliminar empleado específico");
            System.out.println("    5. " + ANSI_RED + "SALIR" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "Ingresa tu respuesta" + ANSI_RESET);
            int option = Integer.parseInt(inst_datos.nextLine());
            //add(valor) => añadir al final
            //instancia.get(indice) => consultar un valor
            //instancia.set(indice, valor nuevo) => modificar determinado valor
            //remove(indice) => eliminar determinado valor
            switch(option){
                case 1: 
                    System.out.println(ANSI_PURPLE + "¿Cuántos empleados desear crear? " + ANSI_RESET);
                    int num_empleados = Integer.parseInt(inst_datos.nextLine());
                    System.out.println(ANSI_RED + "INFORMACIÓN DEL EMPLEADO" + ANSI_RESET);
                    for (int i = 1; i <= num_empleados; i++) {
                        System.out.println(ANSI_PURPLE +"//////////////////////////////Empleado "+ i + "///////////////////////////////"+ ANSI_RESET);
                        System.out.println(ANSI_PURPLE +"Nombre:"+ ANSI_RESET);
                        String name = inst_datos.nextLine();
                        System.out.println(ANSI_PURPLE +"Documento:"+ ANSI_RESET);
                        int document = Integer.parseInt(inst_datos.nextLine());
                        System.out.println(ANSI_PURPLE +"Correo:"+ ANSI_RESET);
                        String email = inst_datos.nextLine();
                        System.out.println(ANSI_PURPLE +"Cargo:"+ ANSI_RESET);
                        String job_p = inst_datos.nextLine();
                        System.out.println(ANSI_PURPLE +"Jerarquía:"+ ANSI_RESET);
                        String level = inst_datos.nextLine();
                        Reto2_CargoClass job = new Reto2_CargoClass(job_p, level);
                        System.out.println(ANSI_PURPLE +"Salario:"+ ANSI_RESET);
                        int salary = Integer.parseInt(inst_datos.nextLine());
                        Reto2_EmpleadoClass empleado = new Reto2_EmpleadoClass(document, name, email, job, salary);
                        empleado_list.add(empleado);
                    }
                    break;
                    
                case 2:
                    System.out.println("\n" + ANSI_RED + "TOTAL DE EMPLEADOS " + empleado_list.size()+ ANSI_RESET);
                    for (int i = 0; i < empleado_list.size(); i++) {
                        System.out.println(ANSI_PURPLE +"Empleado " + i + ANSI_RESET);
                        Reto2_EmpleadoClass empleado = (Reto2_EmpleadoClass)empleado_list.get(i);
                        System.out.println(ANSI_PURPLE +"Nombre: "+ empleado.getNombre()+ ANSI_RESET);
                        System.out.println(ANSI_PURPLE +"Documento: "+ empleado.getDocumento_id()+ ANSI_RESET);
                        System.out.println(ANSI_PURPLE +"Correo: "+ empleado.getCorreo()+ ANSI_RESET);
                        System.out.println(ANSI_PURPLE +"Cargo: "+ empleado.getCargo()+ ANSI_RESET);
                        System.out.println(ANSI_PURPLE +"Salario : "+ empleado.getSalario()+ ANSI_RESET);
                    }
                    break;
                case 3:
                    System.out.println(ANSI_PURPLE + "EDITAR INFORMACIÓN DE EMPLEADO" + ANSI_RESET);
                    System.out.println("Ingresa al indice del empleado a Editar");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= empleado_list.size()) {
                        Reto2_EmpleadoClass empleado = empleado_list.get(index);
                        System.out.println(ANSI_RED + "INFORMACION ACTUALIZADA" + ANSI_RESET);
                        System.out.println(ANSI_PURPLE + " Documento: " + ANSI_RESET + empleado.getDocumento_id());
                        System.out.println(ANSI_PURPLE + " Nombre: " + ANSI_RESET + empleado.getNombre());
                        System.out.println(ANSI_PURPLE + " Correo: " + ANSI_RESET + empleado.getCorreo());
                        System.out.println(ANSI_PURPLE + " Salario: " + ANSI_RESET + empleado.getSalario());
                        System.out.println("¿Que campo deseas editar?\n    1.Documento\n    2.Nombre\n    3.Correo\n    4.Salario\n");
                        int edit_field = Integer.parseInt(inst_datos.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.println(ANSI_CYAN + "Documento nuevo" + ANSI_RESET);
                                int documento = Integer.parseInt(inst_datos.nextLine());
                                empleado.setDocumento_id(documento);
                                break;
                            case 2:
                                System.out.println(ANSI_CYAN + "Nombre nuevo" + ANSI_RESET);
                                String nombre = inst_datos.nextLine();
                                empleado.setNombre(nombre);
                                break;
                            case 3: 
                                System.out.println(ANSI_CYAN + "Correo nuevo" + ANSI_RESET);
                                String correo = inst_datos.nextLine();
                                empleado.setCorreo(correo);
                                break;
                            case 4: 
                                System.out.println(ANSI_CYAN + "Salario nuevo" + ANSI_RESET);
                                int salario = Integer.parseInt(inst_datos.nextLine());
                                empleado.setSalario(salario);
                                break;
                               
                        }
                        System.out.println(ANSI_RED + "LA INFORMACIÓN DEL USUARIO HA SIDO ACTUALIZADA CON ÉXITO" + ANSI_RESET);                
                    }
                    
                    break;
                case 4:
                    System.out.println(ANSI_RED + "ELIMINAR EMPLEADO" + ANSI_RESET);
                    System.out.println("Ingresa al indice del empleado a eliminar");
                    int index_remove = Integer.parseInt(inst_datos.nextLine());
                    if (index_remove >= 0 && index_remove <= empleado_list.size()) {
                        Reto2_EmpleadoClass empleado = empleado_list.get(index_remove);
                        System.out.println(ANSI_RED + "INFORMACIÓN DEL EMPLEADO" + ANSI_RESET);
                        System.out.println(ANSI_PURPLE + "    Documento: " + ANSI_RESET);
                        System.out.println(ANSI_PURPLE + "    Nombre: " + ANSI_RESET);
                        System.out.println("¿Estás seguro que deseas eliminar a  ?" + ANSI_RESET);
                        String remove = inst_datos.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SI")) {
                            empleado_list.remove(index_remove);
                        } else {
                            System.out.println(ANSI_RED + "CANCELANDO PROCESO" + ANSI_RESET);
                        }
                        System.out.println(ANSI_PURPLE + "BASE DE DATOS EMPLEADOS ACTUALIZADA" + ANSI_RESET);
                        for (int i = 0; i < empleado_list.size(); i++) {
                            System.out.println("\n" + ANSI_PURPLE + "    Empleado " + (i + 1) + ANSI_RESET);
                            Reto2_EmpleadoClass empleado_new = empleado_list.get(i);
                            System.out.println(ANSI_PURPLE + "Documento: " + ANSI_RESET + empleado_new.getDocumento_id());
                            System.out.println(ANSI_PURPLE + "Nombre: " + ANSI_RESET + empleado_new.getNombre());
                            System.out.println(ANSI_PURPLE + "Correo: " + ANSI_RESET + empleado_new.getCorreo());
                            System.out.println(ANSI_PURPLE + "Salario: " + ANSI_RESET + empleado_new.getSalario());
                            System.out.println(ANSI_PURPLE + "Cargo: " + ANSI_RESET + empleado_new.getCargo());
                        }
                    }    
                case 5:
                    exit_program = true;
                    System.out.println(ANSI_RED + "SALIENDO DEL PROGRAMA" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "OPCIÓN INVALIDA" + ANSI_RESET);
            }
            
        }
        
    }
     
}
                    
    