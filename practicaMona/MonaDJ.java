package practicaMona;

//Clase MonaDJ que hereda de la clase Mona
public class MonaDJ extends Mona{
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
        System.out.println("Actividades: Selecciona y mezcla musica grabada propia o de otros compositores y artistas,"
                +" para ser escuchada por una audiencia");
    }
}
