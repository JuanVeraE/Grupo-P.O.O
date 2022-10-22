package trabajo2.punto4_7;
/**
* Esta clase concreta denominada Gato es una subclase de Felino.
* @version 1.2/2020
*/
public class Gato extends Felino {
/**
* Método que devuelve un String con el sonido de un gato
* @return Un valor String con el sonido de un gato: “Maullido”
*/
public String getSonido() {
return "Maullido";
}
/**
* Método que devuelve un String con los alimentos de un gato
* @return Un valor String con la alimentación de un gato: “Ratones”
*/
public String getAlimentos() {
return "Ratones";
}
/**
* Método que devuelve un String con el hábitat de un gato
* @return Un valor String con el hábitat de un gato: “Doméstico”
*/
public String getHábitat() {
    return "Doméstico";
    }
    /**
    * Método que devuelve un String con el nombre científico de un gato
    * @return Un valor String con el nombre científico de un gato:
    * “Felis silvestris catus”
    */
    public String getNombreCientífico() {
    return "Felis silvestris catus";
    }
}