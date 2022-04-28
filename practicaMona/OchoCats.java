package practicaMona;



class Mona {
    // Definicmos  las variables de la clase principal

    public int id;
    public String name;

    //Creamos un constructor para inicializar las variables desde el constructor
    Mona(int Id, String name){
        this.id = Id;
        this.name = name;
    }

    //Definimos el metodo de la clase padre
    void accion(){
        System.out.println("Las multiples facetas de la MONA");
    }
}

    // creamos la clase hijo para extender las funcionalidades heredadas de la clase padre con el operador extends
    //creamos el contructor para esta clasecon un parametro mas

class octocats{// nos pide convertir la clase en estatica*****
    public static void main(String[] args) {
        Fintechtocat fin = new Fintechtocat(144, "Fintectocat", "jeejkang");//asignamos los valores del objeto esdsde el constructor
        System.out.println(fin.name + ":");
        fin.accion();
        Filmtocats fil =new Filmtocats(142, "Filmtocats", "heyhayhay" );
        System.out.println(fil.name + ":");
        fil.accion();
        Surftocat sur = new Surftocat (138, "Surftocat", "jeejkang");
        System.out.println(sur.name + ":");
        sur.accion();
        Vinyltocat vin = new Vinyltocat(135, "Vinyltocat", "JohnCreek");
        System.out.println(vin.name + ":");
        vin.accion();
        Luchadortocat luch = new Luchadortocat(113, "Luchadortocat", "jeejkang");
        System.out.println(luch.name+ ":");
        luch.accion();
        PrivateInvestocat inve = new PrivateInvestocat(119, "PrivateInvestocat", "jeejkang");
        System.out.println(inve.name+ ":");
        inve.accion();
    }
}