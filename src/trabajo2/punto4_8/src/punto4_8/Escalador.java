package punto4_8;

public class Escalador extends Ciclista {
    private float aceleracionProm;
    private float gradoRampa;
    
    public Escalador(int identificador, String nombre, float aceleracionProm, float gradoRampa) {
        super(identificador, nombre);
        this.aceleracionProm = aceleracionProm;
        this.gradoRampa = gradoRampa;
    }
    protected float getaceleracionProm() {
        return aceleracionProm;
    }

    protected void setPotenciaPromedio(float aceleracionPromedio) {
        this.aceleracionProm = aceleracionPromedio;
    }

    protected double getgradoRampa() {
        return gradoRampa;
    }

    protected void setgradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
    
    protected String imprimirTipo() {
        return "Es un escalador";
    }
    
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleracion promedio = " + aceleracionProm);
        System.out.println("Grado rampa = " + gradoRampa);
    }
}
