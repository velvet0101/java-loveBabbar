package patternPrinting;

public class pattern7 {
    static void main() {
       int n = 4;
       //incomplete
       for(int i =1; i <=n;i++) {

           for(int j =1; j<=i-1;i++){
               System.out.print(" ");
           }
           System.out.println();
           for (int k = 1; k<=2;k++);
       }
    }
}
