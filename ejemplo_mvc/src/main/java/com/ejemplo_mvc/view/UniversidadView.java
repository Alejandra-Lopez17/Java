package com.ejemplo_mvc.view;

import java.util.Scanner;

import com.ejemplo_mvc.controller.UniversidadController;

public class UniversidadView {
    // ATRIBUTOS
    private UniversidadController uController;

    // CONSTRUCTOR
    public UniversidadView() {
        uController = new UniversidadController();
    }

    public UniversidadController getUcontroller() {
        return uController;
    }

    public void crearUniversidad(Scanner sc) {
        System.out.println("-----------CREAR UNIVERSIDAD------------");
        System.out.println("Por favor ingrese los siguientes datos: ");
        try {
            // Solicitar nit
            System.out.print("Nit: ");
            String nit = sc.next();
            sc.nextLine();
            // Solicitar nombre
            System.out.print("Nombre: ");
            String nombre = sc.next();
            sc.nextLine();
            // Solicitar dirección
            System.out.print("Direccion: ");
            String direccion = sc.next();
            sc.nextLine();
            // Solicitar email
            System.out.print("Email: ");
            String email = sc.next();
            sc.nextLine();
            // Enviar los datos al controlador
            uController.crearUniversidad(nit, nombre, direccion, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mostrarUniversidades() {
        for (int i = 0; i < uController.getCantidadUniversidades(); i++) {
            System.out.println(uController.getUniversidadByIndex(i));
        }
    }

    public void mostrarUniversidadXnit(Scanner sc) {
        System.out.println("-----------CONSULTAR UNIVERSIDAD POR NIT---------");
        System.out.println("Por favor ingrese la siguiente informacion: ");
        try {
            System.out.print("Nit: ");
            String nit = sc.next();
            String strUniversidad = uController.getUniversidadByNit(nit);
            System.out.println(strUniversidad);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarUniversidadXnit(Scanner sc) {
        System.out.println("-----------ELIMINAR UNIVERSIDAD POR NIT---------");
        System.out.println("Por favor ingrese la siguiente informacion: ");
        try {
            System.out.print("Nit: ");
            String nit = sc.next();
            uController.eliminarUniversidad(nit);
            System.out.println("Universidad eliminada con exito");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void menu() {
        // Opciones del usuario
        String mensaje = "-----------------UNIVERSIDADES-------------\n";
        mensaje += "1) Crear universidad\n";
        mensaje += "2) Mostrar todas las universidades\n";
        mensaje += "3) Mostrar universidad por nit\n";
        mensaje += "4) Eliminar universidad\n";
        mensaje += "-1) Salir\n";
        mensaje += ">>> ";
        // Objeto scanner y variable que representa la opción ingresada por el usuario
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        while (opcion != -1) {
            System.out.print(mensaje);
            opcion = sc.nextInt();
            // Evaluar la opción ingresada por el usuario
            switch (opcion) {
                case 1:
                    crearUniversidad(sc);
                    break;
                case 2:
                    mostrarUniversidades();
                    break;
                case 3:
                    mostrarUniversidadXnit(sc);
                    break;
                case 4:
                    eliminarUniversidadXnit(sc);
                    break;
                default:
                    break;
            }
        }
    }

}
