//Clase que representa a una persona
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellido;

    //CONSTRUCTOR
    public Persona(String nombre, String apellido){
        //this.nombre -> Atributo
        //nombre -> parámetro
        this.nombre = nombre;
        this.apellido = apellido;
        //System.out.println("Hola soy una persona, soy "+this.nombre);
    }


    /***********************
     * MÉTODOS CONSULTORES
     ***********************/
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    /***********************
     * MÉTODOS MODIFICADORES
     ***********************/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    /***********************
     * ACCIONES
     ***********************/
    public double calcularNomina(double valorHora){
        int cantHoras = 10;
        return (cantHoras*valorHora);
    }
}
