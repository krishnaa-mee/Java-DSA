import java.util.Scanner;
public class largestnuminarray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for (int i = 1; i < size; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }

        }
        System.out.println("The maximum number is "+max);
    }
}
