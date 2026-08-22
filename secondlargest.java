import java.util.Scanner;
public class secondlargest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int secondlargest = arr[0];
//        WE CAN USE Integer.MIN VALUE
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
               secondlargest =  largest;
               largest = arr[i];
            }
            else if (arr[i] > secondlargest && arr[i]!=largest) {
                secondlargest = arr[i];
            }
        }
        if (secondlargest == arr[0])
        {
            System.out.println("secondlargest element dosen't exist");
        }
        else{
            System.out.println("secondlargest element is " + secondlargest);
        }

    }
}