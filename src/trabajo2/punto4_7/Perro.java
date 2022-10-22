package trabajo2.punto4_7;
/**
* Esta clase concreta denominada Perro es una subclase de Cánido.
* @version 1.2/2020
*/
public class Perro extends Canido {
    /**
* Método que devuelve un String con el sonido de un perro
* @return Un valor String con el sonido de un perro: “Ladrido”
*/
public String getSonido() {
    return "Ladrido";
    }
    /**
    * Método que devuelve un String con los alimentos de un perro
    * @return Un valor String con la alimentación de un perro: “Carnívoro”
    */
    public String getAlimentos() {
    return "Carnívoro";
    }
    /**
    * Método que devuelve un String con el hábitat de un perro
    * @return Un valor String con el hábitat de un perro: “Doméstico”
    */
    public String getHábitat() {
    return "Doméstico";
    }
    /**
    * Método que devuelve un String con el nombre científico de un perro
    * @return Un valor String con el nombre científico de un perro:
    * “Canis lupus familiaris”
    */
    public String getNombreCientífico() {
    return "Canis lupus familiaris";
    }
}