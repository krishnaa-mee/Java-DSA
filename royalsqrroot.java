import java.util.Scanner;
public class royalsqrroot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long low =0;
        long high = x;
        long ans = 0;

        while (low<=high) {
            long mid = low + ((high-low)/2);
            if (mid*mid <= x) {
                ans = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}
