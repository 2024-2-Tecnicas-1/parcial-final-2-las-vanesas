package logicaNegocio;

public class Delfin extends Animal {

    public Delfin(String nombre, TipoHabitat habitat) {
        super("Delfin", TipoHabitat.ACUATICO);
    }

    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
      return "Pescado";
    }
  
}
