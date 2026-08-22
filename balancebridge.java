import java.util.Scanner;
public class balancebridge {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        aisa index jiske right aur left sum equal ho
//        sum left of index = sum right of index

        int n = sc.nextInt();
        int[] arr = new int[n];

        int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        int left  = 0;
        for (int i = 0; i < n; i++) {
            int right = total - left - arr[i];

            if (left == right) {
                System.out.println(i);
                return;
            }
            left += arr[i];
        }
        System.out.println(-1);
    }
}
