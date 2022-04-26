package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class SpiderHam extends Spiderman implements PoderesHam{

    public SpiderHam(String universo, String nombreReal, String alias, String especie, String ocupacion){
        super(universo, nombreReal, alias,especie,ocupacion);
    }

    @Override
    public void fuerza(Screen s) {
        s.out("\n-Fuerza Sobrehumana: Es capaz de levantar 10 toneladas de peso sobre su cabeza usando ambos" +
                " brazos.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void velocidad(Screen s) {
        s.out("\n-Velocidad Sobrehumana: Su factor de velocidad y reflejos son varias decenas de veces más " +
                        "rápidos que cualquier ser humano en perfectas condiciones físicas.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void reflejos(Screen s) {
        s.out("\n-Reflejos Sobrehumanos: Sus reflejos y movimientos le permiten esquivar casi cualquier objeto " +
                        "que viaje a grandes velocidades. Su capacidad de reflejos son tales que él es prácticamente " +
                        "intocable.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void agilidad(Screen s) {
        s.out("\n-Agilidad Sobrehumana: Su fisiología arácnida, también le proporciona una flexibilidad corporal " +
                        "increíble, sus tendones pueden prolongarse mucho más allá que las personas ordinarias, " +
                        "permitiéndole tomar sus tan características poses de araña.\n",
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
    public void durabilidad(Screen s) {
        s.out("\n-Durabilidad Sobrehumana: Puede resistir la fatiga y el cansancio durante horas e incluso días. " +
                        "También su durabilidad es de niveles superhumanos, siendo sus tejidos más duros que los de un " +
                        "ser humano común\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void resistencia(Screen s) {
        s.out("\n-Resistencia Sobrehumana: Su musculatura avanzada produce menos toxinas de fatiga durante la " +
                        "actividad física que un ser humano ordinario. Esto le permite exigirse físicamente durante " +
                        "períodos más largos de tiempo antes de que el cansancio empiece a deteriorar su rendimiento " +
                        "físico.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void factorCuracion(Screen s) {
        s.out("\n-Factor de Curación: Su resistencia y fuerzas físicas superhumanas también le dan un factor de " +
                        "curación muy rápido, pudiendo sanar heridas en horas o días lo que a un porcino normal le " +
                        "tomaría semanas.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void trepaMuros(Screen s) {
        s.out("\n-Trepa Muros: La fisiología arácnida de Spider-Ham, le permite controlar mentalmente el flujo de " +
                        "atracción interatómica (Electrostática) entre el límite molecular de las superficies, así " +
                        "supera la repulsión normal de electrones y permite su increíble potencial de adhesión.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.out("\n-Sentido Arácnido: Su sentido arácnido le ha salvado la vida incontables veces, previniéndole " +
                        "del peligro aún antes que este ocurra. Su sentido no identifica la naturaleza del peligro, " +
                        "pero si le avisa de donde proviene y que tan peligroso es, permitiéndole reaccionar aún " +
                        "antes que el peligro se manifieste y en la dirección adecuada para esquivarlo, anularlo o " +
                        "contra-atacarlo.\n",
                "Arial", 18, Colors.PrestigeBlue);
    }
}
