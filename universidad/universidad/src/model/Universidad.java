package model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Universidad {
    // ATRIBUTOS
    private String nombre;
    private String nit;
    private String direccion;
    private ArrayList<String> telefonos;
    private String email;
    private ArrayList<Facultad> facultades;
    private Map<String, ArrayList<Estudiante>> matriculas;

    // CONSTRUCTOR
    public Universidad(String nombre, String nit, String direccion, String email) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.email = email;
        this.facultades = new ArrayList<Facultad>();
        this.matriculas = new LinkedHashMap<String, ArrayList<Estudiante>>();
    }

    // CONSULTORES
    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public String getEmail() {
        return email;
    }

    // MODIFICADORES
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ACCIONES
    public void crearFacultad(String codigo, String nombre) {
        // Crear objeto de tipo Facultad
        Facultad objFacultad = new Facultad(codigo, nombre);
        facultades.add(objFacultad);
    }

    public boolean matricularEstudiante(String nombre, String apellido, int edad, String cedula, String sexo,
            String codigoFacultad) {
        boolean estudiante_matriculado = false;
        // Validar si la facultad existe
        if (validarFacultad(codigoFacultad)) {
            // Crear objeto de tipo Estudiante
            Estudiante objEstudiante = new Estudiante(nombre, apellido, edad, cedula, sexo, "12345");
            // Validar si por lo menos hay un estudiante matriculado en la facultad
            if (matriculas.containsKey(codigoFacultad)) {
                // Adicionando el nuevo estudiante al arrayList que contiene el código de la
                // facutlad
                matriculas.get(codigoFacultad).add(objEstudiante);
            } else {
                // Crear arrayList con el nuevo estudiante (el arrayList es el valor en el Map
                // 'matriculas')
                ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
                estudiantes.add(objEstudiante);
                // matricular estudiante
                matriculas.put(codigoFacultad, estudiantes);
            }
            estudiante_matriculado = true;
        }
        return estudiante_matriculado;
    }

    /**
     * 
     * Método que valida la existencia de una facultad
     * por medio de su código.
     * Recibe como parámetros:
     * * codigo: String
     * y Retorna un boolean (true si existe, false en caso contrario)
     */
    public boolean validarFacultad(String codigo) {
        boolean existe = false;
        for (int i = 0; i < facultades.size(); i++) {
            if (facultades.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

}

/********
 * 
 * NOTA:
 * No concatenar variables directamente en una consulta SQL porque
 * genera problemas de SQLI (SQL Injection)
 * 
 * String usuario = "andres";
 * String password = " \" OR 1=1-- ";
 * 
 * SELECT * FROM users WHERE name = usuario AND pass = password;
 * 
 * SELECT * FROM users WHERE name = "andres" AND pass = " " OR 1=1-- ";
 * 
 */
