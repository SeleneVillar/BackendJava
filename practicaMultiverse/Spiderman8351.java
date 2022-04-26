package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class Spiderman8351 extends Spiderman implements PoderesSpiderman8351 {

    public Spiderman8351(String universo, String nombreReal, String alias, String especie, String ocupacion){
        super(universo, nombreReal, alias, especie, ocupacion);
    }

    @Override
    public void fisiologiaAracnida(Screen s) {
        s.out("\n-Fisiología Arácnida: Posee los poderes proporcionales de una araña, concedidos por medio de una" +
                        " araña común irradiada la cual le pico durante su adolescencia.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void fuerza(Screen s) {
        s.out("\n-Fuerza Superhumana: Es capaz de levantar 10 toneladas de peso sobre su cabeza usando ambos brazos," +
                        " aunque después puede levantar hasta 20 toneladas tras pasar por una mutación a manos de la " +
                        "Reina y sufrir una evolución al renacer.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void durabilidad(Screen s) {
        s.out("\n-Durabilidad Sobrehumana: Tiene una resistencia superhumana pudiendo resistir la fatiga y el " +
                        "cansancio durante horas e incluso días. Su durabilidad es de niveles superhumanos, siendo sus " +
                        "tejidos más duros que los de un ser humano común.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void resistencia(Screen s) {
        s.out("\n-Resistencia Sobrehumana: Puede exigirse físicamente durante períodos más largos de tiempo antes " +
                        "de que el cansancio empiece a deteriorar su rendimiento físico. También le permite mantener la " +
                        "respiración por un tiempo prolongado, incluso por encima de los 20 minutos.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void factorCuracion(Screen s) {
        s.out("\n-Factor de Curación: Tiene un factor de curación muy rápido, pudiendo sanar heridas en horas o " +
                        "días lo que a un humano normal le tomaría semanas. Debido a su metabolismo acelerado, tiene " +
                        "una mayor tolerancia a las drogas y las enfermedades que los seres humanos normales, pudiendo " +
                        "combatir sus efectos en tan sólo cuestión de instantes.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void velocidad(Screen s) {
        s.out("\n-Velocidad Sobrehumana: Su factor de velocidad y reflejos son varias decenas de veces más rápido " +
                        "que cualquier ser humano en perfectas condiciones físicas. Sus reflejos son 40 veces más " +
                        "rápidos que los seres humanos.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void reflejos(Screen s) {
        s.out("\n-Reflejos Sobrehumanos: Sus reflejos y movimientos le permiten esquivar casi cualquier objeto que " +
                        "viaje a grandes velocidades. Su capacidad de reflejos son tales que él es prácticamente " +
                        "intocable.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void agilidad(Screen s) {
        s.out("\n-Agilidad Sobrehumana: La araña que le dio a Peter sus poderes, también le proporcionó una " +
                        "flexibilidad corporal increíble, sus tendones pueden prolongarse mucho más allá que las " +
                        "personas ordinarias, permitiéndole tomar sus tan características poses de araña.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void saltos(Screen s) {
        s.out("\n-Habilidad para Saltar: Tanto su fuerza como su agilidad y rapidez le permiten realizar saltos " +
                        "extraordinarios y de gran velocidad pudiendo cubrir 100 metros en un salto largo y 30 metros " +
                        "en altura.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void trepaMuros(Screen s) {
        s.out("\n-Trepa Muros: La araña radiactiva que lo pico, produjo una mutación en el cerebelo de Peter, " +
                        "como consecuencia él puede controlar mentalmente el flujo de atracción interatómica " +
                        "(electrostática) entre el límite molecular de las superficies, así supera la repulsión normal " +
                        "de electrones y permite su increíble potencial de adhesión.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.out("\n-Sentido Arácnido: Posee un sentido extrasensorial o sentido arácnido que le avisa de los " +
                        "potenciales peligros inmediatos con una sensación de hormigueo en la parte posterior de la " +
                        "cabeza.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void equilibrioPerfecto(Screen s) {
        s.out("\n-Equilibrio Perfecto: Tiene un perfecto balance y equilibrio, desde prácticamente cualquier punto " +
                        "imaginable.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }
}