import java.util.Scanner;

public class cap4ej22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nombre = input.nextLine();
        int salario = input.nextInt(), horas_mes = input.nextInt(), salarioT = salario * horas_mes;

        if (salarioT > 450000){
            System.out.println(nombre);
            System.out.println(salarioT);
        } else {
            System.out.println(nombre);
        }   
        input.close();
    }
}
