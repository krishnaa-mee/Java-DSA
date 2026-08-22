import java.util.Scanner;
public class shiftedleaderboard {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        kitna shift kru ki array sorted ho jaye

        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        int breaks = 0;
        int shift = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]) {
                breaks++;
                shift = n-(i+1);
            }
        }
        if(breaks<=1){
            System.out.println(shift);
        }
        else{
            System.out.println(-1);
        }
    }
}
