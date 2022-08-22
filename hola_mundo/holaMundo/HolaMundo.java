public class HolaMundo{
    //Función principal
    public static void main(String[] args){
        //Comentario de una linea
        /*
         * Comentario de
         * varias lineas
         */
        //Imprimir mensaje en consola con salto de linea
        System.out.println("Hola mundo, este es mi primer programa en Java");
        System.out.println("Mi nombre es Alejandra");
        //VARIABLES
        int entero;//declarar variable 'entero'
        entero = 10;
        double decimal = 5.5;
        boolean bandera = true;
        //variable que representa un caracter
        char caracter = 'a';
        String mensaje = "Hola mundo desde una variable de tipo String\n";
        System.out.println(mensaje);
        //OPERACIONES BÁSICAS
        int n1 = 10;
        int n2 = 20;
        int suma = n1+n2;
        double n3 = 5.5;
        double n4 = 10.8;
        double multiplicacion = n3*n4;
        multiplicacion *= 2;
        double division = n3/n4;
        //Llamar funciones
        funcion_sin_parametro();
        int resultado = sumar();
        System.out.println("Resultado de la suma es: "+resultado);
        restar(50, 10);
        division = dividir(100, 2);
        System.out.println("Resultado division: "+division);
    }

    //Funciones sin parámetros y sin retorno
    public static void funcion_sin_parametro(){
        int n1 = 10;
        int n2 = 2;
        int resta = n1-n2;
        //Concatenar dentro de un print
        System.out.println("Resta: "+resta);
    }

    //Funcion sin parámetros y con retorno
    public static int sumar(){
        int n1 = 10;
        int n2 = 10;
        return (n1+n2);
    }

    //Funcion con parámetros y sin retorno
    public static void restar(double n1, double n2){
        System.out.println("Resta: "+(n1-n2));
    }

    //Función con parámetros y con retorno
    public static double dividir(double n1, double n2){
        double resultado = n1/n2;
        return resultado;
    }

}