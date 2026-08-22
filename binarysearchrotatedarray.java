import java.util.Scanner;
public class binarysearchrotatedarray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the targeted array:");
        int target = sc.nextInt();

        int low = 0;
        int high = n-1;
        while (low < high){
            int mid = low  + (high-low)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<target && arr[mid]>target){
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            else {
                if(arr[mid]<target && arr[high]>=target)
                {
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }


            }

        }
        if(low > high){
            System.out.println("-1");

        }

    }
}
