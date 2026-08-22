import java.util.Scanner;
public class lowerandupperbound {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        lower bound of X = first index where arr[i]>=X
//        upper bound of X = first index where arr[i]>X
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int X =sc.nextInt();
//        lower bound

        int low = 0;
        int high = n-1;
        int lower = n;
        while (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid]>=X) {
                lower = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        System.out.println("lower bound is "+lower);

//        uppper bound
//        int low = 0;
//        int high = n-1;
//        int upper = n;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if(arr[mid]>X){
//                upper = mid;
//                high = mid - 1;
//            }
//            else{
//                low = mid + 1;
//            }
//        }
//        System.out.println("upper bound is " + upper);
    }
}
