import java.util.Scanner;
public class searchingintwoDarraay {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        int found = 0;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j]== target) {
                    found = 1;
                    System.out.println("element found at index "+i+" "+j);
                    break;
                }
            }
        }
        if(found==0)
        System.out.println("element not found");

    }
}
