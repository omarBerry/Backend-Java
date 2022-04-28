package practicaHarry;

public class Personaje {
    // def variables
    public String nombre, casa, genero, boggart, patrons;

    //Def los getters

    public String getNombre() {
        return nombre;
    }

    public String getGenero(){
        return  genero;
    }

    public String getCasa(){
        return casa;
    }

    public String getPatrons() {
        return patrons;
    }

    public String getBoggart() {
        return boggart;
    }
    //def setters
    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public boolean setCasa(String casa){
        if (!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }
    public boolean  setPatrons(String patrons){
        if (!patrons.isEmpty()){
            this.patrons = patrons;
            return true;
        }else
            return false;
    }
    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }
}
