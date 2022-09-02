package trabajo1.parte1;
import java.util.Scanner;

public class punto4_14 {
    public static void main(String[] args){
        double vd1,vd2,vd3,salario,totalVen,porven,salar1,salar2,salar3;

        Scanner db = new Scanner(System.in);


        System.out.println("ingrese ventas apto1: ");
        vd1=db.nextDouble();

        System.out.println("ingrese ventas apto2: ");
        vd2=db.nextDouble();

        System.out.println("ingrese ventas apto3: ");
        vd3=db.nextDouble();

        System.out.println("ingrese el salario: ");
        salario=db.nextDouble();

        db.close();
        
        totalVen=vd1+vd2+vd3;
        porven=0.33*totalVen;

        if (vd1>porven) {
            salar1=salario+(0.2*salario);
        } else {
            salar1=salario;
        }

        if (vd2>porven) {
            salar2=salario+(0.2*salario);
        } else {
            salar2=salario;
        }

        if (vd3>porven) {
            salar3=salario+(0.2*salario);
        } else {
            salar3=salario;
        }

        System.out.println("Salario vendedores depto.1 $"+salar1+" salario vendedores depto.2 $"+salar2+" salario vendedores depto.3 $"+salar3);
    }
}
