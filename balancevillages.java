import java.util.Scanner;
public class balancevillages {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long total = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLong();
            total+=arr[i];
        }
        long leftsum=0;
        for(int i=0;i<n;i++){
            long rightsum = total-leftsum-arr[i];

            long balance = Math.abs(leftsum-rightsum);
            System.out.println(balance);
            if(i<n-1){
                System.out.print(" ");
            }
            leftsum += arr[i];
        }
    }
}
