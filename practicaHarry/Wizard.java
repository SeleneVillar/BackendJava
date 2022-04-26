package practicaHarry;

public class Wizard {
    //Atributos
    private String name;
    private String gender;
    private String bloodStatus;
    private String house;
    private String boggart;
    private String patronus;

    //Getters
    public String getName(){  return name;  }
    public String getGender(){  return gender;  }
    public String getBloodStatus(){  return bloodStatus;  }
    public String getHouse(){  return house;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }

    //Setters
    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setGender(String gender){
        if (!gender.isEmpty()) {
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean setBloodStatus(String bloodStatus){
        if(!bloodStatus.isEmpty()){
            this.bloodStatus = bloodStatus;
            return true;
        }else
            return false;
    }

    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    //Método showMessage, devuelve un String con la información del Mago
    public String showMessage(){
        return "Name: "+getName()+
                "\nGender: "+getGender()+
                "\nBlood Status: "+getBloodStatus()+
                "\nHouse: "+getHouse()+
                "\nBoggart: "+getBoggart()+
                "\nPatronus: "+getPatronus()+
                "\n----------------------------------------------------";
    }
}