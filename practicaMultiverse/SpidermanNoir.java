package practicaMultiverse;
import imonsh.Colors;
import imonsh.Screen;

public class SpidermanNoir extends Spiderman implements PoderesNoir{

    public SpidermanNoir(String universo, String nombreReal, String alias, String especie, String ocupacion){
        super(universo, nombreReal, alias, especie, ocupacion);
    }

    @Override
    public void fisiologiaAracnida(Screen s) {
        s.out("\n-Fisiología Arácnida: Posee poderes que le confieren habilidades de naturaleza arácnida. Sus " +
                        "dones son de origen místico, le fueron otorgadas por el Dios Araña Anansi. Parker ganó " +
                        "la fuerza proporcional de una araña, sus reflejos son más rápidos que el promedio humano. " +
                        "Además es extraordinariamente ágil, sus tendones y tejidos son el doble de elásticos que los " +
                        "de un ser humano promedio.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void fuerza(Screen s) {
        s.out("\n-Fuerza Superhumana: Su fuerza le permite levantar 10 toneladas de fuerza, saltar varios metros " +
                        "de altura, además de columpiarse mediante su telaraña por los tejados.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void velocidad(Screen s) {
        s.out("\n-Velocidad Sobrehumana: Su factor de velocidad y reflejos son varias decenas de veces más " +
                        "rápidos que cualquier ser humano en perfectas condiciones físicas.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void agilidad(Screen s) {
        s.out("\n-Agilidad Sobrehumana: A nivel físico, la picadura produjo cambios a nivel muscular, aumentando " +
                        "su capacidad física hasta un nivel sobrehumano; aumentó también el número de tendones " +
                        "presentes, cosa que facilita posturas de alta complejidad. Su fuerza sobrehumana está " +
                        "presente en todas las extremidades, por lo que es capaz de saltar grandes longitudes, y caer " +
                        "de las mismas sin causar demasiados daños. Todas sus articulaciones se volvieron más " +
                        "flexibles y resistente ante golpes e impactos.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void reflejos(Screen s) {
        s.out("\n-Reflejos Sobrehumanos: Posee reflejos y movimientos que le permiten esquivar casi cualquier " +
                        "objeto que viaje a grandes velocidades. Su extraordinaria agilidad, reflejos y velocidad, en " +
                        "combinación con su sentido arácnido le permiten escapar de cualquier ataque como si nada.\n",
                "Arial", 18, Colors.PrestigeBlue);

    }

    @Override
    public void telaraniaOrganica(Screen s) {
        s.out("\n-Telaraña Orgánica: Puede generar telaraña de manera orgánica gracias a las glándulas secretoras " +
                        "que aloja en sus antebrazos, aunque esto le causa un cierto desgaste en su salud y nutrición.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.out("\n-Sentido Arácnido: Posee un sentido extrasensorial o sentido arácnido que le avisa de los " +
                        "potenciales peligros inmediatos con una sensación de hormigueo en la parte posterior de la " +
                        "cabeza. La naturaleza precisa de este sentido es desconocida. El sentido también puede crear " +
                        "una respuesta general de varios minutos de antelación ante una amenaza sin saber su naturaleza, " +
                        "y puede discernir la severidad del peligro gracias a la intensidad del hormigueo.\n",
                "Arial", 18, Colors.PrestigeBlue);

    }

    @Override
    public void trepaMuros(Screen s) {
        s.out("\n-Trepa Muros: La araña mística que pico a Spider-Man, produjo una mutación en el cerebelo de " +
                        "Peter, como consecuencia él puede controlar mentalmente el flujo de atracción interatómica " +
                        "(electrostática) entre el límite molecular de las superficies, así supera la repulsión normal " +
                        "de electrones y permite su increíble potencial de adhesión.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }
}
