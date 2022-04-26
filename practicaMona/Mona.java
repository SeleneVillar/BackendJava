package practicaMona;

public class Mona {
    //Atributos
    private String nombre;
    private String profesion;
    private String apariencia;
    private String vestimenta;

    //Getters
    public String getNombre(){  return nombre;  }
    public String getProfesion(){  return profesion;  }
    public String getApariencia(){  return apariencia;  }
    public String getVestimenta(){  return vestimenta;  }

    //Setters
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setProfesion(String profesion){
        if (!profesion.isEmpty()){
            this.profesion = profesion;
            return true;
        }else
            return false;
    }

    public boolean setApariencia(String apariencia){
        if (!apariencia.isEmpty()){
            this.apariencia = apariencia;
            return true;
        }else
            return false;
    }

    public boolean setVestimenta(String vestimenta){
        if (!vestimenta.isEmpty()){
            this.vestimenta = vestimenta;
            return true;
        }else
            return false;
    }

    //Método printMsg: Imprime el mensaje Creando personaje y el nombre del personaje que se está creando
    public void printMsg(){
        System.out.println("Creando personaje: " + getNombre());
    }
}