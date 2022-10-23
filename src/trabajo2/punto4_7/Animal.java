package trabajo2.punto4_7;
/**
* Esta clase abstracta denominada Animal modela un animal genérico
* que cuenta con atributos como un sonido, alimentos que consume,
* un hábitat y un nombre científico.
* @version 1.2/2020
*/
public abstract class Animal {
protected String sonido; 
protected String alimentos; 
protected String hábitat; 
protected String nombreCientífico; 

public abstract String getNombreCientífico();
/**
* Método abstracto que permite obtener el sonido producido por el
* animal
* @return El sonido producido por el animal
*/
public abstract String getSonido();
/**
* Método abstracto que permite obtener los alimentos que consume
* un animal
* @return Los alimentos que consume el animal
*/
public abstract String getAlimentos();
/**
* Método abstracto que permite obtener el hábitat de un animal
* @return El hábitat del animal
*/
public abstract String getHábitat();
}