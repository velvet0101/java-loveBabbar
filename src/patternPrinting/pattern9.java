package patternPrinting;

import java.util.Scanner;

public class pattern9 {
     public static void main() {
         Scanner sc= new Scanner(System.in);
         int n = sc.nextInt();

         for (int i =1; i<=n;i++){
            if (i<n) {
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }

                System.out.println();
            }
            else {
                for (int k=1;k<=n;k++){
                        System.out.print("* ");
                }
            }
         }

    }
}
