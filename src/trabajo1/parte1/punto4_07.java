package trabajo1.parte1;

import java.util.Scanner;

public class punto4_07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("A:");
        int A = scan.nextInt();
        System.out.println("B:");
        int B = scan.nextInt();
        scan.close();

        if (A < B) {
            System.out.println("A es menor que B");
        } else if (A > B) {
            System.out.println("A es mayor que B");
        } else {
            System.out.println("A es igual que B");
        }
    }
}
