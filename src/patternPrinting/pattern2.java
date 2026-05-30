package patternPrinting;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        //printing solid rectangle pattern
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
