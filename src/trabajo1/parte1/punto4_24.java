package trabajo1.parte1;
import java.util.Scanner;

public class punto4_24 {
    public static void main(String[] args) {
        boolean a_biggerThan_b,a_biggerThan_c,b_biggerThan_c;
        Scanner input = new Scanner (System.in);

        System.out.println ("Necesitamos información sobre las esferas para determinar algo sobre ellas.\n"
        + "Asi que para determinar todos los casos posibles iremos preguntando cuál pesa más que otra, intentando minimizar las preguntas\n"
        );

        System.out.println ("¿es la esfera A más pesada que la B? "); 
        System.out.println ("(true, false)");
        a_biggerThan_b = input.nextBoolean();

        System.out.println ("¿es la esfera A más pesada que la C? "); 
        System.out.println ("(true, false)");
        a_biggerThan_c = input.nextBoolean(); 

        System.out.println ("¿es la esfera B más pesada que la C? "); 
        System.out.println ("(true, false)");
        b_biggerThan_c = input.nextBoolean(); 

        input.close();

        if(a_biggerThan_b){
            if (a_biggerThan_c) {
                System.out.println ("A es la más grande");
            }else{
                System.out.println ("C es la más grande");
            }
        }else{
            if(b_biggerThan_c){
                System.out.println ("B es la más grande");
            }else{
                System.out.println ("C es la más grande");
            }
        }
    }
}
