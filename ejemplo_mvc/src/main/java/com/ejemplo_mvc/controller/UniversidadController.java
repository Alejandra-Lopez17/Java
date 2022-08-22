package com.ejemplo_mvc.controller;

import java.util.ArrayList;

import com.ejemplo_mvc.model.Universidad;

public class UniversidadController {
    // ATRIBUTOS
    private ArrayList<Universidad> universidades;

    // CONSTRUCTOR
    public UniversidadController() {
        this.universidades = new ArrayList<Universidad>();
    }

    public int getCantidadUniversidades() {
        return universidades.size();
    }

    public void crearUniversidad(String nit, String nombre, String direccion, String email) {
        // Crear objeto de tipo Universidad
        Universidad objUni = new Universidad(nit, nombre, direccion, email);
        // Añadir objeto al arrayList
        universidades.add(objUni);
    }

    public String getUniversidadByIndex(int index) {
        Universidad objUni = universidades.get(index);
        return objUni.toString();
    }

    public String getUniversidadByNit(String nit) {
        String strUniversidad = "";
        // Iterar arrayList
        for (Universidad universidad : universidades) {
            if (universidad.getNit().equalsIgnoreCase(nit)) {
                strUniversidad = universidad.toString();
                break;
            }
        }
        return strUniversidad;
    }

    public void eliminarUniversidad(String nit) {
        int index = -1;
        for (int i = 0; i < getCantidadUniversidades(); i++) {
            if (universidades.get(i).getNit().equalsIgnoreCase(nit)) {
                index = i;
            }
        }
        if (index >= 0) {
            universidades.remove(index);
        }

    }
}
