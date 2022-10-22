package punto4_8;

public class Velocista extends Ciclista {
    private double potenciaProm;
    private double velocidadProm;
    
    public Velocista(int identificador, String nombre, double potenciaProm, double velocidadProm) {
        super(identificador, nombre);
        this.potenciaProm = potenciaProm;
        this.velocidadProm = velocidadProm;
    }
    protected double getPotenciaPromedio() {
        return potenciaProm;
    }

    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaProm = potenciaPromedio;
    }

    protected double getvelocidadPromedio() {
        return velocidadProm;
    }

    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadProm = velocidadPromedio;
    }
    
    protected String imprimirTipo() {
        return "Es un velocista";
    }
    
    protected void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio = " + potenciaProm);
        System.out.println("Velocidad promedio = " + velocidadProm);
    }
}
