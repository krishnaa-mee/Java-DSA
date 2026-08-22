import java.util.Arrays;
import java.util.Scanner;
public class increment {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + 2;
        }
        System.out.println("Array after increment is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "");
        }

    }
}
