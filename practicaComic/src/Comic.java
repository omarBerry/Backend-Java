public class Comic {
    public static void main(String[] args)throws InterruptedException {
        contenidoH();
    }
    public static void contenidoH() throws InterruptedException {
        Screen screenI =new Screen("FAREWELL TO FROG-MAN");
        Screen screenT = new Screen("Web of Spyder-man");
        Contenido contenido = new Contenido();
        Runnable s = new Runnable() {
            @Override
            public void run() {
                try{
                    contenido.pages(screenI);
                    Thread.sleep(3000);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Runnable t = new Runnable() {
            @Override
            public void run() {
                try{
                    contenido.texto((screenT));
                    Thread.sleep(3000);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
    Thread comic = new Thread(s);
    Thread comict =new Thread(t);
    comict.start();
    comic.start();
    comic.join(15000);
    }
}

