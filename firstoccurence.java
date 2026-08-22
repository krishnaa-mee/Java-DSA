import java.util.Scanner;
public class firstoccurence {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the key to find");
        int key = sc.nextInt();
        int first = -1;

        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                first = mid;
                high = mid-1;
            }
            else if(arr[mid] < key){
                low = mid+1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println("first occurence is at index " + first);
    }
}
