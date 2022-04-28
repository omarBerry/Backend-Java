package practicaMona;

public class Vinyltocat extends Mona{
    public String creator;
    Vinyltocat(int id, String name, String creator){
        super(id,name);
        this.creator = creator;
    }

    @Override
    void accion() {
        System.out.println("Que buena musica toca este Retro-DJ");
    }
}
