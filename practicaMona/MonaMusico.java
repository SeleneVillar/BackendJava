package practicaMona;

//Clase MonaMusico que hereda de la clase Mona
public class MonaMusico extends Mona{
    //Atributo
    private String instrumento;

    //Getter
    public String getInstrumento(){  return instrumento;  }

    //Setter
    public boolean setInstrumento(String instrumento){
        if (!instrumento.isEmpty()){
            this.instrumento = instrumento;
            return true;
        }else
            return false;
    }

    //Método actividades: Imprime las actividades del personaje
    public void actividades(){
        System.out.println("Actividades: Practicar, ensayar, componer, hacer audiciones, organizar actuaciones, grabar "
                        +"musica, hacer presentaciones en donde toca en publico, etc.");
    }
}