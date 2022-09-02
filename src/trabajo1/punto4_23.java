package trabajo1;

import java.util.Scanner;

public class punto4_23 {
    public static void main() {
        double a,b,c,raiz1,raiz2,determinante;
        Scanner input = new Scanner (System.in); //Creación de un objeto Scanner

        System.out.println ("Para la ecuacion cartesiana de segundo grado Ax^2 + Bx + C = 0");

        System.out.println ("A: "); 
        a = input.nextDouble(); 
        input.close();

        System.out.println ("B: "); 
        b = input.nextDouble(); 
        input.close();

        System.out.println ("C: "); 
        c = input.nextDouble(); 
        input.close();

        determinante=Math.pow(b,2)-4*a*c;
        
        if(determinante>0){
            raiz1=(-b+determinante)/(2*a);
            raiz2=(-b-determinante)/(2*a);
            System.out.println ("Las posibles raices son: ");
            System.out.println ("raiz 1: "+raiz1);
            System.out.println ("raiz 1: "+raiz2);
        }else if(determinante==0){
            raiz1=(-b)/(2*a);
            System.out.println ("tiene unica raiz: "+raiz1);
        }else{
            System.out.println ("No tiene raices reales");
        }
    }
}
