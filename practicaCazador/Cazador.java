package practicaCazador;

public class Cazador {
    //Atributos
    private String nombre;
    private String habilidades;
    private String tecnicaRespiracion;
    private int edad;
    private double estatura;

    //Constructor parametrizado
    public Cazador(String nombre, int edad, double estatura, String habilidades, String tecnicaRespiracion){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.habilidades = habilidades;
        this.tecnicaRespiracion = tecnicaRespiracion;
    }

    //Método showMessage, devuelve un String con la información del cazador de demonios
    public String showMessage(){
        return "Nombre: "+nombre+
                "\nEdad: "+edad+
                "\nAltura: "+ estatura +
                "\nHabilidades: "+habilidades+
                "\nTecnica de respiracion: "+tecnicaRespiracion+
                "\n----------------------------------------------------";
    }
}