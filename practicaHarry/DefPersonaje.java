package practicaHarry;

public class DefPersonaje {
    public static void main(String[] args) {
        defObj();
    }

    public static void defObj(){
        //creamos los objetos mediente el constructor por omisión

        Personaje p1 = new Personaje(), p2 = new Personaje(), p3 = new Personaje(), p4 = new Personaje(),p5 = new Personaje();

        //inicializamos cada uno de los objetos con el metodo Set y asignamos valores a a las
        // caracteristicas de cada uno de los objetos.

        //Objeto1
        p1.setNombre("Harry James Potter");
        p1.setCasa("Gryffindor");
        p1.setGenero("Hombre");
        p1.setPatrons("Ciervo");
        p1.setBoggart("Dementor");

        //objeto 2
        p2.setNombre("Hermione Jean Granjer");
        p2.setCasa("Gryffindor");
        p2.setGenero("Mujer");
        p2.setPatrons("Nutria");
        p2.setBoggart("Profesora Mc Gonagall");

        //objeto3
        p3.setNombre("Ronald Weasley");
        p3.setCasa("Gryffindor");
        p3.setGenero("Hombre");
        p3.setPatrons("Jack Russel Terrier");
        p3.setBoggart("Acromantula");

        //objeto4
        p4.setNombre("Draco Malfoy");
        p4.setCasa("Slytherin");
        p4.setGenero("Hombre");
        p4.setPatrons("Sin datos");
        p4.setBoggart("Lord Voldemort");

        //objeto5
        p5.setNombre("Luna Lovegood");
        p5.setCasa("Revenclaw");
        p5.setGenero("Mujer");
        p5.setPatrons("Liebre");
        p5.setBoggart("Seres queridos muertos");

        String msg = "Soy el personaje";

        msg += "\nNombre: "+p1.getNombre();
        msg += "\nCasa: "+p1.getCasa();
        msg += "\nGenero: "+p1.getGenero();
        msg += "\nPatron: "+p1.getPatrons();
        msg += "\nBoggart: "+p1.getBoggart() + "\n";

        msg += "\nNombre: "+p2.getNombre();
        msg += "\nCasa: "+p2.getCasa();
        msg += "\nGenero: "+p2.getGenero();
        msg += "\nPatron: "+p2.getPatrons();
        msg += "\nBoggart: "+p2.getBoggart() + "\n";

        msg += "\nNombre: "+p3.getNombre();
        msg += "\nCasa: "+p3.getCasa();
        msg += "\nGenero: "+p3.getGenero();
        msg += "\nPatron: "+p3.getPatrons();
        msg += "\nBoggart: "+p3.getBoggart() + "\n";

        msg += "\nNombre: "+p4.getNombre();
        msg += "\nCasa: "+p4.getCasa();
        msg += "\nGenero: "+p4.getGenero();
        msg += "\nPatron: "+p4.getPatrons();
        msg += "\nBoggart: "+p4.getBoggart() + "\n";

        msg += "\nNombre: "+p5.getNombre();
        msg += "\nCasa: "+p5.getCasa();
        msg += "\nGenero: "+p5.getGenero();
        msg += "\nPatron: "+p5.getPatrons();
        msg += "\nBoggart: "+p5.getBoggart() + "\n";
        System.out.print(msg);
    }

}
