package practicaLineUp;

public class Banda {
    //Atributos
    private String nombre;
    private String logo;
    private String imagen;
    private String cancion;
    private String nombreCancionUno;
    private String cancionUno;
    private String gifUno;
    private String nombreCancionDos;
    private String cancionDos;
    private String gifDos;
    private String nombreCancionTres;
    private String cancionTres;
    private String gifTres;
    private String nombreCancionCuatro;
    private String cancionCuatro;
    private String gifCuatro;
    
    //Constructor parametrizado
    public Banda(String nombre, String logo, String imagen, String cancion, String nombreCancionUno, String cancionUno,
                 String gifUno, String nombreCancionDos, String cancionDos, String gifDos,  String nombreCancionTres,
                 String cancionTres, String gifTres, String nombreCancionCuatro, String cancionCuatro, String gifCuatro){
        this.nombre = nombre;
        this.logo = logo;
        this.imagen = imagen;
        this.cancion = cancion;
        this.nombreCancionUno = nombreCancionUno;
        this.cancionUno = cancionUno;
        this.gifUno = gifUno;
        this.nombreCancionDos = nombreCancionDos;
        this.cancionDos = cancionDos;
        this.gifDos = gifDos;
        this.nombreCancionTres = nombreCancionTres;
        this.cancionTres = cancionTres;
        this.gifTres = gifTres;
        this.nombreCancionCuatro = nombreCancionCuatro;
        this.cancionCuatro = cancionCuatro;
        this.gifCuatro = gifCuatro;
    }
    
    //Getters
    public String getNombre(){  return nombre;  }
    public String getLogo(){  return logo;  }
    public String getImagen(){  return imagen;  }
    public String getCancion(){  return cancion;  }
    public String getNombreCancionUno(){  return nombreCancionUno;  }
    public String getCancionUno(){  return cancionUno;  }
    public String getGifUno(){  return gifUno;  }
    public String getNombreCancionDos(){  return nombreCancionDos;  }
    public String getCancionDos(){  return cancionDos;  }
    public String getGifDos(){  return gifDos;  }
    public String getNombreCancionTres(){  return nombreCancionTres;  }
    public String getCancionTres(){  return cancionTres;  }
    public String getGifTres(){  return gifTres;  }
    public String getNombreCancionCuatro(){  return nombreCancionCuatro;  }
    public String getCancionCuatro(){  return cancionCuatro;  }
    public String getGifCuatro(){  return gifCuatro;  }

    //Setters
    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setLogo(String logo){
        if (!logo.isEmpty()){
            this.logo = logo;
            return true;
        }else
            return false;
    }

    public boolean setImagen(String imagen){
        if (!imagen.isEmpty()){
            this.imagen = imagen;
            return true;
        }else
            return false;
    }

    public boolean setCancion(String cancion){
        if (!cancion.isEmpty()){
            this.cancion = cancion;
            return true;
        }else
            return false;
    }

    public boolean setNombreCancionUno(String nombreCancionUno){
        if (!nombreCancionUno.isEmpty()){
            this.nombreCancionUno = nombreCancionUno;
            return true;
        }else
            return false;
    }

    public boolean setCancionUno(String cancionUno){
        if (!cancionUno.isEmpty()){
            this.cancionUno = cancionUno;
            return true;
        }else
            return false;
    }

    public boolean setGifUno(String gifUno){
        if (!gifUno.isEmpty()){
            this.gifUno = gifUno;
            return true;
        }else
            return false;
    }

    public boolean setNombreCancionDos(String nombreCancionDos){
        if (!nombreCancionDos.isEmpty()){
            this.nombreCancionDos = nombreCancionDos;
            return true;
        }else
            return false;
    }

    public boolean setCancionDos(String cancionDos){
        if (!cancionDos.isEmpty()){
            this.cancionDos = cancionDos;
            return true;
        }else
            return false;
    }

    public boolean setGifDos(String gifDos){
        if (!gifDos.isEmpty()){
            this.gifDos = gifDos;
            return true;
        }else
            return false;
    }

    public boolean setNombreCancionTres(String nombreCancionTres){
        if (!nombreCancionTres.isEmpty()){
            this.nombreCancionTres = nombreCancionTres;
            return true;
        }else
            return false;
    }

    public boolean setCancionTres(String cancionTres){
        if (!cancionTres.isEmpty()){
            this.cancionTres = cancionTres;
            return true;
        }else
            return false;
    }

    public boolean setGifTres(String gifTres){
        if (!gifTres.isEmpty()){
            this.gifTres = gifTres;
            return true;
        }else
            return false;
    }

    public boolean setNombreCancionCuatro(String nombreCancionCuatro){
        if (!nombreCancionCuatro.isEmpty()){
            this.nombreCancionCuatro = nombreCancionCuatro;
            return true;
        }else
            return false;
    }

    public boolean setCancionCuatro(String cancionCuatro){
        if (!cancionCuatro.isEmpty()){
            this.cancionCuatro = cancionCuatro;
            return true;
        }else
            return false;
    }

    public boolean setGifCuatro(String gifCuatro){
        if (!gifCuatro.isEmpty()){
            this.gifCuatro = gifCuatro;
            return true;
        }else
            return false;
    }

}
