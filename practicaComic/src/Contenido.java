import java.io.FileInputStream;
import java.io.IOException;

public class Contenido implements contenidoComic {

    @Override
    public void pages(Screen si) {
        si.cls();
        si.setVisible(true);
        si.out("EL COMIC","Comic Sans MS", 25, Colors.ORANGE);
        si.cls();
        si.setBounds(0, 0, 600, 800);

        for (int i = 1; i <= 7; i++) {
            si.cls();
            si.showImage("page" + i + ".jpg");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        @Override
        public void texto (Screen st) {
            st.cls();
            st.setVisible(true);
            st.cls();
            st.setBounds(600, 0, 600, 800);
            try{
                FileInputStream fis =new FileInputStream("dialogo.txt");
                int i;
                while ((i = fis.read()) != -1){
                    /*62 es el codigo  ascci para el signo > "mayor que"*/
                    if (i == 62){
                        Thread.sleep(3000);
                        st.cls();
                        }else{
                        /*Mostramos lo dialogos en la  pantalla*/
                        char c = (char) i;
                        st.out(String.valueOf(c),"MV Boli",23,Colors.BlueHorizon);
                    }
                }
                fis.close();
            }catch(IOException ioe){
                ioe.printStackTrace();}
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}






