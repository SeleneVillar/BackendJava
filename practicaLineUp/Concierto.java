package practicaLineUp;

import imonsh.Colors;
import imonsh.Screen;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Concierto {
    public static void main(String[] args) {
        startConcert();
    }

    public static void startConcert() {
        String folder = "C:\\Users\\mcr_0\\OneDrive\\Documentos\\0 Launch X Innovacción Virtual\\Backend - Java\\Concierto\\";
        Screen screen = new Screen("MomeFest 2022");
        screen.setVisible(true);
        screen.setBounds(0, 0, 1368, 743);
        Avatar avatar = new Avatar("Avatar", folder+"LogoAvatar.jpg", folder+"avatar-metal.gif",
                folder+"Murderer.wav", "When The Snow Lies Red", folder+"WhenTheSnowLiesRed.wav",
                folder+"Avatar.gif", "Child", folder+"Child.wav", folder+"Avatar2.gif",
                "Paint Me Red", folder+"PaintMeRed.wav", folder+"Avatar3.gif",
                "Bloody Angel", folder+"BloodyAngel.wav", folder+"avatar4.gif");
        Lacrimosa lacrimosa = new Lacrimosa("Lacrimosa", folder+"logoLacrimosa.jpg", folder+"lacrimosa.gif",
                folder+"Lichtgestalt.wav", "Der Morgen Danach", folder+"DerMorgenDanach.wav",
                folder+"Lacrimosa1.gif", "Alles Luge", folder+"AllesLuge.wav",
                folder+"Lacrimosa2.gif", "Black Wedding Day", folder+"BlackWeddingDay.wav",
                folder+"Lacrimosa3.gif", "Liebesspiel", folder+"Liebesspiel.wav",
                folder+"Lacrimosa4.gif");
        Rammstein rammstein = new Rammstein("Rammstein", folder+"LogoRammstein.jpg", folder+"Rammstein.gif",
                folder+"DuHast.wav", "Deutschland", folder+"Deutschland.wav", folder+"Rammstein1.gif",
                "Auslander", folder+"Auslander.wav", folder+"Rammstein2.gif", "Rosenrot",
                folder+"Rosenrot.wav", folder+"Rammstein3.gif", "Sonne", folder+"Sonne.wav",
                folder+"Rammstein4.gif");
        Slipknot slipknot = new Slipknot("Slipknot", folder+"LogoSlipknot.jpg", folder+"Slipknot.gif",
                folder+"Duality.wav", "Unsainted", folder+"Unsainted.wav",
                folder+"Slipknot1.gif", "Snuff", folder+"Snuff.wav", folder+"Slipknot2.gif",
                "Psychosocial", folder+"Psychosocial.wav", folder+"Slipknot3.gif",
                "Killpop", folder+"Killpop.wav", folder+"Slipknot4.gif");

        Runnable presentacion = new Runnable() {
            @Override
            public void run() {
                try {
                    screen.out("\t\t\t\t\tMomeFest2022", "Papyrus", 100, Colors.C64Ntsc, Colors.black);
                    Thread.sleep(1500);
                    screen.out("\n\n\t\t   Las mejores bandas reunidas en un mismo lugar", "Tempus Sans ITC",
                            50, Colors.CityLights, Colors.black);
                    Thread.sleep(1500);
                    screen.out("\n\n\t\t\t\t\t\t\tLine Up:", "Papyrus", 70, Colors.LIGHT_GRAY, Colors.black);
                    Thread.sleep(1500);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Runnable bands = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);

                    //Avatar
                    avatar.presentarBanda(screen);
                    Thread.sleep(35000);

                    avatar.primerCancion(screen);
                    Thread.sleep(35000);

                    avatar.segundaCancion(screen);
                    Thread.sleep(35000);

                    avatar.tercerCancion(screen);
                    Thread.sleep(35000);

                    avatar.cuartaCancion(screen);
                    Thread.sleep(35000);

                    //Lacrimosa
                    lacrimosa.presentarBanda(screen);
                    Thread.sleep(35000);

                    lacrimosa.primerCancion(screen);
                    Thread.sleep(35000);

                    lacrimosa.segundaCancion(screen);
                    Thread.sleep(35000);

                    lacrimosa.tercerCancion(screen);
                    Thread.sleep(35000);

                    lacrimosa.cuartaCancion(screen);
                    Thread.sleep(35000);

                    //Rammstein
                    rammstein.presentarBanda(screen);
                    Thread.sleep(35000);

                    rammstein.primerCancion(screen);
                    Thread.sleep(35000);

                    rammstein.segundaCancion(screen);
                    Thread.sleep(35000);

                    rammstein.tercerCancion(screen);
                    Thread.sleep(35000);

                    rammstein.cuartaCancion(screen);
                    Thread.sleep(35000);

                    //Slipknot
                    slipknot.presentarBanda(screen);
                    Thread.sleep(35000);

                    slipknot.primerCancion(screen);
                    Thread.sleep(35000);

                    slipknot.segundaCancion(screen);
                    Thread.sleep(35000);

                    slipknot.tercerCancion(screen);
                    Thread.sleep(35000);

                    slipknot.cuartaCancion(screen);
                    Thread.sleep(35000);

                    //Final
                    screen.cls();
                    screen.out("\t\t\t\t\tMomeFest2022", "Papyrus", 100, Colors.C64Ntsc, Colors.black);
                    Thread.sleep(1500);
                    screen.out("\n\n\t\t\t\t\t   Te esperamos, ¡No te lo pierdas!", "Tempus Sans ITC",
                            50, Colors.CityLights, Colors.black);
                    Thread.sleep(1500);
                    screen.out("\n\n\t\t\t\t\t\t\t08-12-2022", "Papyrus", 70, Colors.LIGHT_GRAY, Colors.black);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Runnable songs = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    //Avatar
                    File avatar0 = new File(avatar.getCancion());
                    Clip clipA0 = AudioSystem.getClip();
                    clipA0.open(AudioSystem.getAudioInputStream(avatar0));
                    clipA0.start();
                    Thread.sleep(35000);
                    File avatar1 = new File(avatar.getCancionUno());
                    Clip clipA1 = AudioSystem.getClip();
                    clipA1.open(AudioSystem.getAudioInputStream(avatar1));
                    clipA1.start();
                    Thread.sleep(35000);
                    File avatar2 = new File(avatar.getCancionDos());
                    Clip clipA2 = AudioSystem.getClip();
                    clipA2.open(AudioSystem.getAudioInputStream(avatar2));
                    clipA2.start();
                    Thread.sleep(35000);
                    File avatar3 = new File(avatar.getCancionTres());
                    Clip clipA3 = AudioSystem.getClip();
                    clipA3.open(AudioSystem.getAudioInputStream(avatar3));
                    clipA3.start();
                    Thread.sleep(35000);
                    File avatar4 = new File(avatar.getCancionCuatro());
                    Clip clipA4 = AudioSystem.getClip();
                    clipA4.open(AudioSystem.getAudioInputStream(avatar4));
                    clipA4.start();
                    Thread.sleep(35000);
                    //Lacrimosa
                    File lacrimosa0 = new File(lacrimosa.getCancion());
                    Clip clipL0 = AudioSystem.getClip();
                    clipL0.open(AudioSystem.getAudioInputStream(lacrimosa0));
                    clipL0.start();
                    Thread.sleep(35000);
                    File lacrimosa1 = new File(lacrimosa.getCancionUno());
                    Clip clipL1 = AudioSystem.getClip();
                    clipL1.open(AudioSystem.getAudioInputStream(lacrimosa1));
                    clipL1.start();
                    Thread.sleep(35000);
                    File lacrimosa2 = new File(lacrimosa.getCancionDos());
                    Clip clipL2 = AudioSystem.getClip();
                    clipL2.open(AudioSystem.getAudioInputStream(lacrimosa2));
                    clipL2.start();
                    Thread.sleep(35000);
                    File lacrimosa3 = new File(lacrimosa.getCancionTres());
                    Clip clipL3 = AudioSystem.getClip();
                    clipL3.open(AudioSystem.getAudioInputStream(lacrimosa3));
                    clipL3.start();
                    Thread.sleep(35000);
                    File lacrimosa4 = new File(lacrimosa.getCancionCuatro());
                    Clip clipL4 = AudioSystem.getClip();
                    clipL4.open(AudioSystem.getAudioInputStream(lacrimosa4));
                    clipL4.start();
                    Thread.sleep(35000);
                    //Rammstein
                    File rammstein0 = new File(rammstein.getCancion());
                    Clip clipR0 = AudioSystem.getClip();
                    clipR0.open(AudioSystem.getAudioInputStream(rammstein0));
                    clipR0.start();
                    Thread.sleep(35000);
                    File rammstein1 = new File(rammstein.getCancionUno());
                    Clip clipR1 = AudioSystem.getClip();
                    clipR1.open(AudioSystem.getAudioInputStream(rammstein1));
                    clipR1.start();
                    Thread.sleep(35000);
                    File rammstein2 = new File(rammstein.getCancionDos());
                    Clip clipR2 = AudioSystem.getClip();
                    clipR2.open(AudioSystem.getAudioInputStream(rammstein2));
                    clipR2.start();
                    Thread.sleep(35000);
                    File rammstein3 = new File(rammstein.getCancionTres());
                    Clip clipR3 = AudioSystem.getClip();
                    clipR3.open(AudioSystem.getAudioInputStream(rammstein3));
                    clipR3.start();
                    Thread.sleep(35000);
                    File rammstein4 = new File(rammstein.getCancionCuatro());
                    Clip clipR4 = AudioSystem.getClip();
                    clipR4.open(AudioSystem.getAudioInputStream(rammstein4));
                    clipR4.start();
                    Thread.sleep(35000);
                    //Slipknot
                    File slipknot0 = new File(slipknot.getCancion());
                    Clip clipS0 = AudioSystem.getClip();
                    clipS0.open(AudioSystem.getAudioInputStream(slipknot0));
                    clipS0.start();
                    Thread.sleep(35000);
                    File slipknot1 = new File(slipknot.getCancionUno());
                    Clip clipS1 = AudioSystem.getClip();
                    clipS1.open(AudioSystem.getAudioInputStream(slipknot1));
                    clipS1.start();
                    Thread.sleep(35000);
                    File slipknot2 = new File(slipknot.getCancionDos());
                    Clip clipS2 = AudioSystem.getClip();
                    clipS2.open(AudioSystem.getAudioInputStream(slipknot2));
                    clipS2.start();
                    Thread.sleep(35000);
                    File slipknot3 = new File(slipknot.getCancionTres());
                    Clip clipS3 = AudioSystem.getClip();
                    clipS3.open(AudioSystem.getAudioInputStream(slipknot3));
                    clipS3.start();
                    Thread.sleep(35000);
                    File slipknot4 = new File(slipknot.getCancionCuatro());
                    Clip clipS4 = AudioSystem.getClip();
                    clipS4.open(AudioSystem.getAudioInputStream(slipknot4));
                    clipS4.start();
                    Thread.sleep(35000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        Thread inicio = new Thread(presentacion);
        Thread lineUp = new Thread(bands);
        Thread concert = new Thread(songs);
        inicio.start();
        lineUp.start();
        concert.start();
    }
}
