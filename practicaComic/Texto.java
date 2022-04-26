package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

public class Texto implements TextoComic{
    String texto;

    @Override
    public void paginaUno(Screen s) {
        texto = "The Umbrella Academy #0\n";
        s.setVisible(true);
        s.out(texto, "Berlin Sans FB Demi", 35, Colors.BalticSea);

    }

    @Override
    public void paginaDos(Screen s) {
        s.cls();
        texto = "KRAKEN. ¡Resistencia sobrehumana para aguantar la respiración bajo el agua! ¡Es muy rudo y necesita " +
                "afeitarse! (¡Ten cuidado con tus ojos!). La parte buena es que es guapo y un excelente peleador.\n\n" +
                "SÉANCE. ¡Tenebrosos poderes! Habla con los muertos y flota. ¡¿Pero qué los fantasmas no existían?! " +
                "¡Drácula!\n\nRUMOR. Su poder es hacer la mentira realidad. Su interesante uniforme es especial para " +
                "las citas. ¿Cuándo volverá a mentir? Creo que la próxima vez... ¡Lo hará fantástico! \n\nHORROR. Locos " +
                "monstruos bajo su piel... ¡Oh, no! Una dimensión paralela de desagradables sensaciones. Alcancé a " +
                "contar a tres de ellos de excitantes nombres. ¡Imposibles de pronunciar! \n\nSPACEBOY. ¡Cuidado! " +
                "¡Cuerpo de Gorila Marciano! El temerario líder de la Academia Umbrella. ¡Es fuerte! ¡Me presta su " +
                "pistola láser! ¡Es imposible hacer que se ría! \n\nSIR REGINAL HARGREEVES, AKA THE MONOCLE. " +
                "¿Extraterrestre? ¡¿Quién sabe?! ¿No es  malo? ¡Inteligente y maravillosamente rico para encargarse " +
                "de una escuela!";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaTres(Screen s) {
        s.cls();
        texto = "SÉANCE: LA IMPRESIÓN PSÍQUICA EN ESTE CUERPO LO CONFIRMA... ÉSTA NO ES UN REPLICANTE EXTRATERRESTRE, " +
                "NI UN ANDROIDE, O UN CLON DE PRUEBA... \n\n\n....ÉSTA REALMENTE ERES TÚ, RUMOR...\n\n...Y ESTÁS MUERTA." +
                "\n\n LO LAMENTO.";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaCuatro(Screen s) {
        s.cls();
        s.out("La Academia Umbrella en:\n", "Arial Rounded MT Bold", 20, Colors.FussionRed);
        s.out("PERO EL PASADO NO HA TERMINADO CONTIGO.", "Berlin Sans FB Demi", 22, Colors.OrangeHibiscus);
        texto = "\n\nSÉANCE: Y YO, QUE CREÍA QUE SÓLO UNO DE USTEDES ERA MALO....\n\nRUMOR: MUY GRACIOSO, KLAUS...\n\n" +
                "FOTOGRAFO: ¡DIGAN CHEESE! \n\nRUMOR: SABES, QUE LA FLASH-O-MATIC 2-10 TENÍA UN ERROR DE FÁBRICA QUE " +
                "ARRUINABA LA PELÍCULA.\n\nRADIO: ¡ESPACIAL! ¡ESPACIAL! ¡CAMBIO! \n\nFOTOGRAFO: AHH. İRAYOS! \n\n" +
                "SPACEBOY: ÉSTE ES EL AGENTE 00.01... \n\nRADIO: PROBLEMAS EN TOKIO, SPACEBOY... UN JUGUETERO HIZO QUE " +
                "UNA SERPIENTE MARINA SE ENOJARA AL HACER UN MUÑECO DE FELPA CON SU IMAGEN. EL MUÑECO CANTA EL FELIZ " +
                "CUMPLEAÑOS. SI USAN EL TELEVADOR... APENAS LOGRARÍAN LLEGAR A... \n\nSPACEBOY: VAMOS DE CAMINO... " +
                "\nSPACEBOY: ¿RUMOR? HUBIESE QUERIDO QUE NO USARAS TUS PODERES EN LA CÁMARA DE ESE FOTÓGRAFO... " +
                "NECESITAMOS QUE LA PRENSA REPORTE TU MUERTE. \n\nRUMOR: ¿PARA QUÉ? \n\nSPACEBOY: PORQUE NECESITAMOS " +
                "QUE QUIEN SEA QUE TE HAYA MATADO TENGA EL CRÉDITO. EL QUERRÁ JACTARSE DE ESTO.";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaCinco(Screen s) {
        s.cls();
        texto = "MAGO: ASÍ QUE LA MATÉ. \n\nPÚBLICO: OOOHHHH \n\nSR. CLARK: ¡ESO SÍ ES MÁGICO! ¿CÓMO LO HICISTE?\n\n\n" +
                "MAGO: BUENO, SR. CLARK...\n\n...LA CORTÉ POR LA MITAD \n\nPÚBLICO: HA HA HA HA\n\n\nSR. CLARK: PARA " +
                "AQUELLOS QUE RECIÉN NOS SINTONIZAN, HOY NUESTROS INVITADOS SON EL ASOMBROSO MAGO ASESINO, Y SU " +
                "ADORABLE SECUAZ, LA ASISTENTE... \n\nASISTENTE: ENCANTADORA, LO ASEGURO. \n\nSR. CLARK: ...QUIENES " +
                "RECIENTEMENTE ASESINARON A RUMOR. Y QUE LA SEMANA PASADA GANARON EL PREMIO ANUAL OPPENHEIMER PARA " +
                "VILLANOS EN LA CATEGORÍA DE ACTOS RUINES... ¿QUÉ ES LO QUE HARÁN CON TODO ESE DINERO? \n\nMAGO: " +
                "BUENO, ESTOY MUY FELIZ DE QUE ME LO PREGUNTES...";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaSeis(Screen s) {
        s.cls();
        texto="MAGO: PORQUE ME GASTÉ TODO EL DINERO EN ESTE ASESINOBOT GIGANTE, ¡Y ME HE ESTADO MURIENDO DE GANAS POR " +
                "PROBARLO! \n\nASISTENTE: ES CIERTO... GASTO CADA CENTAVO. \n\nSR. CLARK: iWOW! iES IMPRESIONANTE! ¿QUÉ " +
                "SE SUPONE QUE HACE? \n\n\n\nMAGO: BUENO, SR. CLARK... MATA GENTE. \n\nMAGO: HABLO EN SERIO. \n\n" +
                "ASISTENTE: LO HACE.";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaSiete(Screen s) {
        s.cls();
        texto="¡INSPECTOR LUPO...! \n\n¡LAS COSAS VAN A EMPEORAR EN ESE ESTUDIO! \n\nEL ALCALDE QUIERE SABER DE QUÉ " +
                "HABLAN TANTO... \n\nLUPO: ¡HUMPH! ESOS MALCRIADOS DE UMBRELLA SIEMPRE NOS HACEN ESPERAR, INSISTEN EN " +
                "USAR SU TELEVADOR EN VEZ DE SIMPLEMENTE VOLAR HASTA AQUÍ... \n\n\nAHÍ VIENEN... \n\nLUPO: DAME MIS " +
                "DIENTES. \n\n¡PFFT! SUPER HÉROES... \n\n\n¡I MIE! OCCHI!* (*MIS OJOS) \n\nLUPO: LLEGAN TARDE.";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaOcho(Screen s) {
        s.cls();
        texto="HORROR: ¡FELIZ CUMPLEAÑOS! \n\nSPACEBOY: TUVIMOS PROBLEMAS ENCONTRANDO UN TELEVADOR OPERATIVO EN EL " +
                "OCÉANO PACIFICO... ¿CUÁL ES LA SITUACIÓN? \n\nLUPO: ESTE MAGO ASESINO HIPNOTIZÓ A LUCIFER CLARK Y A " +
                "LA AUDIENCIA DEL ESTUDIO, Y PUSO A SU ASESINOBOT EN MODO \"BRUTALIDAD IMPRUDENTE\" PIDE DIEZ MILLONES " +
                "DE DÓLARES Y UNA CITA CON LA ACTRIZ DE TELENOVELAS ITALIANA GINA BARBEAUX...\n\n\nLUPO: TAMBIÉN TOMÓ " +
                "EL CRÉDITO DE HABER MATADO A RUMOR. \n\nKRAKEN: TODOS LO HACEN. \n\nLUPO: TIENE FOTOGRAFÍAS KRAKEN... " +
                "Y LAS ESTÁ MOSTRANDO EN CÁMARA... \n\nSPACEBOY: NOSOTROS NOS OCUPAREMOS INSPECTOR. TENGA A SUS HOMBRES " +
                "AQUÍ AFUERA EN CASO DE QUE EL MAGO ASESINO INTENTE ESCAPAR. Y SOBRE TODO... NO TENGAN PÁNICO. \n\n" +
                "LUPO: HUMPH.";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaNueve(Screen s) {
        s.cls();
        texto="MAGO: ¡RESULTÓ! \n\nASISTENTE: ¡HAZLOS EXPLOTAR! ¡A TODOS! \n\nPÚBLICO: ¡AYUDA! ¡PARE! ¡AHHHH!\n\n\n\n" +
                "MAGO: UNA MARAVILLOSA IDEA, AMORCITO... PERO PRIMERO... PARA... MI... PRÓXIMO... TRUCO... \n\nMAGO: " +
                "¡...UN FABULOSO ACTO DE VIOLENCIA! \n\nASISTENTE: UN TRUCO CLÁSICO... ¡PERO LOS CLÁSICOS NUNCA PASAN " +
                "DE MODA! \n\n\n\nMAGO: ¡ASISTENTE! ¡ESPERO QUE HAYAS TRAÍDO ROPA DE REPUESTO... \n\nMAGO: ¿QUÉ ES ESE... ?";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaDiez(Screen s) {
        s.cls();
        texto="SPACEBOY: AHORA BAJA ESE SERRUCHO ANTES DE QUE TE LASTIMES...\n\nKRAKEN: Eres ridiculo, Space... \n\n" +
                "MAGO: ¡PRESTO! \n\n\n\nHORROR: ¡SPACE! \n\n\n\nMAGO: ¡VAN DOS! SE LES PARTIRÁN SUS PEQUEÑOS CORAZONES " +
                "VIÉNDOME ACABAR CON TODA SU FAMILIA... \n\nKRAKEN: EN REALIDAD NO... \n\nKRAKEN: SOMOS ADOPTADOS. " +
                "\n\nASISTENTE: Hora de desaparecer...";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaOnce(Screen s) {
        s.cls();
        texto="SPACEBOY: ¡HORROR! ¡SUJETA SU OTRO BRAZO! \n\nHORROR: ¡LO TENGO! \n\n\n\nSPACEBOY: ¡SÉANCE! ¡SUELTA " +
                "LOS REMACHES! \n\nSÉANCE: HECHO. \n\nSPACEBOY: TIRA. \n\n\n\n¡BOOOM!";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaDoce(Screen s) {
        s.cls();
        texto="RUMOR: HEY, ASISTENTE... \n\nRUMOR: ...OÍ QUE LA PARRILLA DE ILUMINACIÓN ERA UN LUGAR MUY PELIGROSO, UN " +
                "POCO DE PESO EXTRA Y CEDE. \n\n\n\nASISTENTE: ¡PERO SI TE MATAMOS! \n\nHOWWWWW…. CRASH\n\n\n\nMONOCLE: " +
                "CUAN CIERTO...";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaTrece(Screen s) {
        s.cls();
        texto="HORROR: ¡PAPÁ! \n\nKRAKEN: HARGREEVES. \n\nSPACEBOY: SEÑOR. \n\nSÉANCE: TÚ DE NUEVO... \n\nRUMOR: ... " +
                "\n\n\nMONOCLE: ¿DEBO RECORDARLES QUE SE REFIERAN A MI SOLO COMO THE MONOCLE?. \nMONOCLE: ¿Y POR QUÉ " +
                "AÚN ESTÁS VIVA, RUMOR? \n\nRUMOR: ¿? \n\nSPACEBOY: PORQUE ELLA NOS MINTIÓ... \n\nSPACEBOY: ESO ES LO " +
                "QUE RUMOR HACE. QUERÍA EVITAR EL TURNO DE PATRULLAJE... ASÍ QUE NOS DIJO QUE IRÍA A ESTUDIAR \"CIENCIA " +
                "POLIGRÁFICA A LA BIBLIOTECA\" \n\n\nSPACEBOY: PERO EN REALIDAD HABÍA SALIDO CON UN LANZADOR DE " +
                "CUCHILLOS POLINESIO, CUANDO LA ATRAPASTE ENTRANDO A HURTADILLAS PASADA LA MEDIANOCHE. PERO NOS DIJO " +
                "QUE HABÍA ESTADO EN LA BIBLIOTECA... Y LO QUE RUMOR DICE... SIEMPRE TERMINA SIENDO LA VERDAD. \n\n" +
                "COMENCÉ A SOSPECHAR CUANDO EL CADÁVER APARECIÓ...";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaCatorce(Screen s) {
        s.cls();
        texto="SPACEBOY: ENTONCES ENCONTRE ESTO EN SU ROPA. SU MENTIRA SE HABÍA MANIFESTADO EN OTRO RUMOR... EN LA " +
                "BIBLIOTECA. NO PASO MUCHO TIEMPO HASTA QUE ALGUIEN LA ENCONTRARA... EL MAGO ASESINO Y LA ASISTENTE..." +
                "\n\nMONOCLE: BUEN TRABAJO, AGENTE 00.01... ¡PARA DESCUBRIR QUE GUIE AL MAGO ASESINO HASTA UNA COPIA! " +
                "¡FASCINANTE! \n\nRUMOR: ¿QUÉ... ? \n\n\nKRAKEN: ¡¡¿TÚ LE DIJISTE A ESE PSICOPATA DONDE ENCONTRARLA?" +
                "!! ¡¡¿POR QUÉ HARÍAS ESO?!! \n\n\nMONOCLE: PARA ENSEÑARLE UNA LECCIÓN.\n\nMONOCLE: SE TERMINÓ LA " +
                "CLASE.\n\n\n\n Esta ha sido una aventura presentando a la Academia Umbrella. Algunos de los personajes " +
                "de los que has disfrutado, puede que estén o no estén vivos y/o muertos para el próximo episodio.";
        s.out(texto, "Eras Medium ITC", 18, Colors.black);
    }

    @Override
    public void paginaQuince(Screen s) {
        s.cls();
        texto="GERARD WAY & GABRIEL BA. \n\nTHE UMBRELLA ACADEMY \n\n\nDIOS SALVE AL PRESIDENTE \n\n\nLA HISTORIA QUE " +
                "NO CAMBIARÁ ABSOLUTAMENTE NADA.";
        s.out(texto, "Berlin Sans FB Demi", 22, Colors.black);
    }
}
