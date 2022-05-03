public class Spyders {

    //def de variables o caracterisitcas
    public int id;
    public String nombre, descripcion, universo;
    // def de constructor parametrizado
    public Spyders(int id, String nombre, String descripcion, String universo){

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.universo = universo;
    }
//Metodo getter para recuperar los valores de las caracteriticas del objeto

    public int getId(){
        return id;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getNombre(){
        return nombre;
    }
    public String getUniverso(){
        return universo;
    }

    //Metodos setter
    public boolean setId(int id){
        if(id > 0){
            this.id = id;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setDescripcion(String descripcion){
        if(!descripcion.isEmpty()){
            this.nombre = descripcion;
            return true;
        }else
            return false;
    }

    public boolean setUniverso(String universo){
        if(!universo.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public String showMensaje(){
        return
                "\t\t\t\tId: "+id+ "\n"+
                        "\t\t\t\tNombre: "+ nombre+ ""+
                        "\t\t\t\tUniverso: "+ universo+ "\n"+
                        "Descipción: "+ descripcion +"";
    }
}

