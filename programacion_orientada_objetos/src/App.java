public class App {
    public static void main(String[] args) throws Exception {
       //Construir un objeto de tipo Persona
        Persona objPersona_1 =  new Persona("Alejandra", "Lopez");
        String nombre = objPersona_1.getNombre();
        System.out.println("Nombre: "+nombre);
        //Modificar nombre
        objPersona_1.setNombre("Claudia");
        objPersona_1.setApellido("Hinestroza");
        System.out.println( objPersona_1.getNombre()+" "+objPersona_1.getApellido() );

        Persona objPersona_2 = new Persona("Juliana", "Quintana");
        Persona objPersona_3 = new Persona("Andrea", "Valdiri");

        double nomina_p1 = objPersona_1.calcularNomina(5.5);
        double nomina_p2 = objPersona_2.calcularNomina(5.2);
        double nomina_p3 = objPersona_1.calcularNomina(5.8);

        System.out.println(objPersona_1.getNombre()+" - Nómina: "+nomina_p1);
        System.out.println(objPersona_2.getNombre()+" - Nómina: "+nomina_p2);
        System.out.println(objPersona_3.getNombre()+" - Nómina: "+nomina_p3);
    }
}
