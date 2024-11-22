package logicaNegocio;

public abstract class Animal {
    
    private String nombre;
    private TipoHabitat habitat;

    public Animal(String nombre, TipoHabitat habitat) {
        this.nombre = nombre;
        this.habitat = habitat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }
    
    
    
    public abstract String emitirSonido();
    
    public abstract String obtenerDieta();

    }

