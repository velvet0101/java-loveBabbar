public class gcd {

    public static int gcd(int a, int b){

        while (b!=0){
            int original = b;
            b=a%b;
            a=original;
        }
        return a;
    }

    static void main() {
       int ans =  gcd(12,18);
        System.out.println(ans);
    }
}
