import java.util.ArrayList;
import java.util.Scanner;
public class leaderinarray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[N-1];
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(max);
        for (int i = N-2; i >= 0; i--) {
            if (arr[i] > max) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        for(int i=leaders.size()-1;i>=0;i--)
        {
            System.out.print(leaders.get(i)+" ");
        }
    }
}
