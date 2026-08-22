import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class halfarray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Half of the array:");
        for (int i = 0; i <= n/2; i++) {
            System.out.println(arr[i] + "");
        }
    }
}
