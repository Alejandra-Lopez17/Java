package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import controller.UniversidadController;

public class UniversidadView {

    // ATRIBUTO
    private UniversidadController uController;

    // CONSTRUCTOR
    public UniversidadView(UniversidadController uController) {
        this.uController = uController;
    }

    // --INTERFAZ POR CONSOLA

    public void crearUniversidad() {
        // ENCABEZADO
        String encabezado = "---------------CREAR UNIVERSIDAD-----------\n";
        encabezado += "Por favor ingrese la siguiente información\n";
        // SOLICITAR INFORMACIÓN
        // Solicitar nombre
        String nombre = JOptionPane.showInputDialog(null, encabezado + "Nombre: ");
        // Solicitar nit
        String nit = JOptionPane.showInputDialog(null, encabezado + "Nit: ");
        // Solicitar direccón
        String direccion = JOptionPane.showInputDialog(null, encabezado + "Dirección: ");
        // Solicitar Email
        String email = JOptionPane.showInputDialog(null, encabezado + "Email: ");
        // ---Solicitar al controlador que cree una universidad
        boolean crear = uController.crearUniversidad(nombre, nit, direccion, email);
        if (crear) {
            JOptionPane.showMessageDialog(null, "Universidad creada con exito");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor intenta mas tarde");
        }
    }

    public void mostrarUniversidades() {
        ResultSet universidades = uController.consultarUniversidades();
        String info = "-----------------UNIVERSIDADES REGISTRADAS-----------------\n\n";
        try {
            while (universidades.next()) {
                info += "\n" + universidades.getString("nombre");
                info += "\n" + universidades.getString("nit");
                info += "\n" + universidades.getString("direccion");
                info += "\n" + universidades.getString("email");
                info += "\n------------------------------------------------------------------\n";
            }
            JOptionPane.showMessageDialog(null, info);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void mostrarUniversidadXnit() {
        String nit = JOptionPane.showInputDialog(null, "Buscar universidad\nPor favor ingrese el nit");
        // Buscar universidad
        try {
            ResultSet result = uController.consultarUniversidadXnit(nit);
            if (result.next()) {
                String info = "Nombre: " + result.getString("nombre");
                info += "\nNit: " + nit;
                info += "\nDirección: " + result.getString("direccion");
                info += "\nEmail: " + result.getString("email");
                // Mostrar información en pantalla
                JOptionPane.showMessageDialog(null, info);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actualizarUniversidad() {
        String encabezado = "---------------ACTUALIZAR UNIVERSIDAD------------\n";
        encabezado += "Por favor ingrese la siguiente información\n";
        // Solicitud de datos
        String nit = JOptionPane.showInputDialog(null, encabezado + "Nit:");
        // Validar si existe una universidad con el nit ingresado
        ResultSet result = uController.consultarUniversidadXnit(nit);
        try {
            if (result.next()) {
                String nombre = JOptionPane.showInputDialog(null, encabezado + "Nombre: ");
                String direccion = JOptionPane.showInputDialog(null, encabezado + "Dirección: ");
                String email = JOptionPane.showInputDialog(null, encabezado + "Email: ");
                // Enviar datos al controlador
                boolean update = uController.actualizarUniversidad(nit, nombre, direccion, email);
                if (update) {
                    JOptionPane.showMessageDialog(null, "Universidad actualizada con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor intenta mas tarde");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe una universidad con el nit ingresado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void eliminarUniversidad() {
        String encabezado = "---------------ELIMINAR UNIVERSIDAD------------\n";
        encabezado += "Por favor ingrese el nit de la universidad a eliminar";
        // Solicitar datos
        String nit = JOptionPane.showInputDialog(null, encabezado);
        // Validar si la universidad existe
        // Validar si existe una universidad con el nit ingresado
        ResultSet result = uController.consultarUniversidadXnit(nit);
        try {
            if (result.next()) {
                // Enviar nit al controlador
                if (uController.eliminarUniversidad(nit)) {
                    JOptionPane.showMessageDialog(null, "Universidad eliminada con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor intenta mas tarde");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe una universidad con el nit ingresado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
