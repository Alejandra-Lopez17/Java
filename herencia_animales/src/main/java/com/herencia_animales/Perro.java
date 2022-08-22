package com.herencia_animales;

public class Perro extends Animal {
    //ATRIBUTOS
    private String raza;

    //CONSTRUCTOR
    public Perro(String color, double peso, double tamanio, boolean mamifero, boolean vertebrado, int edad, char genero,
            String raza) {
        super(color, peso, tamanio, mamifero, vertebrado, edad, genero);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    //POLIMORFISMO
    @Override
    public void avanzar() {
        System.out.println("Caminar");
    }

}
