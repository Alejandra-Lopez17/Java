package com.herencia_animales;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        crear_animales();
    }

    public static void crear_animales(){
        Animal[] animales = new Animal[3];

        Perro perro = new Perro("Cafe", 40, 80, true, true, 2, 'F', "Criollo");
        Rana rana = new Rana("Verde", 500, 10, false, true, 1, 'M', false);
        Pez pez = new Pez("Gris", 50, 10, false, true, 1, 'M');

        animales[0] = perro;
        animales[1] = rana;
        animales[2] = pez;

        for(int i = 0; i < animales.length; i++){
           animales[i].avanzar();
        }

    }

}
