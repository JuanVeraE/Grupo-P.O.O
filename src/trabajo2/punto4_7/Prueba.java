package trabajo2.punto4_7;

/**
* Esta clase prueba diferentes animales y sus métodos.
* @version 1.2/2020
*/
public class Prueba {
/**
* Método main que crea un array de varios animales y para cada uno
* muestra en pantalla su nombre científico, su sonido, alimentos y
* hábitat
*/
public static void main(String[] args) {
Animal[] animales = new Animal[4]; /* Define un array de cuatro
elementos de tipo Animal */
animales[0] = new Gato();
animales[1] = new Perro();
animales[2] = new Lobo();
animales[3] = new Leon();
for (int i = 0; i < animales.length; i++) { /* Recorre el array de
animales */
System.out.println(animales[i].getNombreCientífico());
System.out.println("Sonido: " + animales[i].getSonido());
System.out.println("Alimentos: " + animales[i].
getAlimentos());
System.out.println("Hábitat: " + animales[i].getHábitat());
System.out.println();
}
}
}