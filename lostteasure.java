import java.util.Scanner;
public class lostteasure {
    static int firstposition(long[]arr,long target) {
        int low = 0;
        int high = arr.length - 1;
        int answer = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                answer = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }

    static int lastposition(long[]arr,long target) {
        int low = 0;
        int high = arr.length - 1;
        int answer = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                answer = mid;
                low = mid + 1;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return answer;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long target = sc.nextLong();
        int first = firstposition(arr,target);
        int last = lastposition(arr,target);
        System.out.println(first +" "+last);
    }

}
