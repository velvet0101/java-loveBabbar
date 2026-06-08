public class method {
//    static void tableOfTwo(){
//        for (int i =1; i<=10; i++){
//            int ans = 2*i;
//            System.out.println("-> " +ans);
//        }
//    }
//    //both of the method must be static
//
//    public static void main() {
//
//        tableOfTwo();
//
//    }
            //parameters and no parameters
//    static void add( int x, int y){
//        System.out.println(x+y);
//    }

//    static int multiply(int a, int b){
//        int ans=a*b;
//
//        return ans;
//    }
//
//
//    static void main() {
////        add(3,4);
//       int x=  multiply(5,10);
//        System.out.println(x);

  //  }
//static void main() {
//    System.out.println("hi");
//    int result = add(11,7);
//    System.out.println(result);
//
//}
//static int add(int a, int b) {
//    int add = a + b;
//    hi();
//    return add;
//
//}
//static void hi(){
//    System.out.println("hello");
//}

    //method overriding
    static int add(int x, int y){
        int add= x+y;
        return add;
    }
    static int add(int x , int y, int z){
        int add= x+y+z;
        return add;
    }

    static void main() {
        int ans1= add(1,2);
        int ans2= add(2,3,5);
        System.out.println("ans1 = "+ans1);
        System.out.println("ans2 = " +ans2);
    }

    public static class hwQuestion {
        static void add(int a, int b){
            int sum = a+b;
        }


    }
}
