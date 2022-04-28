package practicaMona;

public class Surftocat extends Mona{
    public String creator;
    Surftocat(int id, String name, String creator){
        super(id,name);
        this.creator = creator;
    }

    @Override
    void accion() {
        System.out.println("¡Le gusta surfear en grandes holas, vaya tabla que usa¡");
    }
}
