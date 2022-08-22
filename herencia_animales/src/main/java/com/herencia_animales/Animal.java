package com.herencia_animales;

public class Animal {
    //ATRIBUTOS
    private String color;
    private double peso;
    private double tamanio;
    private boolean mamifero;
    private boolean vertebrado;
    private int edad;
    private char genero;

    //CONSTRUCTOR
    public Animal(String color, double peso, double tamanio, boolean mamifero, boolean vertebrado, int edad,
            char genero) {
        this.color = color;
        this.peso = peso;
        this.tamanio = tamanio;
        this.mamifero = mamifero;
        this.vertebrado = vertebrado;
        this.edad = edad;
        this.genero = genero;
    }

    //CONSULTORES

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public boolean isMamifero() {
        return mamifero;
    }

    public boolean isVertebrado() {
        return vertebrado;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    //MODIFICADORES

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    //ACCIONES
    public void comer(){
        System.out.println("Comiendo...");
    }

    public void dormir(){
        System.out.println("Durmiendo...zzz");
    }

    public void avanzar(){
        System.out.println("Avanzando...");
    }
    
}
