package trabajo1;
import java.util.Scanner;

public class punto4_12 {
    public static void main(String[] args){
        String nombre;
        double horas,valorHN,horasET,horasEEde8,salario;
    
        Scanner str = new Scanner(System.in);
        Scanner db = new Scanner(System.in);

        System.out.println("ingrese nombre: ");
        nombre=str.nextLine();

        System.out.println("ingrese las horas trabajadas: ");
        horas=db.nextDouble();

        System.out.println("ingrese valor de cada hora: ");
        valorHN=db.nextDouble();
        str.close();
        db.close();

        if(horas>40){
            horasET=horas-40;
            if (horasET>8){
                horasEEde8=horasET-8;
                salario= 40*valorHN+16*valorHN+horasEEde8*3*valorHN;
                
            }

            else{
                salario=40*valorHN+horasET*2*valorHN;
            }
        }

        else{
            salario=horas*valorHN;
        }

        System.out.println("El trabajador "+nombre+" devengo: $"+salario);


    
    }
}
