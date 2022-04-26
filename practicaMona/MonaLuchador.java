package practicaMona;

//Clase MonaLuchador que hereda de la clase Mona
public class MonaLuchador extends Mona{
    //Atributo
    private String modalidadCombate;

    //Getter
    public String getModalidadCombate(){  return modalidadCombate;  }

    //Setter
    public boolean setModalidadCombate(String modalidadCombate){
        if (!modalidadCombate.isEmpty()){
            this.modalidadCombate = modalidadCombate;
            return true;
        }else
            return false;
    }

    //Método actividades: Imprime las actividades del personaje
    public void actividades(){
        System.out.println("Actividades: Debe entrenar, mantenerse en forma y aprender a evitar lesiones para poder" +
                "enfrentarse contra su contendiente en el ring.");
    }
}
