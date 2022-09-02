package trabajo1;

import java.util.Scanner;

public class punto4_7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(), B = scan.nextInt();

        if (A < B) {
            System.out.println("A es menor que B");
        } else if (A > B) {
            System.out.println("A es mayor que B");
        } else {
            System.out.println("A es igual que B");
        }
        scan.close();
    }
}
