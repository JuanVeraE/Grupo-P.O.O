package trabajo1.parte1;

import java.util.Scanner;

public class punto4_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un color (blanca,verde,amarilla,azul): ");
        String color = input.nextLine();
        System.out.println("valor: ");
        double valcomp = input.nextInt();
        double valpag,pdes;

        if (color.equals("blanca")) {
            pdes = 0;
        } else if (color.equals("verde")) {
            pdes = 0.1;
        } else if (color.equals("amarilla")){
            pdes = 0.25;
        } else if (color.equals("azul")){
            pdes = 0.5;
        } else {
            pdes = 1;
        }

        valpag = valcomp - valcomp * pdes;
        System.out.println(valpag);
        input.close();
    }
}
