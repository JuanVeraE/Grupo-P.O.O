package trabajo1;

import java.util.Scanner;

public class punto4_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String color = input.nextLine();
        double valcomp = input.nextInt();
        double valpag,pdes;

        if (color == "blanca") {
            pdes = 0;
        } else if (color == "verde") {
            pdes = 0.1;
        } else if (color == "amarilla"){
            pdes = 0.25;
        } else if (color == "azul"){
            pdes = 0.5;
        } else {
            pdes = 1;
        }

        valpag = valcomp - valcomp * pdes;
        System.out.println(valpag);
        input.close();
    }
}
