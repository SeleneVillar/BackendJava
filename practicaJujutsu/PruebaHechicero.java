package practicaJujutsu;

public class PruebaHechicero {
    public static void main(String[] args){
        hechiceros();
    }

    private static void hechiceros(){
        //Objeto yuji de la clase Hechicero
        Hechicero yuji = new Hechicero();
        yuji.setNombre("Yuji Itadori");
        yuji.setGenero("Masculino");
        yuji.setEdad(15);
        yuji.setEstatura(1.73);
        yuji.setGrado("Desconocido");
        yuji.setTecnicaMaldita("No es capaz de hacer uso de algun tipo de tecnica maldita");
        yuji.setTecnicaHechicero("Punio Divergente, Destello Oscuro, Contrato Vinculante");
        yuji.setArmas("Masacra Demonios, Cuchillo de Supervivencia");

        //Objeto megumi de la clase Hechicero
        Hechicero megumi = new Hechicero();
        megumi.setNombre("Megumi Fushiguro");
        megumi.setGenero("Masculino");
        megumi.setEdad(15);
        megumi.setEstatura(1.75);
        megumi.setGrado("Segundo");
        megumi.setTecnicaMaldita("Tecnica de Sombras de Diez Tipos");
        megumi.setTecnicaHechicero("Expansion Territorial");
        megumi.setArmas("Jardin Azabache de las Quimeras");

        //Objeto nobara de la clase Hechicero
        Hechicero nobara = new Hechicero();
        nobara.setNombre("Nobara Kugisaki");
        nobara.setGenero("Femenino");
        nobara.setEdad(16);
        nobara.setEstatura(1.60);
        nobara.setGrado("Tercero");
        nobara.setTecnicaMaldita("Tecnica de Munieco Vudu");
        nobara.setTecnicaHechicero("Destello Oscuro");
        nobara.setArmas("Munieco Vudu, Clavos, Martillo, Mazo de Goma");

        //Objeto satoru de la clase Hechicero
        Hechicero satoru = new Hechicero();
        satoru.setNombre("Satoru Gojo");
        satoru.setGenero("Masculino");
        satoru.setEdad(26);
        satoru.setEstatura(1.90);
        satoru.setGrado("Especial");
        satoru.setTecnicaMaldita("Tecnica de Maldicion Ilimitada");
        satoru.setTecnicaHechicero("Especial");
        satoru.setArmas("Expansion Territorial, Vacio Inconmensurable, Pantalla, Destello Oscuro");

        //Variable output: Almacena la información de los Hechiceros de jujutsu.
        String output = "Hechiceros de Jujutsu\n";

        output += "\nNombre: " + yuji.getNombre() + "\nGenero: " + yuji.getGenero() + "\nEdad: " + yuji.getEdad()
                + "\nEstatura: " + yuji.getEstatura() + "\nGrado: " + yuji.getGrado() + "\nTecnica Maldita: " + yuji.getTecnicaMaldita()
                + "\nTecnicas de Hechicero: " + yuji.getTecnicaHechicero() + "\nArmas: " + yuji.getArmas()
                + "\n--------------------------------------------------------------------------------";

        output += "\nNombre: " + megumi.getNombre() + "\nGenero: " + megumi.getGenero() + "\nEdad: " + megumi.getEdad()
                + "\nEstatura: " + megumi.getEstatura() + "\nGrado: " + megumi.getGrado() + "\nTecnica Maldita: " + megumi.getTecnicaMaldita()
                + "\nTecnicas de Hechicero: " + megumi.getTecnicaHechicero() + "\nArmas: " + megumi.getArmas()
                + "\n--------------------------------------------------------------------------------";

        output += "\nNombre: " + nobara.getNombre() + "\nGenero: " + nobara.getGenero() + "\nEdad: " + nobara.getEdad()
                + "\nEstatura: " + nobara.getEstatura() + "\nGrado: " + nobara.getGrado() + "\nTecnica Maldita: " + nobara.getTecnicaMaldita()
                + "\nTecnicas de Hechicero: " + nobara.getTecnicaHechicero() + "\nArmas: " + nobara.getArmas()
                + "\n--------------------------------------------------------------------------------";

        output += "\nNombre: " + satoru.getNombre() + "\nGenero: " + satoru.getGenero() + "\nEdad: " + satoru.getEdad()
                + "\nEstatura: " + satoru.getEstatura() + "\nGrado: " + satoru.getGrado() + "\nTecnica Maldita: " + satoru.getTecnicaMaldita()
                + "\nTecnicas de Hechicero: " + satoru.getTecnicaHechicero() + "\nArmas: " + satoru.getArmas()
                + "\n--------------------------------------------------------------------------------";

        System.out.print(output);
    }
}