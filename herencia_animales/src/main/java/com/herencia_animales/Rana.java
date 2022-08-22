package com.herencia_animales;

public class Rana extends Animal {
    //ATRIBUTOS
    private boolean venenosa;

    //CONSTRUCTOR
    public Rana(String color, double peso, double tamanio, boolean mamifero, boolean vertebrado, int edad,
    char genero, boolean venenosa){
        //Enviar parámetros a la superClase 'Animal'
        super(color, peso, tamanio, mamifero, vertebrado, edad, genero);
        this.venenosa = venenosa;
    }

    //CONSULTORES
    public boolean isVenenosa() {
        return venenosa;
    }

    //MODIFICADORES
    public void setVenenosa(boolean venenosa){
        this.venenosa = venenosa;
    }

    //ACCIONES

    //POLIMORFISMO
    @Override
    public void avanzar() {
        System.out.println("Saltar");
    }

}
