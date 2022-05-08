package practicaLineUp;

import imonsh.Colors;
import imonsh.Screen;

public class Lacrimosa extends Banda implements presentacionBanda {

    public Lacrimosa(String nombre, String logo, String imagen, String cancion, String nombreCancionUno, String cancionUno,
                     String gifUno, String nombreCancionDos, String cancionDos, String gifDos, String nombreCancionTres,
                     String cancionTres, String gifTres, String nombreCancionCuatro, String cancionCuatro, String gifCuatro) {
        super(nombre, logo, imagen, cancion, nombreCancionUno, cancionUno, gifUno, nombreCancionDos, cancionDos, gifDos,
                nombreCancionTres, cancionTres, gifTres, nombreCancionCuatro, cancionCuatro, gifCuatro);
    }

    @Override
    public void presentarBanda(Screen s) {
        s.cls();
        s.out("\t\t\t\t\t\t\t"+getNombre(), "Papyrus", 80, Colors.CityLights, Colors.black);
        s.out("\n\t\t\t\t\t\t\t");
        s.showImage(getLogo(), 350, 180);
        s.out("\n\t\t\t\t\t\t");
        s.showImage(getImagen());
    }

    @Override
    public void primerCancion(Screen s) {
        s.cls();
        s.out("\t\t\t\t\t\t\t\tSetlist:", "Papyrus", 50, Colors.CityLights, Colors.black);
        s.out("\n\n\t\t\t\t\t\t\t");
        s.out("1.-"+getNombreCancionUno(), "Tempus Sans ITC", 35, Colors.CityLights);
        s.out("\n\n\t\t\t\t\t\t");
        s.showImage(getGifUno());
    }

    @Override
    public void segundaCancion(Screen s) {
        s.cls();
        s.out("\t\t\t\t\t\t\t\tSetlist:", "Papyrus", 50, Colors.CityLights, Colors.black);
        s.out("\n\n\t\t\t\t\t\t\t\t");
        s.out("2.-"+getNombreCancionDos(), "Tempus Sans ITC", 35, Colors.CityLights);
        s.out("\n\n\t\t\t\t\t");
        s.showImage(getGifDos());
    }

    @Override
    public void tercerCancion(Screen s) {
        s.cls();
        s.out("\t\t\t\t\t\t\t\tSetlist:", "Papyrus", 50, Colors.CityLights, Colors.black);
        s.out("\n\n\t\t\t\t\t\t\t");
        s.out("  3.-"+getNombreCancionTres(), "Tempus Sans ITC", 35, Colors.CityLights);
        s.out("\n\n\t\t\t\t\t");
        s.showImage(getGifTres());
    }

    @Override
    public void cuartaCancion(Screen s) {
        s.cls();
        s.out("\t\t\t\t\t\t\t\tSetlist:", "Papyrus", 50, Colors.CityLights, Colors.black);
        s.out("\n\n\t\t\t\t\t\t\t\t");
        s.out("4.-"+getNombreCancionCuatro(), "Tempus Sans ITC", 35, Colors.CityLights);
        s.out("\n\n\t\t\t\t\t");
        s.showImage(getGifCuatro());
    }
}