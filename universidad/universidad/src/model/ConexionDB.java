package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
    // ATRIBUTOS
    private Connection conexion;

    // CONSTRUCTOR
    public ConexionDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:universidad_grupo42");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // CONSULTOR
    public Connection getConexion() {
        return conexion;
    }

    // ACCIONES
    public void cerrarConexion() throws SQLException {
        conexion.close();
    }

    public void insertar(String query) throws SQLException {
        Statement st = conexion.createStatement();
        st.executeUpdate(query);
    }
}
