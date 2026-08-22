import java.util.Scanner;
public class rotatioon90 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        rotation 90 deg. clockwise
        System.out.println("after rotation 90deg clockwise");
        for(int j=0;j<n;j++) {
            for(int i=m-1;i>=0;i--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
