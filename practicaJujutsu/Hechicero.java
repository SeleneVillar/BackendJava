package practicaJujutsu;

public class Hechicero {
    //Atributos
    private String nombre;
    private String genero;
    private String grado;
    private String tecnicaMaldita;
    private String tecnicaHechicero;
    private String armas;
    private int edad;
    private double estatura;

    //Getters
    public String getNombre(){  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getGrado(){  return grado;  }
    public String getTecnicaMaldita(){  return tecnicaMaldita;  }
    public String getTecnicaHechicero(){  return tecnicaHechicero;  }
    public String getArmas(){  return armas;  }
    public int getEdad(){  return edad;  }
    public double getEstatura(){  return estatura;  }

    //Setters
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setGrado(String grado){
        if(!grado.isEmpty()){
            this.grado = grado;
            return true;
        }else
            return false;
    }

    public boolean setTecnicaMaldita(String tecnicaMaldita){
        if(!tecnicaMaldita.isEmpty()){
            this.tecnicaMaldita = tecnicaMaldita;
            return true;
        }else
            return false;
    }

    public boolean setTecnicaHechicero(String tecnicaHechicero){
        if(!tecnicaHechicero.isEmpty()){
            this.tecnicaHechicero = tecnicaHechicero;
            return true;
        }else
            return false;
    }

    public boolean setArmas(String armas){
        if(!armas.isEmpty()){
            this.armas = armas;
            return true;
        }else
            return false;
    }

    public boolean setEdad(int edad){
        if(edad > 0 ){
            this.edad = edad;
            return true;
        }else
            return false;
    }

    public boolean setEstatura(double estatura){
        if(estatura > 0){
            this.estatura = estatura;
            return true;
        }else
            return false;
    }
}