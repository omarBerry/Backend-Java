package practicaMona;

public class Fintechtocat extends Mona {
    public String creator;

    //creamos el contructor y asignamos los parametrso para el nuevo objeto
    Fintechtocat(int id, String name, String creator) {
        super(id, name);
        this.creator = creator;
    }

    //crear el metodo especifico para esta clase partiendo del metodo de la clase padre
    @Override
    //usamos esta notación para indicar que se esta redefimiento}do el metodo de la clase padre heredado, con lo que s epuede crear el polimorfimos
    void accion() {
        System.out.println("Crea sus inversiones en octocoins");
    }
}
