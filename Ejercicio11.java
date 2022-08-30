package Ejercicios_POO.Ejercicios_Act_2_Grupal;
import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args){
        int a,b,c,mayor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese a: ");
        a=entrada.nextInt();

        System.out.println("ingrese b: ");
        b=entrada.nextInt();

        System.out.println("ingrese c: ");
        c=entrada.nextInt();
        
        if ((a>b)&&(a>c)){
            mayor=a;
        }
            
        else if((b>a)&&(b>c)){
            mayor=b;
        }

        else{
            mayor=c;
        }

        System.out.println("El valor mayor entre "+a+", "+b+" y "+c+" es: "+mayor);

    }
}
