public class Gwendolyne extends Spyders implements spyderActionCallback{


    public Gwendolyne(int id, String nombre, String descripcion, String universo) {
        super(id, nombre, descripcion, universo);
    }

    @Override
    public void attak1(Screen s) {
        s.setVisible(true);
        s.out(showMensaje(), "Helvetica", 28, Colors.FussionRed);
        s.showImage("escalado.jfif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void attak2(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMensaje(), "Helvetica", 28, Colors.FussionRed);
        s.showImage("sentidoAracnido.jfif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void attak3(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMensaje(), "Helvetica", 28, Colors.FussionRed);
        s.showImage("telarania.gif");
        s.setBounds(200,100,1100,1100);
    }
}
