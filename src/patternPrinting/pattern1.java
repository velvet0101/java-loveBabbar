package patternPrinting;

import java.util.Scanner;

public class pattern1 {
     public  static void main() {

        //solid pattern1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j=1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
