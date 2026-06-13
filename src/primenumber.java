public class primenumber {



        static boolean primenumber ( int num){
            for (int j = 2; j<=Math.sqrt(num); j++){
                if (num % j == 0) {
                    return false;
                } 

            }
           return  true;
        }
//.
    static void main() {
       boolean ans=  primenumber(13);
        System.out.println(ans);
    }
}
