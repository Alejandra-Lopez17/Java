package com.ejemplo_mvc.model;

public class Universidad {
    // ATRIBUTOS
    private String nit;
    private String nombre;
    private String direccion;
    private String email;

    // CONSTRUCTOR
    public Universidad(String nit, String nombre, String direccion, String email) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    @Override
    public String toString() {
        String info = "\n-------------" + nombre + "--------------\n";
        info += "Nit: " + nit;
        info += "\nDireccion: " + direccion;
        info += "\nEmail: " + email;
        info += "\n-----------------------------------------------------------\n";
        return info;
    }

    // --------CONSULTORES---------

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    // ----------MODIFICADORES----------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
