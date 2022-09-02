package trabajo1.parte2;

public class Circulo extends Figura {
    //Atributos
    public int radio;
    
    //constructor
    public void Círculo(int radio) {
        this.radio = radio;
    }

    //Métodos
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
    public double calcularPerímetro() {
    return 2*Math.PI*radio;
    }
}
