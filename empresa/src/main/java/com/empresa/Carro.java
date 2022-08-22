package com.empresa;

public class Carro {
    //ATRIBUTOS
    private String color;
    private double vel_maxima;
    private String modelo;
    private String placa;

    public Carro(String color, double vel_maxima, String modelo, String placa) {
        this.color = color;
        this.vel_maxima = vel_maxima;
        this.modelo = modelo;
        this.placa = placa;
    }

    public Carro(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
        this.color = "";
        this.vel_maxima = 0.0;
    }

    @Override
    public String toString() {
        String info = "-----------CARRO-----------\n";
        info += "Placa: "+placa;
        info += "\nModelo: "+modelo;
        info += "\nColor: "+color;
        info += "\nVelocidad maxima: "+vel_maxima+"\n";
        return info;
    }

    public String getColor() {
        return color;
    }

    public double getVel_maxima() {
        return vel_maxima;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVel_maxima(double vel_maxima) {
        this.vel_maxima = vel_maxima;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //ACCIONES
    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void frenar(){
        System.out.println("Frenando...");
    }

    public void girar_dere(){
        System.out.println("Girando a la derecha");
    }

    public void girar_izq(){
        System.out.println("Girar a la izquierda");
    }
}
