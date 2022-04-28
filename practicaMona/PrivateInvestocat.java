package practicaMona;

public class PrivateInvestocat extends Mona{
    public String creator;
    PrivateInvestocat(int id, String name, String creator){
        super(id, name);
        this.creator = creator;
    }

    @Override
    void accion() {
        System.out.println("Este investigato busca quien termino los octo ejerccios");
    }
}
