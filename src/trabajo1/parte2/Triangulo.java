package trabajo1.parte2;

public class Triangulo extends Figura {
    int base;
    int altura;
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    double calcularArea(){
        return ((base * altura)/2);
    }
    double calcularPerimetro(){
        return (base + altura + hipotenusa());
    }
    
    double hipotenusa(){
        return Math.pow(base*base + altura*altura, 0.5);
    }
    void tipotriangulo(){
        if ((base==altura) && (base == hipotenusa()) && (altura == hipotenusa())){
            System.out.println("Es un triangulo equilatero");
        } else if ((base != altura) && (base != hipotenusa()) && (altura != hipotenusa())){
            System.out.println("Es un triangulo escaleno");
        } else {
            System.out.println("Es un triangulo isósceles");
        }
    }
}
