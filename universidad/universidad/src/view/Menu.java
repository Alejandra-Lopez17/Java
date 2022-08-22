package view;

import java.util.Scanner;

import controller.UniversidadController;

public class Menu {
    // ATRIBUTOS
    private UniversidadController uController;

    public Menu(UniversidadController uController) {
        this.uController = uController;
    }

    public void crearMenu() {
        // CREACION DE OBJETOS DE TIPO VIEW
        UniversidadView uView = new UniversidadView(uController);

        // Opciones del menu
        String mensaje = "\n\n--------------DASHBOARD---------------\n\n";
        mensaje += "1) Crear Universidad\n";
        mensaje += "2) Mostrar Universidades\n";
        mensaje += "3) Buscar Universidad\n";
        mensaje += "4) Actualizar Universidad\n";
        mensaje += "5) Eliminar Universidad\n";
        mensaje += "-1) Salir\n";
        mensaje += ">>> ";
        int opcion = 0;
        /*
         * Scanner sc = new Scanner(System.in);
         * try {
         * while (opcion != -1) {
         * System.out.print(mensaje);
         * opcion = sc.nextInt();
         * // Evaluar
         * switch (opcion) {
         * case 1:
         * uView.crearUniversidad(sc);
         * break;
         * case 2:
         * uView.mostrarUniversidades();
         * break;
         * default:
         * break;
         * }
         * }
         * sc.close();
         * } catch (Exception e) {
         * System.err.
         * println("Por favor ingrese valores numericos en las opciones del menu");
         * }
         */
    }

}
