package trabajo1;

import java.util.Scanner; 

public class punto3_19 { 
    public static void main() { 

        double lado,area,perimetro,altura; 
        double pi=Math.PI;

        System.out.println ("lado del triangulo: ");
        Scanner scanLado = new Scanner (System.in); //Creación de un objeto Scanner 
        lado = scanLado.nextDouble();
        scanLado.close();

        area=pi*Math.pow(lado,2);
        perimetro= lado*pi;
        altura=lado;
        
        System.out.println("El área es: "+area);
        System.out.println("la altura es: "+altura);
        System.out.println("El perimetro es: "+perimetro); 
    }
}
