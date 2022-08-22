package controller;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import model.ConexionDB;
import model.Universidad;
import model.dao.UniversidadDao;

public class UniversidadController {
    // ATRIBUTOS
    private ArrayList<Universidad> universidades;
    private ConexionDB objConn;

    // --CONSTRUCTORES

    public UniversidadController() {
        universidades = new ArrayList<Universidad>();
        objConn = new ConexionDB();
    }

    public UniversidadController(ConexionDB objConn) {
        universidades = new ArrayList<Universidad>();
        this.objConn = objConn;
    }

    // CONSULTORES
    public int getCantidadUniversidades() {
        return universidades.size();
    }

    // --ACCIONES
    public boolean crearUniversidad(String nombre, String nit, String direccion, String email) {
        // Crear objeto de tipo Universidad
        UniversidadDao objUni = new UniversidadDao(nombre, nit, direccion, email);
        // Crear universidad en la BD
        boolean insert = objUni.insert(objConn.getConexion());
        return insert;
    }

    public boolean actualizarUniversidad(String nit, String nombre, String direccion, String email) {
        boolean update = UniversidadDao.updateByNit(objConn.getConexion(), nit, nombre, direccion, email);
        return update;
    }

    public boolean eliminarUniversidad(String nit) {
        boolean delete = UniversidadDao.deleteByNit(objConn.getConexion(), nit);
        return delete;
    }

    public ResultSet consultarUniversidades() {
        return UniversidadDao.selectAll(objConn.getConexion());
    }

    public ResultSet consultarUniversidadXnit(String nit) {
        return UniversidadDao.selectUniversidadByNit(objConn.getConexion(), nit);
    }

}
