import java.util.Scanner;
public class transposebyothermethod {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int[][] tran = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        print matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tran[j][i] = arr[i][j];
            }
        }
//        print transpose
        System.out.println("after transpose");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(tran[i][j] + " ");
            }
            System.out.println();
        }
//        90 deg rotation
        for (int i = 0; i < m; i++) {
            for(int j = 0; j <m/2 ; j++) {
                int temp = tran[i][j];
                tran[i][j] = tran[i][m-j-1];
                tran[i][m-j-1] = temp;
            }
        }
        System.out.println("90 deg rotation");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(tran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
