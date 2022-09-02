package trabajo1;
import java.util.Scanner;

public class punto4_10 {
    public static void main(String[] args){

        double patrimonio,estrato,matricula=50000;
        String nombre="",numero_ins;

        Scanner entrada = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        System.out.println("ingrese el nombre: ");
        nombre=str.nextLine();

        System.out.println("ingrese el numero de inscripcion: ");
        numero_ins=entrada.next();

        System.out.println("ingrese patrimonio: ");
        patrimonio=entrada.nextDouble();

        System.out.println("ingrese el estrato: ");
        estrato=entrada.nextDouble();

        entrada.close();
        str.close();
        
        if((patrimonio>2000000) && (estrato>3)){
            matricula=matricula+(0.03*patrimonio);
        }

        System.out.println("El estudiante con numero de inscripcion "
        +numero_ins+" y nombre "+nombre +" debe pagar: $"+matricula);


    }
}
