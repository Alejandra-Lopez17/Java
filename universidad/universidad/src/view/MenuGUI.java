package view;

import javax.swing.JOptionPane;

import controller.UniversidadController;

public class MenuGUI {
    // ATRIBUTOS
    private UniversidadController uController;

    public MenuGUI(UniversidadController uController) {
        this.uController = uController;
    }

    public void construirMenu() {
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
        int opcion = 0;
        try {
            while (opcion != -1) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
                // Evaluar
                switch (opcion) {
                    case 1:
                        uView.crearUniversidad();
                        break;
                    case 2:
                        uView.mostrarUniversidades();
                        break;
                    case 3:
                        uView.mostrarUniversidadXnit();
                        break;
                    case 4:
                        uView.actualizarUniversidad();
                        break;
                    case 5:
                        uView.eliminarUniversidad();
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Por favor ingrese valores numericos en las opciones del menu");
        }
    }

    public void intro() {
        // Ventana emergente para mostrar información
        JOptionPane.showMessageDialog(null, "Esto es un mensaje de prueba con GUI");
        // Ventana emergente para solicitar datos
        String nombre = JOptionPane.showInputDialog(null, "Por favor ingrese su nombre");
        // Mostrar nombre
        JOptionPane.showMessageDialog(null, "Su nombre es: " + nombre);
    }
}

/****
 * Graphical
 * User
 * Interface
 * Españo: Interfaz de usuario gráfica
 */
