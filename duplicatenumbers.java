import java.util.Scanner;
public class duplicatenumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int dup[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    dup[k] = arr[i];
                    k++;
                    break;
                }
            }
        }

        if(k == 0){
            System.out.println("No duplication found");
        }
        else{
            System.out.println("Duplicate elements are:");
            for (int i = 0; i < n; i++) {
                System.out.print(dup[i] + " ");
            }
        }
    }
}
