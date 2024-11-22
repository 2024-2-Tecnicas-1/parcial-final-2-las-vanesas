package logicaNegocio;

public class Perro extends Animal{

    public Perro(String nombre, TipoHabitat habitat) {
        super("Perro" ,TipoHabitat.TERRESTRE);
    }

    @Override
    public String emitirSonido() {
       return "Ladrido";
    }

    @Override
    public String obtenerDieta() {
       return "Omnívoro";
    }
    
    public String interactuarConHumano (){
        return "El perro mueve la cola y ladra de felicidad";
                
    }
}
