package practicaHarry;

public class WizardTest {
    public static void main(String[] args) {
        System.out.println("Wizards of the Harry Potter saga\n");
        wizards();
    }

    public static void wizards(){
        //Objeto snape de la clase Wizard
        Wizard snape = new Wizard();
        snape.setName("Severus Snape");
        snape.setGender("Male");
        snape.setBloodStatus("Half-blood");
        snape.setHouse("Slytherin");
        snape.setBoggart("Lord Voldemort");
        snape.setPatronus("Doe");
        System.out.println(snape.showMessage());

        //Objeto siriusBlack de la clase Wizard
        Wizard siriusBlack = new Wizard();
        siriusBlack.setName("Sirius Black III");
        siriusBlack.setGender("Male");
        siriusBlack.setBloodStatus("Pure-blood");
        siriusBlack.setHouse("Gryffindor");
        siriusBlack.setBoggart("Lord Voldemort");
        siriusBlack.setPatronus("Non-corporeal");
        System.out.println(siriusBlack.showMessage());

        //Objeto dumbledore de la clase Wizard
        Wizard dumbledore = new Wizard();
        dumbledore.setName("Albus Percival Wulfric Brian Dumbledore");
        dumbledore.setGender("Male");
        dumbledore.setBloodStatus("Half-blood");
        dumbledore.setHouse("Gryffindor");
        dumbledore.setBoggart("The corpse of his sister, Ariana");
        dumbledore.setPatronus("Phoenix");
        System.out.println(dumbledore.showMessage());

        //Objeto remusLupin de la clase Wizard
        Wizard remusLupin = new Wizard();
        remusLupin.setName("Remus John Lupin");
        remusLupin.setGender("Male");
        remusLupin.setBloodStatus("Half-blood");
        remusLupin.setHouse("Gryffindor");
        remusLupin.setBoggart("Full moon");
        remusLupin.setPatronus("Wolf");
        System.out.println(remusLupin.showMessage());

        //Objeto voldemort de la clase Wizard
        Wizard voldemort = new Wizard();
        voldemort.setName("Tom Marvolo Riddle");
        voldemort.setGender("Male");
        voldemort.setBloodStatus("Half-blood");
        voldemort.setHouse("Slytherin");
        voldemort.setBoggart("His own corpse");
        voldemort.setPatronus("None");
        System.out.println(voldemort.showMessage());
    }

}