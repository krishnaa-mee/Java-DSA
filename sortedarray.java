import java.util.Scanner;
public class sortedarray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
             arr[i] =  sc.nextInt();

        }
        boolean sorted = true;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] < arr[i-1]) {
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
}
