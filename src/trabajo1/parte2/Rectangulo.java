package trabajo1.parte2;

public class Rectangulo extends Figura {
    int base,altura;

    //constructor
    public Rectangulo(int altura,int base) {
        this.altura = altura;
        this.base=base;
    }

    double calcularArea(){
        return base*altura;
    }
    double calcularPerimetro(){
        return (2*base)+(2*altura);
    }
}


