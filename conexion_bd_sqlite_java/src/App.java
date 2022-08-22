
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        conectarBd();
    }

    public static void conectarBd() {
        try {
            // Generar conexión a BD
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:hr.db");
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos");
                // Crear objeto Statement para ejecutar consultas SQL
                Statement st = conexion.createStatement();
                // selectAllEmployees(st);
                // insertJob(conexion);
                // updateJob(conexion, "Community manager", 20);
                deleteJob(conexion, 20);
                selectAllJobs(st);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectAllEmployees(Statement st) throws SQLException {
        // Ejecutar query y capturar resultados
        ResultSet result = st.executeQuery("SELECT * FROM employees");
        // Iterar resultados
        while (result.next()) {
            // Obtener el nombre
            String nombre = result.getString("first_name");
            System.out.println("Nombre: " + nombre);
        }
    }

    public static void selectAllJobs(Statement st) throws SQLException {
        ResultSet result = st.executeQuery("SELECT * FROM jobs");
        while (result.next()) {
            System.out.println("Job: " + result.getString("job_title"));
            System.out.println("Id: " + result.getInt("job_id"));
        }
    }

    public static void insertJob(Connection conexion) throws SQLException {
        // Preparar consulta SQL
        PreparedStatement pst = conexion
                .prepareStatement("INSERT INTO jobs(job_title, min_salary, max_salary) VALUES(?, ?, ?)");
        // Setear valores de la consulta SQl
        pst.setString(1, "Developer");
        pst.setInt(2, 2000);
        pst.setInt(3, 15000);
        // Ejecutar consulta
        pst.executeUpdate();
    }

    public static void updateJob(Connection conexion, String job, int id) throws SQLException {
        PreparedStatement pst = conexion.prepareStatement("UPDATE jobs SET job_title = ? WHERE job_id = ?");
        pst.setString(1, job);
        pst.setInt(2, id);
        // Ejecutar consulta
        pst.executeUpdate();
    }

    public static void deleteJob(Connection conexion, int id) throws SQLException {
        PreparedStatement pst = conexion.prepareStatement("DELETE FROM jobs WHERE job_id = ?");
        pst.setInt(1, id);
        // Ejecutar la consulta
        pst.executeUpdate();
    }

}
