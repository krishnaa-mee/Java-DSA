import java.util.Scanner;
public class deletioninarray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[100];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position to be deleted");
        int pos = sc.nextInt();
        int i;
        for (i = pos- 1; i < n - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        n--;
        System.out.println("Array after deletion");
        for (i = 0; i < n; i++)
        {
            System.out.println(arr[i]+ "");
        }

    }
}
