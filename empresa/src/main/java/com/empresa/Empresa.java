package com.empresa;

import java.util.Scanner;

public class Empresa {
    //ATRIBUTOS
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String nit;
    private Carro[] carros;

    public Empresa(String nombre, String telefono, String direccion, String email, String nit){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nit = nit;
        this.carros = new Carro[50];
    }

    public Empresa(String nombre, String direccion, String nit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = "";
        this.email = "";
        this.carros = new Carro[50];
    }

    public Empresa(){
        inicializar();
    }

    public void inicializar(){
        this.nombre = "";
        this.telefono = "";
        this.direccion = "";
        this.email = "";
        this.nit = "";
        this.carros = new Carro[50];
    }

    //CONSULTORES
    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getNit() {
        return nit;
    }

    //MODIFICADORES
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    //ACCIONES
    public void fabricar_carro(String modelo, String placa){
        Carro carro = new Carro(modelo, placa);
        for(int i = 0; i < carros.length; i++){
            if(carros[i] != null){
                this.carros[i] = carro;
                break;
            }
        }
    }

    public void fabricar_carro(String color, double vel_maxima, String modelo, String placa){
        Carro carro = new Carro(color, vel_maxima, modelo, placa);
        for(int i = 0; i < carros.length; i++){
            if(carros[i] == null){
                this.carros[i] = carro;
                break;
            }
        }
        
    }

    public void solicitar_datos_carro(Scanner leer){
        //String color, double vel_maxima, String modelo, String placa
        System.out.print("Ingrese el color del carro: ");
        String color = leer.next();

        System.out.print("Ingrese la velocidad maxima del carro: ");
        double vel_maxima = leer.nextDouble();

        System.out.print("Ingrese el modelo del carro: ");
        String modelo = leer.next();

        System.out.print("Ingrese la placa del carro: ");
        String placa = leer.next();

        fabricar_carro(color, vel_maxima, modelo, placa);
    }

    public void mostrar_carros(){
        for( int i=0; i < carros.length; i++ ){
            if(carros[i] != null){
                System.out.println(carros[i]);
            }
        }
    }

    public void mostrar_carro_x_pos(int pos){
        System.out.println(carros[pos]);
    }

    public void menu(){

        try(Scanner leer = new Scanner(System.in)){

            String mensaje = "-------------------FABRICA VEHICULOS-----------------\n";
            mensaje += "1) Fabricar carro\n";
            mensaje += "2) Mostrar todos los carros\n";
            mensaje += "3) Mostrar carro por ID\n";
            mensaje += "-1) Salir\n";
            mensaje += ">>> ";

            int opcion;
            do{
                System.out.print(mensaje);
                opcion = leer.nextInt();
                leer.nextLine();
                //evaluar la opcion ingresada por el usuario
                switch(opcion){
                    case 1:
                        solicitar_datos_carro(leer);
                        break;
                    case 2:
                        mostrar_carros();
                        break;
                    case 3:
                        System.out.print("Ingrese el ID del carro: ");
                        int pos = leer.nextInt();
                        mostrar_carro_x_pos(pos);
                        break;
                    case -1:
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            }while(opcion != -1);
            

        }catch(Exception error){
            System.err.println("Por favor ingrese un numero");
        }

    }


}
