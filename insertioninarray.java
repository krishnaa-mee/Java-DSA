import java.util.Scanner;
public class insertioninarray {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position to insert: ");
        int pos = sc.nextInt();
        System.out.println("enter the value to be inserted");
        int ele = sc.nextInt();

        for (int i = n; i <= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos-1] = ele;
        n++;

        System.out.println("array after insertion");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
