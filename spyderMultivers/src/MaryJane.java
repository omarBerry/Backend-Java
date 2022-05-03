public class MaryJane extends Spyders implements MJattak {
    public MaryJane(int id, String nombre, String descripcion, String universo) {
        super(id, nombre, descripcion, universo);
    }

    @Override
    public void attak4(Screen s) {
        s.cls();
        s.setVisible(true);
        s.out(showMensaje(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("Mj.PNG");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void attak5(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMensaje(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("MJ2.PNG");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void attak6(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMensaje(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("mjsesne.gif");
        s.setBounds(200, 100, 1100, 900);
    }
}
