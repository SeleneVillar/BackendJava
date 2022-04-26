package practicaComic;

import imonsh.Screen;

public class Comic {
    public static void main(String[] args) {
        showComic();
    }

    public static void showComic(){
        Screen screenComic = new Screen("The Umbrella Academy #0");
        screenComic.setVisible(true);
        screenComic.setBounds(130,0,500,743);
        Thread paginas = new Thread(new Pagina(screenComic));
        paginas.start();

        Screen screenTexto = new Screen("The Umbrella Academy #0");
        screenTexto.setVisible(true);
        screenTexto.setBounds(610,0,630,743);
        Texto texto = new Texto();

        Runnable text = new Runnable() {
            @Override
            public void run() {
                try{
                    texto.paginaUno(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaDos(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaTres(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaCuatro(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaCinco(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaSeis(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaSiete(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaOcho(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaNueve(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaDiez(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaOnce(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaDoce(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaTrece(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaCatorce(screenTexto);
                    Thread.sleep(8000);

                    texto.paginaQuince(screenTexto);
                    Thread.sleep(8000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread textComic = new Thread(text);
        textComic.start();
    }
}
