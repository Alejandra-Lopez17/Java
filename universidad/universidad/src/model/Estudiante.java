package model;

public class Estudiante extends Persona {
    // ATRIBUTOS
    private String codigo;

    public Estudiante(String nombre, String apellido, int edad, String cedula, String sexo, String codigo) {
        // Envía los parámetros al método de la super clase Persona
        super(nombre, apellido, edad, cedula, sexo);
        this.codigo = codigo;
    }

    // CONSULTOR
    public String getCodigo() {
        return codigo;
    }

    // MODIFICADOR
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
