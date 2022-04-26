package practicaCazador;

public class PruebaCazador {
    public static void main(String[] args) {
        System.out.println("Cazadores de Demonios\n");
        cazadoresDemonios();
    }

    public static void cazadoresDemonios(){
        //Objeto tanjiro de la clase Cazador
        Cazador tanjiro = new Cazador("Tanjiro Kamado", 15, 1.65,
                "Sentido del olfato agudizado, Habilidad de lucha, Manejo de la respiracion de enfoque " +
                        "completo, Marca de Cazador de Demonios","Respiracion del Agua");
        System.out.println(tanjiro.showMessage());

        //Objeto zenitsu de la clase Cazador
        Cazador zenitsu = new Cazador("Zenitsu Agatsuma", 16, 1.64,
                "Audicion agudizada, Combate inconsciente","Respiracion del Rayo");
        System.out.println(zenitsu.showMessage());

        //Objeto inosuke de la clase Cazador
        Cazador inosuke = new Cazador("Inosuke Hashibira", 15, 1.64,
                "Alta sensibilidad del tacto, Flexibilidad, Capacidad de mover organos a voluntad",
                "Respiracion de la Bestia");
        System.out.println(inosuke.showMessage());
    }
}