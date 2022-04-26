package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class Spiderverse {
    public static void main(String[] args) {
        createSpiderverse();
    }

    public static void createSpiderverse(){
        //Objeto de la clase Screen
        Screen screen = new Screen("Spiderverse");
        screen.setVisible(true);
        screen.setBounds(0, 0, 1366, 743);
        screen.out("\t\t\t\t\t\t\t\t Spiderverse\n", "Eras Bold ITC", 24, Colors.RoyalBlue);

        //Objeto spiderman de la clase Spiderman8351
        Spiderman8351 spiderman = new Spiderman8351("Tierra-8351", "Peter Benjamin Parker",
                "Spider-Man Asesino","Humano", "Agente Secreto");
        screen.out("\n"+spiderman.getAlias()+"\n", "Arial Rounded MT Bold", 20, Colors.C64Ntsc);
        screen.out(spiderman.showMessage(), "Arial", 18, Colors.PrestigeBlue);
        screen.out("\nPoderes y Habilidades", "Arial Rounded MT Bold", 20, Colors.C64Ntsc);
        spiderman.fisiologiaAracnida(screen);
        spiderman.fuerza(screen);
        spiderman.durabilidad(screen);
        spiderman.resistencia(screen);
        spiderman.factorCuracion(screen);
        spiderman.velocidad(screen);
        spiderman.reflejos(screen);
        spiderman.agilidad(screen);
        spiderman.saltos(screen);
        spiderman.trepaMuros(screen);
        spiderman.sentidoAracnido(screen);
        spiderman.equilibrioPerfecto(screen);
        screen.out("\t\t\t\t\t\t\t");
        screen.showImage("C://Users//mcr_0//OneDrive//Documentos//0 Launch X Innovacción Virtual//Backend - Java//" +
                "BackendJava//src//practicaMultiverse//spidermanAsesino.jpg", 300, 350);
        screen.out("\n------------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------------");

        //Objeto noir de la clase SpidermanNoir
        SpidermanNoir noir = new SpidermanNoir("Tierra-90214", "Peter Parker", "Spider-Man Noir",
                "Humano", "Aventurero, Vigilante");
        screen.out("\n"+noir.getAlias()+"\n", "Arial Rounded MT Bold", 20, Colors.C64Ntsc);
        screen.out(noir.showMessage(), "Arial", 18, Colors.PrestigeBlue);
        screen.out("\nPoderes y Habilidades", "Arial Rounded MT Bold", 20, Colors.C64Ntsc);
        noir.fisiologiaAracnida(screen);
        noir.fuerza(screen);
        noir.velocidad(screen);
        noir.agilidad(screen);
        noir.reflejos(screen);
        noir.telaraniaOrganica(screen);
        noir.sentidoAracnido(screen);
        noir.trepaMuros(screen);
        screen.out("\t\t\t\t\t\t\t");
        screen.showImage("C://Users//mcr_0//OneDrive//Documentos//0 Launch X Innovacción Virtual//Backend - Java//" +
                "BackendJava//src//practicaMultiverse//spidermanNoir.jpg", 300, 350);
        screen.out("\n------------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------------");

        //Objeto ham de la clase SpiderHam
        SpiderHam ham = new SpiderHam("Tierra-25", "Peter Porker", "Spider-Ham",
                "Porcino antropomorfico", "Vigilante, Aventurero");
        screen.out("\n"+ham.getAlias()+"\n", "Arial Rounded MT Bold", 20, Colors.C64Ntsc);
        screen.out(ham.showMessage(), "Arial", 18, Colors.PrestigeBlue);
        screen.out("\nPoderes y Habilidades", "Arial Rounded MT Bold", 20, Colors.C64Ntsc);
        ham.fuerza(screen);
        ham.velocidad(screen);
        ham.reflejos(screen);
        ham.agilidad(screen);
        ham.saltos(screen);
        ham.durabilidad(screen);
        ham.resistencia(screen);
        ham.factorCuracion(screen);
        ham.trepaMuros(screen);
        ham.sentidoAracnido(screen);
        screen.out("\t\t\t\t\t\t\t");
        screen.showImage("C://Users//mcr_0//OneDrive//Documentos//0 Launch X Innovacción Virtual//Backend - Java//" +
                "BackendJava//src//practicaMultiverse//SpiderHam.jpg", 300, 350);
        screen.out("\n------------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------------");
    }
}
