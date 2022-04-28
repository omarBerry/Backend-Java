package practicaMona;

public class Filmtocats extends Mona {
    public String creator;

    Filmtocats(int id, String name, String creator) {
        super(id, name);
        this.creator = creator;
    }

    @Override
    void accion() {
        System.out.println("Crea sus filmaciones Octocat Film");
    }
}
