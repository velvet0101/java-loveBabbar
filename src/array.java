import java.util.Scanner;

public class array {
    static void main() {


        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i<=n; i++){
            System.out.println(arr[i]);
        }
    }
}
