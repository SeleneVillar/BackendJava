package practicaMona;

//Clase MonaJugadorAmericano que hereda de la clase Mona
public class MonaJugadorAmericano extends Mona{
    //Atributo
    private String equipo;

    //Getter
    public String getEquipo(){  return equipo;  }

    //Setter
    public boolean setEquipo(String equipo){
        if (!equipo.isEmpty()){
            this.equipo = equipo;
            return true;
        }else
            return false;
    }

    //Método actividades: Imprime las actividades del personaje
    public void actividades(){
        System.out.println("Actividades: Entrenar, trabajar en equipo, entregar el balon al halfback o fullback para " +
                "ataques terrestres o realizar pases a los wide receivers o tight ends para ataques aereos.");
    }
}
