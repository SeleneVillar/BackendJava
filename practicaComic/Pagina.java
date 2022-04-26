package practicaComic;

import imonsh.Screen;

public class Pagina implements Runnable {
    Screen screen;

    public Pagina(Screen screen){
        this.screen = screen;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 15; i++){
            String img = "C:\\Users\\mcr_0\\OneDrive\\Documentos\\0 Launch X Innovacción Virtual\\Backend - Java\\Comic\\Pagina"+i+".jpg";
            screen.cls();
            screen.showImage(img);
            try {
                Thread.sleep(7900);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }

    }
}
