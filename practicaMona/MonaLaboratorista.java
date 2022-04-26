package practicaMona;

//Clase MonaLaboratorista que hereda de la clase Mona
public class MonaLaboratorista extends Mona{
    //Atributo
    private String materiales;

    //Getter
    public String getMateriales(){  return materiales;  }

    //Setter
    public boolean setMateriales(String materiales){
        if(!materiales.isEmpty()){
            this.materiales = materiales;
            return true;
        }else
            return false;
    }

    //Método actividades: Imprime las actividades del personaje
    public void actividades(){
        System.out.println("Actividades: Manipula y opera equipos de laboratorio para realizar analisis quimicos, " +
                "ejecuta metodos de analisis cualitativos, cuantitativos, fisico-quimicos, y microbiologicos a " +
                "diversas muestras con base en normas y procesos estandarizados, analiza resultados, etc.");
    }

}