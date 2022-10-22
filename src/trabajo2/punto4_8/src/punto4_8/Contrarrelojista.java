package punto4_8;

public class Contrarrelojista extends Ciclista {
    private double velocidadMax;
    
    public Contrarrelojista (int identificador, String nombre, double velocidadMax) {
        super(identificador, nombre);
        this.velocidadMax = velocidadMax;
    }
    protected double getVelocidadMax() {
        return velocidadMax;
    }

    protected void setVelocidadMax(double velocidadMaxima) {
        this.velocidadMax = velocidadMaxima;
    }
 
    protected String imprimirTipo() {
        return "Es un contrarrelojista";
    }
    
    protected void imprimir() {
        super.imprimir();
        System.out.println("Velocidad máxima = " + velocidadMax);
    }
}
