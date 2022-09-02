package trabajo1.parte2;
import trabajo1.parte2.*;

public class PruebasFiguras {
    public static void main(String args[]) {

        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(1,2);
        Cuadrado cuadrado = new Cuadrado(3);
        Triangulo triangulo= new Triangulo(2, 3);
        TrianguloR trianguloR = new TrianguloR(3,5);

        System.out.println("El área del círculo es = " + circulo.calcularArea());
        System.out.println("El perímetro del círculo es = " + circulo.calcularPerimetro());
        System.out.println();

        System.out.println("El área del rectángulo es = " + rectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + rectangulo.calcularPerimetro());
        System.out.println();

        System.out.println("El área del cuadrado es = " + cuadrado.calcularArea());
        System.out.println("El perímetro del cuadrado es =" + cuadrado.calcularPerimetro());
        System.out.println();

        System.out.println("El área del triángulo es = " + triangulo.calcularArea());
        System.out.println("El perímetro del triángulo es = " + triangulo.calcularPerimetro());
        triangulo.tipotriangulo();

        }
    
}
