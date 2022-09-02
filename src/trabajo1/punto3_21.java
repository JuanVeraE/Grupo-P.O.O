package trabajo1;

import java.util.Scanner; 

public class punto3_21 {
     public static void main() {
        double lado1,lado2,lado3,area,perimetro,semiperimetro;

        System.out.println ("lado uno del triangulo: "); 
        Scanner scanLado = new Scanner (System.in); //Creación de un objeto Scanner
        lado1 = scanLado.nextDouble(); 
        scanLado.close();
        
        System.out.println ("lado dos del triangulo: "); 
        scanLado = new Scanner (System.in); //Creación de un objeto Scanner 
        lado2 = scanLado.nextDouble(); 
        scanLado.close();

        System.out.println ("lado tres del triangulo: "); 
        scanLado = new Scanner (System.in); //Creación de un objeto Scanner
        lado3 = scanLado.nextDouble(); 
        scanLado.close();

        area=Math.pow(lado1,2);
        perimetro= lado2;
        semiperimetro=lado3;

        System.out.println("El área es: "+area);
        System.out.println("la semiperimetro es: "+semiperimetro);
        System.out.println("El perimetro es: "+perimetro); 
    }
}