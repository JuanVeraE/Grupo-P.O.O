package trabajo1.parte1;
import java.util.Scanner; 

public class punto3_18 {
    public static void main(String[] args){
        
        String codigo,nombre,horas,valorHora,retencion;

        System.out.println ("codigo: ");
        Scanner ScanData = new Scanner (System.in); //Creación de un objeto Scanner
        codigo = ScanData.nextLine();
        ScanData.close();

        System.out.println ("nombre: ");
        ScanData = new Scanner (System.in); 
        nombre = ScanData.nextLine();
        ScanData.close();

        System.out.println ("horas: ");
        ScanData = new Scanner (System.in); 
        horas = ScanData.nextLine();
        ScanData.close();

        System.out.println ("valorHora: ");
        ScanData = new Scanner (System.in); 
        valorHora = ScanData.nextLine();
        ScanData.close();

        System.out.println ("retencion: ");
        ScanData = new Scanner (System.in); 
        retencion = ScanData.nextLine();
        ScanData.close();

        ScanData.close();
        System.out.println("codigo: "+codigo);
        System.out.println("nombre: "+nombre);
        System.out.println("horas: "+horas);
        System.out.println("valorHora: "+valorHora);
        System.out.println("retencion: "+retencion);
    }
}