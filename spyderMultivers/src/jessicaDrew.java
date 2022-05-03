public class jessicaDrew extends Spyders implements JDarrak {
        public jessicaDrew(int id, String nombre, String descripcion, String universo) {
            super(id, nombre, descripcion, universo);
        }

        @Override
        public void attak7(Screen s) {
            s.cls();
            s.setVisible(true);
            s.out(showMensaje(), "Helvetica", 28, Colors.BlueHorizon);
            s.showImage("JD.PNG");
            s.setBounds(200, 100, 1100, 900);
        }

        @Override
        public void attak8(Screen s) {
            s.cls();
            s.repaint();
            s.out(showMensaje(), "Helvetica", 28, Colors.BlueHorizon);
            s.showImage("jd2.PNG");
            s.setBounds(200, 100, 1100, 900);
        }

        @Override
        public void attak9(Screen s) {
            s.cls();
            s.repaint();
            s.out(showMensaje(), "Helvetica", 28, Colors.BlueHorizon);
            s.showImage("jd3.png");
            s.setBounds(200, 100, 1100, 900);
        }
}


