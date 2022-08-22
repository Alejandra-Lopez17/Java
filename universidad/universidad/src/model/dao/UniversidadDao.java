package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Universidad;

public class UniversidadDao extends Universidad {

    public UniversidadDao(String nombre, String nit, String direccion, String email) {
        super(nombre, nit, direccion, email);
    }

    // ---CONSULTAS SQL
    /***************************
     * 
     * QUERIES
     * 
     ***********************/

    /**
     * Método para almacenar una universidad en la base de datos,
     * retorna un valor booleano (true en caso de realizar la insercion, false en
     * caso contrario)
     * Recibe como parámetro un objeto de tipo Connection
     */
    public boolean insert(Connection conn) {
        boolean insert = false;

        try {
            String query = "INSERT INTO universidades VALUES(?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(query);
            // Setear la consulta
            pst.setString(1, getNit());
            pst.setString(2, getNombre());
            pst.setString(3, getDireccion());
            pst.setString(4, getEmail());
            // Ejecutar la consulta
            insert = pst.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return insert;
    }

    public static ResultSet selectAll(Connection conn) {
        ResultSet result = null;
        try {
            String query = "SELECT * FROM universidades";
            Statement st = conn.createStatement();
            result = st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static boolean updateByNit(Connection conn, String nit, String nombre, String direccion, String email) {
        boolean update = false;
        try {
            String query = "UPDATE universidades SET nombre = ?, direccion = ?, email = ? WHERE nit = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, nombre);
            pst.setString(2, direccion);
            pst.setString(3, email);
            pst.setString(4, nit);
            // Ejecutar
            update = pst.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }

    public static boolean deleteByNit(Connection conn, String nit) {
        boolean delete = false;
        try {
            String query = "DELETE FROM universidades WHERE nit = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, nit);
            delete = pst.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return delete;
    }

    public static ResultSet selectUniversidadByNit(Connection conn, String nit) {
        ResultSet result = null;
        try {
            String query = "SELECT * FROM universidades WHERE nit = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, nit);
            result = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
