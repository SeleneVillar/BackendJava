package practicaMona;

//Clase MonaBombero que hereda de la clase Mona
public class MonaBombero extends Mona{
    //Atributo
    private String elementoTrabajo;

    //Getter
    public String getElementoTrabajo(){  return elementoTrabajo;  }

    //Setter
    public boolean setElementoTrabajo(String elementoTrabajo){
        if (!elementoTrabajo.isEmpty()){
            this.elementoTrabajo = elementoTrabajo;
            return true;
        }else
            return false;
    }

    //Método actividades: Imprime las actividades del personaje
    public void actividades(){
        System.out.println("Actividades: Se encarga de apagar incendios y prestar ayuda, rescate y proteccion a la " +
                "comunidad durante accidentes o cualquier otro tipo de siniestro o emergencia");
    }
}
