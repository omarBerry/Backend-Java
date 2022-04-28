package practicaMona;

public class Luchadortocat extends Mona{
    public String creator;
    Luchadortocat(int id,String name, String creator){
        super(id,name);
        this.creator = creator;
    }

    @Override
    void accion() {
        System.out.println("Que buen luchador tenemos");
    }
}
