package patternPrinting;

import java.util.Scanner;

public class pattern5 {
    public static void main() {
        //pattern 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j= 0; j<=n-i; j++){
                System.out.print((char)('A' +j) + " ");
            }
            System.out.println();
        }
    }

}