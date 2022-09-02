package trabajo1.parte2;

public class Circulo extends Figura {
    //Atributos
    public int radio;
    
    //constructor
    public Circulo(int radio) {
        this.radio = radio;
    }

    //Métodos
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
}
