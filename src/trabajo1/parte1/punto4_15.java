package trabajo1.parte1;

import java.util.Scanner;

public class punto4_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int A = input.nextInt(), B = input.nextInt(),C = input.nextInt(),D = input.nextInt();
        if ((A == B) && (A == C)){
            if (D > A){
                System.out.println("D es de mayor peso");
            } else {
                System.out.println("D es de menor peso");
            }
        } else {
            if ((A == B) && (A == D)){
                if (C > A){
                    System.out.println("C es de mayor peso");
                } else {
                    System.out.println("C es de menor peso");
                } 
            } else {
                if ((A == C) && (A == D)){
                    if (B > A){
                        System.out.println("B es de mayor peso");
                    } else {
                        System.out.println("B es de menor peso");
                    } 
                } else {
                    if (A > B){
                        System.out.println("A es de mayor peso");
                    } else {
                        System.out.println("A es de menor peso");
                    } 
                }
            }
        }
        input.close();
    }
}
