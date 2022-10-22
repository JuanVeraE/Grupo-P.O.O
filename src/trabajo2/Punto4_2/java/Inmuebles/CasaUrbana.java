package Inmuebles;

public class CasaUrbana extends Casa{
    public CasaUrbana(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int númeroPisos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, área, dirección,
    númeroHabitaciones, númeroBaños, númeroPisos);
    }
    
    void imprimir() {
    super.imprimir(); 
    }
    
}
