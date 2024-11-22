package logicaNegocio;

public class Leon extends Animal{

    public Leon(String nombre, TipoHabitat habitat) {
        super("Leon", TipoHabitat.TERRESTRE);
    }

    @Override
    public String emitirSonido() {
      return "Rugido";
    }

    @Override
    public String obtenerDieta() {
        return "Carnivoro";
    }
  
}
