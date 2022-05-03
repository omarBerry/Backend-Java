
public class Combate {
    public static void main(String[] args) throws InterruptedException {
        combatGwendolyne();
        combateMJ();
        combateJD();
    }

public static void combatGwendolyne() throws InterruptedException {
    Screen screen = new Screen();
    Gwendolyne gwendolyne = new Gwendolyne(1,
            "Gwendplyne Stac\n",
            "En la realidad alternativa designada como Tierra-65, Gwen Stacy es mordida por una araña radioactiva, y se convierte en un superhéroe con el nombre de Spider-Woman.\n",
            "Tierra-65\n");

    //implementasmo la interfase Runnable de manera anonima para crear los hilos
Runnable combate1 = new Runnable() {
    @Override
    public void run() {
        try{
            gwendolyne.attak1(screen);
            Thread.sleep(3000);

            gwendolyne.attak2(screen);
            Thread.sleep(3000);

            gwendolyne.attak3(screen);
            Thread.sleep(3000);

        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
};
Thread ataqueGwen = new Thread(combate1);
ataqueGwen.start();
ataqueGwen.join(15000);
}

public static void combateMJ() throws InterruptedException {
    Screen screen = new Screen();
    MaryJane maryJane = new MaryJane(2,
            "Mary Jane Watson-Parker\n",
            "Mary Jane es representada como una pelirroja extremadamente bella y de ojos verdes, y ha sido el principal interés romántico de Peter Parker durante los últimos veinte años, aunque inicialmente compitió con otras por su afecto.\n",
            "Earth-18119\n");


    //implementasmo la interfase Runnable de manera anonima para crear los hilos
    Runnable combate2 = new Runnable() {
        @Override
        public void run() {
            try{
                maryJane.attak4 (screen);
                Thread.sleep(3000);

                maryJane.attak5(screen);
                Thread.sleep(3000);

                maryJane.attak6(screen);
                Thread.sleep(3000);

            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    };


    Thread ataqueMj = new Thread(combate2);
    ataqueMj.start();
    ataqueMj.join(15000);

}
    public static void combateJD() throws InterruptedException {
        Screen screen = new Screen();
        jessicaDrew jDarrak = new jessicaDrew(3,
                "Jessica Drew\n",
                "Jessica Drew es la hija del antropólogo estadounidense Johnatan Drew y su esposa británica Merriam. No habiendo cumplido Jessica los dos años de edad, sus padres se trasladaron a la región balcánica de Transia\n",
                "Earth-616\n");


        //implementasmo la interfase Runnable de manera anonima para crear los hilos
        Runnable combate3 = new Runnable() {
            @Override
            public void run() {
                try{
                    jDarrak.attak7 (screen);
                    Thread.sleep(3000);

                    jDarrak.attak8(screen);
                    Thread.sleep(3000);

                    jDarrak.attak9(screen);
                    Thread.sleep(3000);

                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread ataqueJD = new Thread(combate3);
        ataqueJD.start();
  //      ataqueJD.join(15000);

    }
}

