package practicaMultiverse;

public class Spiderman {
    //Atributos
    private String universo;
    private String nombreReal;
    private String alias;
    private String especie;
    private String ocupacion;

    //Constructor parametrizado
    public Spiderman(String universo, String nombreReal, String alias, String especie, String ocupacion) {
        this.universo = universo;
        this.nombreReal = nombreReal;
        this.alias = alias;
        this.especie = especie;
        this.ocupacion = ocupacion;
    }

    //Getters
    public String getUniverso() {
        return universo;
    }
    public String getNombreReal() {
        return nombreReal;
    }
    public String getAlias() {
        return alias;
    }
    public String getEspecie() {
        return especie;
    }
    public String getOcupacion() {
        return ocupacion;
    }

    //Setters
    public boolean setUniverso(String universo) {
        if (!universo.isEmpty()) {
            this.universo = universo;
            return true;
        } else
            return false;
    }

    public boolean setNombreReal(String nombreReal) {
        if (!nombreReal.isEmpty()) {
            this.nombreReal = nombreReal;
            return true;
        } else
            return false;
    }

    public boolean setAlias(String alias) {
        if (!alias.isEmpty()) {
            this.alias = alias;
            return true;
        } else
            return false;
    }

    public boolean setEspecie(String especie){
        if (!especie.isEmpty()){
            this.especie = especie;
            return true;
        }else
            return false;
    }

    public boolean setOcupacion(String ocupacion){
        if (!ocupacion.isEmpty()){
            this.ocupacion = ocupacion;
            return true;
        }else
            return false;
    }

    //Método showMessage, devuelve un String con la información del personaje
    public String showMessage() {
        return "Universo: " + universo +
                "\nNombre real: " + nombreReal +
                "\nAlias: " + alias +
                "\nEspecie: " + especie +
                "\nOcupacion: " + ocupacion+"\n";
    }
}

