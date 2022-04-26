package practicaMona;

public class MonaMain {
    public static void main(String[] args) {
        createCharacters();
    }

    public static void createCharacters(){
        //Objeto bombero de la clase MonaBombero
        MonaBombero bombero = new MonaBombero();
        bombero.setNombre("Sentrytocat");
        bombero.setProfesion("Bombero");
        bombero.setElementoTrabajo("Manguera contra incendio");
        bombero.setApariencia("Ojos color cafe claro");
        bombero.setVestimenta("Casco de bombero color negro con naranja con el logo de github al centro, guantes de "+
                "negros, traje de bombero color negro con naranja y botas de proteccion negras");
        //Variable infoBombero: Almacena la información del personaje
        String infoBombero;
        infoBombero = "Profesion: " + bombero.getProfesion() + "\nElemento de trabajo: " + bombero.getElementoTrabajo()
                +  "\nApariencia: " + bombero.getApariencia() +  "\nVestimenta: " + bombero.getVestimenta();
        bombero.printMsg();
        System.out.println(infoBombero);
        bombero.actividades();
        System.out.println("-----------------------------------------------------------------------------------------");

        //Objeto dj de la clase MonaDJ
        MonaDJ dj = new MonaDJ();
        dj.setNombre("Catstello");
        dj.setProfesion("Disc Jockey");
        dj.setEquipo("Controlador de DJ, computador portatil, audifonos");
        dj.setApariencia("Cabello alborotado color cafe");
        dj.setVestimenta("Lentes negros, playera de la banda Slayer, pantalon de mezclilla");
        //Variable infoDJ: Almacena la información del personaje
        String infoDJ;
        infoDJ = "Profesion: " + dj.getProfesion() + "\nEquipo de trabajo: " + dj.getEquipo() +  "\nApariencia: " +
                dj.getApariencia() +  "\nVestimenta: " + dj.getVestimenta();
        dj.printMsg();
        System.out.println(infoDJ);
        dj.actividades();
        System.out.println("-----------------------------------------------------------------------------------------");

        //Objeto jugador de la clase MonaJugadorAmericano
        MonaJugadorAmericano jugador = new MonaJugadorAmericano();
        jugador.setNombre("Goretocat");
        jugador.setProfesion("Jugador profesional de futbol americano");
        jugador.setEquipo("San Francisco 49ers");
        jugador.setApariencia("Ojos cafe claro");
        jugador.setVestimenta("Uniforme del equipo de San Francisco 49ers y Balon de Futbol Americano");
        //Variable infoJugador: Almacena la información del personaje
        String infoJugador;
        infoJugador = "Profesion: " + jugador.getProfesion() + "\nEquipo de trabajo: " + jugador.getEquipo() +
                "\nApariencia: " + jugador.getApariencia() +  "\nVestimenta: " + jugador.getVestimenta();
        jugador.printMsg();
        System.out.println(infoJugador);
        jugador.actividades();
        System.out.println("-----------------------------------------------------------------------------------------");

        //Objeto laboratorista de la clase MonaLaboratorista
        MonaLaboratorista laboratorista = new MonaLaboratorista();
        laboratorista.setNombre("Labtocat");
        laboratorista.setProfesion("Laboratorista Quimico");
        laboratorista.setMateriales("Matraz Erlenmeyer, Tubo de ensayo");
        laboratorista.setApariencia("Ojos color cafe");
        laboratorista.setVestimenta("Bata de laboratorio blanca, lentes de seguridad, guantes amarillos, calzado" +
                "cerrado color negro.");
        //Variable infoLaboratorista: Almacena la información del personaje
        String infoLaboratorista;
        infoLaboratorista = "Profesion: " + laboratorista.getProfesion() + "\nMateriales: " + laboratorista.getMateriales()
                + "\nApariencia: " + laboratorista.getApariencia() + "\nVestimenta: " + laboratorista.getVestimenta();
        laboratorista.printMsg();
        System.out.println(infoLaboratorista);
        laboratorista.actividades();
        System.out.println("-----------------------------------------------------------------------------------------");

        //Objeto luchador de la clase MonaLuchador
        MonaLuchador luchador = new MonaLuchador();
        luchador.setNombre("Luchadortocat");
        luchador.setProfesion("Lucha libre profesional");
        luchador.setModalidadCombate("Mano a Mano");
        luchador.setApariencia("Ojos color rojo claro");
        luchador.setVestimenta("Mascara color azul jade y verde agua con el logo de Github en la parte superior," +
                "botines de lucha color verde agua, mallas y mangas color verde agua, azul jade y rojo");
        //Variable infoLuchador: Almacena la información del personaje
        String infoLuchador;
        infoLuchador = "Profesion: " + luchador.getProfesion() + "\nEstilo de combate: " + luchador.getModalidadCombate()
                + "\nApariencia: " + luchador.getApariencia() +  "\nVestimenta: " + luchador.getVestimenta();
        luchador.printMsg();
        System.out.println(infoLuchador);
        luchador.actividades();
        System.out.println("-----------------------------------------------------------------------------------------");

        //Objeto musico de la clase MonaMusico
        MonaMusico musico = new MonaMusico();
        musico.setNombre("Defunktocat");
        musico.setProfesion("Musico");
        musico.setInstrumento("Guitarra electrica");
        musico.setApariencia("Rubio, cabello largo, barba y bigote, ojos azules.");
        musico.setVestimenta("Chaqueta de cuero, playera rosa con el logo de GitHub y pantalon de mezclilla");
        //Variable infoMusico: Almacena la información del personaje
        String infoMusico;
        infoMusico = "Profesion: " + musico.getProfesion() + "\nInstrumento: " + musico.getInstrumento() +  "\nApariencia: "
                + musico.getApariencia() +  "\nVestimenta: " + musico.getVestimenta();
        musico.printMsg();
        System.out.println(infoMusico);
        musico.actividades();
    }
}
