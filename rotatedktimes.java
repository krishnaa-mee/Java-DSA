import java.util.Scanner;
public class rotatedktimes {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        System.out.println("enter the elements of the array");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the no. of rotation:");
        int k = sc.nextInt();

        k = k % n;
        for(int i = 0; i < n; i++) {
            temp[(i+k)%n] = arr[i];
        }
        System.out.println("the rotated array");
        for(int i = 0; i < n; i++) {
            System.out.println(temp[i] + "");
        }

    }
}
